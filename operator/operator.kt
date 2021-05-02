fun main(){
    println("Operator Pada  Kotlin")
     val NamaDepan:String = " Panji"
     val NamaBelakang:String = "Yusrifal"
     val numb1: Int = 10
     val numb2: Double = 100.0
     var hasil: Double
     //pada variabel hasil sengaja kita tidak kasih nilai karena nantinya variabel ini akan do outputkan pada hasil yang berbeda - beda seperti contoh di bawah ini
     println("Operator Aritmatika")
     hasil = numb1 + numb2
     println("Penjumlahan \t: $numb1 + $numb2 = $hasil")
     //operator jenis + juga bisa digunakan untuk menyambung string ya teman2 ....  
     println("$NamaDepan" + NamaBelakang)
     hasil = numb1 - numb2
     println("Pengurangan \t: $numb1 - $numb2 = $hasil")
     hasil = numb1 * numb2
     println("Perkalian \t: $numb1 * $numb2 = $hasil")
     hasil = numb1 / numb2
     println("Pembagiam \t: $numb1 / $numb2 = $hasil")
     hasil = numb1 % numb2
     println("Modulus \t: $numb1 % $numb2 = $hasil")
}