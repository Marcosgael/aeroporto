/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author leonardo.lgcc
 */

import com.sun.org.apache.xerces.internal.util.TeeXMLDocumentFilterImpl;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class TelaAeroportoCentral extends javax.swing.JFrame {

    /**
     * Creates new form TelaAeroportoCentral
     */
    
    private JMenuBar menuBar;
    private JMenu menuCadastro;
    private JMenuItem menuItemAeroporto;
    private JMenuItem menuItemPista;
    private JMenuItem menuItemTerminal;
    private JMenuItem menuItemHangar;
    private JMenuItem menuItemAviao;
    private JMenuItem menuItemControlador;
    private JMenuItem menuItemTorreDeControle;
    private JMenuItem menuItemRadar;
    
    public TelaAeroportoCentral() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    private void cadastrarAeroporto() {
        // Lógica para abrir a tela de cadastro de aeroporto
        TelaAeroporto telaCadastroAeroporto = new TelaAeroporto();
        telaCadastroAeroporto.setVisible(true);
    }
    
    private void cadastrarPista() {
        // Lógica para abrir a tela de cadastro de pista
        TelaPista telaCadastroPista = new TelaPista();
        telaCadastroPista.setVisible(true);
    }
    
    private void cadastrarTerminal() {
        // Lógica para abrir a tela de cadastro de terminal
        TelaCadastroTerminal telaCadastroTerminal = new TelaCadastroTerminal();
        telaCadastroTerminal.setVisible(true);
    }
    
    private void cadastrarHangar() {
        // Lógica para abrir a tela de cadastro de hangar
        TelaCadastroHangar telaCadastroHangar = new TelaCadastroHangar();
        telaCadastroHangar.setVisible(true);
    }
    
    private void cadastrarAviao() {
        // Lógica para abrir a tela de cadastro de avião
        TelaCadastroAviao telaCadastroAviao = new TelaCadastroAviao();
        telaCadastroAviao.setVisible(true);
    }
    
    private void cadastrarControlador() {
        // Lógica para abrir a tela de cadastro de controlador
        TelaCadastroControlador telaCadastroControlador = new TelaCadastroControlador();
        telaCadastroControlador.setVisible(true);
    }
    
    private void cadastrarTorreDeControle() {
        // Lógica para abrir a tela de cadastro de torre de controle
        TelaCadTorreDeControle telaCadastroTorreDeControle = new TelaCadTorreDeControle();
        telaCadastroTorreDeControle.setVisible(true);
    }
    
    private void cadastrarRadar() {
        // Lógica para abrir a tela de cadastro de radar
        TelaCadastroRadar telaCadastroRadar = new TelaCadastroRadar();
        telaCadastroRadar.setVisible(true);
    }
    
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
            java.util.logging.Logger.getLogger(TelaAeroportoCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAeroportoCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAeroportoCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAeroportoCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAeroportoCentral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
