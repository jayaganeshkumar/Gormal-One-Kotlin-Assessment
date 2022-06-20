// Write a program to calculate the factorial of a number.
// a. Make sure that factorial should be calculated only
// if it is calculatable, else an error
// message must be displayed in case the
// calculatable conditions fails.
// b. List of those conditions

// defining the function for calculating
// the factorial of the given number
fun fact(num: Int): Long {
    // declaring the variable to store the factorial
    var res = 1L
    // if the num is 0 then return 1
    if (num == 0) return res
    // else multiplying res with each number
    // in the range from 1 to num
    else for (i in 1..num) res *= i
    return res
}
// end of the function

// driver code
fun main() {
    // printing the conditions where we can't find the factorial
    println("Conditions where we can't find the factorial:")
    println("Factorial of negative number is not possible")
    println("\n*********************************************\n")
    // prompt for user to give the input number
    print("Enter the number to find factorial: ")
    // reading the number from user
    // readLine() -> reads the line from the console as a string
    // toInt() -> converts the string to integer
    var num = readLine()!!.toInt()
    // condition to check whether the given number
    // is less than 0. Because factorial of negative
    // number is not defined
    if (num < 0)
    // printing the error message
    println("Error: Invalid input")
    // else calculate the factorial of the given number
    else {
        // storing the factorial of the given number
        // in a variable `res`
        var res = fact(num)
        // printing the factorial of the given number
        println("Factorial of $num is: $res")
    }
}
// end of the code
