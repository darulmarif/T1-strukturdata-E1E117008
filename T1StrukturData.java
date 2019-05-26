/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.struktur.data;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class T1StrukturData {

    /**
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inputUser = new Scanner(System.in);
        int[] nilai = new int[7];
        int kecil=999,besar=0,jumlah=0;
		
        for (int i=1; i<=nilai.length; i++)
        {
          System.out.print("Masukan Nilai praktikum-"+i+" = ");
          nilai[i-1] = inputUser.nextInt();
		  
          if(nilai[i-1]<kecil)
              kecil=nilai[i-1];
		  
          else if(nilai[i-1]>besar)
              besar=nilai[i-1];
		  
          jumlah+=nilai[i-1];

        }
        float rata=jumlah/nilai.length;
		
        System.out.println("rata-rata nilai peraktikum anda adalah = "+rata);
        System.out.println("Nilai tertinggi peraktikum anda adalah = "+besar);
        System.out.println("Nilai terendah peraktikum anda adalah = "+kecil);
		
        for (int i=1; i<=nilai.length; i++)
        {  
          System.out.print(nilai[i-1]+", ");
        }
        System.out.println(" ");
}
    }
    

