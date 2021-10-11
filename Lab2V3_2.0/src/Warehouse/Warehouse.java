
package Warehouse;

import Products.*;

/**
 * Класс, описывающий поведение склада
 */
public class Warehouse {
    private Product[] products;
    
    public Warehouse(){
        this.products = new Product[0];
    }
    public Warehouse(Product[] c){
        this.products = c;
    }
    
    /**
     * Метод добавления продукта в массив продуктов
     * @param p 
     */
    public void addProduct(Product p){
        
        int len = this.products.length;
        this.increaseSize();
        this.products[len] = p;
    }
    
    public Product[] getProducts(){
        return products;
    }
    /**
     * Метод увеличения размера массива продукта
     */
    private void increaseSize(){
        Product[] newArr = new Product[this.products.length + 1];
        System.arraycopy(products, 0, newArr, 0, this.products.length);
        products = newArr;
    }
    /**
     * Метод уменьшения размера массива, удаляется самый правый элемент
     */
    public void pop(){
        Product[] newArr = new Product[this.products.length - 1];
        System.arraycopy(products, 0, newArr, 0, this.products.length - 1);
        products = newArr;
    }
    public void deleteListProducts(){
        this.products = new Product[0];
    }
}

