/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kegiatan1b;

public class Yamaha extends motor{
    public String tahun;
    public String Warna;

    public String getTahun() {
        System.out.println("Tahun   :"+this.tahun);
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        System.out.println("Warna   :"+this.Warna);
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }
    
    public Yamaha(String brand, String bahanbakar, String Warna, String tahun){
        super(brand, bahanbakar);
        this.tahun= tahun;
        this.Warna = Warna;
        
    }
}