package Fundamentals

fun main() {
    val (testScore, midExamScore, finalExamScore) = score()
    examPass(testScore, midExamScore, finalExamScore)
    val number = Numbers(280,972)
    println("Max Number Is: ${number.maxNumber()}")
}

fun examPass(testScore: Int, midExamScore: Int, finalExamScore: Int) {
    var pass = false
    if (testScore >= 75 && midExamScore >= 70 && finalExamScore >= 80) {
        println("You have passed the exam, Congrats!")
    } else if (testScore in 60..74 && midExamScore in 60..69 && finalExamScore in 70..89) {
        println("You passed with exception")
    } else {
        println("You don't passed for the exam")
    }
}

fun score(): Triple<Int, Int, Int> {
    val testScore = 85
    val midScore = 73
    val finalScore = 88
    return Triple(testScore, midScore, finalScore)
}

//let numbers = {
//    number1 : 80,
//    number2 : 85,
//    max: function(){
//        return Math.max(this.number1, this.number2)
//    }
//}
//
//console.log("Maximum value is:",numbers.max())

data class Numbers(val number1: Int, val number2: Int) {
    fun maxNumber(): Int {
        return maxOf(number1,number2)
    }
}
