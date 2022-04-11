/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import dialogues.Fonction;
import vue.Presence;
import traitement.Bmp;
import vue.Affectation;
import vue.Agent;
import vue.Parametre;
import vue.Rapport;
import vue.Statist;

/**
 *
 * @author Immortel
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    Bmp b = new Bmp();
    
    public Home() {
        setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        b.color(jPanel1, jPanel2);
        b.appel(pan, new Statist());
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
        admin = new javax.swing.JLabel();
        fermer = new javax.swing.JLabel();
        agent1 = new javax.swing.JLabel();
        fonct = new javax.swing.JLabel();
        presence = new javax.swing.JLabel();
        serv = new javax.swing.JLabel();
        affect = new javax.swing.JLabel();
        agent = new javax.swing.JLabel();
        param = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pan = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Male_User_100px_2.png"))); // NOI18N
        admin.setToolTipText("Admin");
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 110));

        fermer.setBackground(new java.awt.Color(1, 163, 184));
        fermer.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fermer.setForeground(new java.awt.Color(255, 255, 255));
        fermer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fermer.setText("Deconnexion");
        fermer.setToolTipText("Fermer l'application");
        fermer.setOpaque(true);
        fermer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fermerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fermerMouseExited(evt);
            }
        });
        jPanel1.add(fermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 170, 40));

        agent1.setBackground(new java.awt.Color(1, 163, 184));
        agent1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        agent1.setForeground(new java.awt.Color(255, 255, 255));
        agent1.setText("Agent");
        agent1.setToolTipText("Agent");
        agent1.setOpaque(true);
        agent1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agent1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agent1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agent1MouseExited(evt);
            }
        });
        jPanel1.add(agent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 170, 40));

        fonct.setBackground(new java.awt.Color(1, 163, 184));
        fonct.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fonct.setForeground(new java.awt.Color(255, 255, 255));
        fonct.setText("Fonction");
        fonct.setToolTipText("Agent");
        fonct.setOpaque(true);
        fonct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fonctMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fonctMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fonctMouseExited(evt);
            }
        });
        jPanel1.add(fonct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 170, 40));

        presence.setBackground(new java.awt.Color(1, 163, 184));
        presence.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        presence.setForeground(new java.awt.Color(255, 255, 255));
        presence.setText("Présence");
        presence.setToolTipText("Lancer la présence");
        presence.setOpaque(true);
        presence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                presenceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                presenceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                presenceMouseExited(evt);
            }
        });
        jPanel1.add(presence, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 170, 40));

        serv.setBackground(new java.awt.Color(1, 163, 184));
        serv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        serv.setForeground(new java.awt.Color(255, 255, 255));
        serv.setText("Rapports");
        serv.setToolTipText("Ajouter les services");
        serv.setOpaque(true);
        serv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                servMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                servMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                servMouseExited(evt);
            }
        });
        jPanel1.add(serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 170, 40));

        affect.setBackground(new java.awt.Color(1, 163, 184));
        affect.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        affect.setForeground(new java.awt.Color(255, 255, 255));
        affect.setText("Affectation");
        affect.setToolTipText("Affecter un agent");
        affect.setOpaque(true);
        affect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                affectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                affectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                affectMouseExited(evt);
            }
        });
        jPanel1.add(affect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 170, 40));

        agent.setBackground(new java.awt.Color(1, 163, 184));
        agent.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        agent.setForeground(new java.awt.Color(255, 255, 255));
        agent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agent.setToolTipText("Agent connecté");
        agent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Connecté", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        agent.setOpaque(true);
        jPanel1.add(agent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 170, 50));

        param.setBackground(new java.awt.Color(1, 163, 184));
        param.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        param.setForeground(new java.awt.Color(255, 255, 255));
        param.setText("Parametre");
        param.setToolTipText("Parametre de l'application");
        param.setOpaque(true);
        param.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paramMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paramMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paramMouseExited(evt);
            }
        });
        jPanel1.add(param, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 170, 40));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 170, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 242, 170, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 170, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 170, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 170, 10));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 170, 10));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/1.PNG"))); // NOI18N
        jLabel1.setToolTipText("Accueil");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 170, 640));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(1, 163, 184));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setToolTipText("Fermer l'application");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 30, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("WELCOME AT P_SCANNER");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 930, 60));

        pan.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 920, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void agent1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agent1MouseEntered
        b.entree_colorlabel(agent1);
    }//GEN-LAST:event_agent1MouseEntered

    private void agent1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agent1MouseExited
        b.exitcolorlabel(agent1);
    }//GEN-LAST:event_agent1MouseExited

    private void fonctMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fonctMouseEntered
        b.entree_colorlabel(fonct);
    }//GEN-LAST:event_fonctMouseEntered

    private void fonctMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fonctMouseExited
        b.exitcolorlabel(fonct);
    }//GEN-LAST:event_fonctMouseExited

    private void paramMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paramMouseEntered
        b.entree_colorlabel(param);
    }//GEN-LAST:event_paramMouseEntered

    private void paramMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paramMouseExited
        b.exitcolorlabel(param);
    }//GEN-LAST:event_paramMouseExited

    private void affectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_affectMouseEntered
        b.entree_colorlabel(affect);
    }//GEN-LAST:event_affectMouseEntered

    private void affectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_affectMouseExited
        b.exitcolorlabel(affect);
    }//GEN-LAST:event_affectMouseExited

    private void servMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servMouseClicked
        b.appel(pan, new Rapport());
    }//GEN-LAST:event_servMouseClicked

    private void servMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servMouseExited
        b.exitcolorlabel(serv);
    }//GEN-LAST:event_servMouseExited

    private void presenceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presenceMouseEntered
        b.entree_colorlabel(presence);
    }//GEN-LAST:event_presenceMouseEntered

    private void presenceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presenceMouseExited
        b.exitcolorlabel(presence);
    }//GEN-LAST:event_presenceMouseExited

    private void fermerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseEntered
        b.entree_colorlabel(fermer);
    }//GEN-LAST:event_fermerMouseEntered

    private void fermerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseExited
        b.exitcolorlabel(fermer);
    }//GEN-LAST:event_fermerMouseExited

    private void servMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servMouseEntered
        b.entree_colorlabel(serv);
    }//GEN-LAST:event_servMouseEntered

    private void agent1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agent1MouseClicked
        b.appel(pan, new Agent());
    }//GEN-LAST:event_agent1MouseClicked

    private void fonctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fonctMouseClicked
        new Fonction(null, true).show();
    }//GEN-LAST:event_fonctMouseClicked

    private void presenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presenceMouseClicked
        b.appel(pan, new Presence());
    }//GEN-LAST:event_presenceMouseClicked

    private void affectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_affectMouseClicked
        b.appel(pan, new Affectation());
    }//GEN-LAST:event_affectMouseClicked

    private void paramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paramMouseClicked
        b.appel(pan, new Parametre());        
    }//GEN-LAST:event_paramMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        b.appel(pan, new Statist());
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        b.closecolorlabel(jLabel2);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        b.exitcolorlabel(jLabel2);
    }//GEN-LAST:event_jLabel2MouseExited

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel admin;
    private javax.swing.JLabel affect;
    public static javax.swing.JLabel agent;
    private javax.swing.JLabel agent1;
    private javax.swing.JLabel fermer;
    private javax.swing.JLabel fonct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel pan;
    private javax.swing.JLabel param;
    private javax.swing.JLabel presence;
    private javax.swing.JLabel serv;
    // End of variables declaration//GEN-END:variables
}