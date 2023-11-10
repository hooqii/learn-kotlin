/*
* Array can save date with different data types
* Unit Array = arrayOf()
* Integer Array = intArrayOf()
* Boolean Array = booleanArrayOf()
* Char Array = charArrayOf()
* Long Array = longArrayOf()
* Short Array = shortArrayOf()
* Byte Array = byteArrayOf()
*
* Operation in Array:
* get for getting data from array = array.get(index)
* set for updating data from array = array.set(index)
* Total of array or length in js = array.size
* Print same data to one data in array = array.distinct()
* Print from index we want to last index using drop = array.drop(started index)
* print from index 0 but to index we want using dropLast = array.dropLast(Last index)
* checking array is there have a data or not = array.isEmpty()
*/

fun main() {
    val array = arrayOf(1, "2", 3.0) //Unit Array
    val index0 = array[0] as Int
    val index1 = array[1].toString().toInt()
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    val booleanArray = booleanArrayOf(true, false, true)
    val charArray = charArrayOf('A', 'B', 'C')
    if ('X' in charArray) {
        println("Found")
    } else {
        println("Not Found")
    }
    charArray.set(1, 'C') //Using set method
    intArray[1] = 3 //Using indexing method
    println(index0 + index1)
    println(charArray)
    println(booleanArray.size)
    println(intArray.contentToString())
    for (item in array) {
        print("$item ")
    }
    println(booleanArray.isEmpty())
}