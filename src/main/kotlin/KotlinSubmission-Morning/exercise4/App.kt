package id.infinitelearning.KotlinSubmission.exercise4

/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini
fun main() {
    try {
        val hasil = bagi(21, 0)

        println("Hasil pembagian: $hasil")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan dalam perhitungan: ${e.message}")
    }
}

fun bagi(pembilang: Int, penyebut: Int): Int {

    return pembilang / penyebut
}

