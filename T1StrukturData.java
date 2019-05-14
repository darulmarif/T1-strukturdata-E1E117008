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
          System.out.print("Masukan Nilai ke-"+i+" = ");
          nilai[i-1] = inputUser.nextInt();
		  
          if(nilai[i-1]<kecil)
              kecil=nilai[i-1];
		  
          if(nilai[i-1]>besar)
              besar=nilai[i-1];
		  
          jumlah+=nilai[i-1];

        }
        float rata=jumlah/nilai.length;
		
        System.out.println("Nilai terkecil = "+kecil);
        System.out.println("Nilai terbesar = "+besar);
        System.out.println("Nilai rata-rata = "+rata);
		
        for (int i=1; i<=nilai.length; i++)
        {  
          System.out.print(nilai[i-1]+" ");
        }
        System.out.println(" ");
}
    }
    

