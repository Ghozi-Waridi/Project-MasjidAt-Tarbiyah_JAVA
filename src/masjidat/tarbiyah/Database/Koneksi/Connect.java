package masjidat.tarbiyah.Database.Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/masjidattarbiyah";

    public static Connection koneksi() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn =  DriverManager.getConnection(URL, USERNAME, PASSWORD);
        conn.setAutoCommit(false);
        return conn;
    }
}
