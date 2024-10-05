package controlFlow

fun main(){
    var marks : Int = 1
    resultUsingWhen(marks)
}

fun resultUsingWhen(marks: Int) {

    when(marks) {
        0 -> print("number is zero")
        1 -> print("Number is one")
        else -> print("Number is negative one")
    }
    //just like switch case in java
    return
}