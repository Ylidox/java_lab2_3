package Wagons;

import Products.*;
public class Tank extends Wagon{
    
    double volume; // обьем
    
    public Tank(){
        super(new Liquid(), "tank");
        this.volume = 0;
    }
    public Tank(Liquid l, double volume){
        super(l, "tank");
        this.volume = volume;
    }
    
    public Product getLiquid(){
        return this.getProduct();
    }
    public void setLiquid(Liquid l){
        this.setProduct(l);
    }
    
    public double getVolume(){
        return volume;
    }
    public void setVolume(double v){
        this.volume = v;
    }
//    public void setLiquid(String name, double mass){
//        this.setProduct("liquid", name, mass);
//    }
}
