// 2. A 4x4 grid contains the numbers 1 to 16.
// Write a program to populate the grid with unique
// numbers between 1 and 16 inclusive.
// The population of the grid should be random every
// time the program is executed

// function to populate the grid with unique numbers
// between 1 and 16 inclusive
fun populate(set: Set<Int>): ArrayList<ArrayList<Int>> {
    // declaring a nested arraylist to create a 4x4 grid
    var list = ArrayList<ArrayList<Int>>()
    // declaring the counter variables
    var j = 0 // for counting the values in a row
    var i = 0 // for indexing the consecutive values in the set
    // looping for 4 times because we need 4 rows
    for (k in 1..4) {
        // declaring a temporary arraylist variable
        // to store the values in a row
        val temp = ArrayList<Int>()
        // looping for 4 times because we need 4 columns
        while (j != 4) {
            // adding the element at index i in set
            // to the temp arraylist
            temp.add(set.elementAt(i))
            // incrementing the counter variables
            i++
            j++
        }
        // if 4 columns are filled,
        // then add the temp arraylist to the list
        // and make counter to 0
        j = 0
        list.add(temp)
    }
    // return to list
    return list
}
// end of function

// function to generate 16 unique random numbers
// between 1 and 16 inclusive
fun uni(): Set<Int> {
    // declaring a set to store the random numbers
    var set = mutableSetOf<Int>()
    // looping until the size of set becomes 16
    // because a random number can be generated twice
    //  to avoid that using this size method can be useful
    // also in the set no duplicate values can be added
    while (set.size != 16) {
        // generating a random number between 1 and 16
        var t = (1..16).random()
        // adding the random number to the set
        set.add(t)
    }
    // return to set
    return set
}
// end of function

// driver code
fun main() {
    println("The size of grid is: 4 x 4")
    // calling the function to generate 16 unique random numbers
    var list = uni()
    // calling the function to populate the grid with unique
    // numbers between 1 and 16 inclusive from `list`
    var list2 = populate(list)
    // printing the grid
    for (i in list2) {
        for (j in i) {
            print("$j \t")
        }
        println()
    }
}
// end of the code
