import java.security.PublicKey;

public abstract class  Car {

    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public Car(String vinNumber, String make, String model, int mileage){

    }


    public void getInfo() {
        System.out.println("getInfo(): un método que devuelve una String que contiene " +
                "todas las propiedades del automóvil en un formato legible");
    }



}
