import java.util.Scanner

// 1. Fungsi Penjumlahan
fun tambah(a: Double, b: Double): Double {
    return a + b
}

// 2. Fungsi Pengurangan
fun kurang(a: Double, b: Double): Double {
    return a - b
}

// 3. Fungsi Perkalian
fun kali(a: Double, b: Double): Double {
    return a * b
}

// 4. Fungsi Pembagian
fun bagi(a: Double, b: Double): Double {
    return a / b
}

fun main() {
    val scanner = Scanner(System.`in`)

    // Menampilkan menu pilihan operasi
    println("=== KALKULATOR SEDERHANA ===")
    println("1. Penjumlahan (+)")
    println("2. Pengurangan (-)")
    println("3. Perkalian (*)")
    println("4. Pembagian (/)")
    print("Pilih operasi (1-4): ")
    val pilihan: Int = scanner.nextInt()

    // Menerima input dua angka
    print("Masukkan angka pertama: ")
    val angka1: Double = scanner.nextDouble()

    print("Masukkan angka kedua  : ")
    val angka2: Double = scanner.nextDouble()

    println("\n--- Hasil ---")

    // Memproses pilihan berdasarkan input pengguna
    when (pilihan) {
        1 -> println("$angka1 + $angka2 = ${tambah(angka1, angka2)}")
        2 -> println("$angka1 - $angka2 = ${kurang(angka1, angka2)}")
        3 -> println("$angka1 * $angka2 = ${kali(angka1, angka2)}")
        4 -> {
            if (angka2 != 0.0) {
                println("$angka1 / $angka2 = ${bagi(angka1, angka2)}")
            } else {
                println("Error: Pembagian dengan angka nol tidak diperbolehkan!")
            }
        }
        else -> println("Pilihan tidak valid! Silakan pilih angka 1-4.")
    }
}