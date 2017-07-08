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
public class PreferenceUI extends javax.swing.JFrame {

    /**
     * Creates new form PreferenceUI
     */
    public PreferenceUI() {
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

        mainPanel = new javax.swing.JPanel();
        lblAromaOptions = new javax.swing.JLabel();
        lblZipOptions = new javax.swing.JLabel();
        btnAromaZip = new javax.swing.JToggleButton();
        btnNormalZip = new javax.swing.JToggleButton();
        btnQuickSetup = new javax.swing.JToggleButton();
        btnSaveTools = new javax.swing.JToggleButton();
        btnCheckUpdates = new javax.swing.JToggleButton();
        lblToolOptions = new javax.swing.JLabel();
        lblAddonDOptions = new javax.swing.JLabel();
        btnEnableAddon = new javax.swing.JToggleButton();
        btnDisplayAddon = new javax.swing.JToggleButton();
        btnSave = new javax.swing.JButton();
        btnMelati = new javax.swing.JButton();
        btnFlamboyan = new javax.swing.JButton();
        btnEdelweis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(66, 66, 66));

        lblAromaOptions.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAromaOptions.setForeground(new java.awt.Color(255, 255, 255));
        lblAromaOptions.setText("Aroma Binary Options");

        lblZipOptions.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblZipOptions.setForeground(new java.awt.Color(255, 255, 255));
        lblZipOptions.setText("Zip Options");

        btnAromaZip.setForeground(new java.awt.Color(186, 194, 198));
        btnAromaZip.setText("<html>Create Zip Type<br><p align='center'>Aroma</p></html>");
        btnAromaZip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 194, 198)));
        btnAromaZip.setContentAreaFilled(false);
        btnAromaZip.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAromaZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAromaZipActionPerformed(evt);
            }
        });

        btnNormalZip.setForeground(new java.awt.Color(186, 194, 198));
        btnNormalZip.setText("<html>Create Zip Type<br><p align='center'>Normal</p></html>");
        btnNormalZip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 194, 198)));
        btnNormalZip.setContentAreaFilled(false);
        btnNormalZip.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNormalZip.setPreferredSize(new java.awt.Dimension(115, 37));
        btnNormalZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNormalZipActionPerformed(evt);
            }
        });

        btnQuickSetup.setForeground(new java.awt.Color(186, 194, 198));
        btnQuickSetup.setText("Quick Setup");
        btnQuickSetup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 194, 198)));
        btnQuickSetup.setContentAreaFilled(false);
        btnQuickSetup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuickSetup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuickSetupActionPerformed(evt);
            }
        });

        btnSaveTools.setForeground(new java.awt.Color(186, 194, 198));
        btnSaveTools.setText("Enable Logging");
        btnSaveTools.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 194, 198)));
        btnSaveTools.setContentAreaFilled(false);
        btnSaveTools.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaveTools.setPreferredSize(new java.awt.Dimension(100, 37));
        btnSaveTools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveToolsActionPerformed(evt);
            }
        });

        btnCheckUpdates.setForeground(new java.awt.Color(186, 194, 198));
        btnCheckUpdates.setText("<html>Check For<br><p align='center'>Updates</p></html>");
        btnCheckUpdates.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 194, 198)));
        btnCheckUpdates.setContentAreaFilled(false);
        btnCheckUpdates.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCheckUpdates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckUpdatesActionPerformed(evt);
            }
        });

        lblToolOptions.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblToolOptions.setForeground(new java.awt.Color(255, 255, 255));
        lblToolOptions.setText("Tool Options");

        lblAddonDOptions.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAddonDOptions.setForeground(new java.awt.Color(255, 255, 255));
        lblAddonDOptions.setText("Addon.d Options");

        btnEnableAddon.setForeground(new java.awt.Color(186, 194, 198));
        btnEnableAddon.setText("<html>Enable Support<br><p align='center'>by default</p></html>");
        btnEnableAddon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 194, 198)));
        btnEnableAddon.setContentAreaFilled(false);
        btnEnableAddon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnableAddon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnableAddonActionPerformed(evt);
            }
        });

        btnDisplayAddon.setForeground(new java.awt.Color(186, 194, 198));
        btnDisplayAddon.setText("<html>Display Addon.d<br><p align='center'>Menu in Aroma</p></html>");
        btnDisplayAddon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 194, 198)));
        btnDisplayAddon.setContentAreaFilled(false);
        btnDisplayAddon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDisplayAddon.setPreferredSize(new java.awt.Dimension(115, 37));
        btnDisplayAddon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayAddonActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 194, 198)));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnMelati.setForeground(new java.awt.Color(186, 194, 198));
        btnMelati.setText("<html>Version 3.00<br><p align='center'>MELATI</p></html>");
        btnMelati.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 194, 198)));
        btnMelati.setContentAreaFilled(false);
        btnMelati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMelatiActionPerformed(evt);
            }
        });

        btnFlamboyan.setForeground(new java.awt.Color(186, 194, 198));
        btnFlamboyan.setText("<html>Version 2.70<br><p align='center'>FLAMBOYAN</p></html>");
        btnFlamboyan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 194, 198)));
        btnFlamboyan.setContentAreaFilled(false);
        btnFlamboyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlamboyanActionPerformed(evt);
            }
        });

        btnEdelweis.setForeground(new java.awt.Color(186, 194, 198));
        btnEdelweis.setText("<html>Version 2.56<br><p align='center'>EDELWEIS</p></html>");
        btnEdelweis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 194, 198)));
        btnEdelweis.setContentAreaFilled(false);
        btnEdelweis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdelweisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblToolOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddonDOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAromaOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(btnNormalZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(btnCheckUpdates)
                                    .addGap(30, 30, 30)))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDisplayAddon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblZipOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMelati))
                                .addGap(29, 29, 29)))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAromaZip, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(btnQuickSetup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnableAddon)
                            .addComponent(btnFlamboyan))
                        .addGap(29, 29, 29)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaveTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdelweis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblAromaOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMelati, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFlamboyan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdelweis, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblZipOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNormalZip, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAromaZip, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblToolOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCheckUpdates, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveTools, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuickSetup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAddonDOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDisplayAddon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnableAddon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAromaZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAromaZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAromaZipActionPerformed

    private void btnNormalZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNormalZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNormalZipActionPerformed

    private void btnCheckUpdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckUpdatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckUpdatesActionPerformed

    private void btnQuickSetupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuickSetupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuickSetupActionPerformed

    private void btnSaveToolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveToolsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveToolsActionPerformed

    private void btnDisplayAddonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayAddonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDisplayAddonActionPerformed

    private void btnEnableAddonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnableAddonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnableAddonActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnMelatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMelatiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMelatiActionPerformed

    private void btnFlamboyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlamboyanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFlamboyanActionPerformed

    private void btnEdelweisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdelweisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEdelweisActionPerformed

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
            java.util.logging.Logger.getLogger(PreferenceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreferenceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreferenceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreferenceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreferenceUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAromaZip;
    private javax.swing.JToggleButton btnCheckUpdates;
    private javax.swing.JToggleButton btnDisplayAddon;
    private javax.swing.JButton btnEdelweis;
    private javax.swing.JToggleButton btnEnableAddon;
    private javax.swing.JButton btnFlamboyan;
    private javax.swing.JButton btnMelati;
    private javax.swing.JToggleButton btnNormalZip;
    private javax.swing.JToggleButton btnQuickSetup;
    private javax.swing.JButton btnSave;
    private javax.swing.JToggleButton btnSaveTools;
    private javax.swing.JLabel lblAddonDOptions;
    private javax.swing.JLabel lblAromaOptions;
    private javax.swing.JLabel lblToolOptions;
    private javax.swing.JLabel lblZipOptions;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}