fun main(args: Array<String>) {
    /* 
    var i = 1

    while (i <= 5) {
        println("Line $i")
        ++i
    }
    */
    
    //while
    /*
    var sum = 0
    var oldSum = 0
    var i = 100
    var oldI = 0
    var round = 1

    while (i != 0) {
        oldSum = sum
        sum += i     // sum = sum + i;
        oldI = i
        --i
        println("round $round iteration: sum = $oldSum+$oldI = $sum, i = $i")
        round++
    }
    */

    //for
    /*
    for (i in 1..5) {
        println(i)
    }

    for (i in 1..5) println(i)
    */

    // for in rang
    /*
    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)

    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing

    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)

    println()

    print("for (i in 1..4 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)

    println()

    print("for (i in 4 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)
    */

    //for arr
/* 
    var language = arrayOf("Ruby", "Koltin", "Python","Java")

    for (item in language)
        println(item)
*/

    /*
    //for arr use index
    var language = arrayOf("Ruby", "Koltin", "Python", "Java")

    for (item in language.indices) {

        // printing array elements having even index only
        if (item%2 == 0)
            println(language[item])
    }
    */

    var text= "Kotlin"

    for (a in text) {
        println(a)
    }

}