fun main() {
    println("Hello world!")
    prints()
    variables()
}

fun prints() {
    println("This is the println method which will print the value passed to it and then end it with an enter.")
    print("And for this I used a print function to print a value and I can continue... ")
    print("in this other print method at the end of the last one.")
    println()
}

fun variables() {
    /*One of the key differences in Kotlin from Java is the variable definition
    which can be without any declaration of the data type. and to define if the variable
    is mutable or immutable we have to use either 'var' or 'val'. 'val' is immutable while 'var'
    means that you can change the value later*/
    var name = "Morty"
    val birthday = 1996
    println("$name $birthday")
    name = "Mori"
    println("$name $birthday")

//    Declaring data types
    var ageInString : String = "Nineteen ninety six"
    var ageInInt : Int = 1996

//    Declaring nullable variables
    var nullableVar : String?
    val nullableVal : String?
}

fun dataTypes() {
    println("Byte can have a value between -128 to 127")
    println("Short can have a value between -32768 to 32767")
    println("Int can have a value between -2147483648 to 2147483647")
    println("Long can have a value between -9223372036854775807 to 9223372036854775807")
    println("The difference between Float and double is the precision of the floating points which float have 6 or 7 precision while double has 15")
    println("Float and Double can also be a scientific number with an 'e' or 'E' to indicate power of 10")
    println("to convert a numeric data type to another type you must use toByte() or toShort() or toDouble() or any other relative built-in methods")

}
