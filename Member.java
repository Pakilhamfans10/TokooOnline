
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Member implements User {
ArrayList<String> namaMember = new ArrayList<String>();    
ArrayList<String> Alamat = new ArrayList<String>();
ArrayList<String> Telpon = new ArrayList<String>();
ArrayList<Integer> saldo = new ArrayList<Integer>();


public Member(){
    this.namaMember.add("odi");
    this.Alamat.add("sawojajar");
    this.Telpon.add("08813373340");
    this.saldo.add(10000);
    
    this.namaMember.add("abi");
    this.Alamat.add("sawojojor");
    this.Telpon.add("081348170244");
    this.saldo.add(20000);
    
}
    
 public void setSaldo(int saldo){
 this.saldo.add(saldo);
 }
 public int getSaldo(int idMember){
 return this.saldo.get(idMember);
 }
 public void editSaldo(int idMember, int saldo){
 this.saldo.set(idMember, saldo);;
 }
 public int getJmlMember(){
 return this.saldo.size();
 
 
 }
 
    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
       
    }

    @Override
    public void setAlamat(String alamat) {
     this.Alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.Telpon.add(telepon);
    }

    @Override
    public String getNama(int idMember) {
     return this.namaMember.get(idMember);
    }

    @Override
    public String getAlamat(int idMember) {
        return this.Alamat.get(idMember);
    }

    @Override
    public String getTelepon(int idMember) {
        return this.Telpon.get(idMember);
    }
   
}



   

  

