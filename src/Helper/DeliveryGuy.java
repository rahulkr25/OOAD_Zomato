package Helper;

import java.util.ArrayList;

public class DeliveryGuy extends User{

    private ArrayList<Order>orderdetails;
   public DeliveryGuy(String name, Address address) {
        super(name, address);
        this.orderdetails=new ArrayList<>();
    }
    public ArrayList<Order> getorder()
    {
        return orderdetails;
    }
    public void addorder(Order order)
    {
        orderdetails.add(order);
    }
    
}
