/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.VitalSigns;
import model.VitalSignsHistory;

/**
 *
 * @author apple
 */
public class ViewJPanel extends javax.swing.JPanel {
    
    VitalSignsHistory history;

    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(VitalSignsHistory vitalSignsHistory) {
        initComponents();
        this.history = vitalSignsHistory;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelToDeleteAndView = new javax.swing.JPanel();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblViewTemperature = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        lblViewPulse = new javax.swing.JLabel();
        lblViewDate = new javax.swing.JLabel();
        txtViewPulse = new javax.swing.JTextField();
        txtViewTemperature = new javax.swing.JTextField();
        txtViewDate = new javax.swing.JTextField();
        txtViewBloodPressure = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("View vital signs");

        jPanelToDeleteAndView.setBackground(new java.awt.Color(0, 204, 204));

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblViewTemperature.setText("Temperature");

        lblBloodPressure.setText("Blood Pressure");

        lblViewPulse.setText("Pulse");

        lblViewDate.setText("Date");

        txtViewPulse.setEditable(false);
        txtViewPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewPulseActionPerformed(evt);
            }
        });

        txtViewTemperature.setEditable(false);
        txtViewTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewTemperatureActionPerformed(evt);
            }
        });

        txtViewDate.setEditable(false);
        txtViewDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewDateActionPerformed(evt);
            }
        });

        txtViewBloodPressure.setEditable(false);
        txtViewBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewBloodPressureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelToDeleteAndViewLayout = new javax.swing.GroupLayout(jPanelToDeleteAndView);
        jPanelToDeleteAndView.setLayout(jPanelToDeleteAndViewLayout);
        jPanelToDeleteAndViewLayout.setHorizontalGroup(
            jPanelToDeleteAndViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelToDeleteAndViewLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanelToDeleteAndViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBloodPressure, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblViewTemperature, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblViewPulse, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblViewDate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelToDeleteAndViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtViewTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(txtViewBloodPressure)
                    .addComponent(txtViewPulse)
                    .addComponent(txtViewDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addGap(14, 14, 14))
        );
        jPanelToDeleteAndViewLayout.setVerticalGroup(
            jPanelToDeleteAndViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToDeleteAndViewLayout.createSequentialGroup()
                .addGroup(jPanelToDeleteAndViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelToDeleteAndViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtViewTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblViewTemperature))
                    .addGroup(jPanelToDeleteAndViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelToDeleteAndViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelToDeleteAndViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBloodPressure)
                            .addComponent(txtViewBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelToDeleteAndViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblViewPulse)
                            .addComponent(txtViewPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelToDeleteAndViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtViewDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblViewDate))
                .addGap(0, 46, Short.MAX_VALUE))
        );

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Temperature", "Blood pressure", "Pulse", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblView.setSelectionBackground(new java.awt.Color(153, 0, 0));
        tblView.setSelectionForeground(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(tblView);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanelToDeleteAndView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelToDeleteAndView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblView.getSelectedRow();
        
        if (selectedIndex<0){
            JOptionPane.showMessageDialog(jPanelToDeleteAndView,"No row slected!","Warning",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        VitalSigns selectedVitalSigns = (VitalSigns) model.getValueAt(selectedIndex,0);
        
        if (selectedVitalSigns != null){
            txtViewTemperature.setText(Double.toString(selectedVitalSigns.getTemperature()));
            txtViewBloodPressure.setText(Double.toString(selectedVitalSigns.getBloodPressure()));
            txtViewPulse.setText(Integer.toString(selectedVitalSigns.getPulse()));
            txtViewDate.setText(selectedVitalSigns.getDate());
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtViewPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewPulseActionPerformed

    private void txtViewDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewDateActionPerformed

    private void txtViewBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewBloodPressureActionPerformed

    private void txtViewTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewTemperatureActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedIndex = tblView.getSelectedRow();
        
        if (selectedIndex<0){
            JOptionPane.showMessageDialog(jPanelToDeleteAndView,"No row slected!","Warning",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        VitalSigns selectedVitalSigns = (VitalSigns) model.getValueAt(selectedIndex,0);
        
        if (selectedVitalSigns != null){
            history.removeVitals(selectedVitalSigns);
            JOptionPane.showMessageDialog(jPanelToDeleteAndView, "Deleted successfully", "success", JOptionPane.INFORMATION_MESSAGE);
        }
        
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelToDeleteAndView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblViewDate;
    private javax.swing.JLabel lblViewPulse;
    private javax.swing.JLabel lblViewTemperature;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtViewBloodPressure;
    private javax.swing.JTextField txtViewDate;
    private javax.swing.JTextField txtViewPulse;
    private javax.swing.JTextField txtViewTemperature;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        model.setRowCount(0);
        for (VitalSigns vs: history.getHistory() ){
            Object[] row = new Object[4];
            
            row[0] = vs;
            row[1] = vs.getBloodPressure();
            row[2] = vs.getPulse();
            row[3] = vs.getDate();
            
            model.addRow(row);
        }
    }
}
