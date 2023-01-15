
package entity;

public class Product {
    private String productName;
    private int productPrice;
    private int productQuantity;
    
    public Product() {
    }

    public String getProductname() {
        return productName;
    }

    public void setProductname(String productname) {
        this.productName = productname;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductprice(int productprice) {
        this.productPrice = productprice;
    }
    public int getProductquantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productquantity) {
        this.productQuantity = productquantity;
    }

    @Override
    public String toString() {
        return "Product{" + 
                "productname=" + productName + 
                ", productprice=" + productPrice + 
                ", productquant=" + productQuantity +
                '}';
    }
    
}