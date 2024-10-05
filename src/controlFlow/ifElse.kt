package controlFlow

fun main(){
    var marks : Int = 72
    result(marks)
}
fun result(marks: Int){
    if(marks in 50..60){
        println("Third")
    } else if(marks in 60..74){
        println("Second")
    } else if (marks in 75..89){
        println("First")
    } else {
        println("Exellent")
    }
    return
}