/**
 * Description: that's a database connection manager class
 * @author LUCAS
 */

package data;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public final class GamesDao {
    // Tipo de dado responsável pela conexão
        Connection con;
        
    // Tipo de dado responsável por querys
        Statement stmt;

    /* ATRIBUTES */
        String dbName;
        String user;
        String passwd;
    
    public GamesDao(){
    }
    
    public GamesDao(String dataBaseName, String userName, String dataBasePassword) {
        this.dbName = dataBaseName;
        this.user = userName;
        this.passwd = dataBasePassword;
        
        createDBConex(dbName, user, passwd);
    }
        
    
    
    // Realiza a conexão com o banco de dados
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
    
    // Realiza uma query de inserção
    public int makeInsertQuery(Game game){
        try{
            stmt = con.createStatement();
            
            String query = "INSERT INTO gamedepartment.game (gameName, gameValue, gameDescription, gameCover) "
                    +   "VALUES('"+game.getName()+"', "+game.getValue()+", "
                    +   "'"+game.getDescricao()+"', '"+game.getCover()+"');";
        
            return stmt.executeUpdate(query);
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

    // Encerra a conexão com banco
    public void closeConnection(){
            try {
                // encerra a conexão
                this.con.close();
            } catch (SQLException ex) {}
    }
}
