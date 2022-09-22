package Android_Kotlin_Bootcamp
import java.util.Scanner
// In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
// Function Description
// Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
// aVeryBigSum has the following parameter(s):
// int ar[n]: an array of integers .
// Return
// long: the sum of all array elements
// Input Format
// The first line of the input consists of an integer .
// The next line contains  space-separated integers contained in the array.
// Output Format Return the integer sum of the elements in the array.
/*
fun main(){
    println("Enter the size of the array to be created : ")
    val input = Scanner(System.`in`)
    var sizeOfArray:Int = input.nextInt()
    println("Big Sum = " + aVeryBigSum(sizeOfArray))
}
/*
fun aVeryBigSum(sizeOfArray:Int): Long{
    val arr1 = IntArray(sizeOfArray)
    val input = Scanner(System.`in`)
    for(item in arr1.indices){
        println("Enter the " + item + ". " + "element of the array : ")
        arr1[item] = input.nextInt()
    }
    var bigSum: Long = 0
    for(x in arr1){
        bigSum = bigSum + x
    }
    return bigSum
}
*/ */
//- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
fun main(){
    println("Enter the size of the array to be created : ")
    val input = readLine()!!.trim().toInt()
    println("Enter the elements of the array with one space seperated : ")
    val array = readLine()!!.trimEnd().split(" ").map { it.toLong() }.toTypedArray()
    val sumResult = aVeryBigSum(array)
    println(sumResult)
}

fun aVeryBigSum(array: Array<Long>): Long{
    var bigSum: Long = 0
    for(x in array){
        bigSum = bigSum + x
    }
    return bigSum
}