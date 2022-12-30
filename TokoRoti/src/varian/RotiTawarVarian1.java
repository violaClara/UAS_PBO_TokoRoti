/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package varian;

import interfaces.Filling;

/**
 *
 * @author DELL
 */
public class RotiTawarVarian1 extends kelas.RotiTawar implements Filling{

    int beratCoklat=80;
    double beratCoklatPSN;
    
    @Override
    public void hitungBeratFilling() {
        this.beratCoklatPSN=this.beratCoklat*jumlahPesanan;
        System.out.println("Berat Coklat: "+beratCoklatPSN+" gr");
    }

    @Override
    public double hitungHargaFilling() {
        double hargaCoklat=(29000/500)*beratCoklatPSN;    
        return hargaCoklat;
    }
    
    public void tampilkan(){
        System.out.println("Roti Tawar Varian 1");
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
