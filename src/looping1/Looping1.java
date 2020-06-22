/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping1;
import java.util.Scanner;
/**
 *
 * @author vitor
 */
public class Looping1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        double i,num,result;
        System.out.println ("Digite um número de 1 até 15");
        num = entrada.nextDouble();
        
        i = 0;
        while (i <= 15)
        {
            result = Math.pow(3, i);
            System.out.println ("O resultado da potência de 3 é:" + result);
            i++;
        }
    }  
}
       
    
    

 