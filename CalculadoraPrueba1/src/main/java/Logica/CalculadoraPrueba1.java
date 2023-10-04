/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Logica;

import GUI.frmCalculadora;

/**
 *
 * @author svalv
 */
public class CalculadoraPrueba1 {

    public static void main(String[] args) {
        frmCalculadora frm = new frmCalculadora();
        frm.setVisible(true);
    }
}
































/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField pantalla;
    private double resultado;
    private String operacion;
    private boolean nuevaOperacion = true;
    private double memoria;

    public Calculadora() {
        setSize(400, 400);
        setTitle("Calculadora");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        pantalla = new JTextField("0", 10);
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setEditable(false);
        pantalla.setBackground(Color.WHITE);
        pantalla.setFont(new Font("Arial", Font.PLAIN, 24));

        panel.add(pantalla, BorderLayout.NORTH);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(5, 4));

        String[] etiquetas = {
            "7", "8", "9", "MC",
            "4", "5", "6", "MR",
            "1", "2", "3", "MS",
            "0", ".", "=", "M+",
            "+", "-", "*", "/", "CE", "C", "MOD"
        };

        for (String etiqueta : etiquetas) {
            JButton boton = new JButton(etiqueta);
            boton.addActionListener(this);
            if (etiqueta.matches("[0-9]")) {
                boton.setFont(new Font("Arial", Font.PLAIN, 24));
            } else {
                boton.setFont(new Font("Arial", Font.BOLD, 20));
            }
            if (etiqueta.equals("=")) {
                boton.setBackground(Color.GREEN);
            } else {
                boton.setBackground(Color.WHITE);
            }
            panelBotones.add(boton);
        }

        panel.add(panelBotones, BorderLayout.CENTER);

        add(panel);

        pantalla.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == '.')) {
                    e.consume();
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        
        switch (comando) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case ".":
                if (nuevaOperacion) {
                    pantalla.setText(comando);
                    nuevaOperacion = false;
                } else {
                    pantalla.setText(pantalla.getText() + comando);
                }
                break;
            case "+":
            case "-":
            case "*":
            case "/":
            case "MOD":
                if (!nuevaOperacion) {
                    calcular();
                    operacion = comando;
                    nuevaOperacion = true;
                }
                break;
            case "=":
                if (!nuevaOperacion) {
                    calcular();
                    operacion = "";
                }
                break;
            case "CE":
                pantalla.setText("0");
                nuevaOperacion = true;
                break;
            case "C":
                pantalla.setText("0");
                nuevaOperacion = true;
                resultado = 0;
                operacion = "";
                break;
            case "MC":
                memoria = 0;
                break;
            case "MR":
                pantalla.setText(String.valueOf(memoria));
                nuevaOperacion = true;
                break;
            case "MS":
                memoria = Double.parseDouble(pantalla.getText());
                break;
            case "M+":
                memoria += Double.parseDouble(pantalla.getText());
                break;
        }
    }

    private void calcular() {
        switch (operacion) {
            case "+":
                resultado += Double.parseDouble(pantalla.getText());
                break;
            case "-":
                resultado -= Double.parseDouble(pantalla.getText());
                break;
            case "*":
                resultado *= Double.parseDouble(pantalla.getText());
                break;
            case "/":
                double divisor = Double.parseDouble(pantalla.getText());
                if (divisor != 0) {
                    resultado /= divisor;
                } else {
                    pantalla.setText("Error");
                    nuevaOperacion = true;
                }
                break;
            case "MOD":
                double divisorMod = Double.parseDouble(pantalla.getText());
                if (divisorMod != 0) {
                    resultado %= divisorMod;
                } else {
                    pantalla.setText("Error");
                    nuevaOperacion = true;
                }
                break;
        }
        pantalla.setText(String.valueOf(resultado));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculadora calculadora = new Calculadora();
            calculadora.setVisible(true);
        });
    }
}
*/