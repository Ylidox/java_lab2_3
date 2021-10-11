package Wagons;
import Products.*;
        
public class PlatformForContainers extends Wagon{
    private double maximumLoad;
    
    public PlatformForContainers(){
        super(new Container(), "platformForContainer");
        this.maximumLoad = 0;
    }
    public PlatformForContainers(Container c, double maxLoad){
        super(c, "platformForContainer");
        this.maximumLoad = maxLoad;
    }
    
    public Product getContainer(){
        return this.getProduct();
    }
    public void setContainer(Container c){
        this.setProduct(c);
        
    }
    
    public double getMaximumLoad(){
        return maximumLoad;
    }
    public void setMaximumLoad(double ml){
        this.maximumLoad = ml;
    }
    
//    public void setContainer(String name, double mass){
//        this.setProduct("container", name, mass);
//    }

}
