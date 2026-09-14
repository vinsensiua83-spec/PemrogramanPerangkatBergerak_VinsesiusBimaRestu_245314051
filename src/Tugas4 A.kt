import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Deklarasi konstanta PI
    val PI: Double = 3.14159

    // Menerima input jari-jari (r) bertipe Double
    print("Masukkan jari-jari lingkaran (r): ")
    val r: Double = scanner.nextDouble()

    // Menghitung Luas dan Keliling Lingkaran
    val luas: Double = PI * r * r
    val keliling: Double = 2 * PI * r

    // Menampilkan hasil perhitungan
    println("\nHasil Perhitungan Lingkaran:")
    println("Jari-jari (r) : $r")
    println("Luas          : $luas")
    println("Keliling      : $keliling")
}