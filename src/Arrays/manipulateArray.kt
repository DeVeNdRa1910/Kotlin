package Arrays

fun main() {
    var arr = arrayOf(2,5,8,11,26,31,38,44,51)
    for(i in arr){
        print("$i ")
    }
    println()
    // change 8 with 80
    arr.set(2,80)
    // or arr[2] = 80
    for(i in arr){
        print("$i ")
    }
}