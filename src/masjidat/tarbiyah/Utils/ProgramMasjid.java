package masjidat.tarbiyah.Utils;
import java.time.LocalDate;
public class ProgramMasjid {    
    private int id;
    private String nama;
    private LocalDate tanggal;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public LocalDate getTanggal() {
        return tanggal;
    }
    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }
}





