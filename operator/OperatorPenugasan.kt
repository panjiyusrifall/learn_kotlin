fun main(){
    println("Operator Penugasan")
    // pada opeerator penugasan ini fungsinya sebenernya sama dengan operator aritmatika, namun penulisan syntaxnyna yang berbeda oke langsung kita buat syntaxnya teman2 ...
    val angka: Int = 14
    var angkaDijumlah: Int = angka
    var angkaDikurang: Int = angka
    var angkaDikalikan: Int = angka
    var angkaDibagi: Int = angka
    var angkaModulus: Int = angka

    angkaDijumlah += 5
    println("$angka +5 maka hasilnya $angkaDijumlah")
    angkaDikurang -= 5
    println("$angka -5 makah hasilnya %angkaDikurangi")
    angkaDikalikan *= 5
    println("$angka *5 makah hasilnya $angkaDikalikan")
    angkaDibagi /= 5
    println("$angka /5 makah hasilnya $angkaDibagi")
    angkaModulus %= 5
    println("$angka %5 makah hasilnya $angkaModulus")
    // jadi sederhananya  += 5 sama saja dengan  angka + 5, dan -= 5 angka - 5, dan seterusnya ..
}