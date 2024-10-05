package OOP

class Person(var name: String, var age: Int) {
    fun introduce() {
        println("Hi, my name is $name and I am $age years old.")
    }
}

fun main(){
    // new key is not exist in kotlin
    val person = Person("Devendra", 23)
    val person2 = Person("Janhvi", 23)
    person.introduce()
    person2.introduce()
}