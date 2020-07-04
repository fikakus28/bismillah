/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_sederhana;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class pemesanan_baju {
    public static void main(String[] args) {
         Scanner inputUser = new Scanner (System.in);
         int pesan, pilih;
         String nama, pesanan;
         System.out.println("apakah ingin memesan baju");
         pesanan = inputUser.nextLine();
         System.out.println("masukan nama");
         nama = inputUser.nextLine();
         System.out.println("pilih baju \n 1 baju batik \n 2 baju kemeja \n 3 baju koko");
         System.out.println("pilih pesanan baju anda");
         pilih = inputUser.nextInt();
         
         Scanner scan = new Scanner(System.in);
         
          switch (pilih){
           case 1:
               System.out.println("nama pemesan "+ nama);
               System.out.println("baju batik - hsrga 20.000");
               boolean baju = true;
               String jawab;
               int batik = 0;
               while (baju){
                   System.out.println("apakah anda ingin memesan baju batik lagi");
                   System.out.println("iya atau tidak");
                   jawab = scan.nextLine();
                   if(jawab.equalsIgnoreCase("tidak")){
                       baju = false;
                       
                   }
                   batik++;
                   
               }
               System.out.println("anda sudah memesan "+batik+" baju");
               
               break;
           case 2:
               System.out.println("nama pemesan "+ nama);
               System.out.println("baju kemeja - hsrga 30.000");
               
               boolean baju1 = true;
               String jawab1;
               int kemeja = 0;
               while (baju1){
                   System.out.println("apakah anda ingin memesan baju kemeja lagi");
                   System.out.println("iya atau tidak");
                   jawab1 = scan.nextLine();
                   if(jawab1.equalsIgnoreCase("tidak")){
                       baju1 = false;
                       
                   }
                   kemeja++;
                   
               }
               System.out.println("anda sudah memesan "+kemeja+" baju");
               
               break;
           case 3:
              System.out.println("nama pemesan "+ nama);
               System.out.println("baju koko - hsrga 40.000");
               
               boolean baju2 = true;
               String jawab2;
               int koko = 0;
               while (baju2){
                   System.out.println("apakah anda ingin memesan baju koko lagi");
                   System.out.println("iya atau tidak");
                   jawab2 = scan.nextLine();
                   if(jawab2.equalsIgnoreCase("tidak")){
                       baju2 = false;
                       
                   }
                   koko++;
                   
               }
               System.out.println("anda sudah memesan "+koko+" baju");
               
               
               break;
       
               
           default:
               System.out.println("maaf baju yang anda pilih tidak ada");
               
      
    }
}
}