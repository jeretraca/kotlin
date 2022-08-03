package com.olodyn

fun main(args : Array<String>):Unit{
    val ints = listOf(1,2,3,6,7,8)
    val greaterThanThree = {v:Int -> v > 3}

    val largeInts = ints.all(greaterThanThree)
    println(largeInts)

    var largerInts = ints.any(greaterThanThree)
    println(largerInts)
    var numOfLargeInts = ints.count(greaterThanThree)
    println(numOfLargeInts)

    var found: Int? = ints.find(greaterThanThree)
    println(found)
    found = ints.find { it >8 }
    println(found)
}

class Predicates {
}