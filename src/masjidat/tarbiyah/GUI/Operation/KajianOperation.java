package masjidat.tarbiyah.GUI.Operation;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import masjidat.tarbiyah.Database.Operation.DbKajian;
import masjidat.tarbiyah.Utils.Kajian;

public class KajianOperation extends DbKajian{
    
    
        public void kajianTambah(String nama, String tanggal){
        List<Kajian> kajians = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("ini tombol");
        Kajian kajian = new Kajian();
        kajians.add(kajian);


        for(var kajian1 : kajians){
            System.out.println("data sedang ditambahkan.....");
            kajian1.setNama(nama);

            LocalDate date = null;
            try {
                date = LocalDate.parse(tanggal, formatter);
            } catch (DateTimeParseException e) {
                e.printStackTrace();
            }
            kajian1.setTanggal(date);
        }
            try {
                super.InsertAlldata(kajians);
            } catch (SQLException ex) {
                Logger.getLogger(KajianOperation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(KajianOperation.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
