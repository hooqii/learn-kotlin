package Fundamentals

/*
We can use underscore for numbers(_)
Number types :
    Int = 32 bit, range -2^31 to 2^31-1
    Long = 64 bit, have L key (val = 100L), range -2^63 to 2^63-63-1
    Short = 16 bit,
    Byte = 8 bit,
    Double = 64 bit, decimal number
    Float = 32 bit, have F key (decimal number)

Conversions numbers:
    Int = toInt()
    Long = toLong()
    Short = toShort()
    Byte = toByte()
    Double = toDouble()
    Float = toFloat()
*/

fun main() {
    val int= 10
    val string = "10".toInt()
    println(
        """
        The sum of converted string ${int+string}
        Min number of int = ${Int.MIN_VALUE}
        Max number of int = ${Int.MAX_VALUE}
        Min number of long = ${Long.MIN_VALUE}
        Max number of long = ${Long.MAX_VALUE}
        Min number of short = ${Short.MIN_VALUE}
        Max number of short = ${Short.MAX_VALUE}
        Min number of byte = ${Byte.MIN_VALUE}
        Max number of byte = ${Byte.MAX_VALUE}
        Min number of double = ${Double.MIN_VALUE}
        Max number of double = ${Double.MAX_VALUE}
        Min number of float = ${Float.MIN_VALUE}
        Max number of float = ${Float.MAX_VALUE}
    """.trimIndent()
    )
}
