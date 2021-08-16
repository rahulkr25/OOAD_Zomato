package Helper;

import java.util.Date;
import java.util.ArrayList;

public class Order {
    private static int idcounter=0;
    private int id;
    private ArrayList<FoodItems>foodItems;
    private Date bookingdate;
    private float amount;
    private Customer customer;
    private DeliveryGuy deliveryGuy;
    public Order(ArrayList<FoodItems>foodItems,Date bookingtime,Customer customer,DeliveryGuy deliveryGuy, float amount)
    {
      this.id=idcounter++;
      this.customer=customer;
      this.bookingdate=bookingtime;
      this.deliveryGuy=deliveryGuy;
      this.foodItems=new ArrayList<>(foodItems);
      this.amount=amount;
    }
    public void setfoodItems(ArrayList<FoodItems>foodItems)
    {
        this.foodItems=foodItems;
    }
    public ArrayList<FoodItems>getfooditems()
    {
        return this.foodItems;
    }
    public void setamount(float amount)
    {
        this.amount=amount;
    }
    public float getamount()
    {
        return amount;
    }
    public void setcustomer(Customer customer)
    {
        this.customer=customer;
    }
    public Customer getcustomer()
    {
        return customer;
    }
    public void setdeliveryGuy(DeliveryGuy deliveryGuy)
    {
        this.deliveryGuy=deliveryGuy;
    }
    public DeliveryGuy getdeliveryGuy()
    {
        return deliveryGuy;
    }
    public void setorderdate(Date date)
    {
        this.bookingdate=date;
    }
    public Date getorderdate()
    {
        return bookingdate;
    }
}
