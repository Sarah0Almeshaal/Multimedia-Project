package pkg380.pkg380.project;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import cpit380practice.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PictureMenu extends javax.swing.JFrame {

    static String filepath, filepath1, path;
    static Picture sourcePic, resultPic, targetPic;
    static ImageIcon sourceImage, resultImage;
    static Pixel sourcePixel, targetPixel;

    public PictureMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        browse = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        medianFilter = new javax.swing.JButton();
        laplacianFilter = new javax.swing.JButton();
        Thresholding = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        negativeColor = new javax.swing.JButton();
        picHeight = new javax.swing.JLabel();
        picWidth = new javax.swing.JLabel();
        greenSlider = new javax.swing.JSlider();
        redSlider = new javax.swing.JSlider();
        blueSlider = new javax.swing.JSlider();
        diagonalReflection = new javax.swing.JButton();
        edgeDetection = new javax.swing.JButton();
        scaleUp = new javax.swing.JButton();
        scaleDown = new javax.swing.JButton();
        redEyeReduction = new javax.swing.JButton();
        leftRotateSlider = new javax.swing.JSlider();
        crop = new javax.swing.JButton();
        rightRotateSlider = new javax.swing.JSlider();
        sourceLabel = new javax.swing.JLabel();
        sourceColorLabel = new javax.swing.JLabel();
        resultColorLabel = new javax.swing.JLabel();
        Collage = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        chromakey = new javax.swing.JButton();
        grayScale = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        browse.setBackground(new java.awt.Color(255, 204, 204));
        browse.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        getContentPane().add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 190, 60));

        resultLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultLabelMouseClicked(evt);
            }
        });
        getContentPane().add(resultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 150, 570, 480));

        medianFilter.setBackground(new java.awt.Color(222, 250, 222));
        medianFilter.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        medianFilter.setText("Median Filter");
        medianFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medianFilterActionPerformed(evt);
            }
        });
        getContentPane().add(medianFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 930, 280, 50));

        laplacianFilter.setBackground(new java.awt.Color(222, 250, 222));
        laplacianFilter.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        laplacianFilter.setText("Laplacian Filter");
        laplacianFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laplacianFilterActionPerformed(evt);
            }
        });
        getContentPane().add(laplacianFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 740, 230, 50));

        Thresholding.setBackground(new java.awt.Color(222, 250, 222));
        Thresholding.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        Thresholding.setText("Thresholding");
        Thresholding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThresholdingActionPerformed(evt);
            }
        });
        getContentPane().add(Thresholding, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 930, 230, 50));

        Reset.setBackground(new java.awt.Color(255, 204, 204));
        Reset.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 40, 170, 60));

        negativeColor.setBackground(new java.awt.Color(222, 250, 222));
        negativeColor.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        negativeColor.setText("Negative Color");
        negativeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativeColorActionPerformed(evt);
            }
        });
        getContentPane().add(negativeColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 740, 240, 50));

        picHeight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(picHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 370, 20));

        picWidth.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(picWidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 670, 370, 20));

        greenSlider.setMajorTickSpacing(50);
        greenSlider.setMaximum(255);
        greenSlider.setMinorTickSpacing(50);
        greenSlider.setPaintTicks(true);
        greenSlider.setValue(0);
        greenSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                greenSliderStateChanged(evt);
            }
        });
        getContentPane().add(greenSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 331, -1));

        redSlider.setMajorTickSpacing(50);
        redSlider.setMaximum(255);
        redSlider.setMinorTickSpacing(50);
        redSlider.setPaintTicks(true);
        redSlider.setValue(0);
        redSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redSliderStateChanged(evt);
            }
        });
        getContentPane().add(redSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 331, -1));

        blueSlider.setMajorTickSpacing(50);
        blueSlider.setMaximum(255);
        blueSlider.setMinorTickSpacing(50);
        blueSlider.setPaintTicks(true);
        blueSlider.setValue(0);
        blueSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blueSliderStateChanged(evt);
            }
        });
        getContentPane().add(blueSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, 331, -1));

        diagonalReflection.setBackground(new java.awt.Color(222, 250, 222));
        diagonalReflection.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        diagonalReflection.setText("Diagonal Reflection ");
        diagonalReflection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagonalReflectionActionPerformed(evt);
            }
        });
        getContentPane().add(diagonalReflection, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 830, 280, 60));

        edgeDetection.setBackground(new java.awt.Color(222, 250, 222));
        edgeDetection.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        edgeDetection.setText("Edge Detection");
        edgeDetection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edgeDetectionActionPerformed(evt);
            }
        });
        getContentPane().add(edgeDetection, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 830, 230, 60));

        scaleUp.setBackground(new java.awt.Color(222, 250, 222));
        scaleUp.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        scaleUp.setText("Scale Up");
        scaleUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scaleUpActionPerformed(evt);
            }
        });
        getContentPane().add(scaleUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 830, 240, 60));

        scaleDown.setBackground(new java.awt.Color(222, 250, 222));
        scaleDown.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        scaleDown.setText("Scale Down");
        scaleDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scaleDownActionPerformed(evt);
            }
        });
        getContentPane().add(scaleDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 930, 240, 50));

        redEyeReduction.setBackground(new java.awt.Color(222, 250, 222));
        redEyeReduction.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        redEyeReduction.setText("Red Eye Reduction");
        redEyeReduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redEyeReductionActionPerformed(evt);
            }
        });
        getContentPane().add(redEyeReduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 740, 270, 50));

        leftRotateSlider.setMajorTickSpacing(90);
        leftRotateSlider.setMaximum(360);
        leftRotateSlider.setPaintLabels(true);
        leftRotateSlider.setPaintTicks(true);
        leftRotateSlider.setSnapToTicks(true);
        leftRotateSlider.setValue(0);
        leftRotateSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                leftRotateSliderStateChanged(evt);
            }
        });
        getContentPane().add(leftRotateSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, 331, -1));

        crop.setBackground(new java.awt.Color(222, 250, 222));
        crop.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        crop.setText("Copy and Crop");
        crop.setEnabled(false);
        crop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cropActionPerformed(evt);
            }
        });
        getContentPane().add(crop, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 830, 260, 60));

        rightRotateSlider.setMajorTickSpacing(90);
        rightRotateSlider.setMaximum(360);
        rightRotateSlider.setPaintLabels(true);
        rightRotateSlider.setPaintTicks(true);
        rightRotateSlider.setSnapToTicks(true);
        rightRotateSlider.setValue(0);
        rightRotateSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rightRotateSliderStateChanged(evt);
            }
        });
        getContentPane().add(rightRotateSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, 331, -1));

        sourceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sourceLabelMouseClicked(evt);
            }
        });
        getContentPane().add(sourceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 600, 470));

        sourceColorLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(sourceColorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 370, 20));

        resultColorLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(resultColorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 640, 380, 20));

        Collage.setBackground(new java.awt.Color(222, 250, 222));
        Collage.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        Collage.setText("Collage");
        Collage.setEnabled(false);
        Collage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CollageActionPerformed(evt);
            }
        });
        getContentPane().add(Collage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 740, 260, 50));

        jButton1.setBackground(new java.awt.Color(222, 250, 222));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jButton1.setText("Blending");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 830, 260, 60));

        chromakey.setBackground(new java.awt.Color(222, 250, 222));
        chromakey.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        chromakey.setText("Chromakey");
        chromakey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chromakeyActionPerformed(evt);
            }
        });
        getContentPane().add(chromakey, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 930, 260, 50));

        grayScale.setBackground(new java.awt.Color(222, 250, 222));
        grayScale.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        grayScale.setText("Gray Scale");
        grayScale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grayScaleActionPerformed(evt);
            }
        });
        getContentPane().add(grayScale, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, 280, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        jLabel1.setText("Red Slider :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 140, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        jLabel3.setText("Green Slider :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        jLabel4.setText("Blue Slider :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        jLabel5.setText("Left Rotate Slider :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 230, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 29)); // NOI18N
        jLabel6.setText("Right Rotate Slider :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 610, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 55)); // NOI18N
        jLabel7.setText("Welcome To Editing Pictures Page");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        jLabel8.setText("Choose :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 690, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jButton2.setText("Main Menu");
        jButton2.setPreferredSize(new java.awt.Dimension(177, 45));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 690, 230, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg380/pkg380/Image/FinalWalljpg.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -20, 1970, 1120));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        filepath = FileChooser.pickAFile();
        sourcePic = new Picture(filepath);
        sourceImage = new ImageIcon(sourcePic.getImage());
        resultPic = new Picture(filepath);
        resultImage = new ImageIcon(resultPic.getImage());
        picWidth.setText("Picture width is: " + sourcePic.getWidth());
        picHeight.setText("Picture height is: " + sourcePic.getHeight());
        Image img = (sourcePic.getImage()).getScaledInstance(sourceLabel.getWidth(), sourceLabel.getHeight(), Image.SCALE_SMOOTH);;
        sourceLabel.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_browseActionPerformed

    public void image(Picture pic) {
        Image img = (pic.getImage()).getScaledInstance(resultLabel.getWidth(), resultLabel.getHeight(), Image.SCALE_SMOOTH);
        resultLabel.setIcon(new ImageIcon(img));
    }

    private void grayScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grayScaleActionPerformed
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
            image(resultPic);
        } catch (NullPointerException except) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_grayScaleActionPerformed

    private void medianFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medianFilterActionPerformed
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
            image(resultPic);
        } catch (NullPointerException except) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_medianFilterActionPerformed

    private void laplacianFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laplacianFilterActionPerformed
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
                }
            }
            image(resultPic);
        } catch (NullPointerException except) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_laplacianFilterActionPerformed

    private void ThresholdingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThresholdingActionPerformed
        if (sourcePic == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int value = Integer.parseInt(JOptionPane.showInputDialog("Enter the thresholding value"));

            int avg;
            for (int x = 1; x < sourcePic.getWidth() - 1; x++) {
                for (int y = 1; y < sourcePic.getHeight() - 1; y++) {
                    avg = (int) sourcePic.getPixel(x, y).getAverage();
                    if (avg >= value) {
                        resultPic.getPixel(x, y).setColor(Color.BLACK);
                    } else {
                        resultPic.getPixel(x, y).setColor(Color.WHITE);
                    }
                }
            }
            image(resultPic);
        }
    }//GEN-LAST:event_ThresholdingActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        try {
            Picture newPic = new Picture(sourcePic);
            //ImageIcon newImage = new ImageIcon(newPic.getImage());
            image(newPic);
            redSlider.setValue(0);
            greenSlider.setValue(0);
            blueSlider.setValue(0);
            leftRotateSlider.setValue(0);
            rightRotateSlider.setValue(0);
        } catch (NullPointerException except) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ResetActionPerformed

    private void negativeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativeColorActionPerformed
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
            image(resultPic);
        } catch (NullPointerException except) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_negativeColorActionPerformed

    private void greenSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_greenSliderStateChanged
        if (sourcePic == null) {
            greenSlider.setValue(0);
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        int green;
        for (int x = 0; x < resultPic.getWidth(); x++) {
            for (int y = 0; y < resultPic.getHeight(); y++) {
                green = sourcePic.getPixel(x, y).getGreen();

                if (greenSlider.getValue() > 0) {
                    resultPic.getPixel(x, y).setGreen(green + greenSlider.getValue());
                } else if (redSlider.getValue() < 0) {
                    resultPic.getPixel(x, y).setGreen(greenSlider.getValue() - green);

                } else {
                    resultPic.getPixel(x, y).setGreen(green);
                }
            }
        }
        image(resultPic);
    }//GEN-LAST:event_greenSliderStateChanged

    private void redSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redSliderStateChanged
        if (sourcePic == null) {
            redSlider.setValue(0);
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        int red;
        for (int x = 0; x < resultPic.getWidth(); x++) {
            for (int y = 0; y < resultPic.getHeight(); y++) {
                red = sourcePic.getPixel(x, y).getRed();
                if (redSlider.getValue() > 0) {
                    resultPic.getPixel(x, y).setRed(redSlider.getValue() + red);
                } else if (redSlider.getValue() < 0) {
                    resultPic.getPixel(x, y).setRed(redSlider.getValue() - red);

                } else {
                    resultPic.getPixel(x, y).setRed(red);
                }
            }
        }
        image(resultPic);
    }//GEN-LAST:event_redSliderStateChanged

    private void blueSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blueSliderStateChanged
        if (sourcePic == null) {
            blueSlider.setValue(0);
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        int blue;
        for (int x = 0; x < resultPic.getWidth(); x++) {
            for (int y = 0; y < resultPic.getHeight(); y++) {
                blue = sourcePic.getPixel(x, y).getBlue();
                if (blueSlider.getValue() > 0) {
                    resultPic.getPixel(x, y).setBlue(blueSlider.getValue() + blue);
                } else if (blueSlider.getValue() < 0) {
                    resultPic.getPixel(x, y).setBlue(blueSlider.getValue() - blue);

                } else {
                    resultPic.getPixel(x, y).setBlue(blue);
                }
            }
        }
        image(resultPic);
    }//GEN-LAST:event_blueSliderStateChanged

    private void diagonalReflectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagonalReflectionActionPerformed
        try {
            Pixel leftPixel = null;
            Pixel rightPixel = null;
            for (int y = 1; y < sourcePic.getHeight(); y++) {
                for (int x = 0; x < y; x++) {
                    leftPixel = resultPic.getPixel(x, y);
                    rightPixel = resultPic.getPixel(y, x);
                    rightPixel.setColor(leftPixel.getColor());
                }
            }
            image(resultPic);
        } catch (NullPointerException except) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_diagonalReflectionActionPerformed

    private void edgeDetectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edgeDetectionActionPerformed
        if (sourcePic == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            double amount = Integer.parseInt(JOptionPane.showInputDialog("value"));
            Pixel topPixel = null;
            Pixel bottomPixel = null;
            double topAverage = 0.0;
            double bottomAverage = 0.0;
            int endY = resultPic.getHeight() - 1;
            for (int y = 0; y < endY; y++) {
                for (int x = 0; x < sourcePic.getWidth(); x++) {
                    topPixel = resultPic.getPixel(x, y);
                    bottomPixel = resultPic.getPixel(x, y + 1);
                    topAverage = topPixel.getAverage();
                    bottomAverage = bottomPixel.getAverage();
                    if (Math.abs(topAverage - bottomAverage) < amount) {
                        topPixel.setColor(Color.WHITE);
                    } else {
                        topPixel.setColor(Color.BLACK);
                    }
                }
                image(resultPic);
        }
    }
    }//GEN-LAST:event_edgeDetectionActionPerformed

    private void scaleUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scaleUpActionPerformed
        if (sourcePic == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        int value = Integer.parseInt(JOptionPane.showInputDialog("Enter the scale up value"));
        int width = sourcePic.getWidth();
        int height = sourcePic.getHeight();
        Picture targetPic = new Picture(width * value, height * value);
        Pixel sourcepixel = null;
        Pixel targetpixel = null;
        int x = 0;
        int y = 0;

        for (int sourceX = 0; sourceX < width; sourceX++) {
            for (int sourceY = 0; sourceY < height; sourceY++) {
                sourcepixel = sourcePic.getPixel(sourceX, sourceY);
                for (int YY = 0; YY < value; YY++) {
                    for (int XX = 0; XX < value; XX++) {
                        x = sourceX * value + XX;
                        y = sourceY * value + YY;
                        targetpixel = targetPic.getPixel(x, y);
                        targetpixel.setColor(sourcepixel.getColor());
                    }
                }
            }
        }
        resultImage = new ImageIcon(targetPic.getImage());
        resultLabel.setIcon(resultImage);
    }//GEN-LAST:event_scaleUpActionPerformed


    private void scaleDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scaleDownActionPerformed
        if (sourcePic == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        int value = Integer.parseInt(JOptionPane.showInputDialog("Enter the scale down value"));
    
        int width = sourcePic.getWidth();
        int height = sourcePic.getHeight();

        targetPic = new Picture(sourcePic.getWidth() / value + 1, sourcePic.getHeight() / value + 1);
        Pixel sourcepixel = null;
        Pixel targetpixel = null;
        int x = 0;
        int y = 0;

        for (int sourceX = 0, targetX = 0; sourceX < sourcePic.getWidth(); sourceX += value, targetX++) {
            for (int sourceY = 0, targetY = 0; sourceY < sourcePic.getHeight(); sourceY += value, targetY++) {
                sourcePixel = sourcePic.getPixel(sourceX, sourceY);
                targetPixel = targetPic.getPixel(targetX, targetY);
                targetPixel.setColor(sourcePixel.getColor());
            }
        }
        resultImage = new ImageIcon(targetPic.getImage());
        resultLabel.setIcon(resultImage);

    }//GEN-LAST:event_scaleDownActionPerformed
    static boolean r = true;
    private void redEyeReductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redEyeReductionActionPerformed
        if (sourcePic != null) {
            try {
                sourceLabel.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        int x1 = e.getX();
                        int y1 = e.getY();
                        int x2 = e.getX();
                        int y2 = e.getY();
                        sourcePic.removeRedEye(109, 91, 202, 107, java.awt.Color.black);
                        image(sourcePic);
                    }
                }
                );
            } catch (NullPointerException except) {
            }
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_redEyeReductionActionPerformed

    public static void qred(int x1, int y1, int x2, int y2) {

    }

    private void leftRotateSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_leftRotateSliderStateChanged
        if (sourcePic == null) {
            leftRotateSlider.setValue(0);
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (leftRotateSlider.getValue() == 0) {
            image(resultPic);
        } else if (leftRotateSlider.getValue() == 90) {
            Image img = (resultPic.rotateLeft().getImage()).getScaledInstance(resultLabel.getWidth(), resultLabel.getHeight(), Image.SCALE_SMOOTH);
            resultLabel.setIcon(new ImageIcon(img));
        } else if (leftRotateSlider.getValue() == 180) {
            targetPic = new Picture(sourcePic);
            Pixel startPixel = null;
            Pixel endPixel = null;
            for (int y = 0; y < sourcePic.getHeight(); y++) {
                for (int x = 0; x < sourcePic.getWidth(); x++) {
                    startPixel = targetPic.getPixel(x, y);
                    endPixel = sourcePic.getPixel(sourcePic.getWidth() - 1 - x, sourcePic.getHeight() - 1 - y);
                    endPixel.setColor(startPixel.getColor());
                }
            }
            Image img = (targetPic.getImage()).getScaledInstance(resultLabel.getWidth(), resultLabel.getHeight(), Image.SCALE_SMOOTH);
            resultLabel.setIcon(new ImageIcon(img));
        } else if (leftRotateSlider.getValue() == 270) {
            Image img = (resultPic.rotate(270).getImage()).getScaledInstance(resultLabel.getWidth(), resultLabel.getHeight(), Image.SCALE_SMOOTH);
            resultLabel.setIcon(new ImageIcon(img));
        } else if (leftRotateSlider.getValue() == 360) {
            Image img = (resultPic.rotate(360).getImage()).getScaledInstance(resultLabel.getWidth(), resultLabel.getHeight(), Image.SCALE_SMOOTH);
            resultLabel.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_leftRotateSliderStateChanged

    private void cropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cropActionPerformed
        if (sourcePic == null) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            sourceLabel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    int x1 = e.getX();
                    int y1 = e.getY();
                    int x2 = e.getX();
                    int y2 = e.getY();
                    Picture rPic = new Picture(sourcePic.getWidth(), sourcePic.getHeight());
                    for (int x = x1; x < x2; x++) {
                        for (int y = y1; y < y2; y++) {
                            Color sourceColor = sourcePic.getPixel(x, y).getColor();
                            rPic.getPixel(x, y).setColor(sourceColor);
                        }
                    }
                    image(rPic);
                }
            });
        }
    }//GEN-LAST:event_cropActionPerformed

    private void rightRotateSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rightRotateSliderStateChanged
        if (sourcePic == null) {
            rightRotateSlider.setValue(0);
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (rightRotateSlider.getValue() == 0) {
            image(resultPic);
        } else if (rightRotateSlider.getValue() == 90) {
            Image img = (resultPic.rotateRight().getImage()).getScaledInstance(resultLabel.getWidth(), resultLabel.getHeight(), Image.SCALE_SMOOTH);
            resultLabel.setIcon(new ImageIcon(img));
        } else if (rightRotateSlider.getValue() == 180) {
            targetPic = new Picture(sourcePic);
            Pixel startPixel = null;
            Pixel endPixel = null;
            for (int y = 0; y < sourcePic.getHeight(); y++) {
                for (int x = 0; x < sourcePic.getWidth(); x++) {
                    startPixel = targetPic.getPixel(x, y);
                    endPixel = sourcePic.getPixel(sourcePic.getWidth() - 1 - x, sourcePic.getHeight() - 1 - y);
                    endPixel.setColor(startPixel.getColor());
                }
            }
            image(targetPic);
        } else if (rightRotateSlider.getValue() == 270) {
            Image img = (resultPic.rotateRight().rotate(270).getImage()).getScaledInstance(resultLabel.getWidth(), resultLabel.getHeight(), Image.SCALE_SMOOTH);
            resultLabel.setIcon(new ImageIcon(img));
        } else if (rightRotateSlider.getValue() == 360) {
            Image img = (resultPic.rotateRight().rotate(360).getImage()).getScaledInstance(resultLabel.getWidth(), resultLabel.getHeight(), Image.SCALE_SMOOTH);
            resultLabel.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_rightRotateSliderStateChanged

    private void resultLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultLabelMouseClicked
        if (resultLabel != null) {
            Pixel result = resultPic.getPixel(evt.getX(), evt.getY());
            resultColorLabel.setText("Pixel x = " + evt.getX() + " ,Pixel y = " + evt.getY() + " ,Red = " + result.getRed()
                    + " ,Green = " + result.getGreen() + " ,Blue = " + result.getBlue());
        }
    }//GEN-LAST:event_resultLabelMouseClicked

    private void CollageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CollageActionPerformed
        try {
            sourcePic.createCollage(sourcePic);
            sourcePic.drawDashedX(Color.BLACK, 30);
            image(sourcePic);
        } catch (NullPointerException except) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_CollageActionPerformed

    private void sourceLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sourceLabelMouseClicked
        if (sourceLabel != null) {
            Pixel source = sourcePic.getPixel(evt.getX(), evt.getY());
            sourceColorLabel.setText("Pixel x = " + evt.getX() + " ,Pixel y = " + evt.getY() + " ,Red = " + source.getRed()
                    + " ,Green = " + source.getGreen() + " ,Blue = " + source.getBlue());
        }
    }//GEN-LAST:event_sourceLabelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       if (sourcePic != null) {
            try {
                filepath = FileChooser.pickAFile();
                JFrame blendFrame = new JFrame();
                blendFrame.setSize(300, 300);
                blendFrame.setLocationRelativeTo(null);
                blendFrame.setVisible(true);
                blendFrame.setLayout(new FlowLayout());
                blendFrame.setLayout(null);

                JLabel enterLabel = new JLabel();
                enterLabel.setText("Enter blending value");
                enterLabel.setSize(150, 70);
                enterLabel.setLocation(75, 35);

                JTextField thresholdingField = new JTextField();
                thresholdingField.setBounds(65, 100, 150, 40);

                JButton compute = new JButton("Continue");
                compute.setBounds(90, 165, 100, 30);

                blendFrame.add(enterLabel);
                blendFrame.add(thresholdingField);
                blendFrame.add(compute);

                compute.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String value = thresholdingField.getText();
                        boolean isNumber = false;
                        boolean isFloat = Float.parseFloat(value) >= 0 && Float.parseFloat(value) <= 1;

                        if (isFloat) {
                            Float.parseFloat(value);
                            blendFrame.dispose();
                            isNumber = true;
                        } else {
                            JLabel errorLabel = new JLabel();
                            errorLabel.setSize(200, 70);
                            errorLabel.setLocation(70, 200);
                            blendFrame.add(errorLabel);
                            errorLabel.setText("Enter a value between 0 and 1 only!");
                            errorLabel.setForeground(Color.red);
                            thresholdingField.setText("");
                            isNumber = false;

                        }
                        if (isNumber) {
                            Picture r = new Picture(filepath);
                            image(r.blendPictures(sourcePic, Float.parseFloat(value)));
                        }

                    }
                }
                );
            } catch (NullPointerException except) {
            }
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE A PICTURE FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chromakeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chromakeyActionPerformed
        JOptionPane.showMessageDialog(new JFrame(), "Choose the new background picture", "information", JOptionPane.INFORMATION_MESSAGE);
        filepath = FileChooser.pickAFile();
        JOptionPane.showMessageDialog(new JFrame(), "Choose the subtracted picture", "information", JOptionPane.INFORMATION_MESSAGE);
        path = FileChooser.pickAFile();
        try {
            sourceLabel.setVisible(false);
            Picture newBg = new Picture(filepath);
            resultImage = new ImageIcon(newBg.getImage());
            Picture mark = new Picture(path);
            mark.chromakey(newBg);
            image(mark);
        } catch (NullPointerException except) {
            JOptionPane.showMessageDialog(new JFrame(), "CHOOSE PICTURES FIRST!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_chromakeyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         MainMenu mainMenu = new MainMenu();
        mainMenu.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PictureMenu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Collage;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Thresholding;
    private javax.swing.JSlider blueSlider;
    private javax.swing.JButton browse;
    private javax.swing.JButton chromakey;
    private javax.swing.JButton crop;
    private javax.swing.JButton diagonalReflection;
    private javax.swing.JButton edgeDetection;
    private javax.swing.JButton grayScale;
    private javax.swing.JSlider greenSlider;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton laplacianFilter;
    private javax.swing.JSlider leftRotateSlider;
    private javax.swing.JButton medianFilter;
    private javax.swing.JButton negativeColor;
    private javax.swing.JLabel picHeight;
    private javax.swing.JLabel picWidth;
    private javax.swing.JButton redEyeReduction;
    private javax.swing.JSlider redSlider;
    private javax.swing.JLabel resultColorLabel;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JSlider rightRotateSlider;
    private javax.swing.JButton scaleDown;
    private javax.swing.JButton scaleUp;
    private javax.swing.JLabel sourceColorLabel;
    private javax.swing.JLabel sourceLabel;
    // End of variables declaration//GEN-END:variables
}
