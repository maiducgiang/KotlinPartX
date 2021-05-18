abstract class car{
    abstract val numberPerson: Int
    abstract val color: String
    abstract val classify: String
    abstract val weight: Int
    abstract val length: Int
    abstract val height: Int
    abstract val width: Int
}
class luxSA2(val NumberPerson: Int = 7,
             val Color: String = "black",
             val Classify:String = "A",
             val Weight: Int = 1200,
             val Length: Int = 5,
             val Height: Int = 2,
             val Width: Int = 2   ) : car(){
    override val numberPerson: Int = NumberPerson
    override val color: String = Color
    override val classify: String = Classify
    override val weight: Int = Weight
    override val length = Length
    override val height = Height
    override val width = Width


    val company: String = "VinFast"
}
object Acreage{
    fun add(length: Int, width: Int): Int{
        return length * width
    }
}
fun main(){
    val luxsa2 : luxSA2 = luxSA2()
    print(Acreage.add(2,5))
    print(luxsa2.company)
}