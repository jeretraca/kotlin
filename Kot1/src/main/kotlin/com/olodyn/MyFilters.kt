package com.olodyn

import javax.print.DocFlavor.STRING

fun main(args: Array<String>): Unit{
    var ints = listOf(1,2,3,4,5,6,7)
    
    val smallInts = ints.filter{it <= 4}
  //  for(i: Int in smallInts)println(i)
println("**********************************")
    val squredInts = ints.map{it * it}
    //for (i: Int in squredInts)println(i)

    val smallSquaredInts = ints.filter { it > 2 && it < 6 }.map{it * it }

    for (i: Int in smallSquaredInts)println(i)

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2,"Committee Meeting"))
    val titles =  meetings
        .filter { it -> it.id.equals(1) }
        .map { m -> m.title }
    for (t in titles) println(t)
}
class MyFilters {
}
