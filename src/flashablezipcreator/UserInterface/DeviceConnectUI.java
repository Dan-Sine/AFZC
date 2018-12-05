/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashablezipcreator.UserInterface;

import flashablezipcreator.Protocols.Device;
import javax.swing.JOptionPane;

/**
 *
 * @author NBCTNBM
 */
public class DeviceConnectUI extends javax.swing.JFrame {

    /**
     * Creates new form DeviceConnectUI
     */
    public DeviceConnectUI() {
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

        panel = new javax.swing.JPanel();
        panelWifiConnect = new javax.swing.JLayeredPane();
        txtIP1Address = new javax.swing.JTextField();
        lbldot1 = new javax.swing.JLabel();
        txtIP2Address = new javax.swing.JTextField();
        lbldot2 = new javax.swing.JLabel();
        txtIP3Address = new javax.swing.JTextField();
        lbldot3 = new javax.swing.JLabel();
        txtIP4Address = new javax.swing.JTextField();
        txtIP4Address = new javax.swing.JTextField(){

            public void addNotify() {
                super.addNotify();
                requestFocus();
            }
        };
        btnConnectToDevice = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new java.awt.CardLayout());

        txtIP1Address.setEditable(false);
        txtIP1Address.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        txtIP1Address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIP1Address.setText("192");

        lbldot1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbldot1.setText(".");
        lbldot1.setPreferredSize(new java.awt.Dimension(6, 33));

        txtIP2Address.setEditable(false);
        txtIP2Address.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        txtIP2Address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIP2Address.setText("168");

        lbldot2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbldot2.setText(".");
        lbldot2.setPreferredSize(new java.awt.Dimension(6, 33));

        txtIP3Address.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        txtIP3Address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIP3Address.setText("2");

        lbldot3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbldot3.setText(".");
        lbldot3.setPreferredSize(new java.awt.Dimension(6, 33));

        txtIP4Address.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        txtIP4Address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIP4Address.setText("11");

        btnConnectToDevice.setBackground(new java.awt.Color(153, 153, 255));
        btnConnectToDevice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConnectToDevice.setForeground(new java.awt.Color(62, 39, 35));
        btnConnectToDevice.setText("Connect To Device");
        btnConnectToDevice.setBorder(null);
        btnConnectToDevice.setContentAreaFilled(false);
        btnConnectToDevice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConnectToDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectToDeviceActionPerformed(evt);
            }
        });

        panelWifiConnect.setLayer(txtIP1Address, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelWifiConnect.setLayer(lbldot1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelWifiConnect.setLayer(txtIP2Address, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelWifiConnect.setLayer(lbldot2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelWifiConnect.setLayer(txtIP3Address, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelWifiConnect.setLayer(lbldot3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelWifiConnect.setLayer(txtIP4Address, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelWifiConnect.setLayer(btnConnectToDevice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelWifiConnectLayout = new javax.swing.GroupLayout(panelWifiConnect);
        panelWifiConnect.setLayout(panelWifiConnectLayout);
        panelWifiConnectLayout.setHorizontalGroup(
            panelWifiConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWifiConnectLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(panelWifiConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConnectToDevice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelWifiConnectLayout.createSequentialGroup()
                        .addComponent(txtIP1Address, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbldot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIP2Address, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbldot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIP3Address, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbldot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIP4Address, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        panelWifiConnectLayout.setVerticalGroup(
            panelWifiConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWifiConnectLayout.createSequentialGroup()
                .addGroup(panelWifiConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelWifiConnectLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(lbldot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelWifiConnectLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(panelWifiConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIP3Address, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelWifiConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIP1Address, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtIP2Address, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtIP4Address, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelWifiConnectLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panelWifiConnectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbldot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbldot3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(77, 77, 77)
                .addComponent(btnConnectToDevice, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(119, 119, 119))
        );

        panel.add(panelWifiConnect, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConnectToDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectToDeviceActionPerformed
        if (txtIP3Address.getText().equals("") || txtIP4Address.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter IP Address to connect!");
        } else {
            String IP = txtIP1Address.getText() + "." + txtIP2Address.getText() + "."
                    + txtIP3Address.getText() + "." + txtIP4Address.getText() + ":5555";
            Device.IPAddress = IP;

            if (Device.checkDeviceConnectivity(IP) == 1) {
                JOptionPane.showMessageDialog(this, "Device Is Connected!");
                flashablezipcreator.FlashableZipCreator.tree.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Unable to connect to the device!\n"
                        + "Make sure you are connected to correct IP or you have allowed this computer to connect to your device!");
                btnConnectToDevice.setText("Try Again!");
            }
        }
    }//GEN-LAST:event_btnConnectToDeviceActionPerformed

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
            java.util.logging.Logger.getLogger(DeviceConnectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeviceConnectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeviceConnectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeviceConnectUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeviceConnectUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnectToDevice;
    private javax.swing.JLabel lbldot1;
    private javax.swing.JLabel lbldot2;
    private javax.swing.JLabel lbldot3;
    private javax.swing.JPanel panel;
    private javax.swing.JLayeredPane panelWifiConnect;
    private javax.swing.JTextField txtIP1Address;
    private javax.swing.JTextField txtIP2Address;
    private javax.swing.JTextField txtIP3Address;
    private javax.swing.JTextField txtIP4Address;
    // End of variables declaration//GEN-END:variables
}
