

 abstract class figure(){
    abstract val name: String
    abstract val blood : Int
    abstract val armor : Int
    abstract val magicalResistance: Int
    fun Q(): Unit{
        val nameSkill: String
    }
    fun W(): Unit{
        val nameSkill: String
    }
    fun E(): Unit{
        val nameSkill: String
    }
    fun R(): Unit{
        val nameSkill: String
    }
}
class skin(val Namee : String,val Bloodd: Int, val Armorr: Int,val MagicalResistancee: Int): figure(){
    override val name: String = Namee
    override val blood: Int = Bloodd
    override val armor: Int = Armorr
    override val magicalResistance = MagicalResistancee
    init{
        print("creat a class ${Namee} \n")
    }
}
fun main(){
    val lux: skin = skin("lux", 1000, 100, 50)
    val ad: skin = skin("ad", 1000, 100, 55)
    val sp: skin = skin("sp", 1000, 100, 50)
    val mid: skin = skin("mid", 1000, 100, 50)
}
