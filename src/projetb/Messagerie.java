/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetb;

import Data_Access.MessageData;
import Data_Access.UtilisateurData;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import model.Message;
import model.Utilisateur;

/**
 *
 * @author Abdelhaq
 */
public class Messagerie extends javax.swing.JFrame {
    Utilisateur actuel;

    /**
     * Creates new form Messagerie
     */
    public Messagerie() {
        initComponents();
        
    }
    public Messagerie(Utilisateur u) {
        initComponents();
        actuel=u;
        DefaultTableModel defaultModel=(DefaultTableModel) tableauConvs.getModel();
        ArrayList<Message> convos=MessageData.getConvos(actuel);
        Iterator<Message>itr=convos.iterator();
        while(itr.hasNext()){
            Utilisateur utilisateur=new Utilisateur();
            Message msg=itr.next();
            if(msg.getExpéditeur().equals(actuel)){
                utilisateur.setNom(msg.getDéstinataire().getNom());
                utilisateur.setPrénom(msg.getDéstinataire().getPrénom());
                utilisateur.setEmail(msg.getDéstinataire().getEmail());
            }else{
                utilisateur.setNom(msg.getExpéditeur().getNom());
                utilisateur.setPrénom(msg.getExpéditeur().getPrénom());
                utilisateur.setEmail(msg.getExpéditeur().getEmail());
            }
            defaultModel.addRow(new Object[]{utilisateur.getNom()+" "+utilisateur.getPrénom(),utilisateur.getEmail()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableauConvs = new javax.swing.JTable();
        btnFermer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableauConvs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Utilisateur", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableauConvs.setRowHeight(30);
        tableauConvs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableauConvsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableauConvs);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 47, 632, 303));

        btnFermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close _2.png"))); // NOI18N
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });
        getContentPane().add(btnFermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_new.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableauConvsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableauConvsMouseClicked
        // TODO add your handling code here:
        int row =tableauConvs.getSelectedRow();
        String email=tableauConvs.getValueAt(row, 1).toString();
        Utilisateur utilisateur=UtilisateurData.trouver(email);
        new Messages(actuel, utilisateur).setVisible(true);
    }//GEN-LAST:event_tableauConvsMouseClicked

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnFermerActionPerformed

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
            java.util.logging.Logger.getLogger(Messagerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Messagerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Messagerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Messagerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Messagerie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFermer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableauConvs;
    // End of variables declaration//GEN-END:variables
}
