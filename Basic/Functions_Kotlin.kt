fun main(args: Array<String>) {
    //callMe()

    // val number1 = 12.2
    // val number2 = 3.4
    // val result: Int

    // result = addNumbers(number1, number2)
    // println("result = $result")

    //println(getName("John", "Doe"))

    // val a = true
    // val b = false
    // var result2: Boolean

    // result2 = a or b // a.or(b)
    // println("result = $result2")

    // result2 = a and b // a.and(b)
    // println("result = $result2")

    

}

fun callMe(){
    println("Printing from callMe() function.")
    println("This is cool (still printing from inside).")
}
fun addNumbers(n1: Double, n2: Double) : Int{
    val sum = n1 + n2
    val sumInteger = sum.toInt()
    return sumInteger
}

fun getName(firstName: String, lastName: String): String = "$firstName $lastName"