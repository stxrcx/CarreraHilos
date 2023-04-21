package View;

import Model.Carrera;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Emmanuel
 */
public class JFrameCarrera extends javax.swing.JFrame {
    
    public JFrameCarrera() {
        initComponents();
        this.setTitle("Carrera");
        this.setResizable(false);
    }

    public JLabel getCarro1() {
        return lblCarro1;
    }

    public JLabel getCarro2() {
        return lblCarro2;
    }

    public JLabel getCarro3() {
        return lblCarro3;
    }

    public JLabel getMeta() {
        return metaFinal;
    }
    
    public JTextField getP1(){
        return txtPasosC1;
    }
    
    public JTextField getP2(){
        return txtPasosC2;
    }
    
    public JTextField getP3(){
        return txtPasosC3;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPista = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        metaFinal = new javax.swing.JLabel();
        lblCarro1 = new javax.swing.JLabel();
        lblCarro2 = new javax.swing.JLabel();
        lblCarro3 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblNombreCarro1 = new javax.swing.JLabel();
        lblNombreCarro2 = new javax.swing.JLabel();
        lblNombreCarro3 = new javax.swing.JLabel();
        txtPasosC1 = new javax.swing.JTextField();
        txtPasosC2 = new javax.swing.JTextField();
        txtPasosC3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PanelPista.setBackground(new java.awt.Color(204, 204, 255));

        btnIniciar.setBackground(new java.awt.Color(255, 51, 51));
        btnIniciar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        metaFinal.setBackground(new java.awt.Color(102, 0, 153));
        metaFinal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        metaFinal.setForeground(new java.awt.Color(255, 255, 255));
        metaFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        metaFinal.setText("M\nE\nT\nA");
        metaFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        metaFinal.setOpaque(true);

        lblCarro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/auto-antiguo.png"))); // NOI18N

        lblCarro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/carro-viejo (1).png"))); // NOI18N

        lblCarro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/coche.png"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(153, 0, 153));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("       Carrera ");

        lblNombreCarro1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreCarro1.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreCarro1.setText("Carro 1");

        lblNombreCarro2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreCarro2.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreCarro2.setText("Carro 2");

        lblNombreCarro3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombreCarro3.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreCarro3.setText("Carro 3");

        txtPasosC1.setEditable(false);
        txtPasosC1.setBackground(new java.awt.Color(0, 0, 0));
        txtPasosC1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txtPasosC1.setForeground(new java.awt.Color(255, 255, 255));

        txtPasosC2.setEditable(false);
        txtPasosC2.setBackground(new java.awt.Color(0, 0, 0));
        txtPasosC2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txtPasosC2.setForeground(new java.awt.Color(255, 255, 255));

        txtPasosC3.setEditable(false);
        txtPasosC3.setBackground(new java.awt.Color(0, 0, 0));
        txtPasosC3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txtPasosC3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelPistaLayout = new javax.swing.GroupLayout(PanelPista);
        PanelPista.setLayout(PanelPistaLayout);
        PanelPistaLayout.setHorizontalGroup(
            PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPistaLayout.createSequentialGroup()
                .addGroup(PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPistaLayout.createSequentialGroup()
                        .addGroup(PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPistaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                    .addGroup(PanelPistaLayout.createSequentialGroup()
                                        .addGroup(PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNombreCarro3)
                                            .addComponent(lblCarro1)
                                            .addComponent(lblCarro2)
                                            .addComponent(lblCarro3)
                                            .addComponent(lblNombreCarro1)
                                            .addComponent(lblNombreCarro2))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(txtPasosC1)
                            .addComponent(txtPasosC2)
                            .addComponent(txtPasosC3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPistaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addComponent(metaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelPistaLayout.setVerticalGroup(
            PanelPistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPistaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreCarro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCarro1)
                .addGap(23, 23, 23)
                .addComponent(txtPasosC1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblNombreCarro2)
                .addGap(12, 12, 12)
                .addComponent(lblCarro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(txtPasosC2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblNombreCarro3)
                .addGap(12, 12, 12)
                .addComponent(lblCarro3)
                .addGap(11, 11, 11)
                .addComponent(txtPasosC3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addComponent(metaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        lblCarro1.setLocation(0, lblCarro1.getLocation().y);
        lblCarro2.setLocation(0, lblCarro2.getLocation().y);
        lblCarro3.setLocation(0, lblCarro3.getLocation().y);

        Carrera carro1 = new Carrera(lblCarro1, this);
        Carrera carro2 = new Carrera(lblCarro2, this);
        Carrera carro3 = new Carrera(lblCarro3, this);

        carro1.start();
        carro2.start();
        carro3.start();
        
        
        //Limpia el texto
        txtPasosC1.setText("");
        txtPasosC2.setText("");
        txtPasosC3.setText("");
    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCarrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPista;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel lblCarro1;
    private javax.swing.JLabel lblCarro2;
    private javax.swing.JLabel lblCarro3;
    private javax.swing.JLabel lblNombreCarro1;
    private javax.swing.JLabel lblNombreCarro2;
    private javax.swing.JLabel lblNombreCarro3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel metaFinal;
    private javax.swing.JTextField txtPasosC1;
    private javax.swing.JTextField txtPasosC2;
    private javax.swing.JTextField txtPasosC3;
    // End of variables declaration//GEN-END:variables
}
