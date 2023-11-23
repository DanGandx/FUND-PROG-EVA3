/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_valor_maximo;

/**
 *
 * @author invitado
 */
public class EVA3_2_VALOR_MAXIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //llamada a función (invocar función)
        //utilizar el valor directamente de la función
        System.out.println(buscarMaximo(100, 200));
        //guardar el valor y usarlo después
        int result = buscarMaximo(100, 200);
        System.out.println(result);
        //Llamar a la función e ignorar el resultado
        buscarMaximo(100, 200);
    }
    
    public static int buscarMaximo(int val1, int val2){
         /*if(val1 > val2)
            return val1;
        else
            return val2;*/
        
      int result;
        if(val1 > val2)
            result = val1;
        else
            result = val2;
        return result;
    } 
}
