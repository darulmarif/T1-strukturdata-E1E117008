/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
    int lama,kamar,tamu,hasil; 
      System.out.print("lama hari = ");
      lama = inputUser.nextInt();
      
       System.out.println("tipe kamar ");
       System.out.println("1. 300.000 "); 
       System.out.println("2. 400.000 ");
       System.out.println("3. 450.000 ");
        System.out.print("masukan tipe kamar = ");
        kamar = inputUser.nextInt();
       
        
        if (kamar==1)
        {
            System.out.println("tipe tamu ");
            System.out.println("1. VIP diskon "); 
            System.out.println("2. biasa ");

            System.out.print("masukan tipe tamu = ");
            tamu = inputUser.nextInt(); 
           if(tamu==1)
           {
               int diskon,biaya;
               hasil=lama*300000;
               diskon=hasil*10/100;
               biaya=hasil-diskon;
          
              System.out.println("biaya yg harus dibyar :" +biaya); 
           }
           else
           {
               hasil=lama*300000;
              System.out.println("biaya yg harus dibyar :" +hasil); 
           }
        }
        
        
        if (kamar==2)
        {
            System.out.println("tipe tamu ");
            System.out.println("1. VIP diskon "); 
            System.out.println("2. biasa ");

            System.out.print("masukan tipe tamu = ");
            tamu = inputUser.nextInt(); 
           if(tamu==1)
           {
               int diskon,biaya;
               hasil=lama*400000;
               diskon=hasil*10/100;
               biaya=hasil-diskon;
          
              System.out.println("biaya yg harus dibyar :" +biaya); 
           }
           else
           {
               hasil=lama*400000;
              System.out.println("biaya yg harus dibyar :" +hasil); 
           }  
        }
        
        if (kamar==3)
        {
            System.out.println("tipe tamu ");
            System.out.println("1. VIP diskon "); 
            System.out.println("2. biasa ");

            System.out.print("masukan tipe tamu = ");
            tamu = inputUser.nextInt(); 
           if(tamu==1)
           {
               int diskon,biaya;
               hasil=lama*450000;
               diskon=hasil*10/100;
               biaya=hasil-diskon;
          
              System.out.println("biaya yg harus dibyar :" +biaya); 
           }
           else
           {
               hasil=lama*450000;
              System.out.println("biaya yg harus dibyar :" +hasil); 
           }  
        }
        
        
    }
    
}
