package com.esmanureral.deneme1
//Bird class'ı Animal class'ını miras aldı Bird:Animal yazdık sonra const. ekledik..

class Bird(foot: Int, color: String) :Animal(foot, color) {

    fun chirp(){
        println("cik cik")
    }
}