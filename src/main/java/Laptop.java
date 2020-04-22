import java.util.Date;

public class Laptop extends Item {
    public Laptop (String name, String brand, int price_p, String proc, int ram){
        this.name = name;
        this.price_p = price_p;
        this.price_r = price_p * WebMarket.m;
        this.date = new Date();
        this.proc = proc;
        this.ram = ram;
        this.brand = brand;
    }
    String proc;
    int ram;
}
