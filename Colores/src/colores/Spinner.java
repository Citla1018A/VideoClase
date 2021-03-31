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
public class Spinner extends JPanel{
    JSpinner espiner;

    public Spinner(){
        espiner = new JSpinner();
        this.setBackground(Color.pink);
        this.add(espiner);
    }

    public Integer valor(){
        return espiner.getHeight();
    }

    public void resetear(Integer x){
        espiner.setValue(x);
    }


}
