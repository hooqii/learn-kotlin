package Fundamentals/*
Nilai boolean adalah true dan false
Operasi && (And) yang akan bernilai true ketika semua kondisi true
Operasi || (Disjunction atau Or) yang akan bernilai true ketika ada salah satu kondisi bernilai true
*/

fun main() {
    val nilaiUTS = 90
    val nilaiUAS = 88
    val nilaiMinimum = 85
    var bool = false
    if (nilaiUAS >= nilaiMinimum && nilaiUTS >= nilaiMinimum){
        bool = true
    }
    println(bool)
    println(disjuction(84, 86, 85))
}

fun disjuction(nilaiUTS: Int, nilaiUAS: Int, nilaiMinimum: Int): Boolean {
    var bool = false
     if (nilaiUTS>=nilaiMinimum || nilaiUAS>=nilaiMinimum){
         bool = true
    }
    return bool
}