import java.util.Scanner

// Fungsi untuk memeriksa apakah bilangan genap atau ganjil
fun cekGenapGanjil(bilangan: Int): String {
    return if (bilangan % 2 == 0) "Genap" else "Ganjil"
}

fun main() {
    val scanner = Scanner(System.`in`)

    // Menerima input dari pengguna
    print("Masukkan bilangan: ")
    val bilangan: Int = scanner.nextInt()

    // Memanggil fungsi cekGenapGanjil
    val hasil: String = cekGenapGanjil(bilangan)

    // Menampilkan keluaran
    println("$bilangan merupakan bilangan $hasil")
}