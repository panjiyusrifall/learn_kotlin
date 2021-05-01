fun main() {
    println("Selamat Datang di Peljaran Variabel Tipe Data")
    println("=================================================")
    println("1. Variabel")
    // variabel merupakan simbol yang digunakan untuk menyimpan nilai / argument
    // ada 2 tipe variabel yang pertama adalah immutable = bisa diubah dan mutable = yang sifatnya kekal
    // simbol yang digunakan untuk membuat variabel dengan tipe immutable menggunakan simbol " val "
    // sedangkan  membuat variabel denga tipe mutable itu menggunakan simbol " var "
    // oke langsung saja kita buat yang pertama variabel dengan tipe mutable

    println("Variabel dengan tipe Mutable")
    var nama1 = "Yusrifal Panji"
    // oke mari kita coba ubah
    nama1 = "Panji Yusrifal"
    println(nama1)

    println("Variabel dengan tipe immutable")
    val  nama2 = "Panji Yusrifal "
    // oke jika kita masukan kode ( nama2 = " Panji Yusrifal " ) pada bars ini maka akn muncul pesan eror dikarenakan variabel dengan simbol val bersifat kekal
    println(nama2)
    // oke sampai sini pajam yak.., oiya yg terakhir ketika kita membuat variabel di kotlin namun kita tidak menggunakan variabel tersebut maka akan muncul tulisan eror loh teman - teman
    // oke cukup untuk membuat variabel menggunakan kotlin, selanjutanya kita akan belajar tentang tipe data
    println("Tipe Data")
    // penulisaan kode:  var variable-name: Typese = value
    var TipeInt: Int = 4
    // Integer ditulis dengan simbol Int yang tipe data disebut untuk memanggil tipe data bilangan bulat
    var TipeFloat: Float = 8.2F
    // Float  merupskan simnbol untuk mendefinisikn tipe data berjenis bilangan pecahan contoh 8.0 , 8.1, 8.2 dan seterusnya ... oiya pada tipe data float wajib menaruh huruf f pada akhir nilai yang diberikan ya gatau alasanya kenapa hehe..  mungkin biar dia tidak terbaca sebagai tipe jenis data double intinya wajib ya ..
    var TipeDouble: Double  = 14.00
    // double bisa dibilang merupakan simbol yang sama namun di mempunyai ukuran yang lebih besar contohnya seperti 14.00, 14.01, 14.02 dan seterusnya
    var TipeChar: Char = 'A'
    // Tipe Data Char merupakan TipeData yang menampung huruf misalnya A, b, C, D, dan seterusnya
    var TipeString: String? = "Panji Yusrifal"
    // tipe data string berfungsi sebagai menampilkan teks contohnya Panji Yusrifal, Yusrifal Panji Panji YUsrifal Yusrifal Panji, Panji Yusrifal Ganteng 100% whatever that ..... 
    // var TipeData6: Boolean = true
    // var TipeData7: Boolean = false
    // Tipe Data Bololean ini hanya menampung nilai true dan false biasanya digunakan pada operator logika dan relasional, nanti kamu akan ketemu deh di step yang akan datang ..
    println("Tipe Data Integer: " + TipeInt)
    println("Tipe Data Float:" + TipeFloat)
    println("Tipe Data Double:" + TipeDouble)
    println("Tipe Data Char:" + TipeChar)
    println("Tipe Data String:"+  TipeString)
    //Kita juga bisa menkonversikan tipe data dari beilangan bulatke bilangan pecahan sekalipun
    println("Konfetsi bilanga bulat ke bilangan pecahan")
    var conversi = TipeInt.toFloat()
    //conversi hanya dengan menambahkan tipedataawal.totipedataakhir()
    println("Bilangan Bulat ke Bilangan Pecahan " + conversi)




}