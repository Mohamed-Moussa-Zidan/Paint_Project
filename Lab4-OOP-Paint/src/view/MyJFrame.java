/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JFrame;
import observer.paintListener;

/**
 *
 * @author Raffy
 */
public class MyJFrame extends JFrame {

    /**
     * Creates new form MyJFrame
     */
    String method = null;

    public MyJFrame() {

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        rectButt = new javax.swing.JToggleButton();
        lineButt = new javax.swing.JToggleButton();
        squareButt = new javax.swing.JToggleButton();
        ellipseButt = new javax.swing.JToggleButton();
        circleButt = new javax.swing.JToggleButton();
        triButt = new javax.swing.JToggleButton();
        redButt = new javax.swing.JToggleButton();
        blueButt = new javax.swing.JToggleButton();
        yellowButt = new javax.swing.JToggleButton();
        blackButt = new javax.swing.JToggleButton();
        greenButt = new javax.swing.JToggleButton();
        fillButt = new javax.swing.JToggleButton();
        drawButt = new javax.swing.JToggleButton();
        moveButt = new javax.swing.JToggleButton();
        deleteButt = new javax.swing.JToggleButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rectButt.setText("Rectangle");
        rectButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectButtActionPerformed(evt);
            }
        });

        lineButt.setText("Line");
        lineButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineButtActionPerformed(evt);
            }
        });

        squareButt.setText("Square");
        squareButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtActionPerformed(evt);
            }
        });

        ellipseButt.setText("Ellipse");
        ellipseButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ellipseButtActionPerformed(evt);
            }
        });

        circleButt.setText("Circle");
        circleButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleButtActionPerformed(evt);
            }
        });

        triButt.setText("Triangle");
        triButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triButtActionPerformed(evt);
            }
        });

        redButt.setText("red");
        redButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redButtActionPerformed(evt);
            }
        });

        blueButt.setText("blue");
        blueButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueButtActionPerformed(evt);
            }
        });

        yellowButt.setText("yellow");
        yellowButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowButtActionPerformed(evt);
            }
        });

        blackButt.setText("black");
        blackButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackButtActionPerformed(evt);
            }
        });

        greenButt.setText("green");
        greenButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenButtActionPerformed(evt);
            }
        });

        fillButt.setText("fill");
        fillButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillButtActionPerformed(evt);
            }
        });

        drawButt.setText("draw");
        drawButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtActionPerformed(evt);
            }
        });

        moveButt.setText("move");
        moveButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtActionPerformed(evt);
            }
        });

        deleteButt.setText("delete");
        deleteButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(744, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(drawButt, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(blackButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yellowButt, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(blueButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redButt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(greenButt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(moveButt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rectButt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(squareButt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ellipseButt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(circleButt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lineButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(triButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(deleteButt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fillButt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(rectButt))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(redButt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lineButt)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(blueButt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(squareButt)
                    .addComponent(yellowButt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ellipseButt)
                    .addComponent(blackButt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(circleButt)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(greenButt)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(triButt)
                    .addComponent(drawButt))
                .addGap(18, 18, 18)
                .addComponent(moveButt)
                .addGap(18, 18, 18)
                .addComponent(fillButt)
                .addGap(18, 18, 18)
                .addComponent(deleteButt)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void setShapesFalse() {
        circleButt.setSelected(false);
        rectButt.setSelected(false);
        squareButt.setSelected(false);
        ellipseButt.setSelected(false);
        triButt.setSelected(false);
        lineButt.setSelected(false);
    }

    public void setMethodFalse() {
        drawButt.setSelected(false);
        moveButt.setSelected(false);
        fillButt.setSelected(false);
        deleteButt.setSelected(false);
    }

    private void rectButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectButtActionPerformed
        setShapesFalse();
        rectButt.setSelected(true);

        paintListener.setType("Rectangle");        // TODO add your handling code here:
    }//GEN-LAST:event_rectButtActionPerformed

    private void lineButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineButtActionPerformed
        setShapesFalse();
        lineButt.setSelected(true);

        paintListener.setType("Line");
        // TODO add your handling code here:
    }//GEN-LAST:event_lineButtActionPerformed

    private void squareButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtActionPerformed
        setShapesFalse();
        squareButt.setSelected(true);

        paintListener.setType("Square");        // TODO add your handling code here:
    }//GEN-LAST:event_squareButtActionPerformed

    private void ellipseButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ellipseButtActionPerformed
        setShapesFalse();
        ellipseButt.setSelected(true);
        paintListener.setType("Ellipse");     // TODO add your handling code here:
    }//GEN-LAST:event_ellipseButtActionPerformed

    private void circleButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleButtActionPerformed
        setShapesFalse();
        circleButt.setSelected(true);
        paintListener.setType("Circle");   // TODO add your handling code here:
    }//GEN-LAST:event_circleButtActionPerformed

    private void triButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triButtActionPerformed
        setShapesFalse();
        triButt.setSelected(true);
        paintListener.setType("Triangle");  // TODO add your handling code here:
    }//GEN-LAST:event_triButtActionPerformed

    private void redButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redButtActionPerformed

        blueButt.setSelected(false);
        yellowButt.setSelected(false);
        blackButt.setSelected(false);
        greenButt.setSelected(false);
        if (method.equals("Fill")) {
            paintListener.setFillColor(Color.red);
        } else if (method.equals("Draw")) {
            paintListener.setColor(Color.red);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_redButtActionPerformed

    private void blueButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueButtActionPerformed
        redButt.setSelected(false);
        yellowButt.setSelected(false);
        blackButt.setSelected(false);
        greenButt.setSelected(false);
        if (method.equals("Fill")) {
            paintListener.setFillColor(Color.blue);
        } else if (method.equals("Draw")) {
            paintListener.setColor(Color.blue);
        } // TODO add your handling code here:
    }//GEN-LAST:event_blueButtActionPerformed

    private void yellowButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowButtActionPerformed
        redButt.setSelected(false);
        blueButt.setSelected(false);
        blackButt.setSelected(false);
        greenButt.setSelected(false);

        if (method.equals("Fill")) {
            paintListener.setFillColor(Color.yellow);
        } else if (method.equals("Draw")) {
            paintListener.setColor(Color.yellow);
        }       // TODO add your handling code here:
    }//GEN-LAST:event_yellowButtActionPerformed

    private void blackButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackButtActionPerformed
        redButt.setSelected(false);
        blueButt.setSelected(false);
        yellowButt.setSelected(false);
        greenButt.setSelected(false);
        if (method.equals("Fill")) {
            paintListener.setFillColor(Color.black);
        } else if (method.equals("Draw")) {
            paintListener.setColor(Color.black);
        }     // TODO add your handling code here:
    }//GEN-LAST:event_blackButtActionPerformed

    private void greenButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenButtActionPerformed

        redButt.setSelected(false);
        blueButt.setSelected(false);
        yellowButt.setSelected(false);
        blackButt.setSelected(false);
        if (method.equals("Fill")) {
            paintListener.setFillColor(Color.green);
        } else if (method.equals("Draw")) {
            paintListener.setColor(Color.green);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_greenButtActionPerformed

    private void fillButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillButtActionPerformed
        setMethodFalse();
        fillButt.setSelected(true);
        method = "Fill";
        paintListener.setMethod(method);
        // TODO add your handling code here:
    }//GEN-LAST:event_fillButtActionPerformed


    private void drawButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtActionPerformed
        setMethodFalse();
        drawButt.setSelected(true);
        method = "Draw";
        paintListener.setMethod(method);

// TODO add your handling code here:
    }//GEN-LAST:event_drawButtActionPerformed

    private void moveButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtActionPerformed
        setMethodFalse();
        moveButt.setSelected(true);
        method = "Move";
        paintListener.setMethod(method);
// TODO add your handling code here:
    }//GEN-LAST:event_moveButtActionPerformed

    private void deleteButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtActionPerformed
     setMethodFalse();
        deleteButt.setSelected(true);
        method = "Delete";
        paintListener.setMethod(method);   // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton blackButt;
    private javax.swing.JToggleButton blueButt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton circleButt;
    private javax.swing.JToggleButton deleteButt;
    private javax.swing.JToggleButton drawButt;
    private javax.swing.JToggleButton ellipseButt;
    private javax.swing.JToggleButton fillButt;
    private javax.swing.JToggleButton greenButt;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton lineButt;
    private javax.swing.JToggleButton moveButt;
    private javax.swing.JToggleButton rectButt;
    private javax.swing.JToggleButton redButt;
    private javax.swing.JToggleButton squareButt;
    private javax.swing.JToggleButton triButt;
    private javax.swing.JToggleButton yellowButt;
    // End of variables declaration//GEN-END:variables
}
