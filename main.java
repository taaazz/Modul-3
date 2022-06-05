/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kegiatan1b;

public class main{
    public static void main(String[] args){
        
        System.out.println("Macam- macam Motor");
        
        suzuki z = new suzuki("Satria", "pertalite");
        z.show();
        z.spasi();
 
        honda h = new honda("Scoopy", "pertamax", "gold");
        h.show();
        h.getWarna();
        h.spasi();
        
        Yamaha y = new Yamaha("Mio", "Premium", "white", "2019");
        y.show();
        y.getWarna();
        y.getTahun();
        y.spasi();
        
    }
}
