fun main(){
    // Operator Logika merupakan operator yang digunakan untuk dua pernyataan sekaligus, hanya ada dua operator yaitu && yang artinya and || yanf artinya or , 
    var numb1 = 14
    var numb2 = 8
    var numb3 = 4
    var result: Boolean
    
    // && adalah operator yang memaksa semua nilainya menjadi true contohnya
    // jika ada pernyataan yang menhasilkan nilai false maka operator and ini akan menghasilkan nilai false
    result = ( numb1 > numb2 ) && (numb1 < numb3)
    println("($numb1 > $numb2) and ($numb1 < $numb3) maka hasilnya = $result")
    // || adalah simbol yang menyatakan nilai or disini dia akan terus mencari nilai true bagaimana jika salah satu pernyataan memiliki nilai false ? ya tidak masalah selama ada nilai true di dalam pernyataan or maka dia tetap menghasilkan true beda halnya ketika tidak ada salah satupun dari beberapa pernyataan yang menghasilkan nilai false
    result = (numb1 > numb2) || (numb1 == numb3)
    println("($numb1 > $numb2) or ($numb1 == $numb3) maka hasilnya = $result")
}