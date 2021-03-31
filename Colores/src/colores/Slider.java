/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colores;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Citlalli
 */
public class Slider extends JPanel{
    JSlider eslaider;

    public Slider(){
        eslaider = new JSlider(JSlider.HORIZONTAL,0,50,25);
        this.setBackground(Color.RED);
        this.add(eslaider);
    }

    public Integer valor(){
        return eslaider.getValue();
    }

    public void resetear(Integer x){
        eslaider.setValue(x);
    }
}
