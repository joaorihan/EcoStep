/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author victo
 */
public class Splash_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Tela_GUI
     */
    public Splash_GUI() {
        initComponents();
        
        new Thread(){
            public void run() {
                for (int i=0; i<101; i++){
                    try {
                        sleep(60); 

                        barra.setValue(i);

                        if(barra.getValue() == 10){

                            mess.setText("Procurando atualizações");
                            sleep(2000);


                        }else if (barra.getValue() <=30){
                            mess.setText("Inicializando EcoStep");
                          sleep(100);  
                        } else if (barra.getValue() <=99){
                            mess.setText("Carregando estações");

                        }else{
                            mess.setText("Programa iniciando");

                        sleep(2000);

                        new Login_GUI().setVisible(true);
                            dispose();
                        }


                    } catch (InterruptedException ex) {
                    }       

                }        
            }
        
        }.start();
        
   
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
        mess = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        mess.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(mess);
        mess.setBounds(10, 180, 380, 27);

        barra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(barra);
        barra.setBounds(90, 130, 220, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 270);

        setSize(new java.awt.Dimension(396, 267));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mess;
    // End of variables declaration//GEN-END:variables
}