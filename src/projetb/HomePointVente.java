/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetb;

import model.Utilisateur;

/**
 *
 * @author Abdelhaq
 */
public class HomePointVente extends javax.swing.JFrame {
    Utilisateur Actuel;
    /**
     * Creates new form Home
     */
    public HomePointVente() {
        initComponents();
    }
    public HomePointVente(Utilisateur utilisateur){
        Actuel=utilisateur;
        initComponents();
        labelNomEtPrenom.setText(Actuel.getNom()+" "+Actuel.getPrénom());
        labelEmail.setText(Actuel.getEmail());
        labelRôle.setText(Actuel.getRôle());
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
        jPanel3 = new javax.swing.JPanel();
        btnCreerBesoin = new javax.swing.JButton();
        btnMessageVente = new javax.swing.JButton();
        btnDeclarerBesoin = new javax.swing.JButton();
        btnFermer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNomEtPrenom = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelRôle = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 770));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(226, 220, 221));
        jPanel3.setPreferredSize(new java.awt.Dimension(1036, 547));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreerBesoin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCreerBesoin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/créer_besoin.png"))); // NOI18N
        btnCreerBesoin.setText("Créer Besoin");
        btnCreerBesoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreerBesoinActionPerformed(evt);
            }
        });
        jPanel3.add(btnCreerBesoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 308, 277, -1));

        btnMessageVente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMessageVente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Messagerie_big.png"))); // NOI18N
        btnMessageVente.setText("Messagerie");
        btnMessageVente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMessageVenteActionPerformed(evt);
            }
        });
        jPanel3.add(btnMessageVente, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 392, 277, -1));

        btnDeclarerBesoin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDeclarerBesoin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/declarer_besoin.png"))); // NOI18N
        btnDeclarerBesoin.setText("Déclarer besoin");
        btnDeclarerBesoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclarerBesoinActionPerformed(evt);
            }
        });
        jPanel3.add(btnDeclarerBesoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 476, 277, -1));

        btnFermer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close _2.png"))); // NOI18N
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });
        jPanel3.add(btnFermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1080, 770));

        jPanel2.setBackground(new java.awt.Color(60, 0, 6));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENUE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        labelNomEtPrenom.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        labelNomEtPrenom.setForeground(new java.awt.Color(255, 255, 255));
        labelNomEtPrenom.setText("Nom et Prénom");
        jPanel2.add(labelNomEtPrenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        labelEmail.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setText("Email");
        jPanel2.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        labelRôle.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        labelRôle.setForeground(new java.awt.Color(255, 255, 255));
        labelRôle.setText("Rôle");
        jPanel2.add(labelRôle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        btnLogout.setText("Déconnexion");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnFermerActionPerformed

    private void btnDeclarerBesoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclarerBesoinActionPerformed
        // TODO add your handling code here:
        new DéclarationBesoin(Actuel).setVisible(true);
    }//GEN-LAST:event_btnDeclarerBesoinActionPerformed

    private void btnMessageVenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMessageVenteActionPerformed
        // TODO add your handling code here:
        new Messagerie(Actuel).setVisible(true);
    }//GEN-LAST:event_btnMessageVenteActionPerformed

    private void btnCreerBesoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreerBesoinActionPerformed
        // TODO add your handling code here:
        new CréationBesoin(Actuel).setVisible(true);
    }//GEN-LAST:event_btnCreerBesoinActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(HomePointVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePointVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePointVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePointVente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePointVente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreerBesoin;
    private javax.swing.JButton btnDeclarerBesoin;
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMessageVente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNomEtPrenom;
    private javax.swing.JLabel labelRôle;
    // End of variables declaration//GEN-END:variables
}