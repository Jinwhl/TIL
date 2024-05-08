class Car(
    val model : String,
    var speed : Int,
    var gas : Int,
) {
    var incremental: Int = 0

    // Calculate incremental
    fun addGas(newGas:Int) : Unit {
        gas += newGas
        incremental = gas / 10
        println("Current Gas : $gas")
    }

    // Return current speed
    fun getSpeeds():Int {
        return speed
    }

    // Increase car speed
    fun increaseSpeed() {
        speed += incremental
    }
}

val myCar = Car(
    "bugatti chiron",
    20,     // Initial speed
    0       // Initial Gas
)

for (i in 1..10) {
    myCar.addGas(10)
    myCar.increaseSpeed()
    println("Current Speed : ${myCar.getSpeeds()}")
}
