class FirstProgram(_name : String ="Priya", _age :Int=30){
    var name:String
    var age : Int

    init {
        this.name =_name
        this.age = _age
        println("$name and $age")
    }
    fun outPut()
    {
        println("$name and $age")
    }

}
fun main()
{
    val obj = FirstProgram(_age = 20)
    print("Hello")
}