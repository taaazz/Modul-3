/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kegiatan1b;

public class honda extends motor{
    public String Warna;

    public String getWarna() {
        System.out.println("Warna   :"+this.Warna);
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna= Warna;
    }
    public honda( String brand, String bahanbakar, String Warna){
        super (brand, bahanbakar);
        this.Warna= Warna;
    }
   
}