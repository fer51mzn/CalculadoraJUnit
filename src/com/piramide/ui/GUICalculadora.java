package com.piramide.ui;

import javax.swing.*;

public class GUICalculadora extends  JFrame{
    private JTextField OperadorA;
    private JTextField OperadorB;
    private JButton suma;
    private JButton resta;
    private JButton Multiplicacion;
    private JButton Division;
    private JLabel resultado;
    private JLabel resultadoF;
    private JPanel root;

    public GUICalculadora(){
        add(root);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setHandlers();
    }

    private void setHandlers(){
        suma.addActionListener(e -> {
            suma();
        });
        resta.addActionListener(e ->{
            resta();
        });
        Multiplicacion.addActionListener(e2 -> {
            mutiplicar();
        });
        Division.addActionListener(e3 -> {
            dividir();
        });
    }

    private void suma(){
        int a = Integer.parseInt(OperadorA.getText());
        int b = Integer.parseInt(OperadorB.getText());
        resultado.setText(String.valueOf(a+b));
    }

    private void resta(){
        int a = Integer.parseInt(OperadorA.getText());
        int b = Integer.parseInt(OperadorB.getText());
        resultado.setText(String.valueOf(a-b));
    }
    private void mutiplicar(){
        int a = Integer.parseInt(OperadorA.getText());
        int b = Integer.parseInt(OperadorB.getText());
        resultado.setText(String.valueOf(a*b));
    }

    private void dividir(){
        int a = Integer.parseInt(OperadorA.getText());
        int b = Integer.parseInt(OperadorB.getText());
        resultado.setText(String.valueOf(a/b));
    }
}
