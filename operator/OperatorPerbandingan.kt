fun main(){
    println("Operator Perbandingan")
    // Operator perbandingan ini merupakan operator yang memberikan nilai lebih besar, lebih kecil, atau sama dengan dan objek lainnya, langsung saja kita buat sourcecodenya ya.. 
    var numb1: Int = 14
    var numb2: Int = 8
    var hasil: Boolean
    
    // opertaror nilai lebih besar menggunakan " > "
    // oiya disini kita menggunakan kurung kurawal supaya simbil ">" dapat dibaca sebagai perintah penulisannya adalah ${ a > b}
    println("$numb1 > $numb2 maka hasilnya = ${numb1 > numb2}")
    // Operator nilai lebih kecil menggunakan simbol " < "
    println("$numb1 < $numb2 maka hasilnya = ${numb1 < numb2}")
    // Operator nilai lebih besar atau sama dengan menggunakan simbol " >= "
    println("$numb1 >= $numb2 maka hasilnya = ${numb1 >= numb2}")
    // Operator nilai lebih kecil atau sama dengan menggunakan simbol " <= "
    println("$numb1 <= $numb2 maka hasilnya = ${numb1 <= numb2}")
    // Operator sama dengan menggunakan simbol " == "
    println("$numb1 == $numb2 maka hasilnya = ${numb1 == numb2}")
    // Operator tidak sama dengan menggunakan simbol " != "
    println("$numb1 != $numb2 maka hasilnya = ${numb1 != numb2}")

}