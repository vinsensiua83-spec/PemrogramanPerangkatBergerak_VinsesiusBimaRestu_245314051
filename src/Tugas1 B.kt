fun main() {
    // 1. Deklarasi variabel dengan val (nilai tetap/tidak berubah)
    val nama: String = "Budi Santoso"
    val npm: String = "21081010001"

    // 2. Deklarasi variabel dengan var (nilai dapat berubah)
    var semester: Int = 3
    var ipk: Double = 3.65

    // Tampilkan data awal (Sebelum diperbarui)
    println("--- Data Mahasiswa (Awal) ---")
    println("Nama     : $nama")
    println("NPM      : $npm")
    println("Semester : $semester")
    println("IPK      : $ipk")

    // 3. Memperbarui nilai semester dan IPK
    semester = 4
    ipk = 3.78

    // Tampilkan data setelah diperbarui
    println("\n--- Data Mahasiswa (Setelah Diperbarui) ---")
    println("Nama     : $nama")
    println("NPM      : $npm")
    println("Semester : $semester")
    println("IPK      : $ipk")
}