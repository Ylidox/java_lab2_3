package Products;

public class BulkMaterials extends Product{
    double fireHazard; // пожароопасность
    
    public BulkMaterials(){
        super("bulk materials", "name", 0);
        this.fireHazard = 0;
    }
    public BulkMaterials(BulkMaterials b){
        super(b);
        this.fireHazard = b.fireHazard;
    }
    public BulkMaterials(String name, double mass, double fireHazard){
        super("bulk materials", name, mass);
        this.fireHazard = fireHazard;
    }

    public double getFireHazard(){
        return fireHazard;
    }
    public void setFireHazard(double fh){
        this.fireHazard = fh;
    }
}

