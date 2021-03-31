/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package images;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Citlalli
 */
public class Boxes extends JPanel {
    JCheckBox barbilla;
    JCheckBox lentes;
    JCheckBox cabello;
    JCheckBox dientes;
    Listener listen;
    public Boxes(){
        barbilla = new JCheckBox("barbilla");
        barbilla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listen.barbilla();
            }
        });

        cabello = new JCheckBox("lentes");
        cabello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listen.lentes();
            }
        });

        cabello = new JCheckBox("cabello");
        cabello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listen.cabello();
            }
        });

        dientes = new JCheckBox("dientes");
        dientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listen.dientes();
            }
        });


        this.add(barbilla);
        this.add(lentes);
        this.add(cabello);
        this.add(dientes);

    }

    public void setListen(Listener listen) {
        this.listen = listen;
    }

    public boolean isSelectBarbilla(){
        return barbilla.isSelected();
    }

    public boolean isSelectLentes(){
        return lentes.isSelected();
    }

    public boolean isSelectCabello(){
        return cabello.isSelected();
    }

    public boolean isSelectDientes(){
        return dientes.isSelected();
    }

}
