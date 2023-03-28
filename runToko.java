/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class runToko {
    public static void main(String[] args) {
        
    
  Member member = new Member();
  Barang barang = new Barang();
  Laporan laporan = new Laporan();
  Transaksi transaksi = new Transaksi();
  Karyawan karyawan = new Karyawan();
  
  
 laporan.laporan(barang);
 laporan.laporan(member);
 laporan.laporan(transaksi, barang);
 laporan.laporan(karyawan);
          

 

}
}