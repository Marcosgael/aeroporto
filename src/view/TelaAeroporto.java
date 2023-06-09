/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author leogo
 */
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class TelaAeroporto extends javax.swing.JFrame {

    /**
     * Creates new form TelaAeroporto
     */
    public TelaAeroporto() {
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

        lblNomeAeroporto = new javax.swing.JLabel();
        txtNomeAeroporto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblCodAero = new javax.swing.JLabel();
        txtCodAero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO AEROPORTO");
        getContentPane().setLayout(null);

        lblNomeAeroporto.setText("Nome:");
        getContentPane().add(lblNomeAeroporto);
        lblNomeAeroporto.setBounds(30, 70, 36, 16);
        getContentPane().add(txtNomeAeroporto);
        txtNomeAeroporto.setBounds(90, 70, 262, 22);

        jButton1.setText("SALVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 110, 262, 22);

        lblCodAero.setText("Cod");
        getContentPane().add(lblCodAero);
        lblCodAero.setBounds(40, 40, 32, 16);
        getContentPane().add(txtCodAero);
        txtCodAero.setBounds(90, 40, 260, 22);

        setSize(new java.awt.Dimension(442, 192));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/aerosys","root", "");
            PreparedStatement st = conectado.prepareStatement("insert into aeroporto (id, identificacao) values (?,?)");
            st.setInt(1,Integer.parseInt(txtCodAero.getText()));
            st.setString(2, txtNomeAeroporto.getText());
            String nomeAeroporto = txtNomeAeroporto.getText();
                   if (nomeAeroporto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o nome do aeroporto");
            return;
                   }else{
                       st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Aeroporto cadastrado com sucesso!");
            txtNomeAeroporto.setText("");
                   }
            

        
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
           
           
                
        // Exibe uma mensagem informando que o aeroporto foi salvo
//        JOptionPane.showMessageDialog(this, "Aeroporto cadastrado com sucesso!");

        // Limpa o campo de texto
        txtNomeAeroporto.setText("");
        
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
            java.util.logging.Logger.getLogger(TelaAeroporto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAeroporto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAeroporto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAeroporto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAeroporto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblCodAero;
    private javax.swing.JLabel lblNomeAeroporto;
    private javax.swing.JTextField txtCodAero;
    private javax.swing.JTextField txtNomeAeroporto;
    // End of variables declaration//GEN-END:variables
}
