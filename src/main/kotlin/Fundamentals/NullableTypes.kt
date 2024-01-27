/*
* Use ? key for define nullable types
*/

fun main() {
    val text: String? = "null"
    if (text != null) {
        println(text.length)
    }
    safeCalls()
}

/* Safe calls & Elvis Operator*/
fun safeCalls() {
    val test: String? = null
    println(test?.length?:10) //Elvis Operator
    println(test?.length) //Safe Calls
}