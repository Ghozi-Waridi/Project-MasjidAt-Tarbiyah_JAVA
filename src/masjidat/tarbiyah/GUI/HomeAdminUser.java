/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package masjidat.tarbiyah.GUI;

import masjidat.tarbiyah.GUI.View.Admin.KajianInformasi;
//import masjidat.tarbiyah.GUI.View.Admin.SedekahTakjil;
import masjidat.tarbiyah.GUI.View.Admin.TakjilInformasi;
//import masjidat.tarbiyah.GUI.View.Admin.updateKajian;


public class HomeAdminUser extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public HomeAdminUser() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        PNkiri = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BTNtakjil = new javax.swing.JButton();
        BTNkajian = new javax.swing.JButton();
        BTNlogout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PNkanan = new javax.swing.JPanel();
        PNgarisAtas = new javax.swing.JPanel();
        PNdasarKanan = new javax.swing.JPanel();
        PanelMain = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PNkiri.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Charlemagne Std", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("At - tarbiyah");

        jLabel1.setFont(new java.awt.Font("Charlemagne Std", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Masjid");

        BTNtakjil.setBackground(new java.awt.Color(4, 57, 57));
        BTNtakjil.setFont(new java.awt.Font("Charlemagne Std", 1, 14)); // NOI18N
        BTNtakjil.setForeground(new java.awt.Color(255, 255, 255));
        BTNtakjil.setText("Takjil");
        BTNtakjil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNtakjilMouseClicked(evt);
            }
        });
        BTNtakjil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNtakjilActionPerformed(evt);
            }
        });

        BTNkajian.setBackground(new java.awt.Color(4, 57, 57));
        BTNkajian.setFont(new java.awt.Font("Charlemagne Std", 1, 14)); // NOI18N
        BTNkajian.setForeground(new java.awt.Color(255, 255, 255));
        BTNkajian.setText("kajian");
        BTNkajian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNkajianMouseClicked(evt);
            }
        });
        BTNkajian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNkajianActionPerformed(evt);
            }
        });

        BTNlogout.setBackground(new java.awt.Color(204, 204, 204));
        BTNlogout.setFont(new java.awt.Font("Charlemagne Std", 1, 12)); // NOI18N
        BTNlogout.setText("Logout");
        BTNlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNlogoutMouseClicked(evt);
            }
        });
        BTNlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNlogoutActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Charlemagne Std", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("(Admin)");

        javax.swing.GroupLayout PNkiriLayout = new javax.swing.GroupLayout(PNkiri);
        PNkiri.setLayout(PNkiriLayout);
        PNkiriLayout.setHorizontalGroup(
            PNkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNkiriLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PNkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNkiriLayout.createSequentialGroup()
                        .addComponent(BTNlogout)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNkiriLayout.createSequentialGroup()
                        .addGroup(PNkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PNkiriLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(BTNtakjil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNkajian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17))))
            .addGroup(PNkiriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PNkiriLayout.setVerticalGroup(
            PNkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNkiriLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PNkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(BTNtakjil, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNkajian, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(BTNlogout)
                .addGap(55, 55, 55))
        );

        getContentPane().add(PNkiri, java.awt.BorderLayout.LINE_START);

        PNkanan.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout PNgarisAtasLayout = new javax.swing.GroupLayout(PNgarisAtas);
        PNgarisAtas.setLayout(PNgarisAtasLayout);
        PNgarisAtasLayout.setHorizontalGroup(
            PNgarisAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );
        PNgarisAtasLayout.setVerticalGroup(
            PNgarisAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        PNkanan.add(PNgarisAtas, java.awt.BorderLayout.PAGE_START);

        PanelMain.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout PNdasarKananLayout = new javax.swing.GroupLayout(PNdasarKanan);
        PNdasarKanan.setLayout(PNdasarKananLayout);
        PNdasarKananLayout.setHorizontalGroup(
            PNdasarKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNdasarKananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PNdasarKananLayout.setVerticalGroup(
            PNdasarKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PNkanan.add(PNdasarKanan, java.awt.BorderLayout.CENTER);

        getContentPane().add(PNkanan, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNtakjilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNtakjilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNtakjilActionPerformed

    private void BTNkajianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNkajianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNkajianActionPerformed

    private void BTNtakjilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNtakjilMouseClicked
        PanelMain.removeAll();
        PanelMain.add(new TakjilInformasi());
        PanelMain.repaint();
        PanelMain.revalidate();
    }//GEN-LAST:event_BTNtakjilMouseClicked

    private void BTNkajianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNkajianMouseClicked
        PanelMain.removeAll();
        PanelMain.add(new KajianInformasi());
        PanelMain.repaint();
        PanelMain.revalidate();
    }//GEN-LAST:event_BTNkajianMouseClicked

    private void BTNlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNlogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNlogoutActionPerformed

    private void BTNlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNlogoutMouseClicked
                Login login = new Login();
                login.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_BTNlogoutMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeAdminUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAdminUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAdminUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAdminUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeAdminUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNkajian;
    private javax.swing.JButton BTNlogout;
    private javax.swing.JButton BTNtakjil;
    private javax.swing.JPanel PNdasarKanan;
    private javax.swing.JPanel PNgarisAtas;
    private javax.swing.JPanel PNkanan;
    private javax.swing.JPanel PNkiri;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
