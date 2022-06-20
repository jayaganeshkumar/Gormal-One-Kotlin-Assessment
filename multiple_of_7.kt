// 5. Write a program to display the 1, 2, and 4 multiple of 7
// which gives the remainder 1
// when divided by 2, 3, 4, 5 and 6

// driver code
fun main() {
    // initializing the counter to 0
    var count = 0
    // initializing the variable `a` to 0
    var a = 0
    // looping until the count equals to 4
    while (count < 4) {
        a += 7
        // checking the given condition
        if ((a % 2) == 1 && (a % 3) == 1 && (a % 4) == 1 && (a % 5) == 1 && (a % 6) == 1) {
            // if the condition met, increment count by 1
            count++
            // if count equals to 3,
            // do not print the value of a
            if (count == 3) {
                continue
            }
            // else print the value of a
            else {
                println("$count multiple of 7 satisfying the condition is $a")
            }
        }
    }
}
// end of code
