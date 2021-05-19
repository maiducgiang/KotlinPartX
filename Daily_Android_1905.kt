import kotlin.math.sqrt

data class Player(val name: String, val blood: Int, val armor: Int, val magical: Int, val number: Int = 1)
fun Player.element():Boolean{
    val demo: Double = number.toDouble()
    val check: Double = sqrt(demo)
    for(i in 2..check.toInt()) if(number % i == 0) return false
    return true
}

/*{
    Lux("Lux", 1000, 100, 100), Velkot("Velkot", 1000, 100, 100), Draven("Draven", 1000, 100, 100)
}*/
fun main(){
    val demo: Player = Player("lux", 1000, 100, 100,5)
    println("demo \n")
    println(demo.element())
    print(demo.number)
}