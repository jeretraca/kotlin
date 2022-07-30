package com.olodyn

import java.util.*

class Mkutano {
    var Title: String=""
    var When : Date = Date()
    var Who = mutableListOf<String>()

    fun create(){}
}
fun main(){
    val m = Mkutano()
    m.Title = "Board Meeting"
    m.When = Date(2022, 7, 30)
    m.Who.add("Ndolo")

    with(m){
        Title = "Nyumba Kuli Meeting"
        When = Date(2022,7,29)
        Who.add("Omondi")
    }
    m.apply {
        Title = "Nyumba Kuli Meeting"
        When = Date(2022,7,29)
        Who.add("Omondi")
    }.create()
}