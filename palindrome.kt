// 6. Write a program to check whether a sentence is palindrome or not.
// For e.g.,: “I did, did I?”

// function to check if the given string is palindrome or not
fun checkpalin(s:String, l:Int):Boolean{
    // declare the required counters
    // i - from starting of the string
    // j - from end of the string
    var i = 0
    var j = l-1
    // loop till the middle of the string
    while(i < j){
        // check if the characters are equal or not
        if(s[i] != s[j]){
            // if not equal, return false
            return false
        }
        // increment and decrement respective counters
        i++
        j--
    }
    // return true if the string is palindrome
    return true
}

// driver code
fun main(){
    // prompt to take the input of the string from user
    print("Enter the string to check whether it is a palindrome or not: ")
    // take the input of the string
    var s=readLine()!!.toString()
    // removing the characters apart from alphabets and numbers
    println("Removing all non-alphanumeric characters...")
    // storing all the special characters in a string
    var special = " ~`!@#$%^&*()_-+={}|[]\\:\";'<>?,./\""
    // looping through the string
    for (i in s){
        // if the character is a special character
        if (i in special){
            // remove the character
            s=s.replace(i.toString(), "")
    }
    }
    // printing the string after removing the special characters
    println("After removing all non-alphanumeric characters, the string is: $s")
    // length of the string
    var l=s.length
    // asking the whether the given string is case-sensitive or not
    println("Select the type of string you want to check")
    println("1. String where it is case-sensitive")
    println("2. String where it is not case-sensitive")
    print("Enter the option: ")
    // taking the input of the option
    var choice = readLine()!!.toInt()
    // if the option is 1
    if (choice==1){
    // checking the given string is palindrome or not    
    if (checkpalin(s,l))
        println("The string is a palindrome")
    else
        println("The string is not a palindrome")
}
    // if the option is 2
    else if (choice==2){
        // converting the string to lower case
        // checking if the string is palindrome or not
        if (checkpalin(s.lowercase(),l))
            println("The string is a palindrome")
        else
            println("The string is not a palindrome")
    }
    // else print invalid option
    else{
        println("Invalid option")
    }
}