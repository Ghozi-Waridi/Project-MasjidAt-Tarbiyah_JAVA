package masjidat.tarbiyah.Database.Operation;

import masjidat.tarbiyah.Database.Koneksi.Connect;
import masjidat.tarbiyah.User.Admin;
import masjidat.tarbiyah.User.NormalUser;
import masjidat.tarbiyah.User.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DbUser extends OperationDB<User>{
    
    
    List<User> dataUser = new ArrayList();
    
    
    
    @Override
    public List<User> FetchAll() throws SQLException, ClassNotFoundException {
        String QUERY = "SELECT * FROM user";
        try(Connection con = Connect.koneksi()){
            try(PreparedStatement ps = con.prepareStatement(QUERY)){
                try(ResultSet rs = ps.executeQuery()){
                    while (rs.next()){
                        User user;
                        if(rs.getString("username").equals("admin") && rs.getString("password").
                                equals("admin")){
                            user = new Admin(rs.getString("username"), rs.getString("password"));
                        } else {
                            user = new NormalUser(rs.getString("username"), rs.getString("password"));
                        }
                        dataUser.add(user);
                    }
                }
            }
        }
        
        return dataUser;
    }




    
    
}


