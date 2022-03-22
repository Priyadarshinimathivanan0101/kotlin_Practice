data class DataClass(var cornType:String, var cornName :String, var protien:Double, var price:Int)

fun main()
{
    var list1 : MutableList<DataClass> = mutableListOf<DataClass>()
    val u = DataClass("corn", "name",9.0,8)
    list1.add(u)
    print(list1[0])
}
