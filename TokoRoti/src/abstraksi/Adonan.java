/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraksi;

/**
 *
 * @author DELL
 */
public abstract class Adonan {
    public double beratTepungPSN;
    public double beratGulaPSN; 
    public double beratButterPSN;
    public double beratRagiPSN;
    public double beratSusuBubukPSN;
    public double beratSusuCairPSN;
    public double beratTelurPSN;
    public double beratEsBatuPSN;
    
    public int jumlahPesanan;
    
 
    
    public abstract void hitungBeratBahan();
    public double hitungHargaBahan(){
       double hargaTepung=(40000/1000)*this.beratTepungPSN;
       double hargaGula=(25000/1000)*this.beratGulaPSN;
       double hargaButter=(23000/500)*this.beratButterPSN;
       double hargaRagi=(5000/11)*this.beratRagiPSN;
       double hargaSusuBubuk=(39000/1000)*this.beratSusuBubukPSN;
       double hargaSusuCair=(24000/1000)*this.beratSusuCairPSN;
       double hargaTelur=(23000/1000)*this.beratTelurPSN;
       double hargaEsBatu=(2000/1000)*this.beratEsBatuPSN;
       
       double hargaBahan=hargaTepung+hargaGula+hargaButter+hargaRagi+hargaSusuBubuk+hargaSusuCair+hargaTelur+hargaEsBatu;
       return hargaBahan;
    }
 
}
