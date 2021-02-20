package com.concon.guess

class SecretNumber {
    val secret = (1..10).random()
    var count = 0
    fun validate(number: Int): Int {
        count++
        return number - secret
    }
}

fun main(){
    val secretNumber = SecretNumber()
    println(secretNumber.secret)
    println("${secretNumber.validate(2)} , count: ${secretNumber.count}")

}
