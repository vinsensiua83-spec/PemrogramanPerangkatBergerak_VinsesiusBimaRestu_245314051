import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Menerima input bilangan desimal dalam bentuk String
    print("Masukkan bilangan desimal: ")
    val inputString: String = scanner.nextLine()

    // 1. Mengubah String ke Double
    val nilaiDouble: Double = inputString.toDouble()

    // 2. Mengubah Double ke Int (membulatkan kebawah/memotong desimal)
    val nilaiInt: Int = nilaiDouble.toInt()

    // 3. Mengubah kembali ke String
    val nilaiStringKembali: String = nilaiDouble.toString()

    // Menampilkan hasil
    println("\nHasil Konversi Tipe Data:")
    println("Nilai Double : $nilaiDouble")
    println("Nilai Int    : $nilaiInt")
    println("Nilai String : $nilaiStringKembali")
}