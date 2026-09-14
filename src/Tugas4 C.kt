import java.util.Scanner

// Fungsi 1: Menghitung nilai akhir berdasarkan bobot (Tugas 30%, UTS 30%, UAS 40%)
fun hitungNilaiAkhir(tugas: Double, uts: Double, uas: Double): Double {
    return (tugas * 0.30) + (uts * 0.30) + (uas * 0.40)
}

// Fungsi 2: Menentukan grade berdasarkan rentang nilai
fun tentukanGrade(nilai: Double): String {
    return when {
        nilai >= 80.0 -> "A"
        nilai >= 70.0 -> "B"
        nilai >= 60.0 -> "C"
        nilai >= 50.0 -> "D"
        else -> "E"
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    // Menerima input nilai dari pengguna
    print("Masukkan nilai Tugas (0-100): ")
    val tugas = scanner.nextDouble()

    print("Masukkan nilai UTS (0-100)  : ")
    val uts = scanner.nextDouble()

    print("Masukkan nilai UAS (0-100)  : ")
    val uas = scanner.nextDouble()

    // Memanggil fungsi untuk menghitung nilai akhir dan grade
    val nilaiAkhir = hitungNilaiAkhir(tugas, uts, uas)
    val grade = tentukanGrade(nilaiAkhir)

    // Menampilkan hasil
    println("\n--- Hasil Penilaian ---")
    println("Nilai Akhir : ${String.format("%.2f", nilaiAkhir)}")
    println("Grade       : $grade")
}