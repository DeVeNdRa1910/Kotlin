package Arrays

fun main() {
    var arr = arrayOf(2,5, 8, 11, 26, 31, 38,44,51)
    print(isPresent(arr, 38))
}

fun isPresent(arr: Array<Int>, target: Int): Int{
    var s = 0
    var e = arr.size-1
    while (s<e){
        val mid = s+(e-s)/2
        if(arr[mid]==target){
            return mid
        } else if(arr[mid] < target){
            s = mid+1
        }else{
            e = mid-1
        }
    }
    return -1;
}