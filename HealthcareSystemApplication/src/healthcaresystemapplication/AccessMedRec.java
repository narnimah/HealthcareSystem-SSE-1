/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcaresystemapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebParam;
import healthcaresystemapplication.HealthcareSystemGUI;

/**
 *
 * @author Nikitha Mahesh
 */
public class AccessMedRec extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form AccessMedRec
     */
    
    HealthcareSystemGUI b1 = new HealthcareSystemGUI();
    String temp=b1.uname;
    
    public AccessMedRec() {
        initComponents();
            System.out.println(temp);
            String callDB = signIn();
        System.out.println("Calling database"+callDB);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        label1 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        textField1 = new java.awt.TextField();
        JT_doctorvisit = new javax.swing.JTextField();
        JT_labresult = new javax.swing.JTextField();
        JT_radioreport = new javax.swing.JTextField();
        JT_pathreport = new javax.swing.JTextField();
        JT_allinfo = new javax.swing.JTextField();
        JT_medicine = new javax.swing.JTextField();
        JT_problem = new javax.swing.JTextField();
        JT_treatment = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JT_nurseid = new javax.swing.JTextField();
        JT_doctorid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        exit_btn = new javax.swing.JButton();

        label1.setText("label1");

        jTextField1.setText("jTextField1");

        textField1.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JT_doctorvisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_doctorvisitActionPerformed(evt);
            }
        });

        JT_pathreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_pathreportActionPerformed(evt);
            }
        });

        JT_allinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_allinfoActionPerformed(evt);
            }
        });

        jLabel1.setText("Doctor Visit Summary");

        jLabel2.setText("Lab Result");

        jLabel3.setText("Radiology Report");

        jLabel4.setText("Pathology Report");

        jLabel5.setText("Allergy Iinformation");

        jLabel6.setText("Prescribed Medicines");

        jLabel7.setText("Problem");

        jLabel8.setText("Treatment");

        jLabel9.setText("NurseID");

        jLabel10.setText("DoctorID");

        exit_btn.setText("Exit");
        exit_btn.setToolTipText("");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JT_radioreport, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(JT_pathreport)
                            .addComponent(JT_doctorvisit)
                            .addComponent(JT_labresult))
                        .addGap(180, 180, 180))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JT_nurseid)
                        .addGap(176, 176, 176)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JT_allinfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(JT_medicine, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JT_problem)
                    .addComponent(JT_treatment)
                    .addComponent(JT_doctorid))
                .addGap(138, 138, 138))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit_btn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JT_doctorvisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(JT_allinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_labresult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(JT_medicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JT_radioreport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(JT_problem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JT_pathreport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JT_treatment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JT_nurseid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(JT_doctorid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit_btn)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JT_doctorvisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_doctorvisitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_doctorvisitActionPerformed

    private void JT_pathreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_pathreportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_pathreportActionPerformed

    private void JT_allinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_allinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_allinfoActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exit_btnActionPerformed


    
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
            java.util.logging.Logger.getLogger(AccessMedRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccessMedRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccessMedRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccessMedRec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        AccessMedRec c1=new AccessMedRec();
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccessMedRec().setVisible(true);
                //String temp=b1.name;
                String callDB=c1.signIn(); 
               System.out.println("Calling database"+callDB);
            }
        });*/
        
        
        String callDB = c1.signIn();
        System.out.println("Calling database"+callDB);
    }

        public String signIn() {
        //TODO Sign in logic
            Session session = Session.getInstance();
            temp = session.getUsername();
            System.out.println("Singleton User:" + temp);
            
            Security sec = new Security();
            
            String data = getMedicalRecord(sec.encrypt(temp));
            StringBuilder str = new StringBuilder();
            System.out.println(data);
            if(data.length() == 0){
                new cardPopup("No Medical Record Available").setVisible(true);
            }else{
                int k = 0;
                for(int i = 0; i < 10; i++){
                    while(data.charAt(k) !='*'){
                        str.append(data.charAt(k));
                        k++;
                    }
                    k++;
                    switch(i){
                        case 0:
                            JT_doctorvisit.setText(str.toString());
                            break;
                        case 1:
                            JT_labresult.setText(str.toString());

                            break;
                        case 2:
                            JT_radioreport.setText(str.toString());
                            break;
                        case 3:
                            JT_pathreport.setText(str.toString());
                            break;
                        case 4:
                            JT_allinfo.setText(str.toString());
                            break;
                        case 5:
                            JT_medicine.setText(str.toString());
                            break;
                        case 6:
                            JT_problem.setText(str.toString());
                            break;
                        case 7:
                            JT_treatment.setText(str.toString());
                            break;
                        case 8:
                            JT_nurseid.setText(str.toString());
                            break;
                        case 9:
                            JT_doctorid.setText(str.toString());
                            break;
                        default:
                            break;
                    }
                    str.setLength(0);
                }

            }
            
            
            
            
            
            
            
            
            
            setVisible(true);
            return "Success";
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JT_allinfo;
    private javax.swing.JTextField JT_doctorid;
    private javax.swing.JTextField JT_doctorvisit;
    private javax.swing.JTextField JT_labresult;
    private javax.swing.JTextField JT_medicine;
    private javax.swing.JTextField JT_nurseid;
    private javax.swing.JTextField JT_pathreport;
    private javax.swing.JTextField JT_problem;
    private javax.swing.JTextField JT_radioreport;
    private javax.swing.JTextField JT_treatment;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    private java.awt.TextArea textArea1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
       String c2=signIn();
    }

    private static String getMedicalRecord(java.lang.String username) {
        org.me.healthcaresystem.MedicalRec service = new org.me.healthcaresystem.MedicalRec();
        org.me.healthcaresystem.AccessMedRec port = service.getAccessMedRecPort();
        return port.getMedicalRecord(username);
    }


}