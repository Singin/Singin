package singin;

import java.util.ArrayList;

public class LecteurJFrame extends javax.swing.JFrame {

    private enum ETAT {

        PLAY, PAUSE, STOP
    };
    private ETAT etat;

    private Lecteur lecteur;
    private Projet projet;

    public LecteurJFrame() {
        initComponents();

        etat = ETAT.STOP;
        activationStop();
        Simple.init();
        projet = Projet.getOneProjetRandom();
        lecteur = new Lecteur();
        lecteur.addSamples(projet.getSamples());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stopButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        recButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        recButton.setText("Rec");
        recButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(recButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stopButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stopButton)
                    .addComponent(playButton)
                    .addComponent(recButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
      switch (etat) {
          case STOP:
              etat = ETAT.PLAY;
              activationPlay();
              lecteur.play();
              break;
          case PAUSE:
              etat = ETAT.PLAY;
              activationPlay();
              lecteur.play();
              break;
          case PLAY:
              etat = ETAT.PAUSE;
              activationPause();
              lecteur.pause();
              break;
      }
  }//GEN-LAST:event_playButtonActionPerformed

  private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
      switch (etat) {
          case PLAY:
              etat = ETAT.STOP;
              activationStop();
              lecteur.stop();
              break;
          case PAUSE:
              etat = ETAT.STOP;
              activationStop();
              lecteur.stop();
              break;
          case STOP:
              throw new RuntimeException();
      }
  }//GEN-LAST:event_stopButtonActionPerformed

  private void listSampleValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listSampleValueChanged
//    ArrayList<EnregSelectionnable> selected =
//			(ArrayList<EnregSelectionnable>) listSample.getSelectedValuesList();
//	
//	for(EnregSelectionnable e : selected){
//	  if(e.isSelected())
//		e.setSelected(false);
//	  else
//		e.setSelected(true);
//	}
//	
//	System.out.println(selected);
  }//GEN-LAST:event_listSampleValueChanged

    private void recButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recButtonActionPerformed
        switch (etat) {
            case STOP:
                etat = ETAT.PLAY;
                activationRec();
                //lecteur.rec();
                break;
            case PAUSE:
                throw new RuntimeException("enregistrement interdit");
            case PLAY:
                throw new RuntimeException("enregistrement interdit");
        }
    }//GEN-LAST:event_recButtonActionPerformed

    private void activationPlay() {
        playButton.setText("Pause");
        playButton.setEnabled(true);
        stopButton.setEnabled(true);
    }

    private void activationPause() {
        playButton.setText("Play");
        playButton.setEnabled(true);
        stopButton.setEnabled(true);
    }

    private void activationStop() {
        playButton.setText("Play");
        playButton.setEnabled(true);
        stopButton.setEnabled(false);
    }

    private void activationRec() {
        playButton.setEnabled(false);
        stopButton.setEnabled(true);
        recButton.setEnabled(false);
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
            java.util.logging.Logger.getLogger(LecteurJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecteurJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecteurJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecteurJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecteurJFrame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton playButton;
    private javax.swing.JButton recButton;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables
}