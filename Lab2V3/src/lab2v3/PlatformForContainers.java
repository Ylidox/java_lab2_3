package lab2v3;
/**
 * Класс платформы для контейнера
 */
public class PlatformForContainers extends Wagon{
    
    public PlatformForContainers(){
        super(new Container(), "platformForContainer");
    }
    public PlatformForContainers(Container c){
        super(c, "platformForContainer");
    }
    
    public Product getContainer(){
        return this.getProduct();
    }
    public void setContainer(Container c){
        this.setProduct(c);
    }   
    public void setContainer(String name, double mass){
        this.setProduct("container", name, mass);
    }
}
