package id.infinitelearning.KotlinSubmission.exercise2
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    val BilanganGenap = mutableListOf<Int>()

    for (a in 1..100) {
        if (a % 2 == 0) {
            BilanganGenap.add(a)
        }
    }
    var baris = 0
    for (bilangan in BilanganGenap) {
        print("$bilangan ")
        baris++

        if (baris % 5 == 0) {
            println()
        }
    }

//Latihan 2 Map
//    Buatlah variabel bertipe Map dengan kriteria:
//    Daftar nama bulan dalam setahun,
//    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
//    - key "Jan", value January
//    - key "Feb", value February
//    - dst...
//     Buat di bawah sini

    val Namabulan: Map<String, String> = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )


    for ((key, value) in Namabulan) {
        println("$key = $value")
    }


//    Dalam contoh ini, kita menghilangkan tipe data eksplisit pada saat deklarasi variabel, dan kita menggunakan fungsi forEach untuk mencetak setiap pasangan key-value dalam Map. Ini membuat kode menjadi lebih ringkas dan mudah dibaca.
//
//    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
//    - Jan -> January
//    - Feb -> February
//    - Dst...
//    Buat di bawah sini
    val NamaBulan = mapOf(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )

    NamaBulan.forEach { (key, value) ->
        println("$key-> $value")
    }
//    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
//    - "It's {$monthNow} now, I was born in {$birthMonth}"
//     */
//    Buat di bawah sini
    val formatter = DateTimeFormatter.ofPattern("MMMM", Locale.getDefault())

    val bulansekarang = LocalDate.now().format(formatter)
    val bulanlahir = LocalDate.of(2002, 10, 23).format(formatter)

    val result = "It's $bulansekarang, I was born in $bulanlahir"
    println(result)
}


