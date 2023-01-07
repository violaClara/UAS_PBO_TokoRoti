# UAS PBO Perhitungan Toko Roti

Berisi perhitungan untuk menentukan jumlah berat dan harga jual roti.<br>
Dibuat oleh: <br>
K3521009 - Anna Sanya Khazanah <br>
K3521027 - Ferdhian Surya Rajasa <br>
K3521049 - Muhammad Agung Nugroho <br>
K3521067 - Viola Clara Citra Pramesti
<br>
<h1>Package</h1>
<h3><a href="TokoRoti/src/abstraksi/">abstraksi</a></h3>berisi file abstract class berupa <b>Adonan.java</b> yang memuat <i>atribut</i> berat bahan adonan, jumlah pesanan, <i>abstract method</i> untuk di override berupa hitungBeratBahan(), <i>method biasa</i> hitungHargaBahan()
  <h3><a href="TokoRoti/src/interfaces/">interfaces</a></h3>berisi interfaces berupa <b>Filling.java</b> yang memuat abstract method hitungBeratFilling(), hitungHargaFilling() dan <b>Topping.java</b> yang memuat abstract method hitungBeratTopping(), hitungHargaTopping()
  <h3><a href="TokoRoti/src/kelas/">kelas</a></h3> berisi file <b>RotiManis.java, RotiPizza.java, RotiTawar.java</b> yang merupakan subclass dari abstract class Adonan.java masing-masing berisi <i>override method hitungBeratBahan</i>
  <h3><a href="TokoRoti/src/varian/">varian</a></h3>berisi file subclass-subclass <b>RotiManisVarian1.java, RotiManisVarian2.java, RotiManisVarian3.java, RotiTawarVarian1.java, RotiTawarVarian2.java</b> dari file-file pada package kelas yang mengimplementasikan interface yang dibutuhkan.
  <h3><a href="TokoRoti/src/tokoroti/">tokoroti</a></h3>berisi file main class <b>TokoRoti.java</b> yang digunakan untuk melakukan instansiasi objek dari file pada package varian.
  
 <h1>Diagram</h1>
<img src="DiagramTokoRotiJava.jpg" alt="Alt text" title="Optional title">
