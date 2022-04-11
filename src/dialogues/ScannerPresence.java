/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogues;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import traitement.Bmp;

/**
 *
 * @author Immortel
 */
public class ScannerPresence extends javax.swing.JDialog implements Runnable, ThreadFactory {

    /**
     * Creates new form ScannerPresence
     */
    Bmp b = new Bmp();
    private WebcamPanel panel = null;
    private Webcam webcam = null;
    private static final long serialVersionUID = 6441489157408381878L;
    private Executor exec = Executors.newSingleThreadExecutor(this);
    ExecutorService executorService = Executors.newFixedThreadPool(10);

    //private Executors arret = exec.execute(this);
    public ScannerPresence(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        b.color(jPanel1, jPanel2);
        initWebcam();
        afficher();
        idagent.setVisible(false);
        id.setVisible(false);
        nom.setVisible(false);
        b.couleur(jLabel1);
//        pann.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
//        b.savePresece(id, action, idagent);

    }

    private void initWebcam() {
        Dimension size = WebcamResolution.QVGA.getSize();
        webcam = Webcam.getWebcams().get(0);
        webcam.setViewSize(size);
        panel = new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);
        pann.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 150));
        exec.execute(this);

    }

    public void arreter(JLabel fermer) {
        try {
            Future<?> f = executorService.submit(() -> {/*do something*/
            });

            executorService.shutdown();

            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
            String result = (String) f.get();
            //fermer.add(result);
        } catch (InterruptedException ex) {
            Logger.getLogger(ScannerPresence.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(ScannerPresence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void run() {
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Result result = null;
            BufferedImage img = null;
            if (webcam.isOpen()) {
                if ((img = webcam.getImage()) == null) {
                    continue;
                }
            }
            LuminanceSource source = new BufferedImageLuminanceSource(img);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
            try {
                result = new MultiFormatReader().decode(bitmap);
            } catch (NotFoundException e) {
            } catch (Exception e) {
            }
            if (result != null) {
                jTextField1.setText(result.getText());
                labok.setText("ok".toUpperCase());
                action.setText("p".toUpperCase());
                b.indicedeplacement(photo, idagent, nom, jTextField1);
                //b.rechercher(jTable1, jTextField1, photo, mat);
                // action.setText("p".toUpperCase());
            } else {
                //  labok.setText("NON");
            }
        } while (true);

    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "My thread");
        t.setDaemon(true);
        return t;
    }

    private void afficher() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;) {
                    try {
                        Thread.sleep(1000);

                        if (!(jTextField1.getText().isEmpty())) {
                            labok.setText("ok".toUpperCase());
                            b.indicedeplacement(photo, idagent, nom, jTextField1);
                            //b.rechercher(jTable1, jTextField1, photo, mat);
                            // b.savePresece(id, action, idagent);
                            action.setText("p".toUpperCase());
                            Thread.sleep(2000);
                            b.savePresece(id, action, idagent);
                            Thread.sleep(3000);
                            jTextField1.setText("");
                            labok.setText("");
                            nom.setText("");
                            idagent.setText("");
                            jTextField1.setText("");
                            action.setText("");
                            Thread.sleep(5000);

                            // photo.setIcon(null);
                        }

                    } catch (InterruptedException ex) {

                    }
                }
            }
        }).start();
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labok = new javax.swing.JLabel();
        idagent = new javax.swing.JLabel();
        pan = new javax.swing.JPanel();
        photo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        pann = new javax.swing.JPanel();
        nom = new org.jdesktop.swingx.JXTextField();
        action = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VEUILLEZ SCANNER VOTRE CARTE ICI POUR CONFIRMER LA PRESENCE");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 900, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setToolTipText("Fermer la fenetre");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 0, 20, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 940, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labok.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        labok.setForeground(new java.awt.Color(0, 204, 51));
        labok.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(labok, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, 50));

        idagent.setOpaque(true);
        jPanel2.add(idagent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 30, 30));

        pan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pan.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 550));

        jPanel2.add(pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 790, 560));

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 220, 30));

        pann.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(pann, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 130, 130));

        nom.setEditable(false);
        jPanel2.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 190, 30));
        jPanel2.add(action, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 40, 20));
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 20));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 50, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 940, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.hide();

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
//        b.rechercher(jTable1, jTextField2, photo, mat);        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

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
            java.util.logging.Logger.getLogger(ScannerPresence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScannerPresence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScannerPresence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScannerPresence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ScannerPresence dialog = new ScannerPresence(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel action;
    private javax.swing.JLabel id;
    private javax.swing.JLabel idagent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labok;
    private org.jdesktop.swingx.JXTextField nom;
    private javax.swing.JPanel pan;
    private javax.swing.JPanel pann;
    private javax.swing.JLabel photo;
    // End of variables declaration//GEN-END:variables

}
