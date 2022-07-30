
package com.olodyn

import java.io.FileReader
import java.io.IOException
import java.util.TreeMap


fun main(args: Array<String>){

    display("Joseph Ndolo is blessed")
    log("Jesus is my Lord ", 2)
    val text = "With    multiple \t  whitespace"
    println(text)
    println("Without multiple white spaces")
    println(text.replaceMultipleWhiteSpace())

    val h1 = Header("H1")
    val h2 = Header("H2")
    val h3 = h1 plus h2
    println(h1.Name)
    println(h2.Name)
    println(h3.Name)


    }
fun display(message:String):Boolean{
    println("$message")
    return true
}

@JvmOverloads
fun log(message: String, loglevel: Int = 1){
    println(message + loglevel)
}

/** fun replaceMultipleWhiteSpace(value: String): String{
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
} **/

fun String.replaceMultipleWhiteSpace(): String{
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}

class  Header(var Name: String){

}
infix fun Header.plus(other: Header) : Header {
    return Header(this.Name + other.Name)
}