package Products;
public class Container extends Product{
    double volume; // обьем
    public Container(){
        super("container", "name", 0);
        this.volume = 0;
    }
    public Container(Container c){
        super(c);
        this.volume = c.volume;
    }
    public Container(String name, double mass, double volume){
        super("container", name, mass);
        this.volume = volume;
    }
    public double getVolume(){
        return volume;
    }
    public void setVolume(double v){
        this.volume = v;
    }
}
