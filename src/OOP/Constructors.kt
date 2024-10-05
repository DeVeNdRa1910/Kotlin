package OOP

/*
    there are two type of constructor primary and secondry primary constructor
    we used in person class
    example
    // Define a class with a primary constructor
    class Person(val name: String, var age: Int) {

    // Secondary constructor
    constructor() : this("Unknown", 0) {
        println("Secondary constructor called")
    }

    // Method to introduce the person
    fun introduce() {
        println("Hi, my name is $name and I am $age years old.")
    }

*/

class PersonADV(fName: String, personAge: Int) {
    var firstName: String
    var age: Int

    //initializer block
    init {
        firstName = fName
        age = personAge

        println("First Name : $firstName")
        println("Age : $age")
    }

    fun info(){
        println("Hi, my name is $firstName and I am $age years old.")
    }
}

fun main(){
    val person = PersonADV("John", 25)
    person.info()
}