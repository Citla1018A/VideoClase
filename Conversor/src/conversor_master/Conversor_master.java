/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor_master;

/**
 *
 * @author Citlalli
 */
public class Conversor_master {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float ValorConversion=20.66f;
	Conversor ventana=new Conversor(ValorConversion);
	ventana.setVisible(true);
    }
    
}
