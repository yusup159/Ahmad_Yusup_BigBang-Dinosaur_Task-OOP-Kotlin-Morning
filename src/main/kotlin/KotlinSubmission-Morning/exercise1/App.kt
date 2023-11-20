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
    val firstname= "Ahmad"
    val lastname = "Yusup"
    val age = 20
    val status = false
    println("Nama Saya :$firstname + $lastname")
    println("Umur : $age tahun ")
    if (status){
        println("Status : Singgle")
    }else {
        println("Status : Tidak Singgle")
    }

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Nama Group : $groupId")

    println("Daftar Anggota : ")
    var i = 0
    for(member in groupMember) {
        i++
        println("$i. $member")
    }

    println("Sesi : $session")

    return """
        Informasi Group
        Grup : $groupId
        Daftar Anggota : ${groupMember.size}
        Sesi : $session
    """.trimIndent()
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    val anggota = listOf(
        "Ahmad Yusup",
        "Dimas Anggoro Harahap",
        "Yassar Muwwafaq",
        "Inayatul maula",
        "Adella Maulana Annur Ramadhan",
        "Alvito Kurnia Fahrio",
        "Anggi Putri Meriani",
        "Billy Dwi Prakoso",
        "Fadhlan Akbarullah",
        "Muhammad Zaki Raihan",
        "Rafi Kahfi Yugi")

    val myName = anggota.get(10)

    return listOf(myName)

}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Joy", "Kak Maulana")
    val countOfGroup = arrayOf<String>(
        "Ahmad Yusup",
        "Dimas Anggoro Harahap",
        "Yassar Muwwafaq",
        "Inayatul maula",
        "Adella Maulana Annur Ramadhan",
        "Alvito Kurnia Fahrio",
        "Anggi Putri Meriani",
        "Billy Dwi Prakoso",
        "Fadhlan Akbarullah",
        "Muhammad Zaki Raihan",
        "Rafi Kahfi Yugi"
    )
    return mentor.size+countOfGroup.size

    return 0
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("BigBang & Dinosaur",
        listOf(
        "Ahmad Yusup",
        "Dimas Anggoro Harahap",
        "Yassar Muwwafaq",
        "Inayatul maula",
        "Adella Maulana Annur Ramadhan",
        "Alvito Kurnia Fahrio",
        "Anggi Putri Meriani",
        "Billy Dwi Prakoso",
        "Fadhlan Akbarullah",
        "Muhammad Zaki Raihan",
        "Rafi Kahfi Yugi"),
        "Morning B")

}