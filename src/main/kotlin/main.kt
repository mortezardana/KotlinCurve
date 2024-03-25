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