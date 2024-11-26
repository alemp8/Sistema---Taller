/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.progmulti.proyectofinal.sistema.taller.Vistas;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 *
 * @author Victor Alejandro
 */
public class Combo extends JComboBox{
    public Combo(String[] items) {
        super(items);
        setOpaque(true);
        setBackground(new Color(50, 50, 50)); // Fondo oscuro
        setForeground(Color.WHITE); // Texto blanco
        setFont(new Font("Arial", Font.PLAIN, 14)); // Fuente en Arial
        setBorder(new LineBorder(new Color(30, 30, 30), 1)); // Borde sutil
        
        // Personalizar el aspecto del combo box
        setUI(new javax.swing.plaf.basic.BasicComboBoxUI() {
            @Override
            protected JButton createArrowButton() {
                JButton button = super.createArrowButton();
                button.setBackground(new Color(50, 50, 50)); // Fondo oscuro en la flecha
                button.setForeground(Color.WHITE); // Flecha blanca
                return button;
            }
        });
    }
}
