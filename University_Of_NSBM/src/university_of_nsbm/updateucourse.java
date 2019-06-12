
package university_of_nsbm;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class updateucourse extends javax.swing.JFrame {
    
    DBOperation5 dbop5 = new DBOperation5();
    
    
    public updateucourse() {
        initComponents();
    }

    void setFields(UC_registration_form ucrf1){
        textRegID.setText(new Integer(ucrf1.getRegID()).toString());
        textFullname.setText(ucrf1.getFullName());
        textSubject1.setText(ucrf1.getSubject1());
        textSubject2.setText(ucrf1.getSubject2());
        textSubject3.setText(ucrf1.getSubject3());
        textSubject4.setText(ucrf1.getSubject4());
        textCode1.setText(ucrf1.getCode1());
        textCode2.setText(ucrf1.getCode2());
        textCode3.setText(ucrf1.getCode3());
        textCode4.setText(ucrf1.getCode4());
        textYear.setSelectedItem(ucrf1.getYear());
        textFacalty.setSelectedItem(ucrf1.getFacalty());
        textSemester.setSelectedItem(ucrf1.getSemester());
        textPaymentcode.setText(ucrf1.getPaymentCode());
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textSemester = new javax.swing.JComboBox<>();
        textSubject3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        textCode1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textCode2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textCode4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textCode3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textSubject4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textYear = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        textFacalty = new javax.swing.JComboBox<>();
        textFullname = new javax.swing.JTextField();
        textPaymentcode = new javax.swing.JTextField();
        textSubject1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textSubject2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textRegID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        textSemester.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd" }));

        textSubject3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textSubject3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSubject3ActionPerformed(evt);
            }
        });

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textCode1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textCode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCode1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save Changes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Course Registration Form");

        textCode2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textCode2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCode2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Reg ID :");

        textCode4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textCode4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCode4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Subjects & Codes :");

        textCode3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textCode3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCode3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Year :");

        textSubject4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textSubject4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSubject4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Facalty :");

        textYear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 st Year", "2 nd Year", "3 rd Year", "4 th Year", " " }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Payment Code:");

        textFacalty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textFacalty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School Of Business", "School Of Computing", "School Of Engineering" }));

        textFullname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFullnameActionPerformed(evt);
            }
        });

        textPaymentcode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textPaymentcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPaymentcodeActionPerformed(evt);
            }
        });

        textSubject1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textSubject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSubject1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Semester :");

        textSubject2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textSubject2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSubject2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Full Name :");

        textRegID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textRegID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRegIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel1)
                .addContainerGap(335, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFullname)
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
                                                .addComponent(textPaymentcode, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textFacalty, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(textRegID, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(319, 319, 319))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textRegID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(textPaymentcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textSubject3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSubject3ActionPerformed

    }//GEN-LAST:event_textSubject3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // go back to course registration page
        Course_Registration cr = new Course_Registration();
        cr.setVisible(true);
        cr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void textCode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCode1ActionPerformed

    }//GEN-LAST:event_textCode1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Create instance of the entity class
        UC_registration_form ucrf1 = new UC_registration_form();
        
        ucrf1.setRegID(new Integer(textRegID.getText()).intValue());
        ucrf1.setFullName(textFullname.getText());
        ucrf1.setSubject1(textSubject1.getText());
        ucrf1.setSubject2(textSubject2.getText());
        ucrf1.setSubject3(textSubject3.getText());
        ucrf1.setSubject4(textSubject4.getText());
        ucrf1.setCode1(textCode1.getText());
        ucrf1.setCode2(textCode2.getText());
        ucrf1.setCode3(textCode3.getText());
        ucrf1.setCode4(textCode4.getText());
        ucrf1.setYear(textYear.getSelectedItem().toString());
        ucrf1.setFacalty(textFacalty.getSelectedItem().toString());
        ucrf1.setSemester(textSemester.getSelectedItem().toString());
        ucrf1.setPaymentCode(textPaymentcode.getText());

        

        if(dbop5.updateucourse(ucrf1)){
            JOptionPane.showMessageDialog(this,"Successfully Updated!");//say insert successfully
            this.dispose();
            return;
        }else{
            JOptionPane.showMessageDialog(this,"Error");//say not insert successfully
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void textCode2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCode2ActionPerformed

    }//GEN-LAST:event_textCode2ActionPerformed

    private void textCode4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCode4ActionPerformed

    }//GEN-LAST:event_textCode4ActionPerformed

    private void textCode3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCode3ActionPerformed

    }//GEN-LAST:event_textCode3ActionPerformed

    private void textSubject4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSubject4ActionPerformed

    }//GEN-LAST:event_textSubject4ActionPerformed

    private void textFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFullnameActionPerformed

    }//GEN-LAST:event_textFullnameActionPerformed

    private void textPaymentcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPaymentcodeActionPerformed

    }//GEN-LAST:event_textPaymentcodeActionPerformed

    private void textSubject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSubject1ActionPerformed

    }//GEN-LAST:event_textSubject1ActionPerformed

    private void textSubject2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSubject2ActionPerformed

    }//GEN-LAST:event_textSubject2ActionPerformed

    private void textRegIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRegIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRegIDActionPerformed

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
            java.util.logging.Logger.getLogger(updateucourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateucourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateucourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateucourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateucourse().setVisible(true);
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
