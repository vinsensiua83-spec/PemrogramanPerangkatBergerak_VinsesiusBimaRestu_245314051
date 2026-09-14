import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Menerima input satu karakter dari pengguna
    print("Masukkan karakter: ")
    val input: String = scanner.next()

    // Mengambil karakter pertama dari String yang dimasukkan
    val karakter: Char = input[0]

    // 1. Mendapatkan kode ASCII/Unicode dengan mengonversi Char ke Int
    val kodeKarakter: Int = karakter.code

    // 2. Memeriksa apakah karakter termasuk huruf
    val termasukHuruf: Boolean = karakter.isLetter()

    // 3. Memeriksa apakah karakter termasuk angka (digit)
    val termasukAngka: Boolean = karakter.isDigit()

    // Menampilkan hasil analisis
    println("\nHasil Analisis Karakter:")
    println("Karakter       : $karakter")
    println("Kode karakter  : $kodeKarakter")
    println("Termasuk huruf : $termasukHuruf")
    println("Termasuk angka : $termasukAngka")
}