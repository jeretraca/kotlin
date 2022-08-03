package com.olodyn
fun iter(seq: Sequence<String>){
    for (t in seq)println(t)
}

fun main(args: Array<String>):Unit{
    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    /*val people: List<Person> = meetings
                .flatMap(Meeting::people)
        .distinct()
    *//*val people = meetings.map {Meeting::people }*//*
    for (p in people) println(p.name)*/

    val titles = meetings
        .asSequence()
        .filter { println("filter($it)"); it.title.endsWith("g") }
        .map { println("map($it)"); it.title}
        //for(t in titles) println(t)
    iter(titles)
}