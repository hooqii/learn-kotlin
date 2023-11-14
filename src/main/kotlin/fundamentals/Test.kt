package fundamentals

class ValidateException(message: String) :Throwable(message)

fun validateUserName(userName: String) {
    if (userName.isBlank()){
        throw ValidateException("Username is blank")
    } else{
        println("Hello $userName")
    }
}

fun main() {
    try {
        validateUserName("Alex")
        validateUserName("")
    } catch (e: ValidateException) {
        println("Ada yang g beres : ${e.message}")
    }
}