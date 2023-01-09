/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varian;

import interfaces.Filling;
import interfaces.Topping;

/**
 *
 * @author MuhAgungN173
 */
public class RotiManisVarian2 extends kelas.RotiManis implements Filling, Topping{
    int beratRedBean=10;
    double beratRedBeanPSN;

    int beratVanilla=5;
    double beratVanillaPSN;
    
    int beratCoklatTopping;
    double beratCoklatToppingPSN;
    

    @Override
    public void hitungBeratFilling() {
        this.beratRedBeanPSN=this.beratRedBean*jumlahPesanan;
        
        System.out.println("Berat Filling Red Bean: "+beratRedBeanPSN+" gr");
    }

    @Override
    public double hitungHargaFilling() {
        double hargaRedBean=(31000/250)*beratRedBeanPSN;  
        double hargaFilling=hargaRedBean;
        return hargaFilling;
    }

    @Override
    public void hitungBeratTopping() {
        this.beratCoklatToppingPSN=this.beratCoklatTopping*jumlahPesanan;
        
        System.out.println("Berat Topping Coklat: "+beratCoklatToppingPSN+" gr");
    }

    @Override
    public double hitungHargaTopping() {
        double hargaCoklatTopping=(29000/500)*beratCoklatToppingPSN;    
        return hargaCoklatTopping;
    }
    
     public void tampilkan(){
        System.out.println("Roti Manis Varian 2");
        System.out.println("Jumlah: "+jumlahPesanan+" pcs \n");
        hitungBeratBahan();
        hitungBeratFilling();
        hitungBeratTopping();
        System.out.println("-------------------");
        System.out.println("Harga Bahan: Rp"+hitungHargaBahan());
        System.out.println("Harga Filling: Rp"+hitungHargaFilling());
        System.out.println("Harga Topping: Rp"+hitungHargaTopping());
        
        double hargaJual= hitungHargaBahan()+hitungHargaFilling()+hitungHargaTopping()+((hitungHargaBahan()+hitungHargaFilling()+hitungHargaTopping())*(50/100));
        System.out.println("Harga Jual Per pcs: Rp"+hargaJual/jumlahPesanan);
        System.out.println("\n \n");
    }
    
}
