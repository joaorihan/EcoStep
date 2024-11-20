/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.Funcionalidades_DAO;

/**
 *
 * @author João
 */
public class Estacao_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Estacao_GUI
     */
    public Estacao_GUI() {
        initComponents();
        estacaoLabel.setText("Estação " + Funcionalidades_DAO.estacaoText);
        
        horaLabel.setText(String.valueOf(Funcionalidades_DAO.horaAtual) + ":00");
        horarioTipo.setText(Funcionalidades_DAO.horario);
                
        passageirosLabel.setText(String.valueOf(Funcionalidades_DAO.passageiros));
        passosLabel.setText(String.valueOf(Funcionalidades_DAO.passos));
        energiaLabel.setText(String.valueOf(Funcionalidades_DAO.energia) + "kWh");
        valorLabel.setText("R$ " + String.valueOf(Funcionalidades_DAO.preco));
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
        jPanel2 = new javax.swing.JPanel();
        estacaoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        valorLabel = new javax.swing.JLabel();
        passageirosLabel = new javax.swing.JLabel();
        passosLabel = new javax.swing.JLabel();
        energiaLabel = new javax.swing.JLabel();
        horaLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        horarioTipo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setLayout(null);

        jLabel1.setText("Estação");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 40, 50, 16);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        estacaoLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estacaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estacaoLabel.setText("Estação");
        jPanel2.add(estacaoLabel);
        estacaoLabel.setBounds(0, 20, 540, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Passageiros:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(110, 110, 120, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Passos no EcoStep:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 150, 180, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Energia gerada:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(110, 190, 170, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Valor da energia:  ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(110, 230, 190, 25);

        valorLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valorLabel.setText("0");
        jPanel2.add(valorLabel);
        valorLabel.setBounds(270, 230, 100, 30);

        passageirosLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passageirosLabel.setText("0");
        jPanel2.add(passageirosLabel);
        passageirosLabel.setBounds(230, 110, 100, 30);

        passosLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passosLabel.setText("0");
        jPanel2.add(passosLabel);
        passosLabel.setBounds(280, 150, 100, 30);

        energiaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        energiaLabel.setText("0");
        jPanel2.add(energiaLabel);
        energiaLabel.setBounds(260, 190, 100, 30);

        horaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        horaLabel.setText("12:00");
        jPanel2.add(horaLabel);
        horaLabel.setBounds(440, 50, 80, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Hora do dia:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(350, 50, 80, 20);

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(voltarButton);
        voltarButton.setBounds(430, 280, 72, 30);

        horarioTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        horarioTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horarioTipo.setText("Horário de Pico");
        jPanel2.add(horarioTipo);
        horarioTipo.setBounds(350, 80, 130, 20);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton1.setText("Manutenção");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(410, 230, 110, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 540, 330);

        setSize(new java.awt.Dimension(542, 329));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        this.dispose();
        new MenuPrincipal_GUI().setVisible(true);
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "Manutenção solicitada com sucesso para a estação " + Funcionalidades_DAO.estacaoText, "EcoStep", 1);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Estacao_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estacao_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estacao_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estacao_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estacao_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel energiaLabel;
    private javax.swing.JLabel estacaoLabel;
    private javax.swing.JLabel horaLabel;
    private javax.swing.JLabel horarioTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel passageirosLabel;
    private javax.swing.JLabel passosLabel;
    private javax.swing.JLabel valorLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}