package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namadepan: String = "Fauzan"
    val namabelakang: String ="Zidni"
    val umur: Int = 20
    val status: Boolean = true

    println("Nama Depan: $namadepan")
    println("Nama Belakang: $namabelakang")
    println("Umur: $umur Tahun")
    println("Status: ${if (status) "Tidak Berpacaran" else "Berpacaran"}")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(namagrup: String, namaanggota: List<Any>, sesi: String, kelas: String): Any {
    println("Nama Kelompok: $namagrup")
    println("Nama Anggota: $namaanggota")
    println("Sesi: $sesi")
    println("Kelas: $kelas")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val anggotagrup = listOf("Gatot","Fauzan Zidni","Anis","M.Raihan","Vito","Della","Eka","Hamda","Ichsan","Hafizh")
    val namasaya = anggotagrup[1]
    println("Nama Saya: $namasaya")
    return anggotagrup
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentors = arrayOf("Kak Raihan","Kak Fateh")
    val groupMembers = arrayOf("Gatot","Fauzan Zidni","Anis","M.Raihan","Vito","Della","Eka","Hamda","Ichsan","Hafizh")

    val total = mentors.size + groupMembers.size
    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("Nama Anggota : $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Shelter Nerd ", listOf("Fauzan Zidni","Gatot Triantono","Anis Saputri","M.Raihan AryaDevin","Muhammada Vito"), "Pagi","A",)

}