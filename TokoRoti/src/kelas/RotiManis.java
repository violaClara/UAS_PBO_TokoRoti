/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelas;

/**
 *
 * @author DELL
 */
public class RotiManis extends abstraksi.Adonan{


    

    @Override
    public void hitungBeratBahan() {
        double jumlahRotiPerAdonan= 2350/50;
        this.beratTepungPSN=(1000/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratGulaPSN=(150/jumlahRotiPerAdonan)*jumlahPesanan; 
        this.beratButterPSN=(150/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratRagiPSN=(20/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratSusuBubukPSN=(300/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratSusuCairPSN=(250/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratTelurPSN=(80/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratEsBatuPSN=(400/jumlahRotiPerAdonan)*jumlahPesanan;
        
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
