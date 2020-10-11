fun main(args: Array<String>) {
    /*val number = 10

    var result = if (number > 0) {
        "Positive number"
    } else {
        "Negative number"
    }
    println(result)

    result = if (number > 0) "Positive number" else "Negative number"
    println(result)
    */

    /* 
    val a = -9
    val b = -11

    val max = if (a > b) {
        println("$a is larger than $b.")
        println("max variable holds value of a.")
        a
    } else {
        println("$b is larger than $a.")
        println("max variable holds value of b.")
        b
    }
    println("max = $max")
    */

    /* 
    val number = 0

    val result = if (number > 0)
        "positive number"
    else if (number < 0)
        "negative number"
    else 
        "zero"
    
    println("number is $result")
    */

    val n1 = 3
    val n2 = 5
    val n3 = -2

    val max = if (n1 > n2) {
        if (n1 > n3)
            n1
        else
            n3
    } else {
        if (n2 > n3)
            n2
        else
            n3
    }

    println("max = $max")
}