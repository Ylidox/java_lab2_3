package WarehouseManager;

import Train.Train;
import Warehouse.Warehouse;
import TableManager.TableManager;
import Products.*;
import Wagons.*;

public class WarehouseManager {
    private Train train;
    private Warehouse warehouse;
    private TableManager tm;
    public WarehouseManager(){
        train = new Train();
        warehouse = new Warehouse();
        tm = new TableManager();
    }
    
    public void loadingProductsToWarehouse(){
        warehouse.addProduct(new Liquid("нефть", 73300, 1040));
        warehouse.addProduct(new Liquid("дизельное топливо", 73300, 860));
        warehouse.addProduct(new Liquid("мазут", 73300, 890));
        warehouse.addProduct(new BulkMaterials("зерно", 76000, 0.2));
        warehouse.addProduct(new BulkMaterials("уголь", 76000, 0.4));
        warehouse.addProduct(new BulkMaterials("песок", 76000, 0));
        warehouse.addProduct(new Container("CP-2001", 5000, 33.9));
        warehouse.addProduct(new Container("QW-1207", 3000, 20));
        warehouse.addProduct(new Car("Ford", 2300, 190));
        warehouse.addProduct(new Car("Nissan", 1500, 220));
    }
    public void loadingWagon(Product p){
        train.addWagon(p);
    }
    
    public void loadingProductsFromWarehouseToTrain(){
        Product[] products = warehouse.getProducts();
        for(int i = products.length - 1; i >= 0; i--){
            this.loadingWagon(products[i]);
        }
        warehouse.deleteListProducts();
    }
    
    public void showWarehouse(){
        tm.showWarehouse(warehouse);
    }
    
    public void showTrain(){
        tm.showTrain(train);
    }
    
    public void hello(){
        tm.hello();
    }
}
