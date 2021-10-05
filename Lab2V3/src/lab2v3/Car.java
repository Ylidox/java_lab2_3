package lab2v3;
/**
 * Класс автомобилей
 */
public class Car extends Product{
    private double maxSpeed;
    public Car(){
        super("car", "name", 0);
        maxSpeed = 0;
    }
    public Car(Car c){
        super(c);
        maxSpeed = c.maxSpeed;
    }
    public Car(String name, double mass, double maxSpeed){
        super("car", name, mass);
        this.maxSpeed = maxSpeed;
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(double speed){
        this.maxSpeed = speed;
    }
}
