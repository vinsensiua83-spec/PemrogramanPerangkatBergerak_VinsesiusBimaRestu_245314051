import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input suhu Celsius
        System.out.print("Masukkan suhu Celsius: ");
        Double celsius = input.nextDouble();

        // Menghitung Fahrenheit
        Double fahrenheit = (celsius * 9 / 5) + 32;

        // Menghitung Kelvin
        Double kelvin = celsius + 273.15;

        // Menampilkan hasil
        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Kelvin     : " + kelvin);

        input.close();
    }
}