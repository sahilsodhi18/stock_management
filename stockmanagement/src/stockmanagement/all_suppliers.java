/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Sahil
 */
public class all_suppliers extends javax.swing.JInternalFrame implements myvariables
{

    /**
     * Creates new form all_accounts
     */
    public all_suppliers() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("All_Accounts");
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setPreferredSize(new java.awt.Dimension(1300, 650));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("All Suppliers");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier Id", "Supplier Name", "Company Name", "Gender", "Address", "Phone", "Email", "Total Business", "Pending Amount", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose", "Supplier Id", "Supplier Name" }));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1264, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(173, 173, 173)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(534, 534, 534))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton2)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        
       
        
    }//GEN-LAST:event_formInternalFrameActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(jComboBox2.getSelectedItem().toString().equals("Choose") || jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Please fill Mandatory Fields .");
        }
        else
        {
        try
            {
                Connection myconnection ; 
                myconnection=DriverManager.getConnection(path+place,username,password);
                try
                {
               
                            // all accounts details

                    
                if(jComboBox2.getSelectedIndex()==1)
                {
                    String q = "select * from supplier_table where supplier_id like ?";
                    
                    PreparedStatement mystatement = myconnection.prepareStatement(q);
                    
                    
                    mystatement.setString(1,'%'+jTextField1.getText().toUpperCase()+'%');

                    ResultSet myresult = mystatement.executeQuery();

                    DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                    mymodel.setRowCount(0);
                
                        if(myresult.next())
                        {
                            do
                            {
                                String id = myresult.getString("supplier_id");
                                String name = myresult.getString("supplier_name");
                                String gender = myresult.getString("gender");
                                String comp = myresult.getString("company_name");
                                String phone = myresult.getString("phone");
                                String address = myresult.getString("address");
                                String email = myresult.getString("email");
                                String status = myresult.getString("status");
                                String tb = myresult.getString("total_business");
                                String pa = myresult.getString("pending_amt");
                        
                                mymodel.addRow(new Object[] {id,comp,name,gender,address,phone,email,tb,pa,status});
                            }
                            while(myresult.next());
                        }
                        
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane," No Records Found .");
                        }
                    }
                else if(jComboBox2.getSelectedIndex()==2)
                {
                    String q = "select * from supplier_table where supplier_name like ?";
                    
                    PreparedStatement mystatement = myconnection.prepareStatement(q);
                    
                    
                    mystatement.setString(1,'%'+jTextField1.getText().toUpperCase()+'%');

                    ResultSet myresult = mystatement.executeQuery();

                    DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                    mymodel.setRowCount(0);
                
                        if(myresult.next())
                        {
                            do
                            {
                                String id = myresult.getString("supplier_id");
                                String name = myresult.getString("supplier_name");
                                String gender = myresult.getString("gender");
                                String comp = myresult.getString("company_name");
                                String phone = myresult.getString("phone");
                                String address = myresult.getString("address");
                                String email = myresult.getString("email");
                                String status = myresult.getString("status");
                                String tb = myresult.getString("total_business");
                                String pa = myresult.getString("pending_amt");
                        
                                mymodel.addRow(new Object[] {id,comp,name,gender,address,phone,email,tb,pa,status});
                            }
                            while(myresult.next());
                        }
                        
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane," No Records Found .");
                        }
                }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane,"Error in Query , "+e.getMessage());
                }
                finally
                {
                    myconnection.close();
                }
                            
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error in Connection "+e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
         try
            {
                Connection myconnection ; 
                myconnection=DriverManager.getConnection(path+place,username,password);
                try
                {
                
                        // all employee details
                
                String q = "select * from supplier_table";
                    
                    PreparedStatement mystatement = myconnection.prepareStatement(q);
                  

                    ResultSet myresult = mystatement.executeQuery();

                    DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                    mymodel.setRowCount(0);
                
                        if(myresult.next())
                        {
                            do
                            {
                                String id = myresult.getString("supplier_id");
                                String name = myresult.getString("supplier_name");
                                String gender = myresult.getString("gender");
                                String comp = myresult.getString("company_name");
                                String phone = myresult.getString("phone");
                                String address = myresult.getString("address");
                                String email = myresult.getString("email");
                                String status = myresult.getString("status");
                                String tb = myresult.getString("total_business");
                                String pa = myresult.getString("pending_amt");
                        
                                mymodel.addRow(new Object[] {id,comp,name,gender,address,phone,email,tb,pa,status});
                            }
                            while(myresult.next());
                        }
                        
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane," No Records Found .");
                        }
                
                
               
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane,"Error in Query , "+e.getMessage());
                }
                finally
                {
                    myconnection.close();
                }
                            
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error in Connection "+e.getMessage());
            }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
