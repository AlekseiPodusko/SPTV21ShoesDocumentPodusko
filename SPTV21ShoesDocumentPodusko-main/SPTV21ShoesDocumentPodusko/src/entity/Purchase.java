package entity;

import java.io.Serializable;
import java.util.Date;

public class Purchase implements Serializable{
    private Product product;
    private Customer customer;
    private Date date;
    private int quantity;
    
    public Purchase() {
        
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Purchase{" + "product=" + product 
                + ", customer=" + customer 
                + ", date=" + date 
                + ", quantity=" + quantity 
                + '}';
    }

     

   
}
