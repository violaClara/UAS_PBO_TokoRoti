/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package varian;

import interfaces.Filling;

/**
 *
 * @author HP
 */
public class RotiTawarVarian2 extends kelas.RotiTawar implements Filling{

    int beratKeju=80;
    double beratKejuPSN;
    
    @Override
    public void hitungBeratFilling() {
        this.beratKejuPSN=this.beratKeju*jumlahPesanan;
        
        System.out.println("Berat Keju: "+beratKejuPSN+" gr");
    
       
    }

    @Override
    public double hitungHargaFilling() {
       
        double hargaKeju=(31000/250)*beratKejuPSN;    
        return hargaKeju;
    }
    
    public void tampilkan(){
        System.out.println("Roti Tawar Varian 2");
        System.out.println("Jumlah: "+jumlahPesanan+" pcs \n");
        hitungBeratBahan();
        hitungBeratFilling();
        System.out.println("-------------------");
        System.out.println("Harga Bahan: Rp"+hitungHargaBahan());
        System.out.println("Harga Filling: Rp"+hitungHargaFilling());
        
        double hargaJual= hitungHargaBahan()+hitungHargaFilling()+((hitungHargaBahan()+hitungHargaFilling())*50/100);
        System.out.println("Harga Jual Per pcs: Rp"+hargaJual/jumlahPesanan);
        System.out.println("\n \n");
    }
    
}
