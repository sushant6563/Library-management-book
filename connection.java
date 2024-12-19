import java.io.InputStream; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties; 

public class connection {

    public static Connection connection = null;

    public static Connection  getConnection() {

       
        if(connection == null) {
            try (InputStream input = DataBconnection.class.getClassLoader().getResourceAsStream("db_config.properties")) {
                Properties prop = new Properties(); 
                prop.load(input); //Load the database credentials from the properties files.

                //Getting the Database URL, username, password from the properties file.
                String url = prop.getProperty("db.url");
                String user = prop.getProperty("db.username");
                String password = prop.getProperty("db.password");

                //Establishing connection using the driver manager class
                connection = DriverManager.getConnection(url, user, password);
            } catch (Exception e) {
                e.printStackTrace(); //Print any error that occurs during connection attempt.
            }
        }
        return connection;
    }
}
