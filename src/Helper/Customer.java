package Helper;

import java.util.ArrayList;
import java.util.Date;

public class Customer extends User{
    private ArrayList<Order>orderdetails;
    private Cart cart;
    
    public Customer(String name, Address address) {
        super(name, address);
        this.cart=new Cart();
        this.orderdetails=new ArrayList<>();
         
    }
    
    public void addItemtoCart(FoodItems foodItems)
    {
       this.cart.addfooditems(foodItems);
    }
    public void printCartItems(){
        for(FoodItems foodItems:cart.getfooditems())
        {
            System.out.println(foodItems.getmeal()+" "+foodItems.getcost());
        }
    }
    public void placeOrder(DeliveryGuy deliveryGuy){
         
        float amount = 0;
        for(FoodItems item : this.cart.getfooditems()){
            amount += item.getcost();
        }
        Order currentOrder = new Order(this.cart.getfooditems(), new Date(), this,deliveryGuy , amount);
        this.orderdetails.add(currentOrder);
        deliveryGuy.addorder(currentOrder);
        this.cart.checkout();
        System.out.println(currentOrder.getcustomer().getname()+ " "+currentOrder.getamount()+" "+orderdetails.size());
        System.out.println("Order Successfull");
    }

    public ArrayList<Order> getOrderHistory() {
        return this.orderdetails;
    }

     
}

