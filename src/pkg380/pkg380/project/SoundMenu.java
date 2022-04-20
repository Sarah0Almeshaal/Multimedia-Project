package pkg380.pkg380.project;

import cpit380practice.*;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SoundMenu extends javax.swing.JFrame {

    static String pathfile;
    static Sound sourceSound, targetSound;
    static int startValue, endValue, silentZoneValue;

    public SoundMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        browse = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        decreaseVolume = new javax.swing.JButton();
        increaseVolume = new javax.swing.JButton();
        start = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        clippingSound = new javax.swing.JButton();
        spliceButton = new javax.swing.JButton();
        silentZoneField = new javax.swing.JTextField();
        end = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        reverseButton = new javax.swing.JButton();
        mirrorBackToFront = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("SoundMenu"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        browse.setBackground(new java.awt.Color(255, 204, 204));
        browse.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        getContentPane().add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 180, 70));

        playButton.setBackground(new java.awt.Color(138, 184, 91));
        playButton.setFont(new java.awt.Font("Times New Roman", 1, 39)); // NOI18N
        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        getContentPane().add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 800, 300, 90));

        decreaseVolume.setBackground(new java.awt.Color(222, 250, 222));
        decreaseVolume.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        decreaseVolume.setText("-");
        decreaseVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseVolumeActionPerformed(evt);
            }
        });
        getContentPane().add(decreaseVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 550, 50, -1));

        increaseVolume.setBackground(new java.awt.Color(222, 250, 222));
        increaseVolume.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        increaseVolume.setText("+");
        increaseVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseVolumeActionPerformed(evt);
            }
        });
        getContentPane().add(increaseVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 470, -1, -1));
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 120, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 32)); // NOI18N
        jLabel3.setText("Clip From:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        jLabel4.setBackground(new java.awt.Color(222, 250, 222));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 32)); // NOI18N
        jLabel4.setText("To:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, -1, -1));

        clippingSound.setBackground(new java.awt.Color(222, 250, 222));
        clippingSound.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        clippingSound.setText("Clip a Sound");
        clippingSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clippingSoundActionPerformed(evt);
            }
        });
        getContentPane().add(clippingSound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 250, 60));

        spliceButton.setBackground(new java.awt.Color(222, 250, 222));
        spliceButton.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        spliceButton.setText("Splice Sounds");
        spliceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spliceButtonActionPerformed(evt);
            }
        });
        getContentPane().add(spliceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 270, 60));
        getContentPane().add(silentZoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 720, 120, 50));
        getContentPane().add(end, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 120, 50));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel7.setText("Silent Zone :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, -1, -1));

        reverseButton.setBackground(new java.awt.Color(222, 250, 222));
        reverseButton.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        reverseButton.setText("Reverse a Sound");
        reverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reverseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(reverseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, 270, 60));

        mirrorBackToFront.setBackground(new java.awt.Color(222, 250, 222));
        mirrorBackToFront.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        mirrorBackToFront.setText("Mirror Back To Front");
        mirrorBackToFront.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mirrorBackToFrontActionPerformed(evt);
            }
        });
        getContentPane().add(mirrorBackToFront, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 310, 60));

        jButton3.setBackground(new java.awt.Color(222, 250, 222));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jButton3.setText("Blending Sounds");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 550, 310, 60));

        jButton4.setBackground(new java.awt.Color(222, 250, 222));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jButton4.setText("Squeez and Spread");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 310, 60));

        jButton5.setBackground(new java.awt.Color(222, 250, 222));
        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jButton5.setText("Max Filter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 550, 230, 60));

        jButton6.setBackground(new java.awt.Color(222, 250, 222));
        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jButton6.setText("Median Filter");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 450, 230, 60));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 35)); // NOI18N
        jLabel5.setText("Choose a sound :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 55)); // NOI18N
        jLabel2.setText("Welcome To Editing Sound Page");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 830, 90));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel6.setText("Volume Down :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 550, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel8.setText("Volume Up :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 470, -1, 40));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jButton1.setText("Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 670, 220, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg380/pkg380/Image/FinalWalljpg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 10, 1970, 1070));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        pathfile = FileChooser.pickAFile();
        sourceSound = new Sound(pathfile);
        targetSound = new Sound(pathfile);
    }//GEN-LAST:event_browseActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        if (sourceSound == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A SOUND FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            targetSound.play();
        }
    }//GEN-LAST:event_playButtonActionPerformed

    private void decreaseVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreaseVolumeActionPerformed
        if (sourceSound == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A SOUND FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            targetSound.changeVolume(0.5);
        }
    }//GEN-LAST:event_decreaseVolumeActionPerformed

    private void increaseVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increaseVolumeActionPerformed
        if (sourceSound == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A SOUND FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            targetSound.changeVolume(2);
        }
    }//GEN-LAST:event_increaseVolumeActionPerformed

    private void reverseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reverseButtonActionPerformed
        if (sourceSound == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A SOUND FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            targetSound.reverse();
            targetSound.play();
        }
     }//GEN-LAST:event_reverseButtonActionPerformed

    private void spliceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spliceButtonActionPerformed
        if (sourceSound == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A SOUND FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String silentZone = silentZoneField.getText();
            boolean isNumber;
            try {
                silentZoneValue = Integer.parseInt(silentZone);
                isNumber = true;
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(new JFrame(), "Enter interger values only!", "Error", JOptionPane.ERROR_MESSAGE);
                isNumber = false;
            }
            if (isNumber) {
                sourceSound = splice(silentZoneValue);
                while (true) {
                    int reply = JOptionPane.showConfirmDialog(null, "Do you want to splice another sound ?", "Splice?", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        sourceSound = splice(silentZoneValue);
                    } else {
                        sourceSound.play();
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_spliceButtonActionPerformed

    public Sound splice(int silentZone) {

        Sound sound2 = new Sound(FileChooser.pickAFile());

        int splicedIndex = 0;

        double length = sourceSound.getLength() + sound2.getLength() + silentZone;
        Sound splicedSound = new Sound((int) length);

        for (int i = 0; i < sourceSound.getLength(); i++, splicedIndex++) {

            splicedSound.setSampleValueAt(splicedIndex, sourceSound.getSampleValueAt(i));
        }
        for (int i = 0; i < silentZone; i++, splicedIndex++) {
            splicedSound.setSampleValueAt(splicedIndex, 0);
        }
        for (int i = 0; i < sound2.getLength(); i++, splicedIndex++) {
            splicedSound.setSampleValueAt(splicedIndex, sound2.getSampleValueAt(i));
        }
        return splicedSound;
    }

    private void clippingSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clippingSoundActionPerformed
        if (sourceSound == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A SOUND FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String startText = start.getText();
            String endText = end.getText();

            boolean isNumber;
            try {
                startValue = Integer.parseInt(startText);
                endValue = Integer.parseInt(endText);
                isNumber = true;
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(new JFrame(), "enter interger values only!", "Error", JOptionPane.ERROR_MESSAGE);
                isNumber = false;
            }
            if (isNumber) {
                targetSound = sourceSound.clip(startValue, endValue);
                targetSound.play();
            }
        }
    }//GEN-LAST:event_clippingSoundActionPerformed

    private void mirrorBackToFrontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mirrorBackToFrontActionPerformed
        if (sourceSound == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A SOUND FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            targetSound.mirrorBackToFront();
            targetSound.play();
        }
    }//GEN-LAST:event_mirrorBackToFrontActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (sourceSound == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A SOUND FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Sound sound1
                    = new Sound(FileChooser.pickAFile());
            Sound sound2
                    = new Sound(FileChooser.pickAFile());
            Sound st = new Sound(sound1.getLength() + sound2.getLength());

            int value = 0;
            for (int index = 0; index < 20000; index++) {
                st.setSampleValueAt(index,
                        sound1.getSampleValueAt(index));
            }

            for (int index = 0; index < 20000; index++) {
                value = (int) ((sound1.getSampleValueAt(index + 20000)
                        * 0.5)
                        + (sound2.getSampleValueAt(index) * 0.5));
                st.setSampleValueAt(index + 20000, value);
            }

            for (int index = 20000; index < 40000; index++) {
                st.setSampleValueAt(index + 20000,
                        sound2.getSampleValueAt(index));
            }
            st.play();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (sourceSound == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A SOUND FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int sampleValue = 0;
            int targetIndex = 0;
            int index = 0;
            Sound sourceObj = new Sound(FileChooser.pickAFile());
            SoundSample[] samples = sourceObj.getSamples();
            Sound target = new Sound(sourceSound.getLength() * 2);
            for (int i = 0; i < target.getLength(); i++) {
                sampleValue = sourceSound.getSampleValueAt(i);
                target.setSampleValueAt(targetIndex, sampleValue);
                target.setSampleValueAt(targetIndex + 1, sampleValue);
                targetIndex += 2;
            }

            int value = 0;
            for (int i = targetIndex; i < target.getLength() / 2; i++, index++) {
                value = target.getSampleValueAt(i + i);
                target.setSampleValueAt(i, value);
            }
            target.play();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if (sourceSound == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A SOUND FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
        Sound target = new Sound(sourceSound.getLength());
        int p[] = new int[3];
        int max;
        for (int i = 1; i < sourceSound.getLength() - 1; i++) {
            p[0] = (int) sourceSound.getSampleValueAt(i);
            p[1] = (int) sourceSound.getSampleValueAt(i + 1);
            p[2] = (int) sourceSound.getSampleValueAt(i - 1);
            max = Math.max(Math.max(p[0], p[1]), p[2]);
            target.setSampleValueAt(i, max);
        }
        target.play();
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      if (sourceSound == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A SOUND FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
        Sound target = new Sound(sourceSound.getLength());
        int p[] = new int[3];
        for (int i = 1; i < sourceSound.getLength() - 1; i++) {
            p[0] = (int) sourceSound.getSampleValueAt(i);
            p[1] = (int) sourceSound.getSampleValueAt(i + 1);
            p[2] = (int) sourceSound.getSampleValueAt(i - 1);
            Arrays.sort(p);
            target.setSampleValueAt(i, p[1]);
        }
        target.play();
      }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainMenu mainMenu = new MainMenu();
        mainMenu.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoundMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browse;
    private javax.swing.JButton clippingSound;
    private javax.swing.JButton decreaseVolume;
    private javax.swing.JTextField end;
    private javax.swing.JButton increaseVolume;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton mirrorBackToFront;
    private javax.swing.JButton playButton;
    private javax.swing.JButton reverseButton;
    private javax.swing.JTextField silentZoneField;
    private javax.swing.JButton spliceButton;
    private javax.swing.JTextField start;
    // End of variables declaration//GEN-END:variables
}
