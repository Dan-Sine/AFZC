/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flashablezipcreator.UserInterface;

import flashablezipcreator.FileSystemModel;
import java.io.File;

/**
 *
 * @author Nikhil
 */
public class JTreeDemo extends javax.swing.JFrame {

    /**
     * Creates new form JTreeDemo
     */
    public JTreeDemo() {
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
        panel_logo = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        SP_tree = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        panelLower = new javax.swing.JPanel();
        layeredPaneButtons = new javax.swing.JLayeredPane();
        panelImportZip = new javax.swing.JPanel();
        btnImportZip = new javax.swing.JButton();
        panelCreateZip = new javax.swing.JPanel();
        btnCreateZip = new javax.swing.JButton();
        layeredPaneProgressBar = new javax.swing.JLayeredPane();
        progressBarImportExport = new javax.swing.JProgressBar();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemPreferences = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panel_logo.setBackground(new java.awt.Color(120, 144, 156));
        panel_logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("   Android Flashable Zip Creator");

        javax.swing.GroupLayout panel_logoLayout = new javax.swing.GroupLayout(panel_logo);
        panel_logo.setLayout(panel_logoLayout);
        panel_logoLayout.setHorizontalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_logoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_logoLayout.setVerticalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        tree.setModel(new FileSystemModel(new File("src")));
        tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                treeMouseEntered(evt);
            }
        });
        SP_tree.setViewportView(tree);

        panelLower.setBackground(new java.awt.Color(255, 255, 255));
        panelLower.setLayout(new java.awt.CardLayout());

        panelImportZip.setBackground(new java.awt.Color(120, 144, 156));

        btnImportZip.setBackground(new java.awt.Color(153, 153, 255));
        btnImportZip.setForeground(new java.awt.Color(255, 255, 255));
        btnImportZip.setText("Import Zip");
        btnImportZip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnImportZip.setContentAreaFilled(false);
        btnImportZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportZipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImportZipLayout = new javax.swing.GroupLayout(panelImportZip);
        panelImportZip.setLayout(panelImportZipLayout);
        panelImportZipLayout.setHorizontalGroup(
            panelImportZipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnImportZip, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        panelImportZipLayout.setVerticalGroup(
            panelImportZipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnImportZip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        panelCreateZip.setBackground(new java.awt.Color(120, 144, 156));

        btnCreateZip.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateZip.setText("Create Zip");
        btnCreateZip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCreateZip.setContentAreaFilled(false);
        btnCreateZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateZipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCreateZipLayout = new javax.swing.GroupLayout(panelCreateZip);
        panelCreateZip.setLayout(panelCreateZipLayout);
        panelCreateZipLayout.setHorizontalGroup(
            panelCreateZipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCreateZip, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        panelCreateZipLayout.setVerticalGroup(
            panelCreateZipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCreateZip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layeredPaneButtonsLayout = new javax.swing.GroupLayout(layeredPaneButtons);
        layeredPaneButtons.setLayout(layeredPaneButtonsLayout);
        layeredPaneButtonsLayout.setHorizontalGroup(
            layeredPaneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneButtonsLayout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(panelImportZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCreateZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layeredPaneButtonsLayout.setVerticalGroup(
            layeredPaneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layeredPaneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelImportZip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCreateZip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layeredPaneButtons.setLayer(panelImportZip, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneButtons.setLayer(panelCreateZip, javax.swing.JLayeredPane.DEFAULT_LAYER);

        panelLower.add(layeredPaneButtons, "card1");

        progressBarImportExport.setForeground(new java.awt.Color(120, 144, 156));
        progressBarImportExport.setToolTipText("Click To Change Progress Mode");
        progressBarImportExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        progressBarImportExport.setStringPainted(true);
        progressBarImportExport.setVerifyInputWhenFocusTarget(false);
        progressBarImportExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                progressBarImportExportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layeredPaneProgressBarLayout = new javax.swing.GroupLayout(layeredPaneProgressBar);
        layeredPaneProgressBar.setLayout(layeredPaneProgressBarLayout);
        layeredPaneProgressBarLayout.setHorizontalGroup(
            layeredPaneProgressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
            .addGroup(layeredPaneProgressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(progressBarImportExport, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
        );
        layeredPaneProgressBarLayout.setVerticalGroup(
            layeredPaneProgressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
            .addGroup(layeredPaneProgressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(progressBarImportExport, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
        );
        layeredPaneProgressBar.setLayer(progressBarImportExport, javax.swing.JLayeredPane.DEFAULT_LAYER);

        panelLower.add(layeredPaneProgressBar, "card2");

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelLower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panel_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SP_tree)
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panel_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SP_tree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelLower, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuFile.setText("File");

        menuItemPreferences.setText("Preferences");
        menuItemPreferences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPreferencesActionPerformed(evt);
            }
        });
        menuFile.add(menuItemPreferences);

        menuItemExit.setText("Exit");
        menuFile.add(menuItemExit);

        menuBar.add(menuFile);

        menuAbout.setText("About");
        menuBar.add(menuAbout);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateZipActionPerformed

    private void btnImportZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImportZipActionPerformed

    private void treeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_treeMouseClicked

    private void treeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_treeMouseEntered

    private void menuItemPreferencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPreferencesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemPreferencesActionPerformed

    private void progressBarImportExportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_progressBarImportExportMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_progressBarImportExportMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JTreeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTreeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTreeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTreeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTreeDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane SP_tree;
    private javax.swing.JButton btnCreateZip;
    private javax.swing.JButton btnImportZip;
    private javax.swing.JLayeredPane layeredPaneButtons;
    private javax.swing.JLayeredPane layeredPaneProgressBar;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemPreferences;
    private javax.swing.JPanel panelCreateZip;
    private javax.swing.JPanel panelImportZip;
    private javax.swing.JPanel panelLower;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panel_logo;
    private javax.swing.JProgressBar progressBarImportExport;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables
}
