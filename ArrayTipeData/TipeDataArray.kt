fun main(){
    // array ini berfungsi untuk menampung nilai banyak sekaligus  dalam satu variabel, dan aray di kotlin itu dimulai dari angkan 0 ya teman// misalnya kita masukan kode berikut
    val members: Array<String> = arrayOf("Panji", "Yusrifal", "Ganteng")
    //disini "Panji nilainya adalah 0 yusrifal adalah 1 dam ganteng adalah 2" kita coba print panjiyusrifak disini
    println(members[0] + members[1])
    val angka: Array<Int> = arrayOf(14_000,8_0000,4_000,2_0000)
    println(angka[1])
    val byte: Array<Byte> = arrayOf(14,8,4,2)
    println(byte [0]) 
    // bedanya diamond pada byte dan integer adalah byte hanya menamoung nilaikecil sedangkan integer dia menampung nilai yang besar


}