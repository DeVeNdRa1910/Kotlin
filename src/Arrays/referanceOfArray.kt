package Arrays

fun main() {
    var arr = arrayOf(2,5,8,11,26,31,38,44,51)
    var arr2 = arr
    print("arr ")
    for(i in arr){
        print("$i ")
    }
    println()
    print("arr2 ")
    for(i in arr2){
        print("$i ")
    }
    arr2.set(4,1000)
    println()
    println("After change in arr2")
    print("arr ")
    for(i in arr){
        print("$i ")
    }
    println()
    print("arr2 ")
    for(i in arr2){
        print("$i ")
    }
}