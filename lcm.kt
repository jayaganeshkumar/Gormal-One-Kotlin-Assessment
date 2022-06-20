// 4. Write a program to find the LCM of any number of numbers.

// defining the function to calculate the gcd
// of the two numbers
fun gcd(a: Int, b: Int): Int {
    // if b is equal to 0, then the gcd is a
	if (b == 0)
		return a;
    // otherwise, recursively call the function
    // until b is equal to 0
	return gcd(b, a % b);
}

// defining the function to calculate the lcm
// of the array of integers
fun findLCM(arr: ArrayList<Int>): Int 
{
	// declaring the result variable
    // with first element of the array
	var res = arr.get(0)
	// looping through the array and calculating
    // lcm for each element and result variable
	for (i in arr)
		res = (((i * res)) / (gcd(i, res)))
    // returning the result
	return res
}

// Driver Code
fun main (){
    // prompting the user to enter the number of elements
    print("Enter the number of elements: ")
    // declaring the variable to store number of elements
    var n = readLine()!!.toInt()
    // declaring the arraylist of integers
    // to store the elements
    var arr = ArrayList<Int>()
    // prompting the user to enter integers
    // one after the other
    println("Enter the elements of the array: ")
    for(i in 1..n) {
        // declaring the variable to store the element
        var t = readLine()!!.toInt()
        // adding the element to the arraylist
        arr.add(t)
    }
    // calling the function to calculate the lcm
    var res = findLCM(arr)    
    println("LCM of the given array of integers is: $res")
}