/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class PGCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        int x,y;
        
        System.out.print("Saisir un nombre enrier : ");
        x=reader.nextInt();
        System.out.print("Saisir un nombre enrier : ");
        y=reader.nextInt();
        System.out.println("PGCD : "+ PGCD(x,y));
        
    }
    
    
    public static int PGCD( int a, int b ){
        while (a != b) {
            if (a > b ){
                a = a-b;
            }
             else  b = b-a ;
             }
        return a;
    }
}
    

