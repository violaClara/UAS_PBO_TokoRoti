/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoroti;

/**
 *
 * @author acer
 */
public class RotiPizza extends abstraksi.Adonan{


    

    @Override
    public void hitungBeratBahan() {
        double jumlahRotiPerAdonan= 1950/190;
        this.beratTepungPSN=(1000/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratGulaPSN=(100/jumlahRotiPerAdonan)*jumlahPesanan; 
        this.beratButterPSN=(100/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratRagiPSN=(20/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratSusuBubukPSN=(200/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratSusuCairPSN=(180/jumlahRotiPerAdonan)*jumlahPesanan;
        this.beratTelurPSN=(50/jumlahRotiPerAdonan)*jumlahPesanan;
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
