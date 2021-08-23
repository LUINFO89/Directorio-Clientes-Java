import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connect {
    public Connection connect() {
        String url = "jdbc:sqlite: /Users/luis/Directorio-Clientes-Java/Directorio/db/datacontact.db";
        Connection var = null;
        try {
            var = DriverManager.getConnection(url);
            System.out.println("Me conecte al sistema!");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return var;
    }


    
}