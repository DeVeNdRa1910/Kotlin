package Functions

fun main() {
    val a: Int = 12
    val b: Int = 34
    val ans: Int = sum(a,b)
    println("Sum of $a and $b is $ans")
}
fun sum(num1: Int, num2: Int): Int{
    val sum: Int = num1+num2
    return sum
}

/*
fun functionName(var1: typeOfVar1, var2: typeOfVar2 ....): returnTypeOfFunction {
    // Block of Statements
    return result
}
if return type of your function is void then no need to provide return type of function
*/
