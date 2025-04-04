import java.math.BigDecimal;
import java.math.RoundingMode;

import vehicles.Car;
import vehicles.Sedan;
import vehicles.Truck;
import vehicles.UtilityVehicle;
import video.Movie;
import video.TvSeries;

public class Main {

    public static void main(String[] args) {
       //Ejercicio 1.1
        BigDecimal number = new BigDecimal("4.2545");
        //decimalDouble(number);

        //Ejercicio 1.2
        //creamos numeros bigdecimal
        BigDecimal number1 = new BigDecimal("1.2345");
        BigDecimal number2 = new BigDecimal("-45.67");
//      invertirSigno(number1);
//      invertirSigno(number2);

        //Ejercicio 2. Sistema de Inventario de vehículos.
        //inventarioVehiculos();

        //Ejercicio 3. Servicio de transmision de video.
        playVideo();



    }

    //Ejercicio 1.1
    public static double decimalDouble(BigDecimal number){
        System.out.println("Ejercicio 1.1, utilizando BigDecimal");
        BigDecimal roundedNumber = number.setScale(2, RoundingMode.HALF_UP);
        double result = roundedNumber.doubleValue();
        System.out.println("Resultado redondeado y pasado a double: " + result + "\n");
        return result;
    }

    //Ejercicio 1.2
    public static double invertirSigno(BigDecimal number){
        System.out.println("Ejercicio 1.2, utilizando BigDecimal");
        BigDecimal invertedNumber = number.negate();
        BigDecimal roundedNumber = invertedNumber.setScale(1, RoundingMode.HALF_UP);
        double result = roundedNumber.doubleValue();
        System.out.println("Redondeamos invirtiendo el numero: " + roundedNumber);
        return result;
    }

    //Ejercicio 2. Inventario de coche.
    public static void inventarioVehiculos(){
        System.out.println("\nEjercicio 2. Sistema de inventarios de coches.");

        Sedan sedan1 = new Sedan("98427823", "Turismo", "SDI", 10000);
        UtilityVehicle utilityVehicle1 = new UtilityVehicle("213124", "Patro" , "todocamino", 40000, true );
        Truck truck1 = new Truck("1123124", "superTruck", "4X4", 2000, 2);

        sedan1.getInfo();
        utilityVehicle1.getInfo();
        truck1.getInfo();
    }

    //Ejercicio 3. Servicio de transmision de video.
    public static void playVideo(){
        System.out.println("\nEjercicio 3. Sistema de reproducción de video.");

        TvSeries tvSeries1 = new TvSeries("Crepusculo", 45, 137 );
        Movie movie1 = new Movie("Los Juegos del Hambre", 150, 7.8);

        tvSeries1.getInfo();
        movie1.getInfo();

    }


}

