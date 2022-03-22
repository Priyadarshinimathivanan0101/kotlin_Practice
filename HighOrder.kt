class HighOrder {
    fun highOderfun(lambdafun:(a:Int,b:Int)->Int)
    {
        println(lambdafun(3,5))
    }
    fun highOrderfun2(addFunction:(Int,Int)-> Int)
    {
        println(addFunction(4,5))
    }
    fun addition(a:Int, b:Int):Int{
        return a+b
    }
    fun highOrderfun3() :(Int,Int)->Int
    {
        return ::addition //returning function
    }

}
fun addTwoNum(a:Int,b:Int):Int{
    return a+b
}
fun main()
{
    var lambdaName : (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    val obj = HighOrder()
    obj.highOderfun(lambdaName)// passing lambda to higher order function
    obj.highOrderfun2(::addTwoNum) // passing function to higher order function
    var result = obj.highOrderfun3() //return function from higher order function
    println(result(2,3))
}
