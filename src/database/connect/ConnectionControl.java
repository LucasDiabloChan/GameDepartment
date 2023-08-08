/**
 * Description: that's a database connection manager class
 * @author LUCAS
 */

package database.connect;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class ConnectionControl {
    // Tipo de dado responsável pela conexão
        Connection con;
        
    // Tipo de dado responsável por querys
        Statement stmt;

    /* ATRIBUTES */
        String dbName;
        String user;
        String passwd;
        
    public ConnectionControl(String dataBaseName, String userName, String dataBasePassword) {
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

        } catch (ClassNotFoundException ex) {
            JOptionPane.showConfirmDialog(null, "O driver não foi encontrado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu pau na conexão bixo!");
        }
        
        return created;
    }
    
    // Realiza uma query de inserção
    public void makeInsertQuery(String query){
        try{
            stmt = con.createStatement();
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Deu tudo certo");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Falha ao realizar query: " + ex.getMessage());
        }
    }

    // Encerra a conexão com banco
    public void closeConnection(){
            try {
                // encerra a conexão
                this.con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionControl.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
