/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class PrincipalCalculadora {

    public static void main(String[] args) {
      int x, y ;
        String sX, sY;
        
        sX = JOptionPane.showInputDialog(null, "Digite o primeiro numero: ",
        "primeiro numero", JOptionPane.QUESTION_MESSAGE);
        
        x = Integer.parseInt(sX);
        
        sY = JOptionPane.showInputDialog(null, "Digite o segundo numero: ",
        "segundo numero", JOptionPane.QUESTION_MESSAGE);
        
        y = Integer.parseInt(sY);
        
        Calculadora calc = new Calculadora();
        
        JOptionPane.showMessageDialog(null, "Somar " + calc.somar(x, y));
        JOptionPane.showMessageDialog(null, "Subtrair " + calc.subtrair(x, y));
        JOptionPane.showMessageDialog(null, "Multiplicar " + calc.multiplicar(x, y));
        JOptionPane.showMessageDialog(null, "Dividir " + calc.dividir(x, y));
        
        System.exit( 0 );
    }
}
