/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogos;

import java.awt.event.*;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Citlalli
 */
public class Dialogoss extends JFrame{
        private JTextField tf;
         private JTextField ft;
        private JCheckBox informacion;
        private JCheckBox pregunta;
        private JCheckBox precaucion;
        private JCheckBox error;
        public Dialogoss(){
       //     JPanel panel = new JPanel();
          //  panel.setBackground(Color.PINK);
       /*     this.getContentPane().add(panel);
            setTitle("Dialogos");
            JLabel texto = new JLabel();
            texto.setText("MENSAJE");
            panel.add(texto);*/
            
           setTitle("Prueba/Dialogos");
           setLayout(new FlowLayout());
           JLabel texto = new JLabel();
           texto.setText("MENSAJE");//MENSAJE
           add(texto);
            tf= new JTextField("MENSAJE", 50);//Texto
            add(tf);
        
           JLabel titulo = new JLabel();
           titulo.setText("TITULO");//Titulo
            add(titulo);
            ft = new JTextField("TITULO",50);
            add(ft);
        
           
            informacion = new JCheckBox("Informacion");
            pregunta= new JCheckBox("Pregunta");
            precaucion= new JCheckBox("Precaucion");
            error= new JCheckBox("Error");
            add(informacion);
            add(pregunta);
            add(precaucion);
            add(error);
            TheHandler  handler=new TheHandler();
            informacion.addItemListener(handler);
            pregunta.addItemListener(handler);
            precaucion.addItemListener(handler);
            error.addItemListener(handler);
             
        }
        private class  TheHandler implements ItemListener{
           public void itemStateChanged (ItemEvent event)     
        {
          if(informacion.isSelected()){
            JOptionPane.showMessageDialog(null, "Soy Información");
            }
            if(pregunta.isSelected()){
                  JOptionPane.showMessageDialog(null, "Soy Pregunta","pregunta", JOptionPane.QUESTION_MESSAGE);
            }
            if(precaucion.isSelected()){
                JOptionPane.showMessageDialog(null, "Soy Precaución", "Precaución", JOptionPane.WARNING_MESSAGE);
            }
            if(error.isSelected()){
                    JOptionPane.showMessageDialog(null, "Soy Error","Error", JOptionPane. ERROR_MESSAGE);
            }
            
            
        } 

        
            
        
        }
}
