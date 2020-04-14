/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author MARCOS
 */
public class Pago {
    public double monto;
    public String pagador;
    public String receptor;
    public void pagar(){
        JOptionPane.showMessageDialog(null, "Se ha realizado el pago.");
    }
}
