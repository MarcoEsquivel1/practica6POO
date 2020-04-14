/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author MARCOS
 */
public class EmpleadoAsalariado extends Empleado{
    public static void saludoEmpleado(){
        JOptionPane.showMessageDialog(null, "Soy un empleado de esta empresa");
    }
    
    @Override
    public void tipoEmpleado(){
        JOptionPane.showMessageDialog(null, "Soy un empleado asalariado");
    }
}
