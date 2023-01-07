/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;

import interfaces.Topping;

/**
 *
 * @author acer
 */
public class RotiPizza extends abstraksi.Adonan implements Topping{

    int beratKejuTopping=30;
    double beratKejuToppingPSN;
    
    int beratSosisTopping=50;
    double beratSosisToppingPSN;
    
    int beratSmokedBeefTopping=50;
    double beratSmokedBeefToppingPSN;
    
    int beratBawangBombayTopping=30;
    double beratBawangBombayToppingPSN;
    

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
    
            @Override
    public void hitungBeratTopping() {
        this.beratKejuToppingPSN=this.beratKejuTopping*jumlahPesanan;
        this.beratSosisToppingPSN=this.beratSosisTopping*jumlahPesanan;
        this.beratSmokedBeefToppingPSN=this.beratSmokedBeefTopping*jumlahPesanan;
        this.beratBawangBombayToppingPSN=this.beratBawangBombayTopping*jumlahPesanan;
        
        System.out.println("Berat Topping Keju: "+beratKejuToppingPSN+" gr");
        System.out.println("Berat Topping Sosis: "+beratSosisToppingPSN+" gr");
        System.out.println("Berat Topping Smoked Beef: "+beratSmokedBeefToppingPSN+" gr");
        System.out.println("Berat Topping Bawang Bombay: "+beratBawangBombayToppingPSN+" gr");
    }

    @Override
    public double hitungHargaTopping() {
        double hargaKejuTopping=(31000/250)*beratKejuToppingPSN;    
        double hargaSosisTopping=(80000/1000)*beratSosisToppingPSN;    
        double hargaSmokedBeefTopping=(90000/1000)*beratSmokedBeefToppingPSN;    
        double hargaBawangBombayTopping=(40000/500)*beratBawangBombayToppingPSN;    
        double hargaTopping=hargaKejuTopping+hargaSosisTopping+hargaSmokedBeefTopping+hargaBawangBombayTopping;
        return hargaTopping;
    }
    
     public void tampilkan(){
        System.out.println("Roti Pizza Varian");
        System.out.println("Jumlah: "+jumlahPesanan+" pcs \n");
        hitungBeratBahan();
        hitungBeratTopping();
        System.out.println("-------------------");
        System.out.println("Harga Bahan: Rp"+hitungHargaBahan());
        System.out.println("Harga Topping: Rp"+hitungHargaTopping());
        
        double hargaJual= hitungHargaBahan()+hitungHargaTopping()+((hitungHargaBahan()+hitungHargaTopping())*(10/100));
        System.out.println("Harga Jual Per pcs: Rp"+hargaJual/jumlahPesanan);
        System.out.println("\n \n");
    }
}
