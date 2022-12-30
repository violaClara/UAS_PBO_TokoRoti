/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelas;

import java.time.chrono.ThaiBuddhistEra;

/**
 *
 * @author DELL
 */
public class RotiTawar extends abstraksi.Adonan{


    

    @Override
    public void hitungBeratBahan() {
        double jumlahRotiPerAdonan= 2065/400;
        this.beratTepungPSN=(1000/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratGulaPSN=(125/jumlahRotiPerAdonan)*jumlahPesanan; 
        this.beratButterPSN=(100/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratRagiPSN=(20/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratSusuBubukPSN=(250/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratSusuCairPSN=(200/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratTelurPSN=(70/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratEsBatuPSN=(300/jumlahRotiPerAdonan)*jumlahPesanan;
        
        System.out.println("Berat Tepung: "+beratTepungPSN+" gr");
        System.out.println("Berat Gula: "+beratGulaPSN+" gr");
        System.out.println("Berat Butter: "+beratButterPSN+" gr");
        System.out.println("Berat Ragi: "+beratRagiPSN+" gr");
        System.out.println("Berat Susu Bubuk: "+beratSusuBubukPSN+" gr");
        System.out.println("Berat Susu Cair: "+beratSusuCairPSN+" gr");
        System.out.println("Berat Telur: "+beratTelurPSN+" gr");
        System.out.println("Berat Es Batu: "+beratEsBatuPSN+" gr"); 
        
       
        
    }

   
    
    

 
    
    
    
}
