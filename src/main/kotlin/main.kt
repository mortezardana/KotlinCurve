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

fun ifElse() {
    var result = if (10 > 9) "10 is greater than 9" else "it's not"
    println("$result, if/else statements are expressions, so they can return a value as demonstrated here")
}

//This is equivalent to java's switch case statement
fun whenSeeThrough() {
    val day = 4
    val result = when (day) {
        1 -> { "Monday" }
        2 -> { "Tuesday" }
        3 -> { "Wednesday" }
        4 -> { "Thursday" }
        5 -> { "Friday" }
        6 -> { "Saturday" }
        7 -> { "Sunday" }
        else -> { "Invalid day" }
    }
    println(result)
    /*
    * Also we can use a variant of the while loop to do a code block first
    * and then check the condition, and if it is still true continue to do so
    * until we ran out of the condition statement
    * like do {
    *   //some code
    * }
    * while (condition);
    * this will be useful on the cases that you want to do a snippet of code
    * and then checking if the condition that you've put in is still relavant
    * and if it is, continue to do the snippet till the condition is met
    * break/continue are still the same as java, so you can use break to end the whole loop and jump out
    * and you can use continue to just end that specific iteration that you're in.
    * */
}

fun arrays() {
    val cars = arrayOf("Volvo", "BMW", "Ford", "LandRover", "Toyota", "Mazda")
    // and in case that you need an empty array you can always do it like this:
    var arr = emptyArray<String>()
    // the variable is defined with 'var' because I need to populate the array later and I cannot do it if it was 'val'
}
