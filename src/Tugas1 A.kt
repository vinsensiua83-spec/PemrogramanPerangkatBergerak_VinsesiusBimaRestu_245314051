object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        // Menyimpan biodata mahasiswa

        val nama = "Budi"
        val umur = 19
        val tinggiBadan = 168.5
        val mahasiswaAktif = true
        val golonganDarah = 'B'

        // Menampilkan biodata
        println("Nama            : " + nama)
        println("Umur            : " + umur + " tahun")
        println("Tinggi badan    : " + tinggiBadan + " cm")
        println("Mahasiswa aktif : " + mahasiswaAktif)
        println("Golongan darah  : " + golonganDarah)
    }
}