package masjidat.tarbiyah.GUI.Operation;

import masjidat.tarbiyah.Database.Operation.DbTakjil;
import masjidat.tarbiyah.Utils.Takjil;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class TakjilOperation extends DbTakjil {

    public void sedekahTakjil(String nama, int jumlah, boolean jemput, String tanggal, String alamat){
        List<Takjil> takjils = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Takjil takjil = new Takjil();
        takjils.add(takjil);


        for(var takjil1 : takjils){
            System.out.println("data sedang ditambahkan.....");
            takjil1.setNama(nama);
            takjil1.setJumlah(jumlah);
            if(!alamat.equals("")){
               takjil1.setDiJemput(jemput, alamat);
            } else {
                takjil1.setDiJemput(jemput);    
            }
            
            LocalDate date = null;
            try {
                date = LocalDate.parse(tanggal, formatter);
            } catch (DateTimeParseException e) {
                e.printStackTrace();
            }
            takjil1.setTanggal(date);

        }
        try {
            super.InsertAlldata(takjils);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
