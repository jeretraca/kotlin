package com.olodyn

class Question {
    var Answer: String? = ""
    val CorrectAnswer= "77"
    val Question: String ="What is the answer to life, the universe and everything?"
    fun display(){
        println("You said $Answer")
    }

    fun printResult(){
        when (Answer) {
            CorrectAnswer -> { println("You were Correct") }
            else -> { "Try Again" }
        }
    }
}