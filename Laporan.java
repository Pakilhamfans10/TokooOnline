/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Laporan {
   

 public void laporan(Barang barang){
 int x=barang.getJmlBarang();

 System.out.println();
 System.out.println("Tabel Barang");
 System.out.println();
 System.out.println("Nama Barang \tStok \tHarga");
 for (int i = 0; i < x; i++) {
 System.out.println(barang.getNamaBarang(i)+"\t"+
 barang.getStok(i)+"\t"+barang.getHarga(i));
 }
 }
 public void laporan(Member member){
 int x=member.getJmlMember();

 System.out.println();
 System.out.println("Tabel Member");
 System.out.println();
 System.out.println("Nama \tAlamat \t\tTelepon \tSaldo");
 for (int i = 0; i < x; i++) {
 System.out.println(member.getNama(i)+"\t"+
 member.getAlamat(i)+"\t"+member.getTelepon(i)+"\t"+
 member.getSaldo(i));
 }
 }
 public void laporan(Karyawan karyawan){
     int x=karyawan.getJmlKaryawan();
     
     System.out.println("");
     System.out.println("tabel karyawan");
     System.out.println("");
     System.out.println("Nama \tAlamat \t\tTelpon \tSaldo");
     for (int i = 0; i < x; i++) {
         System.out.println(karyawan.getNama(i)+"\t"+
                 karyawan.getAlamat(i)+"\t"+karyawan.getTelepon(i)+"\t"+
                 karyawan.getJabatan(i));
         
     }
 }

 public void laporan(Transaksi transaksi, Barang barang){
 int x=transaksi.getJmlTransaksi();

 System.out.println();
 System.out.println("Laporan Transaksi");
 System.out.println();
 System.out.println("Nama Barang\tQty \tHarga \tJumlah");

 int total=0;
 for (int i = 0; i < x; i++) {
 int
jumlah=transaksi.getBanyaknya(i)*barang.getHarga(transaksi.getIdBarang(i));
 total+=jumlah;

System.out.println(barang.getNamaBarang(transaksi.getIdBarang(i))+"\t"+

transaksi.getBanyaknya(i)+"\t"+barang.getHarga(transaksi.getIdBarang(i))+"\t"
+
 jumlah);
 }
 System.out.println("Total Omset ="+total);
 }
}
 

 
 


