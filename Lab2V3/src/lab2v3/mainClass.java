package lab2v3;
/**
 * Основной класс, запускающий программу
 * @author Aliev Artiom
 */
public class mainClass {


    public static void main(String[] args) {
//        WarehouseManager manager = new WarehouseManager();
//        manager.loadingProductsToWarehouse();
//        manager.loadingProductsFromWarehouseToTrain();
//
//        manager.hello();
//        manager.showTrain();
        Product[] ps = new Product[10];
        Car c = new Car("Ford", 1500, 130);
        ps[0] = c;
        
        if(ps[0] instanceof Car) System.out.println( ((Car) ps[0]).getMaxSpeed());
    }
    
}
