fun main() {
    val (price, quantity) = wilson()
    var totalPrice = calculateTotalPrice(price, quantity)
    var discountPercent = calculateDiscountPercent(totalPrice)
    val discountPrice = totalPrice * discountPercent / 100
    val finalPrice = totalPrice - discountPrice
    println(
        """
        Wilson bought $quantity kilograms of mangoes
        The price for each 1 kg mango is $price
        total price is $totalPrice
        wilson gets a discount of $discountPercent percent
        that's approx $discountPrice
        and the final price is $finalPrice
    """.trimIndent()
    )
}

fun calculateTotalPrice(price: Int, quantity: Int): Int {
    return price * quantity
}

fun calculateDiscountPercent(totalPrice: Int): Int {
    return when {
        totalPrice in 75_000..149_999 -> 5
        totalPrice in 150_000..499_999 -> 15
        totalPrice >= 500_000 -> 25
        else -> 0
    }
}

fun wilson(): Pair<Int, Int> {
    val price = 45_000
    val quantity = 5
    return Pair(price, quantity)
}