package fundamentals

/*
* Try catch used for handle the exceptions
* "Try" block for the exception code or the logic exception
* "Catch" block for execute the exception action
* "e" parameters for exception message, example (e.message)
* "finally" key is optional used for run the action when an exception occurs or not
*/

class ValidateUsernameException(message: String) :Throwable(message)

fun checkUserName (userName: String) {
    if(userName.isBlank()){
        throw ValidateUsernameException("Please input your username")
    } else {
        println("Hello $userName")
    }
}

fun main() {
    try {
        checkUserName("Kevin")
        checkUserName(" ")
    } catch (e: ValidateUsernameException) {
        println("Somethings wrong : ${e.message}")
    }
}