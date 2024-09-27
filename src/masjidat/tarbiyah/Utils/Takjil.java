package masjidat.tarbiyah.Utils;

public class Takjil extends ProgramMasjid{
    
    private int jumlah;
    private boolean diJemput;
    private String alamat;
    
    public Takjil(int jumlah, boolean diJemput) {
        this.jumlah = jumlah;
        this.diJemput = diJemput;
        this.alamat = "";
    }

    public Takjil() {
    }
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public boolean isDiJemput() {
        return diJemput;
    }

    
    public void setDiJemput(boolean diJemput) {
        this.diJemput = diJemput;
    }
    
    public void setDiJemput(boolean diJemput, String alamat) {
        this.diJemput = diJemput;
        this.alamat = alamat;
    }
    
}
