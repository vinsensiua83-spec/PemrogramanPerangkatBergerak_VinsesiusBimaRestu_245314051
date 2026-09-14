import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Menerima input dua bilangan
    print("Masukkan nilai A: ")
    var a: Int = scanner.nextInt()

    print("Masukkan nilai B: ")
    var b: Int = scanner.nextInt()

    // Menampilkan nilai sebelum ditukar
    println("\nSebelum ditukar:")
    println("A = $a")
    println("B = $b")

    // Proses penukaran menggunakan variabel sementara (temp)
    val temp: Int = a
    a = b
    b = temp

    // Menampilkan nilai setelah ditukar
    println("\nSetelah ditukar:")
    println("A = $a")
    println("B = $b")
}