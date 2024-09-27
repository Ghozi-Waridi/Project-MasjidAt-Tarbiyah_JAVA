
package masjidat.tarbiyah.GUI.Operation.Tabel;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import masjidat.tarbiyah.Database.Operation.DbTakjil;
import masjidat.tarbiyah.Utils.Takjil;

public class TabelTakjil implements Tabel{

  @Override
    public void tampilTabel(JTable table) {
        
        DbTakjil takjil = new DbTakjil();
        
        DefaultTableModel tb = new DefaultTableModel();

        List<Takjil> takjilList = null;
        try {
            takjilList = takjil.FetchAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        tb.addColumn("id");
        tb.addColumn("Nama");
        tb.addColumn("Jumlah");
        tb.addColumn("Jemput");
        tb.addColumn("Tanggal");

        for (Takjil takjil1 : takjilList) {
            Object[] rowData = {takjil1.getId(), takjil1.getNama(), takjil1.getJumlah(), takjil1.isDiJemput(), takjil1.getTanggal()};
            tb.addRow(rowData);
        }
        table.setModel(tb);
    }
    
}
