package controlFlow

fun main(){
    var marks : Int = 72
    resultUsingWhen(marks)
}

fun resultUsingWhen(marks: Int) {

    when(marks) {
        in 0..49 -> print("Failed")
        in 50..60  -> print("Third")
        in 61..74 -> print("Second")
        in 75..89 -> print("First")
        else -> print("Excellent")
    }
    //just like switch case in java
    return
}
