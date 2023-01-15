package manager;
import entity.Purchase;
import entity.Product;
import entity.Customer;
import java.util.GregorianCalendar;
import manager.CustomerManager;
import manager.ProductManager;
import java.util.Scanner;


public class PurchaseManager {
    private final Scanner scanner;
    private CustomerManager customerManager;
    private ProductManager productManager;
    
    public PurchaseManager(){
        scanner= new Scanner(System.in);
        customerManager = new CustomerManager();
        productManager = new ProductManager();
        
    }
    public Purchase Buy( Customer[] customers,Product[] products){
        System.out.println("Список покупателей: ");
        customerManager.printListCustomers(customers);
        System.out.print("Выбирите покупателя: ");
        int numberCustomer=scanner.nextInt(); scanner.nextLine();
        System.out.println("Список товаров: ");
        productManager.printListProducts(products);
        System.out.print("Выберите номер товара; ");
        int numberProduct=scanner.nextInt();scanner.nextLine();
        System.out.print("Выберите количество экземляров товара; ");
        int quantity=scanner.nextInt();scanner.nextLine();
        
        int priceProduct=products[numberProduct-1].getProductPrice();
        int customerCash=customers[numberCustomer-1].getCustomerCash();
        int quantityProduct=products[numberProduct-1].getProductquantity();
       
        if (quantityProduct<=0){
            System.out.println("Товара нету, увы!");
            return null;
        }
        if (priceProduct*quantity>customerCash){
            System.out.println("У вас не хватило денег!");
            return null;
        }
        if (quantityProduct>01){
            quantityProduct--;
            products[numberProduct-1].setProductQuantity(quantityProduct);
        }
        Purchase purchase= new Purchase();
        customers[numberCustomer-1].setCustomerCash(customers[numberCustomer-1].getCustomerCash()- products[numberProduct-1].getProductPrice()*quantity);
        purchase.setCustomer(customers[numberCustomer-1]);
        purchase.setProduct(products[numberProduct-1]);
        purchase.setQuantity(quantity);
        purchase.setDate(new GregorianCalendar().getTime());
        return purchase;
         
    }
    public void allSale(Purchase[] purchases){
        int sum=0;
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase = purchases[i];
            sum += purchase.getProduct().getProductPrice()*purchase.getQuantity();
        }
        System.out.printf("Общая сумма покупок за рабочее время: %d EUR",sum);
        System.out.println();
    }
       
}
