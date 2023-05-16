/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetb;

import Data_Access.UtilisateurData;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Utilisateur;

/**
 *
 * @author Abdelhaq
 */
public class GestionComptes extends javax.swing.JFrame {

    /**
     * Creates new form GestionComptes
     */
    public GestionComptes() {
        initComponents();
        btnActiver.setEnabled(false);
        btnModifier.setEnabled(false);
        btnSupprimer.setEnabled(false);
        DefaultTableModel defaultModel=(DefaultTableModel)tableUsers.getModel();
        ArrayList<Utilisateur> list= UtilisateurData.getAll();
        Iterator<Utilisateur>itr=list.iterator();
        while(itr.hasNext()){
            Utilisateur u =itr.next();
            defaultModel.addRow(new Object[]{u.getId(),u.getNom(),u.getPrénom(),u.getEmail(),u.getMdp(),u.getRôle(),u.getStatut()});
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
        tableUsers = new javax.swing.JTable();
        btnActiver = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnDésactiver = new javax.swing.JButton();
        btnFermer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 200, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nom", "Prénom", "Email", "Mot de passe", "Rôle", "Statut"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUsers.setRowHeight(30);
        tableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUsers);
        if (tableUsers.getColumnModel().getColumnCount() > 0) {
            tableUsers.getColumnModel().getColumn(0).setMinWidth(30);
            tableUsers.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableUsers.getColumnModel().getColumn(0).setMaxWidth(30);
            tableUsers.getColumnModel().getColumn(1).setMinWidth(150);
            tableUsers.getColumnModel().getColumn(1).setPreferredWidth(150);
            tableUsers.getColumnModel().getColumn(1).setMaxWidth(150);
            tableUsers.getColumnModel().getColumn(2).setMinWidth(150);
            tableUsers.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableUsers.getColumnModel().getColumn(2).setMaxWidth(150);
            tableUsers.getColumnModel().getColumn(3).setMinWidth(150);
            tableUsers.getColumnModel().getColumn(3).setPreferredWidth(150);
            tableUsers.getColumnModel().getColumn(3).setMaxWidth(150);
            tableUsers.getColumnModel().getColumn(4).setMinWidth(100);
            tableUsers.getColumnModel().getColumn(4).setPreferredWidth(100);
            tableUsers.getColumnModel().getColumn(4).setMaxWidth(100);
            tableUsers.getColumnModel().getColumn(5).setPreferredWidth(50);
            tableUsers.getColumnModel().getColumn(6).setMinWidth(50);
            tableUsers.getColumnModel().getColumn(6).setPreferredWidth(50);
            tableUsers.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 860, 244));

        btnActiver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/account_activate.png"))); // NOI18N
        btnActiver.setText("Activer Compte");
        btnActiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActiverActionPerformed(evt);
            }
        });
        getContentPane().add(btnActiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        btnModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });
        getContentPane().add(btnModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        btnSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(btnSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));

        btnDésactiver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete-user.png"))); // NOI18N
        btnDésactiver.setText("Désactiver Compte");
        btnDésactiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDésactiverActionPerformed(evt);
            }
        });
        getContentPane().add(btnDésactiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        btnFermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close _2.png"))); // NOI18N
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });
        getContentPane().add(btnFermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/900 x 800.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsersMouseClicked
        // TODO add your handling code here:
        btnActiver.setEnabled(true);
        btnDésactiver.setEnabled(true);
        btnModifier.setEnabled(true);
        btnSupprimer.setEnabled(true);
        
    }//GEN-LAST:event_tableUsersMouseClicked

    private void btnActiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActiverActionPerformed
        // TODO add your handling code here:
        int row=tableUsers.getSelectedRow();
        tableUsers.setValueAt("actif", row, 6);
        Utilisateur utilisateur=new Utilisateur();
        utilisateur.setId(Integer.parseInt(tableUsers.getValueAt(row, 0).toString()));
        utilisateur.setNom(tableUsers.getValueAt(row, 1).toString());
        utilisateur.setPrénom(tableUsers.getValueAt(row, 2).toString());
        utilisateur.setEmail(tableUsers.getValueAt(row, 3).toString());
        utilisateur.setMdp(tableUsers.getValueAt(row, 4).toString());
        utilisateur.setRôle(tableUsers.getValueAt(row, 5).toString());
        utilisateur.setStatut("actif");
        UtilisateurData.modifier(utilisateur);
    }//GEN-LAST:event_btnActiverActionPerformed

    private void btnDésactiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDésactiverActionPerformed
        // TODO add your handling code here:
        int row=tableUsers.getSelectedRow();
        tableUsers.setValueAt("", row, 6);
        Utilisateur utilisateur=new Utilisateur();
        utilisateur.setId(Integer.parseInt(tableUsers.getValueAt(row, 0).toString()));
        utilisateur.setNom(tableUsers.getValueAt(row, 1).toString());
        utilisateur.setPrénom(tableUsers.getValueAt(row, 2).toString());
        utilisateur.setEmail(tableUsers.getValueAt(row, 3).toString());
        utilisateur.setMdp(tableUsers.getValueAt(row, 4).toString());
        utilisateur.setRôle(tableUsers.getValueAt(row, 5).toString());
        utilisateur.setStatut("");
        UtilisateurData.modifier(utilisateur);
    }//GEN-LAST:event_btnDésactiverActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        // TODO add your handling code here:
        int row=tableUsers.getSelectedRow();
        Utilisateur utilisateur=new Utilisateur();
        utilisateur.setId(Integer.parseInt(tableUsers.getValueAt(row, 0).toString()));
        utilisateur.setNom(tableUsers.getValueAt(row, 1).toString());
        utilisateur.setPrénom(tableUsers.getValueAt(row, 2).toString());
        utilisateur.setEmail(tableUsers.getValueAt(row, 3).toString());
        utilisateur.setMdp(tableUsers.getValueAt(row, 4).toString());
        utilisateur.setRôle(tableUsers.getValueAt(row, 5).toString());
        utilisateur.setStatut(tableUsers.getValueAt(row, 6).toString());
        new FormUtilisateur(utilisateur).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        // TODO add your handling code here:
        int row=tableUsers.getSelectedRow();
        Utilisateur utilisateur=new Utilisateur();
        utilisateur.setId(Integer.parseInt(tableUsers.getValueAt(row, 0).toString()));
        utilisateur.setNom(tableUsers.getValueAt(row, 1).toString());
        utilisateur.setPrénom(tableUsers.getValueAt(row, 2).toString());
        utilisateur.setEmail(tableUsers.getValueAt(row, 3).toString());
        utilisateur.setMdp(tableUsers.getValueAt(row, 4).toString());
        utilisateur.setRôle(tableUsers.getValueAt(row, 5).toString());
        UtilisateurData.supprimer(utilisateur);
        this.dispose();
        new GestionComptes().setVisible(true);
    }//GEN-LAST:event_btnSupprimerActionPerformed

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
            java.util.logging.Logger.getLogger(GestionComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionComptes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionComptes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActiver;
    private javax.swing.JButton btnDésactiver;
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUsers;
    // End of variables declaration//GEN-END:variables
}