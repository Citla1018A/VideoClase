/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
/**
 *
 * @author Citlalli
 */
public class MenuOpc extends JMenuBar{
    JMenu mmArchivo;
    JMenu mmAyuda;
    
    JMenuItem miNuevo;
    JMenuItem miAbrir;
    JSeparator jSeparator;
    JMenuItem miSalir;
    
    
    JMenuItem miAcercaDe;
    
    MenuListener listener;
    
    
       
    
    public MenuOpc(){
        mmArchivo = new JMenu("Archivo");
        mmAyuda = new JMenu("Ayuda");
        
        miNuevo = new JMenuItem("Nuevo");
        miNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.miNuevoButtonClick();
            }
        });
        
        miAbrir = new JMenuItem("Abrir");
        miAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.miAbrirButtonClick();
            }
        });
        
        miSalir = new JMenuItem("Salir");
        miSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.miSalirButtonClick();
            }
        });
        
        miAcercaDe = new JMenuItem("Acerca de");
        miAcercaDe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                listener.miAcercaDeButtonClick();
            }
        });
        
        mmArchivo.add(miAbrir);
        mmArchivo.add(miNuevo);
        mmArchivo.add(new JSeparator());
        mmArchivo.add(miSalir);
        
        mmAyuda.add(miAcercaDe);
        
        
        this.add(mmArchivo);
        this.add(mmAyuda);
    }

    public void setListener(MenuListener listener) {
        this.listener = listener;
    }
    
}
