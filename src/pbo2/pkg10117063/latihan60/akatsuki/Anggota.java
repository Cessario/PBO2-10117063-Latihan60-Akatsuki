/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan60.akatsuki;

/*
Nama : Cessario Sheva L.P.A
Nim  : 10117063
Kelas: IF-2
Deskripsi Program : Menampilkan Anggota Akatsuki
 */
public class Anggota extends Akatsuki{
    private String senjata;
    private String target;

    public Anggota(String senjata, String target, String asalDesa, String Nama, String Cincin, String Jutsu, String Tim, String ciriKhas, String Role) {
        super(asalDesa, Nama, Cincin, Jutsu, Tim, ciriKhas, Role);
        this.senjata = senjata;
        this.target = target;
        
        
        System.out.println("Nama anggota : " +Nama);
        System.out.println("Asal desa anggota : " +asalDesa);
        System.out.println("Cincin : " +Cincin);
        System.out.println("Jutsu : " +Jutsu);
        System.out.println("Tim : " +Tim);
        System.out.println("Ciri-Ciri : " +ciriKhas);
        System.out.println("Role : " +Role);
        System.out.println("Senjata : " +senjata);
        System.out.println("Target : " +target);
        System.out.println("==================================================================");
    }

    public String getSenjata() {
        return senjata;
    }

    public void setSenjata(String senjata) {
        this.senjata = senjata;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }


        
       
    }


    
    
    
    

