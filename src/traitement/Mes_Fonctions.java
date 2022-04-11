/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traitement;

import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Immortel
 */
public abstract class Mes_Fonctions {

    abstract public void appel(JPanel a, JPanel b);

    abstract public void photo(JLabel photo, JLabel chemin);

    abstract public ImageIcon returntof(String a, byte[] d, JLabel r);

    abstract public void chargement(JTable t, String sql);

    abstract public void comboBox(JComboBox c, String table, String col);

    public abstract void recherche(JTable table, String data);

    abstract public void delete(JLabel id, String table, String col, JTable t, String sql);

    abstract public void agent(JLabel mat, JLabel id, JTextField nom, JTextField post, JTextField prenom, JComboBox sexe, JDateChooser date, JComboBox eta, JTextField nation, JTextField adresse, JTextField tel, JComboBox niv, String sql, JTable t, String mess, String messE);

    abstract public void indice_agent(JLabel photo, JLabel qrcode, JLabel id, JTextField nom, JTextField post, JTextField prenom, JComboBox sexe, JDateChooser date, JComboBox eta, JTextField nation, JTextField adresse, JTextField tel, JComboBox niv, JTable t);

    abstract public void affecter_avoir(JLabel id, JDateChooser date1, JDateChooser date2, JComboBox code1, JComboBox code2, String req, JTable t, String sql, String mess, String messError);

    abstract public void indice_affecter_avoir(JLabel id, JDateChooser date1, JDateChooser date2, JComboBox code1, JComboBox code2, String table, String col, JTable t);

    abstract public void concerner_(JLabel id, String s1, String s2, String s3, String s4, String s5, String req, JTable t, String sql, String mess, String messError);

    abstract public void indice_concerner(JLabel id, JTextField montant, JDateChooser mois, JDateChooser date, JComboBox codeag, JComboBox code_paie, String table, String col, JTable t);
    //abstract public void indice_presence(JLabel id, JTextField montant, JTextField mois, JDateChooser date, JComboBox codeag, JComboBox code_paie, String table, String col, JTable t);

    abstract public void offre_service(JLabel id, JTextField designation, String req, JTable t, String sql, String mess, String messError);

    abstract public void indice_service(JLabel id, JTextField designation, String table, String col, JTable t);

    abstract public void paiement_fonct_user(JLabel id, String des, String s2, String s3, String table, String col, JTable t, String mess, String messE);

    abstract public void indice_paiement(JLabel id, JTextField libelle, JTextField montant, JComboBox fx, JTable t);

    abstract public void indice_fonct(JLabel id, JTextField design, JDateChooser date, JTextField montant, String table, String col, JTable t);

    abstract public void presence(JLabel id, JLabel action, JLabel agent, String table, String col, JTable t);

    abstract public void Login(JTextField user, JPasswordField pass);

    abstract public void EtatSortie(String querry, String nomEtat);

    abstract public void stt(JPanel p);

    abstract public byte[] Code(String txt, int width, int height);

    abstract public int getCount(String req);

    abstract public void key(KeyEvent evt);

    abstract public void color(JPanel p1, JPanel p2);

    abstract public void indice_user(JTable t, JLabel id, JTextField user, JTextField pass, JComboBox fx, JComboBox ag);
}
