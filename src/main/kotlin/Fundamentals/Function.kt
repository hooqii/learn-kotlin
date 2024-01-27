//"fun" is the function key in Kotlin.
//After fun key followed by function name
//The function have a parameter placed in parentheses
//After parameter function have an expression or return body

fun main() {
    val (price, quantity) = wilson()
    val totalPrice = calculateTotalPrice(price, quantity)
    val discountPercent = calculateDiscountPercent(totalPrice)
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
    println(myName("Alex"))
    user("Wilson", 17)
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

fun myName (name: String) = "My Name Is $name"

fun user(name: String, age: Int) {
    println("My name is $name and i am $age years old")
}