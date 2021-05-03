fun main() {
    // opertaor unery, increment, dan decrement ini adalah operator yang merubah nilai dari - ke +, lalu + ke - true ke false- dll...
    var numb1 = -14
    var numb2 = 8
    var boolean1 = true

    var hasil: Int
    var hasilBoolean: Boolean 

    hasil = + numb1
    println(" + ($numb1) = $hasil ")
    // disini nilai awal dari numb1 satu adalah -14 lalu jika kita menggunakan syntax + numb1 maka nilai -14 akan diubah menjadi +14 atau 14
    hasil = - numb2
    println(" - ($numb2) = $hasil ")
    // disini sama seperti kasus pertama tapi sebaliknya nilai pada numb2 sebelumnya adalah 8 lalu - numb2 merubahnya menjadi -8
    hasilBoolean = ! boolean1
    println("! $boolean1 = $hasilBoolean")
    //di boolean ini nilai true berubah menjadi false
    numb1++
    println("$numb1")
    //++ itu artinya sama dengan + 1 jadi misalnya (-14)++ maka bisa dibilang sama saja dengan -14 + 1 maka  hasilanya adala -13
    numb2--
    println("$numb2")
    // disini sama saja dengan kasus kempat tapi ini kasusnya dikuraingi bukan ditamabah num2-- maka hitunganya sama saja dengan -1 - 8 maka hasilnya adalah 7 
}