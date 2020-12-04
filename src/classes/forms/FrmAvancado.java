package forms;

import javax.swing.JFileChooser;
import javax.swing.JList;

/**
 *
 * @author Anderson Felipe Schneider <hactar@universo.univates.br>
 */
public class FrmAvancado extends javax.swing.JFrame {

    /**
     * Creates new form FrmAvancao
     */
    public FrmAvancado() {
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

        btnDestino = new javax.swing.JButton();
        jtfDestino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMarca = new javax.swing.JButton();
        jtfMarca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlListaTamanhos = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        btnFecharAvancado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDestino.setText("Selecionar");
        btnDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestinoActionPerformed(evt);
            }
        });

        jtfDestino.setEnabled(false);

        jLabel1.setText("Destino");

        jLabel2.setText("Marca D'Água");

        btnMarca.setText("Selecionar");
        btnMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcaActionPerformed(evt);
            }
        });

        jtfMarca.setEnabled(false);

        jlListaTamanhos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "600", "400", "200", "120", "100" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlListaTamanhos);

        jLabel3.setText("Tamanhos imagem padrão");

        btnFecharAvancado.setText("Ok");
        btnFecharAvancado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharAvancadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfDestino)
                        .addGap(18, 18, 18)
                        .addComponent(btnDestino))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMarca))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFecharAvancado)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDestino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMarca))
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFecharAvancado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharAvancadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharAvancadoActionPerformed
//        int teste[] = this.jlListaTamanhos.getSelectedIndices();
//        for( int i = 0; i < teste.length; i++) {
//            System.out.println(teste[i]);
//            System.out.println( jlListaTamanhos.getModel().getElementAt( teste[i]));
//        }
        this.setVisible(false);
    }//GEN-LAST:event_btnFecharAvancadoActionPerformed

    private void btnDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestinoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Selecione o destino");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    //
        // disable the "All files" option.
        //
        chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            jtfDestino.setText( chooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_btnDestinoActionPerformed

    private void btnMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcaActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.showOpenDialog(this);

        jtfMarca.setText( chooser.getSelectedFile().getAbsolutePath());
        
    }//GEN-LAST:event_btnMarcaActionPerformed

    public String getTfMarca() {
        return this.jtfMarca.getText();
    }
    
    public String getTfDestino() {
        return this.jtfDestino.getText();
    }
    
    public JList getListaDeIndices(){
        return this.jlListaTamanhos;
    }
    
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
            java.util.logging.Logger.getLogger(FrmAvancado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAvancado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAvancado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAvancado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAvancado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDestino;
    private javax.swing.JButton btnFecharAvancado;
    private javax.swing.JButton btnMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList jlListaTamanhos;
    private javax.swing.JTextField jtfDestino;
    private javax.swing.JTextField jtfMarca;
    // End of variables declaration//GEN-END:variables
}