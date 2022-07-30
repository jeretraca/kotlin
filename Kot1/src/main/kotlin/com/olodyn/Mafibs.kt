package com.olodyn

fun main(){
    var mafibs = Mafibs()
    var total=0
   // mafibs.fibonacci(8)
   /** mafibs.fibonacci(8,object: Process{
        override fun execute(value: Int) {
            println(value)
        }
    }) **/
    //mafibs.fibonacci(8) {n -> println(n)}
    mafibs.fibonacci(8){ println(it)}
    //mafibs.fibonacci(8,:: println  )
    // adding the value of the fibonacci
    mafibs.fibonacci(8){it -> total += it }
    println("The total of the fibonnaci is $total")
}
interface Process{
    fun execute(value: Int)
}

class Mafibs {
    //1, 1, 2, 3, 5, 8, 13...

    fun fibonacci(limit: Int, action: (Int) -> Unit){
        var prev = 0
        var prevprev = 0
        var current = 1
        for (i: Int in 1..limit){
            action(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    /** fun fibonacci(limit: Int, action: Process){
        var prev = 0
        var prevprev = 0
        var current = 1
        for (i: Int in 1..limit){
            action.execute(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    } **/


    /**fun fibonacci(limit: Int){
        var prev = 0
        var prevprev = 0
        var current = 1
        for (i: Int in 1..limit){
            println(current)
            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    } **/
}

//****Strategy Pattern****
// calculateResult(1,2,{s -> print(s)})
// calculateResult(1,2){s -> print(s)}
// calculateResult(1,2, {print(it) })
// calculateResult(1,2) {print(it) }
// calculateResult(1,2, :: print)