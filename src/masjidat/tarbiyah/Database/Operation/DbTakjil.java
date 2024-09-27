package masjidat.tarbiyah.Database.Operation;

import masjidat.tarbiyah.Database.Koneksi.Connect;
import masjidat.tarbiyah.Utils.Takjil;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DbTakjil extends OperationDB<Takjil>{
    
    
    String QUERY;
    
    
    
    
//    List<Takjil> insertDataTakjil = new ArrayList();


    @Override
    public List<Takjil> FetchAll() throws SQLException, ClassNotFoundException {
        QUERY = "SELECT * FROM takjil";
        List<Takjil> dataTakjil = new ArrayList();
        try(Connection conn = Connect.koneksi() ){
            try(PreparedStatement ps = conn.prepareStatement(QUERY)  ){
                try(ResultSet rs = ps.executeQuery()){
                    while (rs.next()){
                        Takjil takjil = new Takjil();
                        takjil.setId(rs.getInt("id"));
                        takjil.setNama(rs.getString("nama"));
                        takjil.setJumlah(rs.getInt("jumlah"));
                        takjil.setDiJemput(rs.getBoolean("dijemput"));
                        takjil.setTanggal(rs.getDate("tanggal").toLocalDate());
                        dataTakjil.add(takjil);
                    }
                }
            }
        }
        return dataTakjil;
    }


    @Override
    public void InsertAlldata(List<Takjil> data) throws SQLException, ClassNotFoundException {
        QUERY = "INSERT INTO takjil (Nama, Jumlah, dijemput, tanggal) VALUES (?,?,?,?)";
        try (Connection con = Connect.koneksi()) {
            try (PreparedStatement ps = con.prepareStatement(QUERY)) {
                for(var datatakjil : data){
                    ps.setString(1, datatakjil.getNama());
                    ps.setInt(2, datatakjil.getJumlah());
                    ps.setBoolean(3, datatakjil.isDiJemput());
                    ps.setDate(4, Date.valueOf(datatakjil.getTanggal()));
                    ps.executeUpdate();
                    System.out.println("insert database");
                }
                con.commit();
            }
        }
    }

    @Override
    public void updateData(int id, String nama, int jumlah, boolean jemput, LocalDate tanggal) throws SQLException, ClassNotFoundException {
            QUERY = "UPDATE takjil SET Nama = ?, Jumlah = ?, dijemput = ?, tanggal = ? WHERE id = ?";
            try (Connection con = Connect.koneksi()) {
                try (PreparedStatement ps = con.prepareStatement(QUERY)) {
                        ps.setString(1, nama);
                        ps.setInt(2, jumlah);
                        ps.setBoolean(3, jemput);
                        ps.setDate(4, Date.valueOf(tanggal));
                        ps.setInt(5, id);
                        ps.executeUpdate();
                        System.out.println("update database");
                    con.commit();
                }

        }

    }

    @Override
    public void delete(int id) throws SQLException, ClassNotFoundException {
        QUERY = "DELETE FROM takjil WHERE id = ?";
        try(Connection conn = Connect.koneksi()){
            try(PreparedStatement ps = conn.prepareStatement(QUERY)){
                ps.setInt(1, id);
                ps.executeUpdate();
                conn.commit();
            }
        }
    }
    
    
}
