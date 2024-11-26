package com.progmulti.proyectofinal.sistema.taller.Vistas;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class tablas extends JTable {

    public tablas() {
        super();
        configurarTabla();
    }

    public tablas(DefaultTableModel model) {
        super(model);
        configurarTabla();
    }

    private void configurarTabla() {
        // Configuración del encabezado con un fondo negro profundo
        getTableHeader().setBorder(null);
        getTableHeader().setBackground(new Color(25, 25, 25));  
        getTableHeader().setForeground(new Color(200, 200, 200)); 
        getTableHeader().setDefaultRenderer(new TablaEncabezadoMaterial());
        setDefaultRenderer(Object.class, new TablaCeldaMaterial());
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    private class TablaEncabezadoMaterial extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            com.setBackground(new Color(25, 25, 25)); 
            com.setForeground(new Color(200, 200, 200)); 
            com.setFont(com.getFont().deriveFont(12f)); 

            setBorder(javax.swing.BorderFactory.createCompoundBorder(
                    javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(45, 45, 45)), // Borde gris oscuro
                    javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10)
            ));

            return com;
        }
    }

    private class TablaCeldaMaterial extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (isSelected) {
                com.setBackground(new Color(63, 81, 181)); 
                com.setForeground(Color.WHITE);
            } else {
                com.setBackground(row % 2 == 0 ? new Color(30, 30, 30) : new Color(35, 35, 35));
                com.setForeground(new Color(200, 200, 200));
            }
            setBorder(javax.swing.BorderFactory.createLineBorder(new Color(45, 45, 45), 1));

            return com;
        }
    }
}
