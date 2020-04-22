import java.util.Date;

public class Bicycle extends Item {
    public Bicycle (String name, String brand, int gear_num, int wheel_r, int price_p){
        this.name = name;
        this.gear_num = gear_num;
        this.wheel_r = wheel_r;
        this.price_p = price_p;
        this.price_r = price_p * WebMarket.m;
        this.date = new Date();
        this.brand = brand;
    }
    int gear_num;
    int wheel_r;
}
