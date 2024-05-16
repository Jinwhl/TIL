/* --------------------- /
    1. Variables
    2. Data Type
    3. Operator
    4. Condition
    5. Loop
 / -------------------- */

/* 1. Variables */
val a = 3
var b = 5

// a = 4 // Error: Value can't change
b = 6

/* 2. Data Type */
val name : String = "Michael Jordon"
var height : Int = 198
var weight : Double = 98.5
val bloodType : Char = 'B'
val retirement : Boolean = true

/* 3. Operator */
var numA = 10
var numB = 4

println(numA + numB) // 14
println(numA - numB) // 6
println(numA * numB) // 40
println(numA / numB) // 2

numA++
numB--
println(numA)
println(numB)

/* 4. Condition */
var age = 20
if (age >= 20) {
    println("Can Drink")
}

fun describe(obj: Any): String =
    when (obj) {
        10         -> "Ten"
        "Hello"    -> "Greeting"
        !is String -> "Not a string"
        else       -> "Unknown"
    }


/* 5. Loop */
for (i in 1..10) {
    println("index : $i")
}

val languages = listOf("java", "kotlin", "python")
var index = 0
while (index < languages.size) {
    println("Item $index : ${languages[index]}")
    index++
}
