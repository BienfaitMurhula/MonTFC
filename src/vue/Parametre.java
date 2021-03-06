/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import dialogues.Attribution_Fonction;
import dialogues.Offre;
import dialogues.Paiement;
import dialogues.Service;
import dialogues.Utilisateur;
import traitement.Bmp;

/**
 *
 * @author Immortel
 */
public class Parametre extends javax.swing.JPanel {

    /**
     * Creates new form Parametre
     */
    Bmp b = new Bmp();
    
    public Parametre() {
        initComponents();
        b.color(pan, jPanel1);
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
        rapport = new javax.swing.JLabel();
        paie = new javax.swing.JLabel();
        profil = new javax.swing.JLabel();
        offre = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        serv = new javax.swing.JLabel();
        attrib = new javax.swing.JLabel();
        pan = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rapport.setBackground(new java.awt.Color(1, 163, 184));
        rapport.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rapport.setForeground(new java.awt.Color(255, 255, 255));
        rapport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rapport.setText("Utilisateur");
        rapport.setToolTipText("gérer le paiement");
        rapport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        rapport.setOpaque(true);
        rapport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rapportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rapportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rapportMouseExited(evt);
            }
        });
        jPanel1.add(rapport, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 120, 30));

        paie.setBackground(new java.awt.Color(1, 163, 184));
        paie.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        paie.setForeground(new java.awt.Color(255, 255, 255));
        paie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paie.setText("Paiement");
        paie.setToolTipText("gérer le paiement");
        paie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        paie.setOpaque(true);
        paie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paieMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paieMouseExited(evt);
            }
        });
        jPanel1.add(paie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        profil.setBackground(new java.awt.Color(1, 163, 184));
        profil.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        profil.setForeground(new java.awt.Color(255, 255, 255));
        profil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profil.setText("Profil");
        profil.setToolTipText("gérer le paiement");
        profil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        profil.setOpaque(true);
        profil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profilMouseExited(evt);
            }
        });
        jPanel1.add(profil, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, 30));

        offre.setBackground(new java.awt.Color(1, 163, 184));
        offre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        offre.setForeground(new java.awt.Color(255, 255, 255));
        offre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offre.setText("Offre");
        offre.setToolTipText("gérer le paiement");
        offre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        offre.setOpaque(true);
        offre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                offreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                offreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                offreMouseExited(evt);
            }
        });
        jPanel1.add(offre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 120, 30));

        admin.setBackground(new java.awt.Color(1, 163, 184));
        admin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setText("Administration");
        admin.setToolTipText("gérer le paiement");
        admin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        admin.setOpaque(true);
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminMouseExited(evt);
            }
        });
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 120, 30));

        serv.setBackground(new java.awt.Color(1, 163, 184));
        serv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        serv.setForeground(new java.awt.Color(255, 255, 255));
        serv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serv.setText("Service");
        serv.setToolTipText("gérer le paiement");
        serv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
        jPanel1.add(serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 120, 30));

        attrib.setBackground(new java.awt.Color(1, 163, 184));
        attrib.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        attrib.setForeground(new java.awt.Color(255, 255, 255));
        attrib.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attrib.setText("Attribution");
        attrib.setToolTipText("gérer le paiement");
        attrib.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        attrib.setOpaque(true);
        attrib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attribMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                attribMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                attribMouseExited(evt);
            }
        });
        jPanel1.add(attrib, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 120, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 50));

        pan.setLayout(new java.awt.BorderLayout());
        add(pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 970, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void paieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paieMouseClicked
        new Paiement(null, true).show();
    }//GEN-LAST:event_paieMouseClicked

    private void profilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilMouseClicked
        b.appel(pan, new ProfilCandidat());
    }//GEN-LAST:event_profilMouseClicked

    private void offreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offreMouseClicked
        new Offre(null, true).show();
    }//GEN-LAST:event_offreMouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        b.appel(pan, new Concerner());
    }//GEN-LAST:event_adminMouseClicked

    private void servMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servMouseClicked
        new Service(null, true).show();
    }//GEN-LAST:event_servMouseClicked

    private void attribMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attribMouseClicked
        new Attribution_Fonction(null, true).show();

    }//GEN-LAST:event_attribMouseClicked

    private void paieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paieMouseEntered
        b.entree_colorlabel(paie);
    }//GEN-LAST:event_paieMouseEntered

    private void paieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paieMouseExited
        b.exitcolorlabel(paie);
    }//GEN-LAST:event_paieMouseExited

    private void profilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilMouseEntered
        b.entree_colorlabel(profil);
    }//GEN-LAST:event_profilMouseEntered

    private void profilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilMouseExited
        b.exitcolorlabel(profil);
    }//GEN-LAST:event_profilMouseExited

    private void offreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offreMouseEntered
        b.entree_colorlabel(offre);
    }//GEN-LAST:event_offreMouseEntered

    private void offreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offreMouseExited
        b.exitcolorlabel(offre);
    }//GEN-LAST:event_offreMouseExited

    private void adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseEntered
        b.entree_colorlabel(admin);
    }//GEN-LAST:event_adminMouseEntered

    private void adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseExited
        b.exitcolorlabel(admin);
    }//GEN-LAST:event_adminMouseExited

    private void servMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servMouseEntered
        b.entree_colorlabel(serv);
    }//GEN-LAST:event_servMouseEntered

    private void servMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servMouseExited
        b.exitcolorlabel(serv);
    }//GEN-LAST:event_servMouseExited

    private void attribMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attribMouseEntered
        b.entree_colorlabel(attrib);
    }//GEN-LAST:event_attribMouseEntered

    private void attribMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attribMouseExited
        b.exitcolorlabel(attrib);
    }//GEN-LAST:event_attribMouseExited

    private void rapportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rapportMouseClicked
        new Utilisateur(null, true).show();
    }//GEN-LAST:event_rapportMouseClicked

    private void rapportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rapportMouseEntered
        b.entree_colorlabel(rapport);       
    }//GEN-LAST:event_rapportMouseEntered

    private void rapportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rapportMouseExited
        b.exitcolorlabel(rapport);
    }//GEN-LAST:event_rapportMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JLabel attrib;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel offre;
    private javax.swing.JLabel paie;
    private javax.swing.JPanel pan;
    private javax.swing.JLabel profil;
    private javax.swing.JLabel rapport;
    private javax.swing.JLabel serv;
    // End of variables declaration//GEN-END:variables
}
