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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PagoAlContado contado = new PagoAlContado();
        Pago pago1 = contado;
        pago1.monto = 150.00;
        pago1.pagador = "Andrea Martinez";
        pago1.receptor = "Mario Moran";
        
        PagoConTarjetaDeCredito credito = new PagoConTarjetaDeCredito();
        Pago pago2 = credito;
        pago2.monto = 50.00;
        pago2.pagador = "Silvia Arias";
        pago2.receptor = "Juana Torres";
        
        
        int op;
        do {
            
            op = Integer.parseInt(JOptionPane.showInputDialog("[1]Pagar al contado \n[2]Pagar con tarjeta de credito \n[3]SALIR"));
            switch (op) {
                case 1:
                    pago1.pagar();
                    JOptionPane.showMessageDialog(null, "Monto: $"+pago1.monto + "\nPagador: "+pago1.pagador+"\nReceptor: "+pago1.receptor);
                    break;
                case 2:
                    pago2.pagar();
                    JOptionPane.showMessageDialog(null, "Monto: $"+pago2.monto + "\nPagador: "+pago2.pagador+"\nReceptor: "+pago2.receptor);
                    break;
                case 3: 
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
                    break;
            }
        } while (op != 3);
    }
    
}
