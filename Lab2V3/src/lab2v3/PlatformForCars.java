package lab2v3;
/**
 * Класс Платформы для автомобиля
 */
public class PlatformForCars extends Wagon{
    
    public PlatformForCars(){
        super(new Car(), "platformForCar");
    }
    public PlatformForCars(Car c){
        super(c, "platformForCar");
    }
    
    public Product getCar(){
        return this.getProduct();
    }
    public void setCar(Car c){
        this.setProduct(c);
//        this.getProduct().set
    }
    public void setCar(String name, double mass){
        this.setProduct("car", name, mass);
    }
}
