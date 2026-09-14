import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Menerima input suhu dalam Celsius
    print("Masukkan suhu dalam Celsius: ")
    val celsius: Double = scanner.nextDouble()

    // Menghitung konversi suhu
    val fahrenheit: Double = (celsius * 9 / 5) + 32
    val kelvin: Double = celsius + 273.15

    // Menampilkan hasil konversi
    println("\nHasil Konversi Suhu:")
    println("Celsius    : $celsius °C")
    println("Fahrenheit : $fahrenheit °F")
    println("Kelvin     : $kelvin K")
}