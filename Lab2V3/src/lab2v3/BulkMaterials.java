package lab2v3;
/**
 * Класс сыпучих материалов
 */
public class BulkMaterials extends Product{
    
    public BulkMaterials(){
        super("bulk materials", "name", 0);
    }
    public BulkMaterials(BulkMaterials b){
        super(b);
    }
    public BulkMaterials(String name, double mass){
        super("bulk materials", name, mass);
    }

}
