import java.util.Scanner
fun main(args: Array<String>) {
    
    //Byte[-128,127]
    val numByte: Byte = 112
    println(numByte)

    //Short [-32768, 32767]
    val temperature: Short = -11245
    println("$temperature")
    
    //Int
    val score: Int =  100000
    println("$score")

    //Long
    val highestScore: Long = 9999
    println("$highestScore")
    val distance = 100L    // distance value of type Long
    println("$distance")

    //Double
    val distance1 = 999.5
    println("$distance1")

    //Float
    val distance2 = 19.5F
    println("$distance2")

    //Char
    val letter: Char
    letter = 'k'
    println("$letter")

    //Boolean
    val flag = true
    println("$flag")

    // in & !in
    val numbers = intArrayOf(1, 4, 42, -3)

    if (4 !in numbers) {
        println("numbers array contains 4.")
    } else{
        println("No")
    }

    /*
    Type Conversion

    In Java
    int number1 = 55;
    long number2 = number1;    // Valid code 

    In Kotlin,
    val number1: Int = 55
    val number2: Long = number1   // Error: type mismatch.
     */
    val num1: Int = 55
    val num2: Long = num1.toLong()
    println("$num2")

    /*
    toByte() 
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()
     */
    val numb1: Int = 545344
    val numb2: Byte = numb1.toByte()
    println("number1 = $numb1")
    println("number2 = $numb2")

    //Print String Entered By the User
    print("Enter text: ")

    val stringInput = readLine()!!
    println("You entered: $stringInput")

    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    var integer:Int = reader.nextInt()
    println("You entered: $integer")

}