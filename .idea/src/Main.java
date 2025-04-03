import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio 1.1, utilizando BigDecimal");
        BigDecimal number = new BigDecimal("4.2545");

        //decimalDouble(number);

        System.out.println("Ejercicio 1.2, utilizando BigDecimal");
        //creamos numeros bigdecimal
        BigDecimal number1 = new BigDecimal("1.2345");
        BigDecimal number2 = new BigDecimal("-45.67");

        //llamamos al metodo invertirSigno.(negate)
//        invertirSigno(number1);
//        invertirSigno(number2);

        System.out.println("\nSistema de inventarios de coches.");


    }

    //Ejercicio 1.1
    public static double decimalDouble(BigDecimal number){
        BigDecimal roundedNumber = number.setScale(2, RoundingMode.HALF_UP);
        double result = roundedNumber.doubleValue();
        System.out.println("Resultado redondeado y pasado a double: " + result + "\n");
        return result;
    }

    //Ejercicio 1.2
    public static double invertirSigno(BigDecimal number){
        BigDecimal invertedNumber = number.negate();
        BigDecimal roundedNumber = invertedNumber.setScale(1, RoundingMode.HALF_UP);
        double result = roundedNumber.doubleValue();
        System.out.println("Redondeamos invirtiendo el numero: " + roundedNumber);
        return result;
    }


}

