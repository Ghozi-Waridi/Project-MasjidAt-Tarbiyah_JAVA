/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masjidat.tarbiyah.GUI.Operation.Tabel;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import masjidat.tarbiyah.Database.Operation.DbKajian;
import masjidat.tarbiyah.Utils.Kajian;
    
 public class TabelKajian implements Tabel{
    
  @Override
    public void tampilTabel(JTable table) {
        
        DbKajian kajian = new DbKajian();
        
        
        DefaultTableModel tb = new DefaultTableModel();

        List<Kajian> kajianList = null;
        try {
            kajianList = kajian.FetchAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        tb.addColumn("id");
        tb.addColumn("Nama");
        tb.addColumn("Tanggal");

        for (Kajian kajian1 : kajianList) {
            Object[] rowData = {kajian1.getId(), kajian1.getNama(), kajian1.getTanggal()};
            tb.addRow(rowData);
        }
        table.setModel(tb);
    }
  
    
}
