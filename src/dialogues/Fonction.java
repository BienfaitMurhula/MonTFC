/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogues;

import com.toedter.calendar.JDateChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import traitement.Bmp;

/**
 *
 * @author Immortel
 */
public class Fonction extends javax.swing.JDialog {

    /**
     * Creates new form Fonction
     */
    Bmp b = new Bmp();

    public Fonction(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        b.color(jPanel1, jPanel2);
        b.chargement(jTable1, "select * from v_fonction");
        id.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        salaire = new org.jdesktop.swingx.JXTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        design = new org.jdesktop.swingx.JXTextField();
        date = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AJOUTER UNE FONCTION");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 460, 40));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 32, 220, 10));

        jLabel3.setBackground(new java.awt.Color(1, 163, 184));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 0, 30, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 520, 120));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 270, 10));

        salaire.setBorder(null);
        salaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaireActionPerformed(evt);
            }
        });
        salaire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salaireKeyTyped(evt);
            }
        });
        jPanel2.add(salaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 270, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Salaire");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 30));

        jLabel17.setBackground(new java.awt.Color(1, 163, 184));
        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Modifier");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 140, 40));

        jLabel16.setBackground(new java.awt.Color(1, 163, 184));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Enregistrer");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 140, 40));

        jLabel18.setBackground(new java.awt.Color(1, 163, 184));
        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Supprimer");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.setOpaque(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 140, 40));
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        design.setBorder(null);
        jPanel2.add(design, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 270, 30));

        date.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 270, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Designation");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date engag");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 520, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        b.delete(id, "fonction", "id", jTable1, "select * from v_FONCTION");
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        if (id.getText().isEmpty()) {
            b.paiement_fonct_user(id, design.getText(), ((JTextField) date.getDateEditor().getUiComponent()).getText(), salaire.getText(), "select * from V_FONCTION", "exec p_fonction ?,?,?,?", jTable1, "Service ajouté", "Erreur d'ajout");
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez modifier les élements existants");
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        if (!id.getText().isEmpty()) {
            b.paiement_fonct_user(id, design.getText(), ((JTextField) date.getDateEditor().getUiComponent()).getText(), salaire.getText(), "select * from V_FONCTION", "exec p_fonction ?,?,?,?", jTable1, "Service ajouté", "Erreur d'ajout");
            // b.offre_service(id, salaire, "exec p_fonction ?,?", jTable1, "select * from v_fonction", "Service Modifié", "Erreur de modification");
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez ajouter une fonction");
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        b.indice_fonct(id, design, date, design, "v_fonction", "id", jTable1);       // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.hide();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void salaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaireActionPerformed

    private void salaireKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaireKeyTyped
        b.key(evt);
    }//GEN-LAST:event_salaireKeyTyped

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        b.entree_colorlabel(jLabel16);
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        b.exitcolorlabel(jLabel16);
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        b.entree_colorlabel(jLabel17);
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        b.exitcolorlabel(jLabel17);
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        b.entree_colorlabel(jLabel18);
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        b.exitcolorlabel(jLabel18);
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        b.closecolorlabel(jLabel3);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        b.exitcolorlabel(jLabel3);
    }//GEN-LAST:event_jLabel3MouseExited

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
            java.util.logging.Logger.getLogger(Fonction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fonction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fonction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fonction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Fonction dialog = new Fonction(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date;
    private org.jdesktop.swingx.JXTextField design;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXTextField salaire;
    // End of variables declaration//GEN-END:variables

}