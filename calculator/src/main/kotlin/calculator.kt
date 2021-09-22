import kotlin.system.exitProcess

fun calculate() {
    println("please input a number: ")
    var num1 = readLine()!!.toInt()
    println("Please input another number: ")
    var num2 = readLine()!!.toInt()
    println("What operation would you like to perform on these numbers?")
    var operation = readLine()
    if (operation == "+"){
        println(num1 + num2)
    } else if (operation == "-"){
        println(num1 - num2)
    } else if (operation == "*") {
        println(num1 * num2)
    } else if (operation == "/"){
        println(num1 / num2)
    }
    else{
        println("Please enter a valid operator.")
    }
    println("Would you like to calculate another set of numbers? Yes or no")
    repeat()
}

fun repeat() {
    var calcAgain = readLine()!!.uppercase()
    if (calcAgain == "YES"){
        calculate()
    } else if (calcAgain == "NO") {
        println("Thank you for using calculator see you again soon")
        exitProcess(0)
    }
    else {
        println("Please enter yes or no")
        repeat()
    }


}

fun main() {
    calculate()
}