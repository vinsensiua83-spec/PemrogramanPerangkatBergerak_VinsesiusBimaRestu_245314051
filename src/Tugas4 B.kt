import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Menerima input data pegawai
    print("Masukkan nama pegawai: ")
    val namaPegawai: String = scanner.nextLine()

    print("Masukkan gaji pokok: ")
    val gajiPokok: Double = scanner.nextDouble()

    print("Masukkan tunjangan: ")
    val tunjangan: Double = scanner.nextDouble()

    print("Masukkan uang lembur: ")
    val uangLembur: Double = scanner.nextDouble()

    print("Masukkan potongan: ")
    val potongan: Double = scanner.nextDouble()

    // Melakukan perhitungan gaji
    val gajiKotor: Double = gajiPokok + tunjangan + uangLembur
    val gajiBersih: Double = gajiKotor - potongan

    // Menampilkan rincian penggajian
    println("\n--- Rincian Gaji Pegawai ---")
    println("Nama Pegawai : $namaPegawai")
    println("Gaji Pokok   : Rp $gajiPokok")
    println("Tunjangan    : Rp $tunjangan")
    println("Uang Lembur  : Rp $uangLembur")
    println("----------------------------")
    println("Gaji Kotor   : Rp $gajiKotor")
    println("Potongan     : Rp $potongan")
    println("----------------------------")
    println("Gaji Bersih  : Rp $gajiBersih")
}