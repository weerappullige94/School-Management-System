
package university_of_nsbm;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Deletepcourse extends javax.swing.JFrame {
    DBOperation6 dbop6 = new DBOperation6();
    PC_registration_form pcrf2;
    
    public Deletepcourse() {
        initComponents();
    }
    
     void setFields(PC_registration_form pcrf1){
         pcrf2=pcrf1;
        textRegID.setText(new Integer(pcrf1.getRegID()).toString());
        textFullname.setText(pcrf1.getFullName());
        textSubject1.setText(pcrf1.getSubject1());
        textSubject2.setText(pcrf1.getSubject2());
        textSubject3.setText(pcrf1.getSubject3());
        textSubject4.setText(pcrf1.getSubject4());
        textCode1.setText(pcrf1.getCode1());
        textCode2.setText(pcrf1.getCode2());
        textCode3.setText(pcrf1.getCode3());
        textCode4.setText(pcrf1.getCode4());
        textYear.setSelectedItem(pcrf1.getYear());
        textFacalty.setSelectedItem(pcrf1.getFacalty());
        textSemester.setSelectedItem(pcrf1.getSemester());
        textPaymentcode.setText(pcrf1.getPaymentCode());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textCode3 = new javax.swing.JTextField();
        textSubject2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        textSubject4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textSubject3 = new javax.swing.JTextField();
        textFacalty = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textCode1 = new javax.swing.JTextField();
        textFullname = new javax.swing.JTextField();
        textRegID = new javax.swing.JTextField();
        textYear = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        textCode2 = new javax.swing.JTextField();
        textPaymentcode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textCode4 = new javax.swing.JTextField();
        textSubject1 = new javax.swing.JTextField();
        textSemester = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        textCode3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textCode3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCode3ActionPerformed(evt);
            }
        });

        textSubject2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textSubject2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSubject2ActionPerformed(evt);
            }
        });

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textSubject4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textSubject4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSubject4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Course Registration Form");

        textSubject3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textSubject3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSubject3ActionPerformed(evt);
            }
        });

        textFacalty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textFacalty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School Of Business", "School Of Computing", "School Of Engineering" }));

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Payment Code:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Reg ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Full Name :");

        textCode1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textCode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCode1ActionPerformed(evt);
            }
        });

        textFullname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFullnameActionPerformed(evt);
            }
        });

        textRegID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textRegID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRegIDActionPerformed(evt);
            }
        });

        textYear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 st Year", "2 nd Year", "3 rd Year", "4 th Year", " " }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Subjects & Codes :");

        textCode2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textCode2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCode2ActionPerformed(evt);
            }
        });

        textPaymentcode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textPaymentcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPaymentcodeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Semester :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Year :");

        textCode4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textCode4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCode4ActionPerformed(evt);
            }
        });

        textSubject1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textSubject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSubject1ActionPerformed(evt);
            }
        });

        textSemester.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Facalty :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFullname, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(textSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(textCode3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(textSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(textCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textSubject4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(textCode4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(textYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(textSemester, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textPaymentcode, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textFacalty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(textRegID, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addGap(276, 276, 276))))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textRegID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCode2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCode3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCode4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSubject4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(textYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textFacalty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(textPaymentcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textCode3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCode3ActionPerformed

    }//GEN-LAST:event_textCode3ActionPerformed

    private void textSubject2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSubject2ActionPerformed

    }//GEN-LAST:event_textSubject2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // go  back to course registration page
        Course_Registration cr = new Course_Registration();
        cr.setVisible(true);
        cr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textSubject4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSubject4ActionPerformed

    }//GEN-LAST:event_textSubject4ActionPerformed

    private void textSubject3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSubject3ActionPerformed

    }//GEN-LAST:event_textSubject3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // create an instance of the entity class
        

        if(dbop6.deletepcourse(pcrf2)){
            JOptionPane.showMessageDialog(this,"Succesfully Deleted!");//say insert successfully
            this.dispose();
            return;
        }else{
            JOptionPane.showMessageDialog(this,"Error");//say not insert successfully
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textCode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCode1ActionPerformed

    }//GEN-LAST:event_textCode1ActionPerformed

    private void textFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFullnameActionPerformed

    private void textRegIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRegIDActionPerformed

    }//GEN-LAST:event_textRegIDActionPerformed

    private void textCode2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCode2ActionPerformed

    }//GEN-LAST:event_textCode2ActionPerformed

    private void textPaymentcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPaymentcodeActionPerformed

    }//GEN-LAST:event_textPaymentcodeActionPerformed

    private void textCode4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCode4ActionPerformed

    }//GEN-LAST:event_textCode4ActionPerformed

    private void textSubject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSubject1ActionPerformed

    }//GEN-LAST:event_textSubject1ActionPerformed

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
            java.util.logging.Logger.getLogger(Deletepcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deletepcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deletepcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deletepcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deletepcourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField textCode1;
    private javax.swing.JTextField textCode2;
    private javax.swing.JTextField textCode3;
    private javax.swing.JTextField textCode4;
    private javax.swing.JComboBox<String> textFacalty;
    private javax.swing.JTextField textFullname;
    private javax.swing.JTextField textPaymentcode;
    private javax.swing.JTextField textRegID;
    private javax.swing.JComboBox<String> textSemester;
    private javax.swing.JTextField textSubject1;
    private javax.swing.JTextField textSubject2;
    private javax.swing.JTextField textSubject3;
    private javax.swing.JTextField textSubject4;
    private javax.swing.JComboBox<String> textYear;
    // End of variables declaration//GEN-END:variables
}
