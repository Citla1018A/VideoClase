/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogos;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Citlalli
 */
public class Dialogos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dialogoss dialogos = new Dialogoss();
        dialogos .setDefaultCloseOperation(EXIT_ON_CLOSE);
		dialogos.setBounds(50,50,400,400);
		dialogos .setVisible(true);
    }
    
}
