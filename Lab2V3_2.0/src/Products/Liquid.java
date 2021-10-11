package Products;
public class Liquid extends Product{
    
    private double density; // плотность
    
    public Liquid(){
        super("liquid", "name", 0);
        density = 0;
    }
    public Liquid(Liquid l){
        super(l);
        this.density = l.density;
    }
    public Liquid(String name, double mass, double density){
        super("liquid", name, mass);
        this.density = density;
    }
    
    public double getDensity(){
        return density;
    }
    public void setDensity(double den){
        this.density = den;
    }
}