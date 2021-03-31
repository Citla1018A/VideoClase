/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Citlalli
 */
public class Loginn extends JFrame implements ActionListener {
    JPanel panel;
    JLabel user_label, contrasena_label, mensaje;
    JTextField userNombr_text;
    JPasswordField contrasena_text;//propiedad que encripta la contraseña
    JButton enviar, cancelar;

    Loginn() {
        
        // Usuario
        user_label = new JLabel();
        user_label.setText("Nombre de Usuario :");
        userNombr_text = new JTextField();
        
        // Contraseña

        contrasena_label = new JLabel();
        contrasena_label.setText("Contraseña :");
        contrasena_text = new JPasswordField();

        // Login

        enviar = new JButton("Login");

        panel = new JPanel(new GridLayout(3, 1));

        panel.add(user_label);
        panel.add(userNombr_text);
        panel.add(contrasena_label);
        panel.add(contrasena_text);

        mensaje = new JLabel();
        panel.add(mensaje);
        panel.add(enviar);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminar el proceso
        
        // Agrega los oyentes
        enviar.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Login");
        setSize(300, 100);
        setVisible(true);

    }

    
    public void actionPerformed(ActionEvent ae) {
        String userName = userNombr_text.getText();
        String password = contrasena_text.getText();
        if (userName.trim().equals("citlalli") && password.trim().equals("123456")) {
            JOptionPane.showMessageDialog(null, "Citlalli");

        } else {
            JOptionPane.showMessageDialog(null, "Usuario incorrecto");
        }

    }
   
    
}
