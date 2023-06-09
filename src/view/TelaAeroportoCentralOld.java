/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author leogo
 */
public class TelaAeroportoCentralOld extends javax.swing.JFrame {

    /**
     * Creates new form AeroportoCentral
     */
    public TelaAeroportoCentralOld() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCadastro = new javax.swing.JMenu();
        mnuCadAreoporto = new javax.swing.JMenuItem();
        mnuCadTorre = new javax.swing.JMenuItem();
        mnuCadControlador = new javax.swing.JMenuItem();
        mnuCadHangar = new javax.swing.JMenuItem();
        mnuCadPista = new javax.swing.JMenuItem();
        mnuCadTerminal = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA AEROSYS");

        mnuCadastro.setText("CADASTRO");

        mnuCadAreoporto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuCadAreoporto.setText("Aeroporto");
        mnuCadAreoporto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadAreoportoActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadAreoporto);

        mnuCadTorre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuCadTorre.setText("Torre de Controle");
        mnuCadTorre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadTorreActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadTorre);

        mnuCadControlador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuCadControlador.setText("Controladores");
        mnuCadastro.add(mnuCadControlador);

        mnuCadHangar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuCadHangar.setText("Hangar");
        mnuCadastro.add(mnuCadHangar);

        mnuCadPista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuCadPista.setText("Pista");
        mnuCadPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadPistaActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadPista);

        mnuCadTerminal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuCadTerminal.setText("Terminal");
        mnuCadastro.add(mnuCadTerminal);

        jMenuBar1.add(mnuCadastro);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 205));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadTorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadTorreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuCadTorreActionPerformed

    private void mnuCadPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadPistaActionPerformed
       new TelaPista().setVisible(true);
    }//GEN-LAST:event_mnuCadPistaActionPerformed

    private void mnuCadAreoportoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadAreoportoActionPerformed
        new TelaAeroporto().setVisible(true);
    }//GEN-LAST:event_mnuCadAreoportoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAeroportoCentralOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAeroportoCentralOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAeroportoCentralOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAeroportoCentralOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAeroportoCentralOld().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuCadAreoporto;
    private javax.swing.JMenuItem mnuCadControlador;
    private javax.swing.JMenuItem mnuCadHangar;
    private javax.swing.JMenuItem mnuCadPista;
    private javax.swing.JMenuItem mnuCadTerminal;
    private javax.swing.JMenuItem mnuCadTorre;
    private javax.swing.JMenu mnuCadastro;
    // End of variables declaration//GEN-END:variables
}
