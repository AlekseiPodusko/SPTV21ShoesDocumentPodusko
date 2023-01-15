package manager;


import entity.Product; //book
import entity.Customer; //Reader

import java.io.*;

public class DataManager {
    private final String PRODUCT_FILE = "files/PRODUCT";
    private final String CUSTOMER_FILE = "files/CUSTOMER";

    public DataManager(){
        File file = new File("files");
        file.mkdirs();
    }

    public void saveProduct(Product[] products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PRODUCT_FILE );
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            System.out.println("Нет файла PRODUCT");
        } catch (IOException e) {
            System.out.println("Ошибка Ввода Вывода");
        }
    }
    public Product[] loadProduct() {
        Product[] products = new Product[0];
        try {
            FileInputStream fileInputStream = new FileInputStream(PRODUCT_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (Product[]) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Нет файла Product");
        } catch (IOException e) {
            System.out.println("Ошибка Ввода Вывода");
        } catch (ClassNotFoundException e) {
            System.out.println("Не найден класс");
        }
        return products;
    }

    public void saveCustomer(Customer[] customers) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(CUSTOMER_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(customers);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            System.out.println("Нет файла CUSTOMER");
        } catch (IOException e) {
            System.out.println("Ошибка Ввода Вывода");
        }
    }
    public Customer[] loadCustomer() {
        Customer[] customers = new Customer[0];
        try {
            FileInputStream fileInputStream = new FileInputStream(CUSTOMER_FILE);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            customers = (Customer[]) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Нет файла CUSTOMER");
        } catch (IOException e) {
            System.out.println("Ошибка Ввода Вывода");
        } catch (ClassNotFoundException e) {
            System.out.println("Не найден класс");
        }
        return customers;
    }




}