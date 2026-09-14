import java.util.Scanner

// Fungsi untuk menghitung dan mengembalikan nilai luas persegi panjang
fun hitungLuas(panjang: Double, lebar: Double): Double {
    return panjang * lebar
}

fun main() {
    val scanner = Scanner(System.`in`)

    // Menerima input dari pengguna
    print("Panjang : ")
    val panjang: Double = scanner.nextDouble()

    print("Lebar   : ")
    val lebar: Double = scanner.nextDouble()

    // Memanggil fungsi hitungLuas
    val luas: Double = hitungLuas(panjang, lebar)

    // Menampilkan hasil (mengonversi ke Int jika nilainya bulat agar rapi)
    println("Luas    : ${if (luas % 1 == 0.0) luas.toInt() else luas}")
}