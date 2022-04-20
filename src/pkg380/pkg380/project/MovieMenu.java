package pkg380.pkg380.project;

import cpit380practice.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MovieMenu extends javax.swing.JFrame {

    public MovieMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rectangleMovie = new javax.swing.JButton();
        Ball = new javax.swing.JButton();
        sunsetMovie = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 55)); // NOI18N
        jLabel1.setText("Welcome To Editting Movie Page");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 880, 90));

        rectangleMovie.setBackground(new java.awt.Color(204, 255, 204));
        rectangleMovie.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        rectangleMovie.setText("Rectangle Trajectory Movie");
        rectangleMovie.setBorder(null);
        rectangleMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleMovieActionPerformed(evt);
            }
        });
        jPanel1.add(rectangleMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 420, 70));

        Ball.setBackground(new java.awt.Color(204, 255, 204));
        Ball.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        Ball.setText("Dropped Ball Movie");
        Ball.setBorder(null);
        Ball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BallActionPerformed(evt);
            }
        });
        jPanel1.add(Ball, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 360, 70));

        sunsetMovie.setBackground(new java.awt.Color(204, 255, 204));
        sunsetMovie.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        sunsetMovie.setText("Sunset Movie");
        sunsetMovie.setBorder(null);
        sunsetMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sunsetMovieActionPerformed(evt);
            }
        });
        jPanel1.add(sunsetMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 360, 70));

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jButton6.setText("Ticker Tape Movie");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 410, 70));

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jButton3.setText("Background Subtraction Movie");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 410, 70));

        jButton7.setBackground(new java.awt.Color(204, 255, 204));
        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jButton7.setText("Rectangle to Ball Movie");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, 360, 70));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jButton1.setText("Main Menu");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 670, 190, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg380/pkg380/Image/FinalWalljpg.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-530, -220, 1980, 1060));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rectangleMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleMovieActionPerformed
        int framesPerSec = 30;
        Picture pic = null;
        Graphics graph = null;
        String dir = "c:/intro-prog-java/movies/rectangle/";
        FrameSequencer fs = new FrameSequencer(dir);
        for (int i = 0; i < framesPerSec * 2; i++) {
            pic = new Picture(640, 520);
            graph = pic.getGraphics();
            graph.setColor(Color.MAGENTA);
            graph.fillRect(i * 10 + (int) (5 * Math.sin(i + 20)), i * 8 + (int) (5 * Math.cos(i + 20)), 50, 50);
            fs.addFrame(pic);
        }
        fs.play(framesPerSec);
    }//GEN-LAST:event_rectangleMovieActionPerformed

    private void sunsetMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunsetMovieActionPerformed
        Picture pic = new Picture(FileChooser.pickAFile());
        int framesPerSec = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of frames please"));
        String dir = "c:/intro-prog-java/movies/sunset/";
        FrameSequencer fs = new FrameSequencer(dir);
        for (int i = 0; i < framesPerSec; i++) {
            pic = new Picture(pic);
            pic.makeSunset(0.95);
            fs.addFrame(pic);
        }
        fs.play(framesPerSec);
    }//GEN-LAST:event_sunsetMovieActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(new JFrame(), "Choose the fadedout picture", "information", JOptionPane.INFORMATION_MESSAGE);
        Picture kidP = new Picture(FileChooser.pickAFile());
        JOptionPane.showMessageDialog(new JFrame(), "Choose the old background picture", "information", JOptionPane.INFORMATION_MESSAGE);
        Picture wallP = new Picture(FileChooser.pickAFile());
        JOptionPane.showMessageDialog(new JFrame(), "Choose the new background picture", "information", JOptionPane.INFORMATION_MESSAGE);
        Picture beachP = new Picture(FileChooser.pickAFile());
        String dir = "c:/intro-prog-java/movies/fadeout/";
        FrameSequencer frameSequencer = new FrameSequencer(dir);
        int framesPerSec = 30;
        for (int i = 0; i < 170; i++) {
            kidP = new Picture(kidP);
            kidP.swapBackground(wallP, beachP, i);
            frameSequencer.addFrame(kidP);
        }
        frameSequencer.play(framesPerSec);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int framesPerSec = 30;
        Picture pic = null;
        Graphics graph = null;
        String dir = "c:/intro-prog-java/movies/tickerTape/";
        FrameSequencer fs = new FrameSequencer(dir);
        Font font = new Font("Times New Roman", Font.TYPE1_FONT, 30);
        boolean isBackward = true;
        String str = JOptionPane.showInputDialog("Enter your line please: ");

        int x = 0;

        for (int i = 0; i < 200; i++) {
            pic = new Picture(640, 480);
            graph = pic.getGraphics();
            graph.setColor(Color.PINK);
            graph.setFont(font);

            if (isBackward) {
                graph.drawString(str, x++ * 8, 250);
            } else {
                graph.drawString(str, x-- * 8, 250);
            }
            if (x * 8 > pic.getWidth() - str.length() * 15) {
                isBackward = false;
            }
            if (x == 0) {
                isBackward = true;
            }
            fs.addFrame(pic);
        }
        fs.play(framesPerSec);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int framePerSec = 26;
        Picture p = null, p1 = null;
        Graphics g = null, g1 = null;
                String dir = "c:/intro-prog-java/movies/recToBall/";

        FrameSequencer frameSequuencer = new FrameSequencer(dir);
        frameSequuencer.setShown(true);
        for (int i = 0; i < framePerSec; i++) {
            p1 = new Picture(550, 450);
            g1 = p1.getGraphics();
            g1.setColor(Color.ORANGE);
            g1.fillRect(i * 0, (i * 16), 50, 50);
            frameSequuencer.addFrame(p1);
        }
        for (int i = 0; i < 1; i++) {
            p1 = new Picture(550, 450);
            g1 = p1.getGraphics();
            g1.setColor(Color.ORANGE);
            g1.fillOval((i) + 10, 400, 50, 50);
            frameSequuencer.addFrame(p1);
        }
        for (int i = 0; i < 1; i++) {
            p1 = new Picture(550, 450);
            g1 = p1.getGraphics();
            g1.setColor(Color.ORANGE);
            g1.fillOval((i) + 10, 350, 50, 50);
            frameSequuencer.addFrame(p1);
        }
        for (int i = 0; i < 1; i++) {
            p1 = new Picture(550, 450);
            g1 = p1.getGraphics();
            g1.setColor(Color.ORANGE);
            g1.fillOval((i) + 10, 300, 50, 50);
            frameSequuencer.addFrame(p1);
        }
        for (int i = 0; i < 1; i++) {
            p1 = new Picture(550, 450);
            g1 = p1.getGraphics();
            g1.setColor(Color.ORANGE);
            g1.fillOval((i) + 35, 256, 50, 50);
            frameSequuencer.addFrame(p1);
        }

        for (int i = 0; i < 1; i++) {
            p1 = new Picture(550, 450);
            g1 = p1.getGraphics();
            g1.setColor(Color.ORANGE);
            g1.fillOval((i) + 60, 210, 50, 50);
            frameSequuencer.addFrame(p1);
        }

        Picture pp = null;
        Graphics gg = null;
        Graphics d = null;
        int distance = 100;
        int height = 450;
        int start = (height - 50) - distance;
        for (int i = 0; i < framePerSec * 1; i++) {
            pp = new Picture(550, 450);
            gg = pp.getGraphics();
            int y = (int) (Math.sin(30 + (i)) * distance) + start;
            if (y > (height - 50 - 10)) {
                distance = distance / 2;
                start = (height - 55) - distance;
            }
            gg.setColor(Color.ORANGE);
            gg.fillOval((i * 10) +100, y, 50, 50);
            frameSequuencer.addFrame(pp);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void BallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BallActionPerformed
        int framesPerSec = 30;
        Picture pic = null;
        Graphics graph = null;
        String dir = "c:/intro-prog-java/movies/ball/";
        FrameSequencer frameSequencer = new FrameSequencer(dir);
        int distance = 150;
        int Picheight = 480;
        int startPoint = (Picheight - 50) - distance;
        for (int i = 0; i < framesPerSec; i++) {
            pic = new Picture(640, Picheight);
            graph = pic.getGraphics();
            int y = (int) (Math.sin(30 + (i)) * distance) + startPoint;
            if (y > Picheight - 50 - 20) {
                distance = distance / 2;
                startPoint = (Picheight - 50) - distance;
            }
            y = (int) (Math.sin(i) * distance) + startPoint;
            graph.setColor(Color.ORANGE);
            graph.fillOval(i * 20 + 10, y, 50, 50);
            frameSequencer.addFrame(pic);
        }
        frameSequencer.play(framesPerSec);
    }//GEN-LAST:event_BallActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainMenu mainMenu = new MainMenu();
        mainMenu.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MovieMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ball;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rectangleMovie;
    private javax.swing.JButton sunsetMovie;
    // End of variables declaration//GEN-END:variables
}
