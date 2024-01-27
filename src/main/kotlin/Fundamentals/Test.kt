package Fundamentals

fun main() {
    val myArray = arrayOf(1,2,3,4,5)
    myArray.forEach { element ->
        val multiplyElement = element*2
        println(multiplyElement)
    }
}