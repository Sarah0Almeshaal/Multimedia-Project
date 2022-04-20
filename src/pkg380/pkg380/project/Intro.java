package pkg380.pkg380.project;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import cpit380practice.*;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.event.*;

public class Intro extends javax.swing.JFrame {

    static Picture sourcePic, resultPic;
    static ImageIcon sourceImage, resultImage;
    static JFrame menuFrame;
    static JButton editPic, editSound, editVideo;

    public Intro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startButton.setBackground(new java.awt.Color(204, 255, 204));
        startButton.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 210, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 45)); // NOI18N
        jLabel2.setText("Welcome To Our Page");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 470, 110));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 35)); // NOI18N
        jLabel3.setText("CPIT 380 Project");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 27)); // NOI18N
        jLabel4.setText("Dr. Souad Baowidan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel5.setText("Sara Almeshaal 1907432");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel6.setText("Haneen Taju 1807985");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel7.setText("Bashair Alharthi 1906182");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 830, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel8.setText("Lujain Bahattab 1912413");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 780, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg380/pkg380/Image/OS.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -70, 1540, 980));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        MainMenu mainGui = new MainMenu();
        mainGui.show();
        dispose();
        // editPic();

    }//GEN-LAST:event_startButtonActionPerformed

    public static void editPic() {

        JButton browseButton = new JButton("Browse");
        browseButton.setBounds(10, 10, 100, 40);

        JLabel sourceLabel = new JLabel();
        sourceLabel.setSize(0, 0);
        sourceLabel.setLocation(100, 100);

        JLabel resultLabel = new JLabel();
        resultLabel.setSize(0, 0);
        resultLabel.setLocation(1100, 100);

        JLabel redSliderLabel = new JLabel();
        redSliderLabel.setText("Red Slider");
        redSliderLabel.setSize(80, 20);
        redSliderLabel.setLocation(501, 152);

        JSlider redSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        redSlider.setMinorTickSpacing(50);
        redSlider.setMajorTickSpacing(50);
        redSlider.setPaintTicks(true);
        redSlider.setPaintLabels(true);
        redSlider.setBounds(570, 150, 350, 50);

        JLabel greenSliderLabel = new JLabel();
        greenSliderLabel.setText("Green Slider");
        greenSliderLabel.setSize(80, 20);
        greenSliderLabel.setLocation(490, 202);

        JSlider greenSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        greenSlider.setMinorTickSpacing(50);
        greenSlider.setMajorTickSpacing(50);
        greenSlider.setPaintTicks(true);
        greenSlider.setPaintLabels(true);
        greenSlider.setBounds(570, 200, 350, 50);

        JLabel blueSliderLabel = new JLabel();
        blueSliderLabel.setText("Blue Slider");
        blueSliderLabel.setSize(80, 20);
        blueSliderLabel.setLocation(498, 252);

        JSlider blueSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        blueSlider.setMinorTickSpacing(50);
        blueSlider.setMajorTickSpacing(50);
        blueSlider.setPaintTicks(true);
        blueSlider.setPaintLabels(true);
        blueSlider.setBounds(570, 250, 350, 50);

        JButton grayScaleButton = new JButton("Gray Scale");
        grayScaleButton.setBounds(400, 10, 100, 40);

        JButton medianFilterButton = new JButton("Median Filter");
        medianFilterButton.setBounds(520, 10, 100, 40);

        JButton laplacianFilterButton = new JButton("Laplacian Filter");
        laplacianFilterButton.setBounds(640, 10, 120, 40);

        JButton thresholdingButton = new JButton("Thresholding");
        thresholdingButton.setBounds(760, 10, 120, 40);

        // x = +120
        JButton leftRotate = new JButton("Left Rotate by 90");
        leftRotate.setBounds(880, 10, 120, 40);

        JButton reset = new JButton("Reset");
        reset.setBounds(1000, 10, 120, 40);

        JButton negativeColor = new JButton("Negative Color");
        negativeColor.setBounds(1120, 10, 120, 40);

        JButton verticalMirror = new JButton("Vertical Mirror");
        verticalMirror.setBounds(1240, 10, 120, 40);

        JButton topToBottomMirror = new JButton("Horizontal Mirror Top to Bottom");
        topToBottomMirror.setBounds(1240, 50, 200, 40);

        JButton bottomToTopMirror = new JButton("Horizontal Mirror Bottom to Top ");
        bottomToTopMirror.setBounds(1000, 50, 200, 40);

        JLabel picWidth = new JLabel();
        picWidth.setSize(150, 20);

        JLabel picHeight = new JLabel();
        picHeight.setSize(150, 20);

        editPic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame picFrame = new JFrame();
                picFrame.setSize(1500, 900);
                picFrame.setVisible(true);
                picFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menuFrame.setVisible(false);
                picFrame.setLayout(new FlowLayout());
                picFrame.setLayout(null);

                picFrame.add(browseButton);
                picFrame.add(sourceLabel);
                picFrame.add(resultLabel);
                picFrame.add(redSliderLabel);
                picFrame.add(redSlider);
                picFrame.add(greenSliderLabel);
                picFrame.add(greenSlider);
                picFrame.add(blueSliderLabel);
                picFrame.add(blueSlider);
                picFrame.add(grayScaleButton);
                picFrame.add(medianFilterButton);
                picFrame.add(laplacianFilterButton);
                picFrame.add(thresholdingButton);
                picFrame.add(picWidth);
                picFrame.add(picHeight);
                picFrame.add(leftRotate);
                picFrame.add(reset);
                picFrame.add(negativeColor);
                picFrame.add(verticalMirror);
                picFrame.add(topToBottomMirror);
                picFrame.add(bottomToTopMirror);

            }
        });

        browseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String filepath = FileChooser.pickAFile();
                sourcePic = new Picture(filepath);
                sourceImage = new ImageIcon(sourcePic.getImage());
                sourceLabel.setIcon(sourceImage);
                resultPic = new Picture(filepath);
                resultImage = new ImageIcon(resultPic.getImage());
                sourceLabel.setSize(sourcePic.getWidth(), sourcePic.getHeight());
                picWidth.setText("Picture width is: " + sourcePic.getWidth());
                picWidth.setLocation(sourcePic.getWidth() - 100, sourcePic.getHeight() + 100);
                picHeight.setText("Picture height is: " + sourcePic.getHeight());
                picHeight.setLocation(sourcePic.getWidth() - 100, sourcePic.getHeight() + 120);
            }
        });

        redSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                try {
                    int red;
                    for (int x = 0; x < resultPic.getWidth(); x++) {
                        for (int y = 0; y < resultPic.getHeight(); y++) {
                            red = sourcePic.getPixel(x, y).getRed();
                            if (redSlider.getValue() > 0) {
                                resultPic.getPixel(x, y).setRed(redSlider.getValue() + red);
                            } else {
                                resultPic.getPixel(x, y).setRed(red);
                            }
                        }
                    }
                    resultImage = new ImageIcon(resultPic.getImage());
                    resultLabel.setIcon(resultImage);
                    resultLabel.setSize(sourcePic.getWidth(), sourcePic.getHeight());

                } catch (NullPointerException except) {
                    JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        greenSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                try {
                    int green;
                    for (int x = 0; x < resultPic.getWidth(); x++) {
                        for (int y = 0; y < resultPic.getHeight(); y++) {
                            green = sourcePic.getPixel(x, y).getGreen();

                            if (greenSlider.getValue() > 0) {
                                resultPic.getPixel(x, y).setGreen(green + greenSlider.getValue());
                            } else {
                                resultPic.getPixel(x, y).setGreen(green);
                            }
                            resultImage = new ImageIcon(resultPic.getImage());
                            resultLabel.setIcon(resultImage);
                            resultLabel.setSize(sourcePic.getWidth(), sourcePic.getHeight());
                        }
                    }
                } catch (NullPointerException except) {
                    JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        blueSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                try {
                    int blue;
                    for (int x = 0; x < resultPic.getWidth(); x++) {
                        for (int y = 0; y < resultPic.getHeight(); y++) {
                            blue = sourcePic.getPixel(x, y).getBlue();

                            if (blueSlider.getValue() > 0) {
                                resultPic.getPixel(x, y).setBlue(blue + blueSlider.getValue());
                            } else {
                                resultPic.getPixel(x, y).setBlue(blue);
                            }
                            resultImage = new ImageIcon(resultPic.getImage());
                            resultLabel.setIcon(resultImage);
                            resultLabel.setSize(sourcePic.getWidth(), sourcePic.getHeight());
                        }
                    }

                } catch (NullPointerException except) {
                    JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        grayScaleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int intensity;
                    for (int x = 0; x < sourcePic.getWidth(); x++) {
                        for (int y = 0; y < sourcePic.getHeight(); y++) {
                            intensity = (resultPic.getPixel(x, y).getBlue() + resultPic.getPixel(x, y).getRed() + resultPic.getPixel(x, y).getGreen()) / 3;
                            resultPic.getPixel(x, y).setBlue(intensity);
                            resultPic.getPixel(x, y).setGreen(intensity);
                            resultPic.getPixel(x, y).setRed(intensity);
                        }
                    }
                    resultLabel.setIcon(resultImage);
                    resultLabel.setSize(sourcePic.getWidth(), sourcePic.getHeight());
                } catch (NullPointerException except) {
                    JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        }
        );

        medianFilterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int p[] = new int[9];
                    for (int x = 1; x < sourcePic.getWidth() - 1; x++) {
                        for (int y = 1; y < sourcePic.getHeight() - 1; y++) {
                            p[0] = (int) sourcePic.getPixel(x - 1, y - 1).getAverage();
                            p[1] = (int) sourcePic.getPixel(x, y - 1).getAverage();
                            p[2] = (int) sourcePic.getPixel(x + 1, y - 1).getAverage();
                            p[3] = (int) sourcePic.getPixel(x - 1, y).getAverage();
                            p[4] = (int) sourcePic.getPixel(x, y).getAverage();
                            p[5] = (int) sourcePic.getPixel(x + 1, y).getAverage();
                            p[6] = (int) sourcePic.getPixel(x - 1, y + 1).getAverage();
                            p[7] = (int) sourcePic.getPixel(x, y + 1).getAverage();
                            p[8] = (int) sourcePic.getPixel(x + 1, y + 1).getAverage();

                            Arrays.sort(p);

                            resultPic.getPixel(x, y).setColor(new Color(p[4], p[4], p[4]));
                        }
                    }
                    resultImage = new ImageIcon(resultPic.getImage());
                    resultLabel.setIcon(resultImage);
                    resultLabel.setSize(sourcePic.getWidth(), sourcePic.getHeight());

                } catch (NullPointerException except) {
                    JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        );

        laplacianFilterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int result1;
                    int[] p = new int[9];
                    for (int i = 1; i < sourcePic.getWidth() - 1; i++) {
                        for (int j = 1; j < sourcePic.getHeight() - 1; j++) {

                            // Task 1
                            p[0] = (int) sourcePic.getPixel(i - 1, j - 1).getBlue() * 0;
                            p[1] = (int) sourcePic.getPixel(i, j - 1).getBlue() * 1;
                            p[2] = (int) sourcePic.getPixel(i + 1, j - 1).getBlue() * 0;
                            p[3] = (int) sourcePic.getPixel(i - 1, j).getBlue() * 1;
                            p[4] = (int) sourcePic.getPixel(i, j).getBlue() * (-4);
                            p[5] = (int) sourcePic.getPixel(i + 1, j).getBlue() * 1;
                            p[6] = (int) sourcePic.getPixel(i - 1, j + 1).getBlue() * 0;
                            p[7] = (int) sourcePic.getPixel(i, j + 1).getBlue() * 1;
                            p[8] = (int) sourcePic.getPixel(i + 1, j + 1).getBlue() * 0;

                            result1 = p[0] + p[1] + p[2] + p[3] + p[4] + p[5] + p[6] + p[7];

                            if (result1 < 0) {

                                result1 = 0;
                            } else if (result1 > 255) {

                                result1 = 255;
                            }

                            resultPic.getPixel(i, j).setColor(new Color(result1, result1, result1));
                            resultImage = new ImageIcon(resultPic.getImage());
                            resultLabel.setIcon(resultImage);
                            resultLabel.setSize(sourcePic.getWidth(), sourcePic.getHeight());

                        }
                    }
                } catch (NullPointerException except) {
                    JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        );

        thresholdingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (sourcePic != null) {
                    try {
                        JFrame thresholdingFrame = new JFrame();
                        thresholdingFrame.setSize(300, 300);
                        thresholdingFrame.setVisible(true);
                        thresholdingFrame.setLayout(new FlowLayout());
                        thresholdingFrame.setLayout(null);

                        JLabel enterLabel = new JLabel();
                        enterLabel.setText("Enter thresholding value");
                        enterLabel.setSize(150, 70);
                        enterLabel.setLocation(75, 35);

                        JTextField thresholdingField = new JTextField();
                        thresholdingField.setBounds(65, 100, 150, 40);

                        JButton compute = new JButton("Continue");
                        compute.setBounds(90, 165, 100, 30);

                        thresholdingFrame.add(enterLabel);
                        thresholdingFrame.add(thresholdingField);
                        thresholdingFrame.add(compute);

                        compute.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                String value = thresholdingField.getText();
                                boolean isNumber;
                                try {
                                    Integer.parseInt(value);
                                    thresholdingFrame.dispose();
                                    isNumber = true;
                                } catch (NumberFormatException exception) {
                                    JLabel errorLabel = new JLabel();
                                    errorLabel.setSize(200, 70);
                                    errorLabel.setLocation(70, 200);
                                    thresholdingFrame.add(errorLabel);
                                    errorLabel.setText("Enter integers numbers only!");
                                    errorLabel.setForeground(Color.red);
                                    thresholdingField.setText("");
                                    isNumber = false;
                                }
                                if (isNumber) {
                                    int avg;
                                    for (int x = 1; x < sourcePic.getWidth() - 1; x++) {
                                        for (int y = 1; y < sourcePic.getHeight() - 1; y++) {
                                            avg = (int) sourcePic.getPixel(x, y).getAverage();
                                            if (avg >= Integer.parseInt(value)) {
                                                resultPic.getPixel(x, y).setColor(Color.BLACK);
                                            } else {
                                                resultPic.getPixel(x, y).setColor(Color.WHITE);
                                            }
                                        }
                                    }
                                    resultImage = new ImageIcon(resultPic.getImage());
                                    resultLabel.setIcon(resultImage);
                                    resultLabel.setSize(sourcePic.getWidth(), sourcePic.getHeight());
                                }
                            }
                        }
                        );
                    } catch (NullPointerException except) {
                    }
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        );

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    resultLabel.setIcon(sourceImage);
                    resultLabel.setSize(sourcePic.getWidth(), sourcePic.getHeight());
                    redSlider.setValue(0);
                    greenSlider.setValue(0);
                    blueSlider.setValue(0);
                } catch (NullPointerException except) {
                    JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        );

        negativeColor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int negativeBlue, negativeGreen, negativeRed;
                    for (int x = 0; x < sourcePic.getWidth(); x++) {
                        for (int y = 0; y < sourcePic.getHeight(); y++) {
                            negativeRed = 255 - sourcePic.getPixel(x, y).getRed();
                            resultPic.getPixel(x, y).setRed(negativeRed);
                            negativeGreen = 255 - sourcePic.getPixel(x, y).getGreen();
                            resultPic.getPixel(x, y).setGreen(negativeGreen);
                            negativeBlue = 255 - sourcePic.getPixel(x, y).getBlue();
                            resultPic.getPixel(x, y).setBlue(negativeBlue);
                        }
                    }
                    resultLabel.setIcon(resultImage);
                    resultLabel.setSize(sourcePic.getWidth(), sourcePic.getHeight());
                } catch (NullPointerException except) {
                    JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        );

        leftRotate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Pixel sourcePixel = null;
                Pixel targetPixel = null;
                for (int sourceX = 0; sourceX < sourcePic.getWidth(); sourceX++) {
                    for (int sourceY = 0; sourceY < sourcePic.getHeight(); sourceY++) {
                        sourcePixel = sourcePic.getPixel(sourceX, sourceY);
                        targetPixel = sourcePic.getPixel(sourceY, sourcePic.getWidth() - 1
                                - sourceX);
                        targetPixel.setColor(sourcePixel.getColor());
                    }
                }
                ImageIcon target = new ImageIcon(resultPic.getImage());
                resultLabel.setIcon(target);
                resultLabel.setSize(sourcePic.getWidth(), sourcePic.getHeight());
            }
        }
        );

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
            java.util.logging.Logger.getLogger(Intro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
