
package masjidat.tarbiyah.GUI.View.NormalUser;

import masjidat.tarbiyah.Database.Operation.DbTakjil;
import masjidat.tarbiyah.Utils.Takjil;

import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;
import masjidat.tarbiyah.GUI.Operation.Tabel.TabelKajian;
import masjidat.tarbiyah.GUI.Operation.Tabel.TabelTakjil;

public class TakjilInformasi extends javax.swing.JPanel {

    TabelTakjil table = new TabelTakjil();

    public TakjilInformasi() {
        initComponents();
        
        table.tampilTabel(jTable1);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        jLabel5.setFont(new java.awt.Font("Charlemagne Std", 1, 24)); // NOI18N
        jLabel5.setText("informasi Tajkil ");

        jLabel6.setFont(new java.awt.Font("Vladimir Script", 1, 18)); // NOI18N
        jLabel6.setText("Masjid At - Tarbiyah ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nama", "Jumlah", "Dijemput", "Tanggal"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


//    public void tampiltable() {
//        DbTakjil takjil = new DbTakjil();
//        DefaultTableModel tb = new DefaultTableModel();
//
//        List<Takjil> takjilList = null;
//        try {
//            takjilList = takjil.FetchAll();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        tb.addColumn("id");
//        tb.addColumn("Nama");
//        tb.addColumn("Jumlah");
//        tb.addColumn("Jemput");
//        tb.addColumn("Tanggal");
//
//        for (Takjil takjil1 : takjilList) {
//            Object[] rowData = {takjil1.getId(), takjil1.getNama(), takjil1.getJumlah(), takjil1.isDiJemput(), takjil1.getTanggal()};
//            tb.addRow(rowData);
//        }
//        jTable1.setModel(tb);
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
