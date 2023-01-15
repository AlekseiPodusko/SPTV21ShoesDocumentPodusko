
package manager;
import entity.Product;

import java.util.Scanner;
public class ProductManager {
    private Scanner scanner;

    public ProductManager() {
        scanner = new Scanner(System.in);
    }
    public Product createProducts(){
        System.out.print("Введите название продукта: " );
        String productname= scanner.nextLine();
        System.out.print("Введите ценну продукта: ");
        int productprice=scanner.nextInt(); scanner.nextLine(); 
        System.out.print("Введите количество продукта: ");
        int productQuantity=scanner.nextInt(); scanner.nextLine(); 
        Product product= createProduct(productname,productprice,productQuantity);
        return product;
    }
    public Product createProduct(String productname,int productprice,int productquantity){
        Product product= new Product();
        product.setProductname(productname);
        product.setProductprice(productprice);
        product.setProductQuantity(productquantity);
      
        return product;
    }
    public void printListProducts(Product[] products){
        for (int i=0; i<products.length;i++){
            System.out.println(i+1+". Название: "+products[i].getProductname()+", Ценна: "+products[i].getProductPrice()+", Количество: "+products[i].getProductquantity());
        }
        System.out.println();
        
    }
}