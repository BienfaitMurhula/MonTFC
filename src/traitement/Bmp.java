/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traitement;

import Gui.Home;
import Gui.Login;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.toedter.calendar.JDateChooser;
import connexion.Connexion;
import static connexion.Connexion.getInstance;
import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Immortel
 */
final public class Bmp extends Mes_Fonctions {

    PreparedStatement ps;
    ResultSet rs;
    private String p;
    private static byte[] image;
    static ByteArrayOutputStream outp;
    private static byte[] image1;

    @Override
    public void appel(JPanel a, JPanel b) {
        a.removeAll();
        a.add(b);
        a.repaint();
        a.revalidate();
    }

    @Override
    public void photo(JLabel photo, JLabel chemin) {
        try {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(null);
            File f = fc.getSelectedFile();
            p = f.getAbsolutePath();
            chemin.setText(p);
            ImageIcon k = new ImageIcon(p);
            Rectangle re = photo.getBounds();
            Image i = k.getImage().getScaledInstance(re.width, re.height, Image.SCALE_DEFAULT);
            k = new ImageIcon(i);
            photo.setIcon(k);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            File t = new File(p);
            FileInputStream v = new FileInputStream(t);
            ByteArrayOutputStream o = new ByteArrayOutputStream();
            byte[] x = new byte[1024];
            for (int d; (d = v.read(x)) != -1;) {
                o.write(x, 0, d);
            }
            image = o.toByteArray();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public ImageIcon returntof(String a, byte[] d, JLabel r) {
        ImageIcon img = null;
        if (a != null) {
            img = new ImageIcon(a);
        } else {
            img = new ImageIcon(d);
        }
        Image im = img.getImage().getScaledInstance(r.getHeight(), r.getWidth(), Image.SCALE_SMOOTH);
        img = new ImageIcon(im);
        return img;
    }

    @Override
    public void chargement(JTable t, String sql) {
        try {
            ps = getInstance().prepareStatement(sql);
            rs = ps.executeQuery();
            t.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e);
        }
    }

    @Override
    public void comboBox(JComboBox c, String table, String col) {

        try {
            ps = getInstance().prepareStatement("select " + col + " from " + table + "");
            rs = ps.executeQuery();
            while (rs.next()) {
                c.addItem(rs.getString(col));
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void recherche(JTable table, String data) {
        try {
            ps = getInstance().prepareStatement(data);
            rs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur de la recherche" + e.getMessage());
        }
    }

    @Override
    public void delete(JLabel id, String table, String col, JTable t, String sql) {
        if (!(id.getText().isEmpty())) {
            try {
                ps = getInstance().prepareStatement("delete from " + table + " where " + col + " = '" + id.getText() + "'");
                if (JOptionPane.showConfirmDialog(null, "Voulez-vous confirmer la suppression ?", " ", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Supprimé avec succès");
                    chargement(t, sql);
                }
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez selectionner un element à supprimer");
        }
    }

    @Override
    public void agent(JLabel mat, JLabel id, JTextField nom, JTextField post, JTextField prenom, JComboBox sexe, JDateChooser date, JComboBox eta, JTextField nation, JTextField adresse, JTextField tel, JComboBox niv, String sql, JTable t, String mess, String messE) {
        try {
            if (nom.getText().isEmpty() || post.getText().isEmpty() || prenom.getText().isEmpty() || sexe.getSelectedItem().equals("") || ((JTextField) date.getDateEditor().getUiComponent()).getText().isEmpty() || eta.getSelectedItem().equals("") || nation.getText().isEmpty() || adresse.getText().isEmpty() || tel.getText().isEmpty() || niv.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "remplissez tout les champs svp !!");
            } else {
                ps = getInstance().prepareCall("exec p_agent ?,?,?,?,?,?,?,?,?,?,?,?,?,?");
                ps.setString(1, id.getText());
                ps.setString(2, nom.getText());
                ps.setString(3, post.getText());
                ps.setString(4, prenom.getText());
                ps.setString(5, sexe.getSelectedItem().toString());
                ps.setString(6, ((JTextField) date.getDateEditor().getUiComponent()).getText());
                ps.setString(7, eta.getSelectedItem().toString());
                ps.setString(8, nation.getText());
                ps.setString(9, adresse.getText());
                ps.setString(10, tel.getText());
                ps.setString(11, niv.getSelectedItem().toString());
                ps.setBytes(12, image);
                ps.setBytes(13, image1);
                ps.setString(14, mat.getText());
                ps.execute();
                chargement(t, sql);
                JOptionPane.showMessageDialog(null, mess);
                id.setText("");
                post.setText("");
                prenom.setText("");
                sexe.setSelectedItem("");
                mat.setText("");
                nom.setText("");
                adresse.setText("");
                tel.setText("");
                nation.setText("");
                niv.setSelectedItem("");

                ((JTextField) date.getDateEditor().getUiComponent()).setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, messE + " " + e);
        }
    }

    @Override
    public void indice_agent(JLabel photo, JLabel qrcode, JLabel id, JTextField nom, JTextField post, JTextField prenom, JComboBox sexe, JDateChooser date, JComboBox eta, JTextField nation, JTextField adresse, JTextField tel, JComboBox niv, JTable t) {

        try {
            int i = t.getSelectedRow();
            String h = (t.getModel().getValueAt(i, 0).toString());
            ps = getInstance().prepareStatement("select * from v_agent where id = '" + h + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                nom.setText(rs.getString(2));
                post.setText(rs.getString(3));
                prenom.setText(rs.getString(4));
                sexe.setSelectedItem(rs.getString(5));
                ((JTextField) date.getDateEditor().getUiComponent()).setText(rs.getString(6));
                eta.setSelectedItem(rs.getString(8));
                nation.setText(rs.getString(9));
                adresse.setText(rs.getString(11));
                tel.setText(rs.getString(10));
                niv.setSelectedItem(rs.getString(12));
                photo.setIcon(returntof(null, rs.getBytes("photo"), photo));
                //qrcode.setIcon(returntof(null, rs.getBytes("photo"), photo));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public void affecter_avoir(JLabel id, JDateChooser date1, JDateChooser date2, JComboBox code1, JComboBox code2, String req, JTable t, String sql, String mess, String messError) {
        try {
            if (((JTextField) date1.getDateEditor().getUiComponent()).getText().isEmpty() || ((JTextField) date2.getDateEditor().getUiComponent()).getText().isEmpty() || code1.getSelectedItem().equals("") || code2.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "remplissez tout les champs svp !!");
            } else {
                ps = getInstance().prepareCall(req);
                ps.setString(1, id.getText());
                ps.setString(2, ((JTextField) date1.getDateEditor().getUiComponent()).getText());
                ps.setString(3, ((JTextField) date2.getDateEditor().getUiComponent()).getText());
                ps.setString(4, code1.getSelectedItem().toString());
                ps.setString(5, code2.getSelectedItem().toString());
                ps.execute();
                chargement(t, sql);
                JOptionPane.showMessageDialog(null, mess);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, messError + e);
        }
    }

    @Override
    public void indice_affecter_avoir(JLabel id, JDateChooser date1, JDateChooser date2, JComboBox code1, JComboBox code2, String table, String col, JTable t) {
        try {
            int i = t.getSelectedRow();
            String h = (t.getModel().getValueAt(i, 0).toString());
            ps = getInstance().prepareStatement("select * from " + table + " where " + col + " = '" + h + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                ((JTextField) date1.getDateEditor().getUiComponent()).setText(rs.getString(2));
                ((JTextField) date2.getDateEditor().getUiComponent()).setText(rs.getString(3));
                code1.setSelectedItem(rs.getString(4));
                code2.setSelectedItem(rs.getString(5));
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void concerner_(JLabel id, String s1, String s2, String s3, String s4, String s5, String req, JTable t, String sql, String mess, String messError) {
        try {
            if (s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("") || s5.equals("")) {
                JOptionPane.showMessageDialog(null, "veuillez completer tout les champs svp !!");
            } else {
                ps = getInstance().prepareCall(req);
                ps.setString(1, id.getText());
                ps.setString(2, s1);
                ps.setString(3, s2);
                ps.setString(4, s3);
                ps.setString(5, s4);
                ps.setString(6, s5);
                ps.execute();
                chargement(t, sql);
                JOptionPane.showMessageDialog(null, mess);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, messError + e);
        }
    }

    @Override
    public void indice_concerner(JLabel id, JTextField montant, JDateChooser mois, JDateChooser date, JComboBox codeag, JComboBox code_paie, String table, String col, JTable t) {
        try {
            int i = t.getSelectedRow();
            String h = (t.getModel().getValueAt(i, 0).toString());
            ps = getInstance().prepareStatement("select * from v_concerner where id = '" + h + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                montant.setText(rs.getString(2));
                ((JTextField) mois.getDateEditor().getUiComponent()).setText(rs.getString(3));
                ((JTextField) date.getDateEditor().getUiComponent()).setText(rs.getString(4));
                codeag.setSelectedItem(rs.getString(5));
                code_paie.setSelectedItem(rs.getString(6));
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void offre_service(JLabel id, JTextField designation, String req, JTable t, String sql, String mess, String messError) {
        try {
            if (!designation.getText().isEmpty()) {
                ps = getInstance().prepareCall(req);
                ps.setString(1, id.getText());
                ps.setString(2, designation.getText());
                ps.execute();
                chargement(t, sql);
                JOptionPane.showMessageDialog(null, mess);
                id.setText("");
                designation.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "veuillez completer tout le champs vide svp !!");
                designation.setFocusable(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, messError + e);
        }
    }

    @Override
    public void indice_service(JLabel id, JTextField designation, String table, String col, JTable t) {
        try {
            int i = t.getSelectedRow();
            String k = (t.getModel().getValueAt(i, 0).toString());
            ps = getInstance().prepareStatement("select * from " + table + " where id = '" + k + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                designation.setText(rs.getString(2));
            }
        } catch (Exception e) {
        }

    }

    @Override
    public void paiement_fonct_user(JLabel id, String des, String s2, String s3, String table, String req, JTable t, String mess, String messE) {
        try {
            if (des != "" || s2 != "" || s3 != "") {
                ps = getInstance().prepareCall(req);
                ps.setString(1, id.getText());
                ps.setString(2, des);
                ps.setString(3, s2);
                ps.setString(4, s3);
                ps.execute();
                chargement(t, table);
                JOptionPane.showMessageDialog(null, mess);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, messE + e);
        }
    }

    @Override
    public void indice_paiement(JLabel id, JTextField libelle, JTextField montant, JComboBox fx, JTable t) {
        try {
            int i = t.getSelectedRow();
            String k = (t.getModel().getValueAt(i, 0).toString());
            ps = getInstance().prepareStatement("select * from v_paiement where id = '" + k + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                libelle.setText(rs.getString(2));
                montant.setText(rs.getString(3));
                fx.setSelectedItem(rs.getString(4));
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void indice_fonct(JLabel id, JTextField design, JDateChooser date, JTextField montant, String table, String col, JTable t) {
        try {
            int i = t.getSelectedRow();
            String k = (t.getModel().getValueAt(i, 0).toString());
            ps = getInstance().prepareStatement("select * from v_fonction where id = '" + k + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                design.setText(rs.getString(2));
                montant.setText(rs.getString(4));
                ((JTextField) date.getDateEditor().getUiComponent()).setText(rs.getString(3));
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void presence(JLabel id, JLabel action, JLabel agent, String table, String col, JTable t) {
        try {
            ps = getInstance().prepareCall("exep p_presence ?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, action.getText());
            ps.setString(3, agent.getText());
            ps.execute();
        } catch (Exception e) {
        }
    }

    @Override
    public void Login(JTextField user, JPasswordField pass) {
        try {
            ps = getInstance().prepareStatement("select a.id,username, fonction, password, PRENOM+' '+NOM as NOMS,Photo FROM utilisateur U JOIN agent a ON U.agent=a.Id where username = '" + user.getText() + "' and password = '" + pass.getText() + "' ");
//            ps.setString(1, user.getText());
//            ps.setString(2, pass.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                if (!("Admin".equalsIgnoreCase(rs.getString("fonction")))) {
                    new Home().show();
                    new Login().hide();
                    Home.agent.setText(rs.getString("NOMS").toUpperCase());
                    Home.admin.setIcon(returntof(null, rs.getBytes("photo"), Home.admin));
                } else if ("Admin".equalsIgnoreCase(rs.getString("fonction"))) {
                    new Home().show();
                    new Login().hide();
                    Home.agent.setText(rs.getString("NOMS").toUpperCase());
                    Home.admin.setIcon(returntof(null, rs.getBytes("photo"), Home.admin));
                } else {
                    JOptionPane.showMessageDialog(null, "Verifier vos identifiant svp !!");
                    user.setText("");
                    pass.setText("");
                    new Login().show();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur" + e);
        }
    }

    @Override
    public void EtatSortie(String querry, String nomEtat) {
        try {
            JasperDesign jd = JRXmlLoader.load("./" + nomEtat + ".jrxml");
            String sql = querry;
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, Connexion.getInstance());
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
//        } finally {
//            try {
//                Connexion.getInstance().close();
//            } catch (Exception ex) {
//               
//            }

        }
    }

    @Override
    public void stt(JPanel p
    ) {
        try {
            DefaultCategoryDataset d = new DefaultCategoryDataset();
            d.setValue(getCount("select count(*) from agent"), "Nombre des agents engagés", "Agents");
            d.setValue(getCount("select count(*) from appartenir"), "Nombre d'offres publiées", "Offres");
            d.setValue(getCount("select count(*) from fonction"), "Nombre des fonctions ", "Fonction");
            JFreeChart jchar = ChartFactory.createAreaChart("STATISTIQUE DES MOUVEMENTS", "", "", d, PlotOrientation.VERTICAL, false, true, true);
            CategoryPlot plot = jchar.getCategoryPlot();
            plot.setRangeGridlinePaint(Color.GRAY);
            ChartPanel charpanel = new ChartPanel(jchar);
            p.removeAll();
            p.add(charpanel);
            charpanel.updateUI();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override
    public byte[] Code(String txt, int width, int height
    ) {
        try {

            QRCodeWriter qr = new QRCodeWriter();
            BitMatrix btm = qr.encode(txt, BarcodeFormat.QR_CODE, width, height);
            outp = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(btm, "png", outp); //out
            byte[] p = new byte[1024];
            outp.write(p);
            image1 = outp.toByteArray();
//            return outp.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur de scanner le QrCode " + e.getMessage());
        }
        return image1;
    }

    @Override
    public int getCount(String req) {
        try {
            ps = getInstance().prepareStatement(req);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            ps.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        return 0;
    }

    @Override
    public void key(KeyEvent evt) {
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }

    @Override
    public void color(JPanel p1, JPanel p2
    ) {
        p1.setBackground(new java.awt.Color(1, 163, 184));
        p2.setBackground(new java.awt.Color(1, 163, 184));
    }

    public void entree_colorlabel(JLabel l1) {
        l1.setBackground(new java.awt.Color(16, 137, 62));
    }

    public void exitcolorlabel(JLabel l1) {
        l1.setBackground(new java.awt.Color(1, 163, 184));
    }

    public void closecolorlabel(JLabel l1) {
        l1.setBackground(new java.awt.Color(232, 17, 35));
    }

    public void user(JTable t, JLabel id, JTextField user, JTextField pass, JComboBox fx, JComboBox ag, String table, String mess, String messE) {
        try {
            ps = getInstance().prepareCall("exec p_utilisateur ?,?,?,?,?");
            ps.setString(1, id.getText());
            ps.setString(2, user.getText());
            ps.setString(3, pass.getText());
            ps.setString(4, fx.getSelectedItem().toString());
            ps.setString(5, ag.getSelectedItem().toString());
            ps.execute();
            chargement(t, table);
            id.setText("");
            user.setText("");
            pass.setText("");
            fx.setSelectedItem("");
            ag.setSelectedItem("");
            JOptionPane.showMessageDialog(null, mess);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, messE);
        }
    }

    @Override
    public void indice_user(JTable t, JLabel id, JTextField user, JTextField pass, JComboBox fx, JComboBox ag) {
        try {
            int i = t.getSelectedRow();
            String k = (t.getModel().getValueAt(i, 0).toString());
            ps = getInstance().prepareStatement("select * from v_utilisateur where id = '" + k + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                user.setText(rs.getString(2));
                pass.setText(rs.getString(3));
                fx.setSelectedItem(rs.getString(5));
                ag.setSelectedItem(rs.getString(4));
            }
        } catch (Exception e) {
        }
    }

    public void generer(JLabel m, JTextField nom, JTextField post, JTextField prenom, JComboBox sexe) {
        String mat = null;
        Random objGenerator = new Random();
        for (int iCount = 0; iCount < 10; iCount++) {
            int randomNumber = objGenerator.nextInt(100);
            mat = nom.getText().substring(0, 2) + "" + post.getText().substring(0, 1) + "" + prenom.getText().substring(0, 1) + "" + sexe.getSelectedItem().toString().substring(0, 1);
            if (nom.getText().isEmpty() || post.getText().isEmpty() || prenom.getText().isEmpty() || sexe.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Completer tout les champs necessaire avant de generer une matricule svp !!");
            } else {
                m.setText(randomNumber + 1 + "" + mat.toUpperCase());
            }

        }
    }

    public void couleur(JLabel l) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;) {
                    try {
                        Thread.sleep(1000);
                        l.setForeground(Color.GRAY);
                        Thread.sleep(1000);
                        l.setForeground(Color.white);
                        Thread.sleep(1000);
                        l.setForeground(Color.GREEN);
                        Thread.sleep(1000);
                        l.setForeground(Color.ORANGE);
                        Thread.sleep(1000);
                        l.setForeground(Color.YELLOW);
                        Thread.sleep(1000);
                        l.setForeground(Color.pink);
                        Thread.sleep(1000);
                        l.setForeground(Color.cyan);
                    } catch (InterruptedException ex) {

                    }
                }
            }
        }).start();
//       
    }

    public void selectdynamique(JTable m) {
        try {
            DefaultTableModel h = new DefaultTableModel();
            h.addColumn("id");
            h.addColumn("nom");
            h.addColumn("photo");
            h.addColumn("Matricule");
            m.setModel(h);
            ps = getInstance().prepareStatement("select Id,Nom,Photo,Matricule from agent");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("Id");
                String nom = rs.getString("Nom");
                String photo = rs.getString("Photo");
                String matricule = rs.getString("Matricule");
                Object[] w = {id, nom, photo, matricule};
                h.addRow(w);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur de chargement" + e.getMessage());
        }

    }

    public void rechercher(JTable m, JTextField id1, JLabel photo, JLabel ma) {
        try {
            DefaultTableModel h = new DefaultTableModel();
            h.addColumn("id");
            h.addColumn("nom");
            h.addColumn("photo");
            h.addColumn("Matricule");
            m.setModel(h);
            ps = getInstance().prepareStatement("select Id,Nom,Photo,Matricule from agent where Id like '%" + id1.getText() + "%' ");
            rs = ps.executeQuery();
            if (rs.next()) {
                ma.setText(rs.getString("Id"));
                photo.setIcon(returntof(null, rs.getBytes("Photo"), photo));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur de chargement" + e.getMessage());
        }

    }

    public void retourId(JTable n, JLabel ma, JLabel photo) {
        try {
            int hh = n.getSelectedRow();
            String val = n.getModel().getValueAt(hh, 0).toString();
            ps = getInstance().prepareStatement("select Id,Nom,Photo,Matricule from agent where Id='" + val + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                ma.setText(rs.getString("Id"));
                photo.setIcon(returntof(null, rs.getBytes("Photo"), photo));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur d'indice de deplacement" + e.getMessage());
        }
    }

    public void indice(JTable n, JLabel photo, JLabel id, JTextField nom, JTextField mat) {
        try {
            int iy = n.getSelectedRow();

        } catch (Exception e) {
        }
    }

    public void indicedeplacement(JLabel photo, JLabel id, JTextField nom, JTextField mat) {
        try {
            ps = getInstance().prepareStatement("EXEC p_verificationBD ? ");
            ps.setString(1, mat.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                nom.setText(rs.getString(2));
                photo.setIcon(returntof(null, rs.getBytes("photo"), photo));
            } else {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur d'indice de deplacement" + e.getMessage());
        }
    }

    public void profil(JLabel id, JTextField qte, JTextField exp, JTextField niv, JDateChooser date, JComboBox off, JComboBox fx, JTable t, String sql, String mess, String messE) {
        try {
            if (qte.getText().isEmpty() || exp.getText().isEmpty() || niv.getText().isEmpty() || ((JTextField) date.getDateEditor().getUiComponent()).getText().isEmpty() || off.getSelectedItem().toString().isEmpty() || fx.getSelectedItem().toString().isEmpty()) {

            } else {
                ps = getInstance().prepareCall("exec p_appartenir ?,?,?,?,?,?,?");
                ps.setString(1, id.getText());
                ps.setString(2, qte.getText());
                ps.setString(3, exp.getText());
                ps.setString(4, niv.getText());
                ps.setString(5, ((JTextField) date.getDateEditor().getUiComponent()).getText());
                ps.setString(6, off.getSelectedItem().toString());
                ps.setString(7, fx.getSelectedItem().toString());
                ps.execute();
                chargement(t, sql);
                JOptionPane.showMessageDialog(null, mess);
                id.setText("");
                qte.setText("");
                exp.setText("");
                niv.setText("");
                ((JTextField) date.getDateEditor().getUiComponent()).setText("");
                off.setSelectedItem("");
                fx.setSelectedItem("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, messE + e);
        }
    }

    public void deplacerapp(JLabel id, JTextField qte, JTextField exp, JTextField niv, JDateChooser date, JComboBox off, JComboBox fx, JTable t) {
        try {
            int i = t.getSelectedRow();
            String k = (t.getModel().getValueAt(i, 0).toString());
            ps = getInstance().prepareStatement("select * from v_appartenir where id = '" + k + "'");
            rs = ps.executeQuery();
            if (rs.next()) {
                id.setText(rs.getString(1));
                qte.setText(rs.getString(2));
                exp.setText(rs.getString(3));
                niv.setText(rs.getString(4));
                ((JTextField) date.getDateEditor().getUiComponent()).setText(rs.getString(5));
                fx.setSelectedItem(rs.getString(7));
                off.setSelectedItem(rs.getString(6));
            }
        } catch (Exception e) {
        }
    }

    public void insertagent(JLabel id, JLabel action, JLabel codeagent) {
        try {
            ps = getInstance().prepareCall("exec p_presence(?,?,?)");

            ps.setString(1, id.getText());
            ps.setString(2, action.getText().toUpperCase());
            ps.setString(3, codeagent.getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "insertion cool !!!");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "erreur d'insertion" + e.getMessage());
        }
    }

    public void savePresece(JLabel id, JLabel action, JLabel codeagent) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (;;) {
                    try {
                        ps = getInstance().prepareCall("exec p_presence ?,?,?");

                        ps.setString(1, id.getText());
                        ps.setString(2, action.getText().toUpperCase());
                        ps.setString(3, codeagent.getText());
                        //if (!(action.getText().isEmpty() && codeagent.getText().isEmpty())) {
                        // Thread.sleep(600);
                        ps.execute();
//                        id.setText("");
//                        action.setText("");
//                        codeagent.setText("");
                        //    }
                    } catch (Exception e) {
                        //JOptionPane.showMessageDialog(null, "le champs est vide" + e);
                    }
                }
            }
        }).start();
    }

    public void salairefx(JTextField sal, String table, String col, String col2, JComboBox c) {
        try {
            ps = getInstance().prepareStatement("select " + col + " from " + table + " where " + col2 + "= '" + c.getSelectedItem().toString() + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                sal.setText(rs.getString(col));
            }
        } catch (Exception e) {
        }
    }

    public void deplacement(String table, JLabel id, JTable t) {
        int i = t.getSelectedRow();
        String k = (t.getModel().getValueAt(i, 0).toString());
        try {
            ps = getInstance().prepareStatement("select * from " + table + " where id='" + k + "' ");
            rs = ps.executeQuery();
            while (rs.next()) {
                id.setText(rs.getString("id"));
            }
        } catch (Exception e) {
        }
    }
}
