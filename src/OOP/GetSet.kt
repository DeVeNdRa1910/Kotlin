package OOP

import java.util.*

/*
Getters and setters are special methods used to control access to the properties of a class.
They are part of the encapsulation concept in object-oriented programming, which is one of
the four pillars of OOP.

Getters
    Purpose: To retrieve the value of a property,
    Use Case: Can be used to add logic when a property is accessed, such as validation, formatting,
    or computation before returning the value.

Setters
    Purpose: To modify or set the value of a property,
    Use Case: Can be used to add logic when a property is updated, such as validation, transformation,
    or triggering some actions when the value changes.
*/

class GetSet {
    var name: String = ""
        get() = field.uppercase(Locale.getDefault())
        set(value) {
            field = value.trim()
        }

    var age: Int = 0
        get() = field
        set(value) {
            if (value > 0) field = value else println("Age must be positive")
        }
}

fun main() {
    val person = GetSet()
    person.name = " John Doe "
    person.age = 30

    println("Name: ${person.name}")  // Output: Name: JOHN DOE
    println("Age: ${person.age}")  // Output: Age: 30

    person.age = -5  // This will print: Age must be positive
}
