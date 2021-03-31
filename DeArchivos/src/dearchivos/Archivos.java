/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dearchivos;


import javax.swing.*;
/**
 *
 * @author Citlalli
 */
public class Archivos extends JFileChooser{
    
    public Archivos(){
        //this.showSaveDialog(null);
    }

    public void abrir(){
        this.showOpenDialog(null);
    }

    public String direccion(){
        return this.getSelectedFile().getAbsolutePath();
    }

    public void guardar(){
        this.showSaveDialog(null);
    }

}
