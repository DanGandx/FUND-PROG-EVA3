/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_factorial;

/**
 *
 * @author invitado
 */
public class EVA3_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 5;
        System.out.println("Factorial de 5 = " + calcularFactorial(valor));
        //CREAR MÉTODO calcularPotencia(int base, int potencia) --> regresa entero
        System.out.println(calcularPotencia(5, 3));
    }
    
   public static int calcularFactorial(int valor){
       int acumulador = 1;
       for (int i = 1; i <= valor; i++) {
         acumulador *= i; //guaradar = guaradar * i; 
       }
       return acumulador;
   }
   
   public static int calcularPotencia(int base, int potencia){
       int res = 1;
       for (int i = 1; i <= potencia; i++) {
         res = res * base;
       }
       return res;
   
    }
}
