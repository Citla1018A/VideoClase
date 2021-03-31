/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dearchivos;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
/**
 *
 * @author Citlalli
 */
public class Archivoos extends JFrame{
    Color color;

    PanelArchivos panelArchivos;
    Btns botones;
    Archivos archivos;
    PanelColor panelito;

    public Archivoos(){
        panelito = new PanelColor();


        panelArchivos = new PanelArchivos();
        this.setTitle("Seleccionador de Archivos");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        botones = new Btns();

        botones.setListener(new Listener() {
            @Override
            public void abrirArchivo() {
                archivos = new Archivos();
                archivos.abrir();
                panelArchivos.nombreDelArchivo(archivos.direccion());
                Archivoos.this.setVisible(true);
            }

            @Override
            public void guardarArchivo() {
                archivos = new Archivos();
                archivos.guardar();
                panelArchivos.setNombreGuardar(archivos.direccion());
                Archivoos.this.setVisible(true);
            }

            @Override
            public void seleccionarColor() {
                //Color x = JColorChooser.showDialog(MainFrame.this,"Colores",MainFrame.this.getBackground());
                JColorChooser Selectorcolor=new JColorChooser();
                color=Selectorcolor.showDialog(null, "Seleccione un Color", Color.MAGENTA);
                panelito.cambiarDeColor(color);

            }
        });


        this.add(panelito, BorderLayout.EAST);
        this.add(panelArchivos, BorderLayout.CENTER);
        this.add(botones, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
