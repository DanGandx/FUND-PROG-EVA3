/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_1_metodo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_1_METODO {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // llamada a función o procedimiento
        imprimirMensaje("Hola mundo!!!", 5);
       
        Scanner input = new Scanner(System.in);
    }
    public static void imprimirMensaje(String mensaje, int cant){
        for (int i = 0; i < cant; i++) 
              System.out.println(mensaje);
        
      
    }
}
