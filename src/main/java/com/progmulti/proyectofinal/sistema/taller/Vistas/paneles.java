package com.progmulti.proyectofinal.sistema.taller.Vistas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author Victor Alejandro
 */
public class paneles extends JPanel {
    public paneles() {
     setOpaque(false); 
        }
         @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground()); 
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30); 
    } 
}
