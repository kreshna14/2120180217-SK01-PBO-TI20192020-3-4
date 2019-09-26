/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2120180217.sk01.pbo.ti20192020.pkg3.pkg4.pkg03;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SK01PBOTI201920203403 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
         System.out.println("Masukan tinggi segitiga = ");
             int tinggi = input.nextInt();
                
         for (int i = 0; i <= tinggi; i++) {
             for (int j = tinggi - i; j >= 0; j--) {
                 System.out.print("3");
             }
             System.out.println("");
        }
       
    }
    
}

