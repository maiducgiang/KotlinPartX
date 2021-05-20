abstract class animall {
    abstract val name : String
    abstract val averageWeight  : Double
    abstract val chirp : String
    fun classify() = println("${name} chirp ${chirp}")
}
class dogg() : animall() {
    override val name = "Dogg"
    override val averageWeight: Double = 15.0
    override val chirp: String = "gau gau"
}

class catt() : animall() {
    override val name = "Cat"
    override val averageWeight = 3.0
    override val chirp: String = "meo meo"
}
class duckk() : animall() {
    override val name = "Duck"
    override val averageWeight = 1.5
    override val chirp: String = "cap cap"
}
class pigg(val pigClassify: String = "thịt", val weight: Int) : animall() {
    override val name = "Pig"
    override val averageWeight = 100.0
    override val chirp: String = "ec ec"
    init{
        println("con lợn này sẽ là ${pigClassify}")  // raised for meat or pet

    }
    fun caculatio(): Unit{
        if(pigClassify == "thịt" && weight > averageWeight) println("đủ cân nặng để thịt")
        else println("con lợn này cần phải chăm tiếp")
        return
    }
}

fun main(){
    val pigDoNgocAnh: pigg = pigg("thịt", 56)
    pigDoNgocAnh.caculatio()
}
