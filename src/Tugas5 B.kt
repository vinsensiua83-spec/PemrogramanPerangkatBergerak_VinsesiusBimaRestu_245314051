import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Menerima input data mahasiswa
    print("Masukkan nama mahasiswa: ")
    val namaMahasiswa: String = scanner.nextLine()

    print("Masukkan nilai Tugas (0-100): ")
    val tugas: Double = scanner.nextDouble()

    print("Masukkan nilai Kuis (0-100): ")
    val kuis: Double = scanner.nextDouble()

    print("Masukkan nilai UTS (0-100): ")
    val uts: Double = scanner.nextDouble()

    print("Masukkan nilai UAS (0-100): ")
    val uas: Double = scanner.nextDouble()

    // Perhitungan Nilai Akhir sesuai bobot persentase
    val nilaiAkhir: Double = (tugas * 0.25) + (kuis * 0.15) + (uts * 0.25) + (uas * 0.35)

    // Menampilkan hasil perhitungan
    println("\n--- Rincian Nilai Mahasiswa ---")
    println("Nama Mahasiswa : $namaMahasiswa")
    println("Nilai Tugas    : $tugas (25%)")
    println("Nilai Kuis     : $kuis (15%)")
    println("Nilai UTS      : $uts (25%)")
    println("Nilai UAS      : $uas (35%)")
    println("-------------------------------")
    println("Nilai Akhir    : ${String.format("%.2f", nilaiAkhir)}")
}