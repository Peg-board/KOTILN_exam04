var myVar : Int = 100

fun main(args: Array<String>) {
    var myVar : Int = 0
    println(myVar)

    var result : Int = addFuntion(10, 20)
    println(result)
}

fun addFuntion(num1 : Int, num2 : Int) :Int {

    var sum : Int
    sum = num1 + num2 + myVar
    return sum
}