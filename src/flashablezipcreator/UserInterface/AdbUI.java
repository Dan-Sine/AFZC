/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashablezipcreator.UserInterface;

/**
 *
 * @author Nikhil
 */
public class AdbUI extends javax.swing.JFrame {

    /**
     * Creates new form AdbUI
     */
    public AdbUI() {
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

        panelMain = new javax.swing.JPanel();
        lblDeviceName = new javax.swing.JLabel();
        lblChoose = new javax.swing.JLabel();
        lblDeviceIdentified = new javax.swing.JLabel();
        cbSystemApp = new javax.swing.JCheckBox();
        cbSystemPrivApp = new javax.swing.JCheckBox();
        cbDataApp = new javax.swing.JCheckBox();
        cbSystemFonts = new javax.swing.JCheckBox();
        cbSystemMedia = new javax.swing.JCheckBox();
        cbSystemRingtones = new javax.swing.JCheckBox();
        cbSystemNotifications = new javax.swing.JCheckBox();
        cbSystemAlarms = new javax.swing.JCheckBox();
        cbSystemUI = new javax.swing.JCheckBox();
        btnContinue = new javax.swing.JButton();
        btnAdvancedFilter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setBackground(new java.awt.Color(255, 255, 255));

        lblDeviceName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDeviceName.setText("Redmi Note 3");

        lblChoose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblChoose.setText("Choose the partitions you want to fetch files from");

        lblDeviceIdentified.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDeviceIdentified.setText("Device Identified:-");

        cbSystemApp.setBackground(new java.awt.Color(255, 255, 255));
        cbSystemApp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSystemApp.setSelected(true);
        cbSystemApp.setText("/system/app");
        cbSystemApp.setContentAreaFilled(false);
        cbSystemApp.setFocusPainted(false);

        cbSystemPrivApp.setBackground(new java.awt.Color(255, 255, 255));
        cbSystemPrivApp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSystemPrivApp.setText("/system/priv-app");
        cbSystemPrivApp.setFocusPainted(false);

        cbDataApp.setBackground(new java.awt.Color(255, 255, 255));
        cbDataApp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbDataApp.setSelected(true);
        cbDataApp.setText("/data/app");
        cbDataApp.setFocusPainted(false);

        cbSystemFonts.setBackground(new java.awt.Color(255, 255, 255));
        cbSystemFonts.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSystemFonts.setSelected(true);
        cbSystemFonts.setText("/system/fonts");
        cbSystemFonts.setFocusPainted(false);

        cbSystemMedia.setBackground(new java.awt.Color(255, 255, 255));
        cbSystemMedia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSystemMedia.setSelected(true);
        cbSystemMedia.setText("/system/media");
        cbSystemMedia.setFocusPainted(false);

        cbSystemRingtones.setBackground(new java.awt.Color(255, 255, 255));
        cbSystemRingtones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSystemRingtones.setText("/system/media/audio/ringtones");
        cbSystemRingtones.setFocusPainted(false);

        cbSystemNotifications.setBackground(new java.awt.Color(255, 255, 255));
        cbSystemNotifications.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSystemNotifications.setText("/system/media/audio/notifications");
        cbSystemNotifications.setFocusPainted(false);

        cbSystemAlarms.setBackground(new java.awt.Color(255, 255, 255));
        cbSystemAlarms.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSystemAlarms.setText("/system/media/audio/alarms");
        cbSystemAlarms.setFocusPainted(false);

        cbSystemUI.setBackground(new java.awt.Color(255, 255, 255));
        cbSystemUI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSystemUI.setText("/system/media/audio/ui");
        cbSystemUI.setFocusPainted(false);

        btnContinue.setBackground(new java.awt.Color(255, 255, 255));
        btnContinue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnContinue.setText("Continue");
        btnContinue.setContentAreaFilled(false);
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        btnAdvancedFilter.setBackground(new java.awt.Color(255, 255, 255));
        btnAdvancedFilter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdvancedFilter.setText("Advanced Filter");
        btnAdvancedFilter.setContentAreaFilled(false);
        btnAdvancedFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdvancedFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAdvancedFilter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                                .addComponent(lblDeviceIdentified)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(lblDeviceName, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbSystemUI, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSystemAlarms, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSystemNotifications, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSystemRingtones, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSystemMedia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSystemPrivApp, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblChoose, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbDataApp, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbSystemFonts, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(29, 29, 29))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(cbSystemApp)
                        .addGap(76, 452, Short.MAX_VALUE))))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeviceName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeviceIdentified, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(cbSystemApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSystemPrivApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDataApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbSystemFonts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbSystemMedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbSystemRingtones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbSystemNotifications)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbSystemAlarms)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbSystemUI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdvancedFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinueActionPerformed

    private void btnAdvancedFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdvancedFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdvancedFilterActionPerformed

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
            java.util.logging.Logger.getLogger(AdbUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdbUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdbUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdbUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdbUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdvancedFilter;
    private javax.swing.JButton btnContinue;
    private javax.swing.JCheckBox cbDataApp;
    private javax.swing.JCheckBox cbSystemAlarms;
    private javax.swing.JCheckBox cbSystemApp;
    private javax.swing.JCheckBox cbSystemFonts;
    private javax.swing.JCheckBox cbSystemMedia;
    private javax.swing.JCheckBox cbSystemNotifications;
    private javax.swing.JCheckBox cbSystemPrivApp;
    private javax.swing.JCheckBox cbSystemRingtones;
    private javax.swing.JCheckBox cbSystemUI;
    private javax.swing.JLabel lblChoose;
    private javax.swing.JLabel lblDeviceIdentified;
    private javax.swing.JLabel lblDeviceName;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
