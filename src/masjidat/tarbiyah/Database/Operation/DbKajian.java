package masjidat.tarbiyah.Database.Operation;

import masjidat.tarbiyah.Database.Koneksi.Connect;
import masjidat.tarbiyah.Utils.Kajian;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DbKajian extends OperationDB<Kajian>{
    
    
    String QUERY;
    List<Kajian> dataKajian = new ArrayList<>();
    
    
    
    @Override
    public List<Kajian> FetchAll() throws SQLException, ClassNotFoundException {
        QUERY = "SELECT * FROM kajian";
        try(Connection con = Connect.koneksi()){
            try(PreparedStatement pr = con.prepareStatement(QUERY)){
                try(ResultSet rs = pr.executeQuery()){
                    while (rs.next()){
                        Kajian kajian = new Kajian();
                        kajian.setId(rs.getInt("id"));
                        kajian.setNama(rs.getString("nama"));
                        kajian.setTanggal(rs.getDate("tanggal").toLocalDate());
                        dataKajian.add(kajian);
                    }
                }
            }
        }
        return dataKajian;
    }

    @Override
    public void InsertAlldata(List<Kajian> data) throws SQLException, ClassNotFoundException {
        QUERY = "INSERT INTO kajian (Nama, tanggal) VALUES (?,?)";
        try (Connection con = Connect.koneksi()) {
            try (PreparedStatement ps = con.prepareStatement(QUERY)) {
                for(var dataKajian : data){
                    ps.setString(1, dataKajian.getNama());
                    ps.setDate(2, Date.valueOf(dataKajian.getTanggal()));
                    ps.executeUpdate();
                }
                con.commit();
            }
        }
    }    
    
    @Override
    public void updateData(int id, String nama, LocalDate tanggal) throws SQLException, ClassNotFoundException {
             QUERY = "UPDATE kajian SET Nama = ?, tanggal = ? WHERE id = ?";
            try (Connection con = Connect.koneksi()) {
                try (PreparedStatement ps = con.prepareStatement(QUERY)) {
                        ps.setString(1, nama);
                        ps.setDate(2, Date.valueOf(tanggal));
                        ps.setInt(3, id);
                        ps.executeUpdate();
                        System.out.println("update database");
                    con.commit();
                }
            }
    }

    @Override
    public void delete(int id) throws SQLException, ClassNotFoundException {
        QUERY = "DELETE FROM kajian WHERE  id = ?";
        try(Connection conn = Connect.koneksi()){
            try(PreparedStatement ps = conn.prepareStatement(QUERY)){
                ps.setInt(1, id);
                ps.executeUpdate();
                conn.commit();
            }
        }
    }
}
