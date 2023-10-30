fun testCalculatePercent(totalPrice: Int): Int {
    return when {
        totalPrice in 20_000..50_000 -> 5
        else -> 0
    }
}

const val totalPrice = 25_000
val discountPercent = testCalculatePercent(totalPrice)

fun main() {
    println(discountPercent)
}