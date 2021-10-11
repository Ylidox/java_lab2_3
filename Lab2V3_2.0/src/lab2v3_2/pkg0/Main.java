package lab2v3_2.pkg0;
import WarehouseManager.WarehouseManager;

public class Main {

    public static void main(String[] args) {
        WarehouseManager manager = new WarehouseManager();
        manager.loadingProductsToWarehouse();
        manager.loadingProductsFromWarehouseToTrain();

        manager.hello();
        manager.showTrain();
    }
    
}
