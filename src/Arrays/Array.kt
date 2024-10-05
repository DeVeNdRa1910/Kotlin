package Arrays

fun main() {
    var arr = arrayOf(2,5,8,11,26,31,38,44,51)
    var arr2 = arrayOf<Int>(1,3,4,5,6,7,8,12,23,34,45,56,67,78,89,90)
    var arr3 = arrayOf<String>("Devendra", "Janhvi", "Divyanshi", "kiara", "Tara", "Sara")
    var arr4 = arrayOf(1,2,3,0 ,-1,true, false, 'A', "Hello", "This","Js Array")
    for ( i in 0..arr.size-1){
        println(arr[i])
    }
    for ( i in 0..arr.size-1){
        println(arr.get(i))
    }
    for (i in arr ){
        println(i)
    }

    //create an array size is n and value should be null
    val n = 10
    val array = arrayOfNulls<String>(n)
    //create an array size is n and value should be 0
    val arrayWithZero = IntArray(n) {0}
    val arrayWithZero2 = Array(n) { 0 }

}