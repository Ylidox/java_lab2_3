package Wagons;

import Products.*;

public class TankForBulkMaterials extends Wagon{
    private boolean isOpen;
    
    public TankForBulkMaterials(){
        super(new BulkMaterials(), "tankForBulkMaterials");
        isOpen = false;
    }
    public TankForBulkMaterials(BulkMaterials b, boolean isOpen){
        super(b, "tankForBulkMaterials");
        this.isOpen = isOpen;
    }
    
    public Product getBulkMaterials(){
        return this.getProduct();
    }
    public void setBulkMaterials(BulkMaterials b){
        this.setProduct(b);
    }
    
    public boolean getIsOpen(){
        return isOpen;
    }
    public void setIsOpen(boolean isOpen){
        this.isOpen = isOpen;
    }
    
    public void defineIsOpen(){
        String type = this.getBulkMaterials().getName();
        switch(type){
            case "зерно":
            case "сажа":
            case "цемент":
                isOpen = false;
                break;
            case "уголь":
            case "песок":
                isOpen = true;
                break;
                
        }
    }
//    public void setBulkMaterials(String name, double mass){
//        this.setProduct("bulkMaterials", name, mass);
//    }
}

