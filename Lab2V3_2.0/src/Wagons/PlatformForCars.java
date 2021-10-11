package Wagons;
import Products.*;
public class PlatformForCars extends Wagon{
    private double maximumLoad;
    
    public PlatformForCars(){
        super(new Car(), "platformForCar");
        this.maximumLoad = 0;
    }
    public PlatformForCars(Car c, double maxLoad){
        super(c, "platformForCar");
        this.maximumLoad = maxLoad;
    }
    
    public Product getCar(){
        return this.getProduct();
    }
    public void setCar(Car c){
        this.setProduct(c);
    }
    
    public double getMaximumLoad(){
        return maximumLoad;
    }
    public void setMaximumLoad(double ml){
        this.maximumLoad = ml;
    }
//    public void setCar(String name, double mass){
//        this.setProduct("car", name, mass);
//    }
}
