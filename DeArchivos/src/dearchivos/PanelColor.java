/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dearchivos;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Citlalli
 */
public class PanelColor extends JPanel{
    public PanelColor(){
        this.setBackground(Color.BLACK);
        this.setSize(100,200);
    }

    public void cambiarDeColor(Color a){
        this.setBackground(a);
    }
}
