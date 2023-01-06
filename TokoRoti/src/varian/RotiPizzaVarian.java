/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokoroti;

import interfaces.Topping;
/**
 *
 * @author acer
 */
public class RotiPizzaVarian extends kelas.RotiPizza implements Topping{
    int beratKejuTopping=30;
    double beratKejuToppingPSN;
    
    int beratSosisTopping=50;
    double beratSosisToppingPSN;
    
    int beratSmokedBeefTopping=50;
    double beratSmokedBeefToppingPSN;
    
    int beratBawangBombayTopping=5;
    double beratBawangBombayToppingPSN;
    
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
        return hargaKejuTopping;
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
