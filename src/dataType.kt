fun main() {
    var name = "Devendra"
    val gf = "Janhvi"
    println("$name , $gf")
    name = "Dev"
    // gf = "jaan"; // it will give an error
    println(name + " " + gf)

    var temp: Int = 12
    // temp= "jay" // it will give an error
}
/*
there are two type of data  var and val
var is re-assignable(just like var and let in javascript)
val is not re-assignable(just like const in javascript)(one time assignable only)
*/

/*
Integer: Byte, Short, Int, Long
Floating: Float, Double
Boolean: True, False
Character: Char, String

we can specifie the data  type like
var name: String = "devendra"
if we not provide then after initialization of variable compiler automatically
predict the type of data
*/