import com.google.gson.Gson;

import java.io.FileWriter;
import java.util.Scanner;

public class WebMarket {
    public static double m = 1.2;
    public static void main(String[] args){
        Bicycle b1 = new Bicycle("Bicycle ","Specialized", 3, 30, 100);
        Bicycle b2 = new Bicycle("Bicycle ","LTD", 4, 28, 120);
        Laptop l1 = new Laptop("Laptop ", "Dell",100, "Intel Core i5", 4);
        Laptop l2 = new Laptop("Laptop ","HP", 150, "Intel core i7", 16);
        System.out.println("In our store you can purchase the following products:");
        System.out.println("1-"+b1.name+b1.brand+" Gears number: "+b1.gear_num+" Wheel radius: "+b1.wheel_r+" Retail price: "+b1.price_r);
        System.out.println("2-"+b2.name+b2.brand+" Gears number: "+b2.gear_num+" Wheel radius: "+b2.wheel_r+" Retail price: "+b2.price_r);
        System.out.println("3-"+l1.name+l1.brand+" Processor: "+l1.proc+" RAM: "+l1.ram+" Retail price: "+l1.price_r);
        System.out.println("4-"+l2.name+l2.brand+" Processor: "+l2.proc+" RAM: "+l2.ram+" Retail price: "+l2.price_r);
        System.out.println("To add an item to the cart enter the item number");
        System.out.println("To view the contents of the cart enter 0");
        System.out.println("To remove an item from the cart enter the item number + 0");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the item number to add to the cart: ");
        Cart cart = new Cart();
        while (1>0) {
            int num = in.nextInt();
            if (num == 1) cart.addtocart(num, b1);
            else if (num == 2) cart.addtocart(num, b2);
            else if (num == 3) cart.addtocart(num, l1);
            else if (num == 4) cart.addtocart(num, l2);
            else if (num == 0) cart.showcart();
            else if (num == 10) cart.delfromcart(num/10, b1);
            else if (num == 20) cart.delfromcart(num/10, b2);
            else if (num == 30) cart.delfromcart(num/10, l1);
            else if (num == 40) cart.delfromcart(num/10, l2);
            else {
                System.out.println("You entered an invalid combination of numbers, the program will be finished");
                break;
            }
        }
        /*in.close();*/
    }
    
}
