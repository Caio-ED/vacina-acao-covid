/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Models.Usuario;

/**
 *
 * @author andre
 */
public class TelaAdmin extends javax.swing.JFrame {
    private Usuario usuario;
    /**
     * Creates new form TelaAdmin
     */
    public TelaAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);  
    }
    
    public TelaAdmin(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        gerenciarUsuariosButton = new javax.swing.JButton();
        bemVindoText = new javax.swing.JLabel();
        gerenciarPacientesButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        relatoriosButton = new javax.swing.JButton();
        verFilaButton = new javax.swing.JButton();
        gerenciarVacinasButton = new javax.swing.JButton();
        gerenciarVacinacoesButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador");
        setMinimumSize(new java.awt.Dimension(345, 485));
        getContentPane().setLayout(null);

        gerenciarUsuariosButton.setText("Gerenciar usuarios");
        gerenciarUsuariosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarUsuariosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(gerenciarUsuariosButton);
        gerenciarUsuariosButton.setBounds(80, 220, 150, 24);

        bemVindoText.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        bemVindoText.setForeground(new java.awt.Color(255, 255, 255));
        bemVindoText.setText("Seja bem-vindo, Administrador!");
        getContentPane().add(bemVindoText);
        bemVindoText.setBounds(60, 60, 200, 16);

        gerenciarPacientesButton.setText("Gerenciar Pacientes");
        gerenciarPacientesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarPacientesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(gerenciarPacientesButton);
        gerenciarPacientesButton.setBounds(80, 190, 150, 24);

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sairButton);
        sairButton.setBounds(110, 340, 90, 24);

        jLabel1.setMaximumSize(new java.awt.Dimension(20000, 20000));
        jLabel1.setMinimumSize(new java.awt.Dimension(450, 550));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        relatoriosButton.setText("Ver Relatorios");
        relatoriosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(relatoriosButton);
        relatoriosButton.setBounds(80, 150, 150, 24);

        verFilaButton.setText("Ver fila de vacinação");
        verFilaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verFilaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(verFilaButton);
        verFilaButton.setBounds(80, 120, 150, 24);

        gerenciarVacinasButton.setText("Gerenciar Vacinas");
        gerenciarVacinasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarVacinasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(gerenciarVacinasButton);
        gerenciarVacinasButton.setBounds(80, 270, 150, 24);

        gerenciarVacinacoesButton.setText("Gerenciar Vacinações");
        gerenciarVacinacoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarVacinacoesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(gerenciarVacinacoesButton);
        gerenciarVacinacoesButton.setBounds(80, 300, 150, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\caioe\\OneDrive\\Área de Trabalho\\Projeto\\src\\main\\java\\ImagensProjeto\\TelaADM.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 330, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerenciarUsuariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarUsuariosButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        TelaGerenciaUsuario n = new TelaGerenciaUsuario(this.usuario);
        n.setVisible(true);
        n.setLocationRelativeTo(null);
    }//GEN-LAST:event_gerenciarUsuariosButtonActionPerformed

    private void gerenciarPacientesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarPacientesButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        TelaGerenciaPaciente n = new TelaGerenciaPaciente(this.usuario);
        n.setVisible(true);
        n.setLocationRelativeTo(null);
    }//GEN-LAST:event_gerenciarPacientesButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        dispose();  //botao sair     
    }//GEN-LAST:event_sairButtonActionPerformed

    private void relatoriosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriosButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        TelaRelatorio n = new TelaRelatorio(this.usuario);
        n.setVisible(true);
        n.setLocationRelativeTo(null);
    }//GEN-LAST:event_relatoriosButtonActionPerformed

    private void gerenciarVacinasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarVacinasButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gerenciarVacinasButtonActionPerformed

    private void gerenciarVacinacoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarVacinacoesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gerenciarVacinacoesButtonActionPerformed

    private void verFilaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verFilaButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        TelaFilaVacinacao f = new TelaFilaVacinacao(this.usuario);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }//GEN-LAST:event_verFilaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemVindoText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton gerenciarPacientesButton;
    private javax.swing.JButton gerenciarUsuariosButton;
    private javax.swing.JButton gerenciarVacinacoesButton;
    private javax.swing.JButton gerenciarVacinasButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton relatoriosButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton verFilaButton;
    // End of variables declaration//GEN-END:variables

   
    }
