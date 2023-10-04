/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author svalv
 */
public class frmCalculadora extends javax.swing.JFrame {

    private boolean decimal = false;
    private boolean nuevaOperacion = true;
    private double memoria = 0;
    private double resultado = 0;
    private String operacion = "";

    public frmCalculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private void calcular() {
        double numeroActual = Double.parseDouble(pantalla.getText());
        switch (operacion) {
            case "+":
                resultado += numeroActual;
                break;
            case "-":
                resultado -= numeroActual;
                break;
            case "*":
                resultado *= numeroActual;
                break;
            case "/":
                if (numeroActual != 0) {
                    resultado /= numeroActual;
                } else {
                    pantalla.setText("Error");
                    nuevaOperacion = true;
                    return;
                }
                break;
            case "MOD":
                if (numeroActual != 0) {
                    resultado %= numeroActual;
                } else {
                    pantalla.setText("Error");
                    nuevaOperacion = true;
                    return;
                }
                break;
        }
        // Actualiza la pantalla con el resultado
        pantalla.setText(String.valueOf(resultado));
        nuevaOperacion = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMC = new javax.swing.JButton();
        btnMR = new javax.swing.JButton();
        btnMS = new javax.swing.JButton();
        btnMplus = new javax.swing.JButton();
        btnMrest = new javax.swing.JButton();
        btnBorrarUnNumero = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnCambioPositivoNegativo = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnMOD = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btnComa = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMC.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnMC.setText("MC");
        btnMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCActionPerformed(evt);
            }
        });

        btnMR.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnMR.setText("MR");
        btnMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRActionPerformed(evt);
            }
        });

        btnMS.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnMS.setText("MS");
        btnMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMSActionPerformed(evt);
            }
        });

        btnMplus.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnMplus.setText("M+");
        btnMplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMplusActionPerformed(evt);
            }
        });

        btnMrest.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnMrest.setText("M-");
        btnMrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMrestActionPerformed(evt);
            }
        });

        btnBorrarUnNumero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBorrarUnNumero.setText("<");
        btnBorrarUnNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarUnNumeroActionPerformed(evt);
            }
        });

        btnCE.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnCambioPositivoNegativo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCambioPositivoNegativo.setText("+/-");
        btnCambioPositivoNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioPositivoNegativoActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn.setText("8");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnDivision.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnPorcentaje.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });

        btnMOD.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        btnMOD.setText("MOD");
        btnMOD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODActionPerformed(evt);
            }
        });

        btnMultiplicacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMultiplicacion.setText("*");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnResta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnSuma.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResultado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnResultado.setText("=");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });

        btnComa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnComa.setText(",");
        btnComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComaActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        pantalla.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pantalla)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(btnBorrarUnNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCambioPositivoNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(btnDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMplus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMOD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMrest, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMplus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMrest, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCambioPositivoNegativo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBorrarUnNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnPorcentaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMOD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMSActionPerformed
        memoria = Double.parseDouble(pantalla.getText());
    }//GEN-LAST:event_btnMSActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        pantalla.setText(pantalla.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComaActionPerformed
        if (decimal == false && pantalla.getText().length() < 10) {
            pantalla.setText(pantalla.getText() + ",");
            decimal = true;
        }
    }//GEN-LAST:event_btnComaActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        pantalla.setText(pantalla.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        pantalla.setText(pantalla.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        pantalla.setText(pantalla.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        pantalla.setText(pantalla.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        pantalla.setText(pantalla.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        pantalla.setText(pantalla.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        pantalla.setText(pantalla.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        pantalla.setText(pantalla.getText() + "8");
    }//GEN-LAST:event_btnActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        pantalla.setText(pantalla.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        if (!nuevaOperacion) {
            calcular();
        }
        operacion = "+";
        resultado = Double.parseDouble(pantalla.getText());
        pantalla.setText("");
        decimal = false;
        nuevaOperacion = true;
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        if (!nuevaOperacion) {
            calcular();
        }
        operacion = "*";
        resultado = Double.parseDouble(pantalla.getText());
        pantalla.setText("");
        decimal = false;
        nuevaOperacion = true;
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        if (!nuevaOperacion) {
            calcular();
        }
        operacion = "-";
        resultado = Double.parseDouble(pantalla.getText());
        pantalla.setText("");
        decimal = false;
        nuevaOperacion = true;
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        this.calcular();
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        if (!nuevaOperacion) {
            calcular();
        }
        operacion = "/";
        resultado = Double.parseDouble(pantalla.getText());
        pantalla.setText("");
        decimal = false;
        nuevaOperacion = true;
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCActionPerformed
        memoria = 0;
    }//GEN-LAST:event_btnMCActionPerformed

    private void btnMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRActionPerformed
        pantalla.setText(String.valueOf(memoria));
        nuevaOperacion = true;
    }//GEN-LAST:event_btnMRActionPerformed

    private void btnMplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMplusActionPerformed
        memoria += Double.parseDouble(pantalla.getText());
    }//GEN-LAST:event_btnMplusActionPerformed

    private void btnMrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMrestActionPerformed
        memoria -= Double.parseDouble(pantalla.getText());
    }//GEN-LAST:event_btnMrestActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        pantalla.setText("");
        decimal = false;
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnBorrarUnNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarUnNumeroActionPerformed
        String textoActual = pantalla.getText();
        if (!textoActual.isEmpty()) {
            textoActual = textoActual.substring(0, textoActual.length() - 1);
            pantalla.setText(textoActual);
        }
    }//GEN-LAST:event_btnBorrarUnNumeroActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        pantalla.setText("");
        nuevaOperacion = true;
        decimal = false;
        resultado = 0;
        operacion = "";
    }//GEN-LAST:event_btnCActionPerformed

    private void btnCambioPositivoNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioPositivoNegativoActionPerformed
        String textoActual = pantalla.getText();
        if (!textoActual.isEmpty()) {
            double numeroActual = Double.parseDouble(textoActual);
            numeroActual = -numeroActual;
            pantalla.setText(String.valueOf(numeroActual));
        }
    }//GEN-LAST:event_btnCambioPositivoNegativoActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        String textoActual = pantalla.getText();
        if (!textoActual.isEmpty()) {
            double numeroActual = Double.parseDouble(textoActual);
            numeroActual = numeroActual * 0.01;
            pantalla.setText(String.valueOf(numeroActual));
        }
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnMODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODActionPerformed
        if (!nuevaOperacion) {
            calcular();
        }
        operacion = "MOD";
        resultado = Double.parseDouble(pantalla.getText());
        pantalla.setText("");
        decimal = false;
        nuevaOperacion = true;
    }//GEN-LAST:event_btnMODActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrarUnNumero;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnCambioPositivoNegativo;
    private javax.swing.JButton btnComa;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMC;
    private javax.swing.JButton btnMOD;
    private javax.swing.JButton btnMR;
    private javax.swing.JButton btnMS;
    private javax.swing.JButton btnMplus;
    private javax.swing.JButton btnMrest;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}
