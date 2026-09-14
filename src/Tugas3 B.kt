import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Menerima input data belanja dari pengguna
    print("Masukkan nama barang: ")
    val namaBarang: String = scanner.nextLine()

    print("Masukkan harga satuan barang: ")
    val harga: Double = scanner.nextDouble()

    print("Masukkan jumlah barang: ")
    val jumlah: Int = scanner.nextInt()

    print("Masukkan persentase diskon (%): ")
    val diskon: Double = scanner.nextDouble()

    // Melakukan perhitungan sesuai rumus
    val subtotal: Double = harga * jumlah
    val potongan: Double = subtotal * diskon / 100
    val totalBayar: Double = subtotal - potongan

    // Menampilkan rincian hasil belanja
    println("\n--- Rincian Belanja ---")
    println("Nama Barang   : $namaBarang")
    println("Harga Satuan  : $harga")
    println("Jumlah        : $jumlah")
    println("Subtotal      : $subtotal")
    println("Potongan      : $potongan")
    println("Total Bayar   : $totalBayar")
}