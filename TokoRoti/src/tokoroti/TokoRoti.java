/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tokoroti;

import kelas.RotiManis;
import kelas.RotiTawar;
import varian.RotiManisVarian1;
import varian.RotiTawarVarian1;
import varian.RotiTawarVarian2;

/**
 *
 * @author DELL
 */
public class TokoRoti {

 
    public static void main(String[] args) {
     
        System.out.println("----------------Orderan1-----------------");
        RotiTawarVarian1 tawar1=new RotiTawarVarian1();
        tawar1.jumlahPesanan=20;
        tawar1.tampilkan();
        
        System.out.println("----------------Orderan2-----------------");
        
        RotiTawarVarian2 tawar2=new RotiTawarVarian2();
        tawar2.jumlahPesanan=15;
        tawar2.tampilkan();
        
       System.out.println("----------------Orderan3-----------------");
        RotiManisVarian1 manis1=new RotiManisVarian1();
        manis1.jumlahPesanan=50;
        manis1.tampilkan();
      
                
        
       
    }
    
}
