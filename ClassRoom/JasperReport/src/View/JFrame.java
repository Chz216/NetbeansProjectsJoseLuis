/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerReport;

/**
 *
 * @author NAMAN
 */
public class JFrame extends javax.swing.JFrame {
    /**
     * Creates new form JFrame
     */
    ControllerReport controller = new ControllerReport();
    public JFrame() {
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

        ExecuteReport = new javax.swing.JButton();
        txtparameter = new javax.swing.JTextField();
        SendParameters = new javax.swing.JButton();
        ExecuteQuery = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        SendQuery = new javax.swing.JButton();
        ExcuteBarChartReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ExecuteReport.setText("Execute Report");
        ExecuteReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteReportActionPerformed(evt);
            }
        });

        SendParameters.setText("Send Parameter");
        SendParameters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendParametersActionPerformed(evt);
            }
        });

        ExecuteQuery.setText("Excute Query");
        ExecuteQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteQueryActionPerformed(evt);
            }
        });

        SendQuery.setText("Send Parameter to Query");
        SendQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendQueryActionPerformed(evt);
            }
        });

        ExcuteBarChartReport.setText("Excute BarChartReport");
        ExcuteBarChartReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcuteBarChartReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExecuteReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtparameter)
                    .addComponent(SendParameters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExecuteQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDni)
                    .addComponent(SendQuery, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(ExcuteBarChartReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(ExecuteReport)
                .addGap(26, 26, 26)
                .addComponent(txtparameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SendParameters)
                .addGap(18, 18, 18)
                .addComponent(ExecuteQuery)
                .addGap(18, 18, 18)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SendQuery)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExcuteBarChartReport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExecuteReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteReportActionPerformed
        controller.executeReport();
        setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_ExecuteReportActionPerformed

    private void SendParametersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendParametersActionPerformed
        controller.excuteReportWhitParameters(txtparameter.getText());
    }//GEN-LAST:event_SendParametersActionPerformed

    private void ExecuteQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteQueryActionPerformed
        controller.executeReportWithSql();
        setVisible(true);
        setLocationRelativeTo(null);// TODO add your handling code here:
    }//GEN-LAST:event_ExecuteQueryActionPerformed

    private void SendQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendQueryActionPerformed
        controller.excuteReportWhitParametersSql(txtDni.getText());
    }//GEN-LAST:event_SendQueryActionPerformed

    private void ExcuteBarChartReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcuteBarChartReportActionPerformed
         controller.excuteReportBarChartReport();
    }//GEN-LAST:event_ExcuteBarChartReportActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExcuteBarChartReport;
    private javax.swing.JButton ExecuteQuery;
    private javax.swing.JButton ExecuteReport;
    private javax.swing.JButton SendParameters;
    private javax.swing.JButton SendQuery;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtparameter;
    // End of variables declaration//GEN-END:variables
}
