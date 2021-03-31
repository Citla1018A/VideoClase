/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dearchivos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Citlalli
 */
public class Btns  extends JPanel{
    JButton archivo;
    JButton guardar;
    JButton color;
    Listener listener;

    public Btns(){
        archivo = new JButton("otro");
        archivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.abrirArchivo();
            }
        });

        guardar = new JButton("Guardar");
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.guardarArchivo();
            }
        });

        color = new JButton("Seleciona el Color");
        color.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.seleccionarColor();
            }
        });

        this.add(archivo);
        this.add(guardar);
        this.add(color);

    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }
}
