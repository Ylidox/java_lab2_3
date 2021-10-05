package lab2v3;
/**
 * Класс, описывающий взаимодействие состава и склада
 */
public class WarehouseManager {
    private final Train train;
    private final ProductWarehouse warehouse;
    private final TableManager tm;
    public WarehouseManager(){
        train = new Train();
        warehouse = new ProductWarehouse();
        tm = new TableManager(); 
    }
    /**
     * Метод загрузки товара в склад
     * @param p 
     */
    private void loadingProductToWarehouse(Product p){
        warehouse.addProduct(p);
    }
    /**
     * Метод загрузки товаров в склад
     */
    public void loadingProductsToWarehouse(){
        loadingProductToWarehouse(new Liquid("нефть", 73300));
        loadingProductToWarehouse(new Liquid("дизельное топливо", 73300));
        loadingProductToWarehouse(new Liquid("мазут", 73300));
        loadingProductToWarehouse(new BulkMaterials("зерно", 76000));
        loadingProductToWarehouse(new BulkMaterials("уголь", 76000));
        loadingProductToWarehouse(new BulkMaterials("песок", 76000));
        loadingProductToWarehouse(new Container("CP-2001", 5000));
        loadingProductToWarehouse(new Container("QW-1207", 3000));
        loadingProductToWarehouse(new Car("Ford", 2300, 120));
        loadingProductToWarehouse(new Car("Nissan", 1500, 150));
    }
    /**
     * Загрузка вагона поезда тем или иным видом продукции
     * @param p 
     */
    public void loadingWagon(Product p){
        if(p instanceof Car) train.addWagon((Car) p);
        else train.addWagon(p);
    }
    /**
     * Метод загрузки товаров со склада в состав
     */
    public void loadingProductsFromWarehouseToTrain(){
        Product[] products = warehouse.getProducts();
        for(int i = products.length - 1; i >= 0; i--){
            if(products[i] instanceof Car) this.loadingWagon( (Car) products[i]);
            else this.loadingWagon(products[i]);
            warehouse.pop();
        }
        
    }
    /**
     * Отображение данных склада
     */
    public void showWarehouse(){
        tm.showWarehouse(warehouse);
    }
    /**
     * Отображение данных поезда
     */
    public void showTrain(){
        tm.showTrain(train);
    }
    /**
     * Отображает паровозик в консоль
     */
    public void hello(){
        tm.hello();
    }
}
