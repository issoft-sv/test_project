import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class Cart {
    public static double sum;
    HashMap<Integer, String> Cart = new HashMap();
    /*Gson gson = new Gson();*/
    public void addtocart (int num, Item item){
            Cart.put(num, item.name+item.brand);
            sum = sum + item.price_r;
            System.out.println(item.name+item.brand+" added to cart");
            /*try {
                gson.toJson(this, new FileWriter("D:\\json\\file.json"));
            }
            catch (Exception e)
            {
                System.out.println("Exception has been caught");
            }*/
    }
    public void showcart (){
        System.out.print("Your cart: ");
        System.out.println(Cart);
        System.out.println("Total: "+sum);
        /*try {
            HashMap<Integer, String> cart1 = gson.fromJson(new FileReader("D:\\json\\file.json"), HashMap.class);
            System.out.print("Your cart: ");
            System.out.println(cart1);
            System.out.println("Total: "+sum);
        }
        catch (Exception e)
        {
            System.out.println("Exception has been caught");
        }*/

    }
    public void delfromcart (int num, Item item) {
        sum = sum - item.price_r;
        System.out.println(item.name+item.brand+" removed from cart");
        Cart.remove(num);

    }
}
