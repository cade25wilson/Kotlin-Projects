fun main() {
    println("please input a number: ")
    val num1 = readLine()!!.toInt()
    println("Please input another number: ")
    val num2 = readLine()!!.toInt()
    println("What operation would you like to perform on these numbers?")
    var operation = readLine()
    if (operation == "+"){
        println(num1 + num2)
    }

}