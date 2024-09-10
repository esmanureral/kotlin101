package com.esmanureral.deneme1

fun main(){
    //print de alt satıra geçmiyor.
    print("Hello Kotlin")
    print("ben esmanur")
    //println geçiyor.
    println(" ")
    println("Hello Kotlin")
    println("ben esmanur")

    /**********DEĞİŞKENLER**********
      Türkçe karakter olmasın dikkatt*/

   //1)) ilk 5 sonra alt satırda 6 yazdırır.Aynı türde olmaları gerekiyor.
    var sayi1=5
    println(sayi1)
    sayi1=6
    println(sayi1)

    //var değişkeninde  veri tipi aynıysa sonradan değişebiliyor ama val değişkeninde değişemiyor!!

    val sayi2:Int=45
    val sayi3:Float=67.5F
    val sayi4:String="Esmanur"
    println(sayi2)
    print(sayi3)
    println(sayi4)

    //result değiştiği için var tanımlandı.
    var result=0
    val sayi5=5
    val sayi6=6
    result=sayi5*sayi6
    print(result)


    var result1 = ""
    val sayi=2
    val str1="merhaba"
    var str2="kotlin"
    result1="Merhaba $sayi $str1"
    print(result1)  //Merhaba 2 merhaba

    // ***********TÜR DÖNÜŞÜMÜ***********

    //String>Int dönüştürme
    var myString:String = "15"
    var myInt = myString.toInt()
    println(myInt*5)

    //Int>Double dönüştürme
    var myInt1=45
    var myDouble=myInt1.toDouble()
    print(myInt1)

    //***********Null değişkeni***********

    var sayi7:Int?=null // ? koyulması gerekiyor.
    var sayi8:Int?=6
   // print(sayi8*5) bu hata verir çünkü null olabilir dedik.



    //***********DİZİLER***********

    //arrayof
    var myArray= arrayOf("kedi","köpek","tilki","4","2",3)
    println(myArray[0])
    myArray[0]="değiştirildi"
    println(myArray[0])
    myArray.set(2,"ikinci index değiştirildi")
    println(myArray[2])
    println(myArray)//dizi elemanlarını tek tek yazdırmaz.Bellekteki alanı yazdırır.
    var arraySize=myArray.size
    println(arraySize)//dizi uzunlugu:6

    //intarray (int değerler için)

    //***********LİSTELLER***********

    val myArray1=ArrayList<String>() //buraya ekleme yapamıyoruz () içine
    myArray1.add("cengiz")
    myArray1.add("han")
    println(myArray1[0])

    val myArray2= arrayListOf<String>("esmanur","cengiz","kaya")
    println(myArray2) //[esmanur, cengiz, kaya]

    //***********SETLER***********
    //dizilerden farkı aynı elemanı birden kez tutamazlar.
    //indexli çağırılmıyorlar.println(myset[0]) hatalıdır.

    val myArray3=arrayOf(1,2,2,3,4)
    println(myArray3.size) //5

    val mySet= setOf<Int>(1,2,2,3,4)
    println(mySet.size) //4 (2 'yi 1 kez saydı)

    mySet.forEach{ println(it) } // alt alt 1 2 3 4 yazdırır.

    val myHashSet=HashSet<String>() //içine tanımlama yapamıyoruz.
    myHashSet.add("cat")
    myHashSet.add("cat")
    println(myHashSet) //[cat]
    println(myHashSet.size) //1


    //***********HASHMAP***********
    //index mantığı yoktur.Key,Value mantığı

    //İKİ DİZİDEN KARŞILIKLI BİR ŞEY YAZDIRMAK İSTESEK:
    //hashmap'siz;

    val cityArray= arrayOf("izmir","istanbul")
    val degreeArray= arrayOf(25,27)
    println("${cityArray[0]} : ${degreeArray[0]}") //izmir : 25

    //hashmap'li

    val myHash=HashMap<String,Int>()
    myHash["İzmir"]=25
    myHash["İstanbul"]=27

    println("İzmir: ${myHash["İzmir"]}")//İzmir: 25
    println("İstanbul: ${myHash["İstanbul"]}")//İstanbul: 27

    //***********WHEN***********
    //switch-case yapısı gibi.Fazlaca else if kullanmamız gerekiyorsa.

    val day=2
    when(day){
        1->println("pazartesi")
        2->println("salı")
        else->println("yanlıs gun")
    }

     //***********For ve Foreach***********

    val myArray4=arrayOf(1,2,3,4,5)
    for(myFor in myArray4){
        println(myFor*5) // alt alta 5 10 15 20 25 yazdırır.
    }

    myArray4.forEach { println(it) } // alt alta 1,2,3,4,5 yazdırır.
    myArray4.forEach { println(it*5) }//alt alta 5 10 15 20 25 yazdırır.
    myArray4.forEach {myFor->
        println(myFor) } //değişken ismini myFor yapıp dizideki elemanları yazdırdı.

    //***********While ve Do While***********
    //while döngüsü for döngüsünden farklı olarak bir şarta bağlıdır.

    var sayidegiskeni=11
    while(sayidegiskeni<20){
        println(sayidegiskeni)
        sayidegiskeni++ //11,12,13,14,15,16,17,18,19 yazdırır alt alta.
    }


    var sayidegiskeni2=11
    do {
        println(sayidegiskeni2)
        sayidegiskeni2++
    }
    while (sayidegiskeni2<20) //ilk yazdırır sonra koşula bakar.

}