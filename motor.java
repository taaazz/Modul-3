
package kegiatan1b;

public class motor {
    public String brand ;
    public String bahanbakar;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBahanbakar() {
        return bahanbakar;
    }

    public void setBahanbakar(String bahanbakar) {
        this.bahanbakar = bahanbakar;
    }
    public motor(String brand, String bahanbakar){
        this.brand = brand;
        this.bahanbakar = bahanbakar;
    }
void show(){
        System.out.println("Nama        : "+this.getBrand());
        System.out.println("Bahan Bakar : " +this.getBahanbakar());
}

void spasi(){
     System.out.println("");
}
}









