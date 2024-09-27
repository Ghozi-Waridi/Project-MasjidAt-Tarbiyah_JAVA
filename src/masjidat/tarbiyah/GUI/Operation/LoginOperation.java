
package masjidat.tarbiyah.GUI.Operation;

import masjidat.tarbiyah.Database.Operation.DbTakjil;
import masjidat.tarbiyah.Database.Operation.DbUser;
import masjidat.tarbiyah.GUI.HomeAdminUser;
import masjidat.tarbiyah.GUI.HomeUser;
import masjidat.tarbiyah.GUI.Login;
import masjidat.tarbiyah.User.User;

import javax.swing.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;


public class LoginOperation extends DbUser {
    
    List<User> dataUserDb;
    HashMap<String, String> dataUserLogin = new HashMap<>();

    public void chekUser(String username, String password, JFrame frame) throws SQLException, ClassNotFoundException {
        dataUserDb = super.FetchAll();
        for(var user : dataUserDb){
            dataUserLogin.put(user.getUsername(), user.getPassword());
        }

        if(dataUserLogin.containsKey(username) && dataUserLogin.containsValue(password)){
            if(username.equals("admin") && password.equals("admin")){
                HomeAdminUser admin = new HomeAdminUser();
                admin.setVisible(true);
                frame.dispose();
            } else {
                HomeUser normalUser = new HomeUser();
                normalUser.setVisible(true);
                frame.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "username / password, salah...!!");
        }

    }
}
