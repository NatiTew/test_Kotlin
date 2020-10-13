import java.util.Scanner
class Student (val nInput:String, var mScore:Int, var fScore:Int ){
    private var name: String = nInput.capitalize()
    private var mid_score: Int = mScore
    private var final_Score: Int = fScore

    fun p(){
        var ans = mid_score + final_Score
        println("Name = $name , total Score = $ans")
    }

    // init{
    //     name = nInput.capitalize()
    //     mid_score = mScore
    //     final_Score = fScore
    //     var ans = mid_score + final_Score
    //     println("Name = $name , total Score = $ans")
    // }

    
}

// class Student {
//     private var name: String 
//     private var mid_score: Int
//     private var final_Score: Int

//     init{
//         name = nInput.capitalize()
//         mid_score = mScore
//         final_Score = fScore
//         var ans = mid_score + final_Score
//         println("Name = $name , total Score = $ans")
//     }

    
// }

fun main(args: Array<String>) {
    val kb = Scanner(System.`in`)
    var num:Int = kb.nextInt()

    var name = Array<String>(5) { "" }
    var midScore = IntArray(5)
    var finalScore = IntArray(5)

    var cla 

    for(i in 0..num-1){
        midScore[i] = kb.nextInt()
    }
    for(i in 0..num-1){
        finalScore[i] = kb.nextInt()
    }
    for(i in 0..num-1){
        name.set(i,kb.next())
    }

    for(i in 0..num-1){
        cla = Student(name[i], midScore[i], finalScore[i])
    }

    for(i in 0..num-1){
        cla.p()
    }
    

    
    

    
}