/**
 * Description: Classe responsável por toda a lógica de conexão com banco de dados
 * Author: LucDev (Lucas)
 * Created at: 07/07
 * Updated at: 18/07
 **/

package data;

import java.util.List; // Lista específica (util.List != awt.List)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PreparedGamesDao {
    
    // Tipo de dado responsável pela conexão
        Connection con;
        
    // Tipo de dado responsável por querys
        PreparedStatement stmt;
    
    // Tipo de dado responsável por receber dados do banco
        ResultSet rs;

    /* ATRIBUTES */
        String dbName;
        String user;
        String passwd;
        
// - - - - - - - - - - - - - - - - - - - - - //
    
    // * * * * * * * * * * * * *  //
    // CRIA A CONEXÃO COM O BANCO //
    public boolean createDBConex(){        
        String dbStr = "jdbc:mysql://localhost:3306/gamedepartment";
        
        // Tenta conectar
        try {
            // Pega a classe Driver do Java DB controller
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Conecta ao banco e salva a conexão na var con
            con = DriverManager.getConnection(dbStr, "root", "12345678");
            
            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Falha ao estabelecer conexão!");
            return false;
        }
    }
    // * * * * * * * * * * * * *  //
        
    
    // * * * * * * * * * * * * * * * * * * * * * *//
    // CRIA A CONEXÃO COM O BANCO (personalizado) //
    public boolean createDBConex(String db, String user, String pass){
        boolean created = false;
        
        String dbStr = "jdbc:mysql://localhost:3306/" + db;
        
        // Tenta conectar
        try {
            // Pega a classe Driver do Java DB controller
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Conecta ao banco e salva a conexão na var con
            con = DriverManager.getConnection(dbStr, user, pass);
            
            JOptionPane.showMessageDialog(null, "Deu tudo certo");
            created = true;

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showConfirmDialog(null, "O driver não foi encontrado!");
        }
        
        return created;
    }
    // * * * * * * * * * * * * * * * * * * * * * *//

// - - - - - - - - - - - - - - - - - - - - - //
    
    // * * * * * * * * * * * * * * //
    // INSERE UM REGISTRO NO BANCO //
    public int makeCreateQuery(Game game){
        try{
            stmt = con.prepareStatement("INSERT INTO gamedepartment.game VALUES(?, ?, ?, ?)");
            
            stmt.setString(1, game.getName());
            stmt.setDouble(2, game.getValue());
            stmt.setString(3, game.getCover());
            stmt.setString(4, game.getDescricao());
        
            return stmt.executeUpdate();
        }catch(SQLException ex){
            int code = ex.getErrorCode();
            
            System.out.println("código do erro: " + code);
            
            switch(code){
                case 1062 -> {JOptionPane.showMessageDialog(null, "Dado repetido na base de dados.");}
                
                default -> {System.out.println("erro desconhecido: " + code);}
            }
            
            return ex.getErrorCode();
        }
    }
    // * * * * * * * * * * * * * * //
    
    
// - - - - - - - - - - - - - - - - - - - - - //
    
    
    // * * * * * * * * * * * * * * * * //
    /* FAZ UMA CONSULTA BASEADO NOS ID */
    public Game makeReadQueryById(int key){
        
        Game jogo = new Game();
    
        try{
            stmt = con.prepareStatement("SELECT * FROM game WHERE id = ?;");
            stmt.setInt(1, key);
            
            rs = stmt.executeQuery();
            
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "Jogo não encontrado...");
                return null;
            }
            
            jogo.setId   (rs.getInt("id"));
            jogo.setValue (rs.getDouble("gameValue"));
            jogo.setName   (rs.getString("gameName"));
            jogo.setCover   (rs.getString("gameCover"));
            jogo.setDescricao(rs.getString("gameDescription"));
            
            return jogo;
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro ao buscar pelo id '"+ key +"'.");
            return null;
        }
    }
    // * * * * * * * * * * * * * * * * //
    
    // * * * * * * * * * * * * * * * * * /
    /* FAZ UMA CONSULTA BASEADO NO NOME */
    public List<Game> makeReadQueryByGameName(String name){
        try{
            stmt = con.prepareStatement("SELECT * FROM game WHERE gameName LIKE ? ");
            stmt.setString(1, "%" + name + "%");
            rs = stmt.executeQuery();
            
            if(!rs.next()){
                return null;
            }
            
            List<Game> colecaoDeJogos = new ArrayList<>();
            
            do{
                Game jogo = new Game();
                
                jogo.setId   (Integer.parseInt(rs.getString("id")));
                jogo.setValue (Double.parseDouble(rs.getString("gameValue")));
                jogo.setName   (rs.getString("gameName"));
                jogo.setCover   (rs.getString("gameCover"));
                jogo.setDescricao(rs.getString("gameDescription"));
                
                colecaoDeJogos.add(jogo);
                
            }while(rs.next());
            
            return colecaoDeJogos;
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro ao buscar pelo nome '"+ name +"'.");
            System.out.println("Error: " + ex.getMessage());
        }
        
        return null;
    }
    // * * * * * * * * * * * * * * * * * /
    
    // * * * * * * * * * * * * * * * * * * * */
    /* FAZ UMA CONSULTA BASEADO NA DESCRIÇÃO */
    public List<Game> makeReadQueryByGameDescription(String desc){
        
        List<Game> colecaoDeJogo = new ArrayList();
    
        try{
            stmt = con.prepareStatement("SELECT * FROM game WHERE gameDescription LIKE '?'");
            stmt.setString(1, "%" + desc + "%");
            
            rs = stmt.executeQuery();
            
            if(!rs.next()){
                return null;
            }
            
            while(rs.next()){
                Game jogo = new Game();
                
                jogo.setId   (rs.getInt("id"));
                jogo.setValue (rs.getDouble("gameValue"));
                jogo.setName   (rs.getString("gameName"));
                jogo.setCover   (rs.getString("gameCover"));
                jogo.setDescricao(rs.getString("gameDescription"));
            }
            
            return colecaoDeJogo;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Ocorreu algum erro ao buscar pela descrição '"+ desc +"'.");
            System.out.println("Error: " + ex.getMessage());
            System.out.println("On: " + ex.getLocalizedMessage());
            System.out.println("State: " + ex.getSQLState());
            return null;
        }
    }
    // * * * * * * * * * * * * * * * * * * * */
    
    
// - - - - - - - - - - - - - - - - - - - - - //
    
    // * * * * * * * * * * * * * * * //
    // ATUALIZA UM REGISTRO NO BANCO //
    public int makeUpdateQueryById(Game jogo){
        try{
            stmt = con.prepareStatement("UPDATE game "
                    + "SET gameName = ?, "
                    + "gameValue = ?,"
                    + "gameCover = ?,"
                    + "gameDescription = ?"
                    + "WHERE id = ?");
            
            stmt.setString(1, jogo.getName());
            stmt.setDouble(2, jogo.getValue());
            stmt.setString(3,  jogo.getCover());
            stmt.setString(4, jogo.getDescricao());
            stmt.setInt(5, jogo.getId());
            
            System.out.println(stmt);
            
            return stmt.executeUpdate();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "deu ruim biscate");
            System.out.println(ex.getMessage());
            return 0;
        }
    }
    // * * * * * * * * * * * * * * * //

// - - - - - - - - - - - - - - - - - - - - - //
    
    // * * * * * * * * * * * * * * //
    // DELETA UM REGISTRO NO BANCO //
    public int makeDeleteQueryById(int id){
        try{
            stmt = con.prepareStatement("DELETE FROM game WHERE id = ?;");
            
            stmt.setInt(1, id);
            
            return stmt.executeUpdate();
            
        }catch(SQLException ex){
            System.out.println("Houve algum erro ao deletar esse jogo...");
            return 0;
        }
    }
    // * * * * * * * * * * * * * * //
    
// - - - - - - - - - - - - - - - - - - - - - //
    
    // * * * * * * * * * * * * * * //
    // ENCERRA A CONEXÃO COM BANCO //
    public void closeConnection(){
        try {
            this.con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao encerrar a sessão. " + ex.getMessage());
        }
    }
    // * * * * * * * * * * * * * * //
}

