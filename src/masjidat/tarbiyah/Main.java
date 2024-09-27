
package masjidat.tarbiyah;


import java.sql.SQLException;

import masjidat.tarbiyah.GUI.Login;

public class Main {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Login login = new Login();
        login.setVisible(true);
    }
}
