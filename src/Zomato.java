import java.util.ArrayList;
import java.util.HashMap;

import Helper.Customer;
import Helper.DeliveryGuy;
import Helper.FoodItems;
import Helper.Menu;
import Helper.Order;
import Helper.Restaurant;
import Helper.Address;
import Helper.Cart;
public class Zomato {
    private static  ArrayList<Customer>allcustomer;
    private static ArrayList<DeliveryGuy>alldeliveryGuy;
    private static ArrayList<Restaurant>allrestaurants;
    private static HashMap<String,FoodItems>itemcatalog;
    public Zomato(ArrayList<Customer>customers,ArrayList<DeliveryGuy>deliveryGuys,ArrayList<Restaurant>restaurants)
    {
       this.allcustomer=customers;
        alldeliveryGuy=deliveryGuys;
       allrestaurants=restaurants;
       itemcatalog=new HashMap<>();
       generateitemcatalog();
    }
    public void generateitemcatalog()
    {
        for(Restaurant restaurant:allrestaurants)
        {
            for(FoodItems foodItems: restaurant.getallfooditems())
            {
                itemcatalog.put(foodItems.getmeal().toLowerCase(),foodItems);
            }
        }
    }
    public  void addRestaurant(Restaurant restaurant)
    {
        allrestaurants.add(restaurant);
    }
    public static void addcustomer(Customer customer)
    {
        allcustomer.add(customer);
    }
    public static void adddelivery(DeliveryGuy deliveryGuy)
    {
        alldeliveryGuy.add(deliveryGuy);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

       //->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Data Generation Code<<<<<<<<<<<<<<<<<<<<<<<<<<<-
        Customer rahul=new Customer("Rahul", new Address("Mahavir Chowk", "saharsa", "india"));
        Customer raju=new Customer("Raju", new Address("Koshi Medical", "saharsa", "india"));

        DeliveryGuy shyam=new DeliveryGuy("Shyam", new Address("Purab Bajar", "Saharsa", "India"));
        DeliveryGuy ramesh=new DeliveryGuy("Ramesh", new Address("Refugge Colony", "Saharsa", "India"));

        FoodItems maggi=new FoodItems("Maggi", "Spicy and Delicious", 45.00);
        FoodItems kachori=new FoodItems("Kachori", "Krispy ", 25.00);
        FoodItems BreadCutlet=new FoodItems("BreadCutlet", "Spicy and Hot", 65.00);
        FoodItems sandwich=new FoodItems("Sandwich", "Spicy and Delicious", 35.00);
        FoodItems dosha=new FoodItems("Dosha", "Spicy and Delicious", 25.00);
        FoodItems idli=new FoodItems("Idly-sambhar", "Soft ", 45.00);
        FoodItems momos=new FoodItems("Momos", "Spicy and Hot", 65.00);
        FoodItems gulabjamun=new FoodItems("GulabJamun", "Sweet", 35.00);
        FoodItems choumean=new FoodItems("Choumean", "Spicy and Delicious", 65.00);

        Restaurant bijiyea=new Restaurant("Bijiyea", "Prashant Mor", new Menu());
        momos.registerrestaurant(bijiyea);
        choumean.registerrestaurant(bijiyea);
        idli.registerrestaurant(bijiyea);

        Restaurant rajasthansweets=new Restaurant("Rajashtan Sweets", "Mahavir Chowk", new Menu());
        gulabjamun.registerrestaurant(rajasthansweets);
        kachori.registerrestaurant(rajasthansweets);
        maggi.registerrestaurant(rajasthansweets);

        Restaurant alokpaneer=new Restaurant("Alok Paneer", "D.B Road", new Menu());
         BreadCutlet.registerrestaurant(alokpaneer);
         dosha.registerrestaurant(alokpaneer);
         sandwich.registerrestaurant(alokpaneer);

         
           
////////////////////////////////////////////////////////////////////////////////////////////
        ArrayList<Customer>customers=new ArrayList<>();
        customers.add(rahul);
        customers.add(raju);
        ArrayList<DeliveryGuy>deliveryGuys=new ArrayList<>();
        deliveryGuys.add(ramesh);
        deliveryGuys.add(shyam);
        ArrayList<Restaurant> restaurants=new ArrayList<>();
        restaurants.add(bijiyea);restaurants.add(rajasthansweets);
        Zomato zomato=new Zomato(customers, deliveryGuys, restaurants);
        zomato.addRestaurant(alokpaneer);


        // Rahul is searching for momos
        FoodItems foodItems= itemcatalog.get("momos");
        //Rahul added below items in his cart
        
        rahul.addItemtoCart(foodItems);
        
        rahul.addItemtoCart(itemcatalog.get("gulabjamun"));
        // the items in his cart
        rahul.printCartItems();
        //placed the order
        rahul.placeOrder(shyam);

      //all customers we have till know
       for(Customer customer:allcustomer)
       {
           System.out.println(customer.getname()+" "+customer.getAdress().getlocation());
       }
       //all delivery guys we have till know
       for(DeliveryGuy deliveryGuy:alldeliveryGuy)
       {
           System.out.println(deliveryGuy.getname()+" "+deliveryGuy.getAdress().getlocation());
       }
       // printing all the order history of rahul
       for(Order order:rahul.getOrderHistory())
       {
           for(FoodItems foodItems2:order.getfooditems())
           {
                System.out.print(foodItems2.getmeal()+" "+foodItems2.getcost()+ " " );
           }
       }




    }
}
