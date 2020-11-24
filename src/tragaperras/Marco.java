package tragaperras;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Marco extends JFrame 
{
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Image3;
    private javax.swing.JButton Imagen;
    private javax.swing.JButton Imagen2;
    private javax.swing.JButton Inicio;
    ImageIcon icono,icono2,icono3;
    ImageIcon iconoEscalado,iconoEscalado2,iconoEscalado3;
    Hilo h1;
    Hilo h2;
    Hilo h3;
    // End of variables declaration//GEN-END:variables
    /**
     * Creates new form Ventana
     */
    public Marco() 
    {
        initComponents();
        
        icono= new ImageIcon(".\\imagenes\\numero5.png");
        iconoEscalado = new ImageIcon (icono.getImage().getScaledInstance(this.Imagen.getWidth(), this.Imagen.getHeight(), 0));
        this.Imagen.setIcon(iconoEscalado);
        
        icono2= new ImageIcon(".\\imagenes\\numero5.png");
        iconoEscalado2 = new ImageIcon (icono.getImage().getScaledInstance(this.Imagen2.getWidth(), this.Imagen2.getHeight(), 0));
        this.Imagen2.setIcon(iconoEscalado);
        
        icono3= new ImageIcon(".\\imagenes\\numero5.png");
        iconoEscalado3 = new ImageIcon (icono.getImage().getScaledInstance(this.Image3.getWidth(), this.Image3.getHeight(), 0));
        this.Image3.setIcon(iconoEscalado);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Imagen = new javax.swing.JButton();
        Imagen2 = new javax.swing.JButton();
        Image3 = new javax.swing.JButton();
        Inicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Button1.setText("STOP");
        Button1.setEnabled(false);
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setText("STOP");
        Button2.setEnabled(false);
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setText("STOP");
        Button3.setEnabled(false);
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagenActionPerformed(evt);
            }
        });

        Imagen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imagen2ActionPerformed(evt);
            }
        });

        Image3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Image3ActionPerformed(evt);
            }
        });

        Inicio.setText("START");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Image3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button3, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Image3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Imagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imagen2ActionPerformed
        // TODO add your handling code here:
    	h2.actionPerformed(evt);
        Inicio.setEnabled(true);
        Button2.setEnabled(false);
        Imagen2.setEnabled(false);
        Resultado();
    }//GEN-LAST:event_Imagen2ActionPerformed

    private void Image3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Image3ActionPerformed
        // TODO add your handling code here:
    	h1.actionPerformed(evt);
        Inicio.setEnabled(true);
        Button3.setEnabled(false);
        Image3.setEnabled(false);
        Resultado();
    }//GEN-LAST:event_Image3ActionPerformed

    private void ImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagenActionPerformed
        // TODO add your handling code here:
    	h3.actionPerformed(evt);
        Inicio.setEnabled(true);
        Button1.setEnabled(false);
        Imagen.setEnabled(false);
        Resultado();
    }//GEN-LAST:event_ImagenActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        
    	h1 = new Hilo(Imagen,Button1);
    	h2 = new Hilo(Imagen2,Button2);
    	h3 = new Hilo(Image3,Button3);
        
        h1.start();
        h2.start();
        h3.start();

        Inicio.setEnabled(false);
        Button1.setEnabled(true);
        Button2.setEnabled(true);
        Button3.setEnabled(true);
        Imagen.setEnabled(true);
        Imagen2.setEnabled(true);
        Image3.setEnabled(true);
        
    }//GEN-LAST:event_InicioActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
      h1.actionPerformed(evt);
      Inicio.setEnabled(true);
      Button1.setEnabled(false);
      Imagen.setEnabled(false);
      Resultado();
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
    	h2.actionPerformed(evt);
    	Inicio.setEnabled(true);
    	Button2.setEnabled(false);
        Imagen2.setEnabled(false);
        Resultado();
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        // TODO add your handling code here:
    	h3.actionPerformed(evt);
    	Inicio.setEnabled(true);
    	Button3.setEnabled(false);
        Image3.setEnabled(false);
        Resultado();
    }//GEN-LAST:event_Button3ActionPerformed

    private void Resultado(){
    	if(!h1.isAlive() && !h2.isAlive() && !h3.isAlive()) {
    		Inicio.setEnabled(true);
    		if(h1.numImagen().equals(h2.numImagen()) && h1.numImagen().equals(h3.numImagen())) {
    			System.out.println("Enhorabuena has ganado...");
    			System.out.println("100� !!!!");
    		}
    	}
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
            java.util.logging.Logger.getLogger(Marco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Marco().setVisible(true);
            }
        });
    }
}
