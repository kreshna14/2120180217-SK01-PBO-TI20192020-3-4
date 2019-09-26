/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2120180217.sk01.pbo.ti20192020.pkg3.pkg4.pkg02;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SK01PBOTI201920203402 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         System.out.println("Masukan tinggi segitiga = ");
             int tinggi = input.nextInt();
                
         for (int i = 1; i <= tinggi; i++) {
             for (int j = tinggi - i; j >= 1; j--) {
                 System.out.print(" ");
             }
             for (int j = tinggi - i; j <= tinggi; j++) {
                 System.out.print("2");
                 
             }
             System.out.println("");
        }
       
    }
    
    
}
