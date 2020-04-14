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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoAsalariado asalariado = new EmpleadoAsalariado();
        Empleado empleado1 = asalariado;
        
        EmpleadoPorHoras porHoras = new EmpleadoPorHoras();
        Empleado empleado2 = porHoras;
        
        EmpleadoPorComision porComision = new EmpleadoPorComision();
        Empleado empleado3 = porComision;
        
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("[1]Empleado Asalariado. \n[2]Empleado por Horas. \n[3]Empleado por Comision. \n[4]SALIR"));
            switch (op) {
                case 1:
                    do{
                        op = Integer.parseInt(JOptionPane.showInputDialog("[1]Metodo de clase. \n[2]Metodo de instancia. \n[3]Salir."));
                        switch(op){
                            case 1:
                                Empleado.saludoEmpleado();
                                break;
                            case 2:
                                empleado1.tipoEmpleado();
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
                                break;    
                        }
                    }while(op != 3);    
                    break;
                case 2:
                    do{
                        op = Integer.parseInt(JOptionPane.showInputDialog("[1]Metodo de clase. \n[2]Metodo de instancia. \n[3]Salir."));
                        switch(op){
                            case 1:
                                Empleado.saludoEmpleado();
                                break;
                            case 2:
                                empleado2.tipoEmpleado();
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
                                break;
                        }
                    }while(op != 3); 
                    break;
                case 3:
                    do{
                        op = Integer.parseInt(JOptionPane.showInputDialog("[1]Metodo de clase. \n[2]Metodo de instancia. \n[3]Salir."));
                        switch(op){
                            case 1:
                                Empleado.saludoEmpleado();
                                break;
                            case 2:
                                empleado3.tipoEmpleado();
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
                                break;
                        }
                    }while(op != 3); 
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
                    break;
            }
        } while (op != 4);
    }
    
}
