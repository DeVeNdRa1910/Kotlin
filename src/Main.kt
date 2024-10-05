fun main() {
    println("Hello World!")
    var name = "Devendra";
    val gf = "Janhvi";
    println("$name , $gf")
    name = "Dev"
    // gf = "jaan"; // it will give an error
    println(name + " " + gf)
    test()
}
fun test() {
    print("Hello we start journey with kotlin")
    temp()
}
fun temp(){
    print("This is third function")
}
/*
there are two type of data  var and val
var is re-assignable(just like var and let in javascript)
val is not re-assignable(just like const in javascript)(one time assignable only)
*/