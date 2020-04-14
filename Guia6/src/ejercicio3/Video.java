/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author MARCOS
 */
public class Video extends ArchivoMultimedia{
    @Override
    public void reproducir(){
        JOptionPane.showMessageDialog(null, "Se esta reproduciendo un video");
    }
}
