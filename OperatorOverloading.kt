class OperatorOverloading(var str:String) {
    operator fun inc() : OperatorOverloading
    {
        val obj = OperatorOverloading(this.str)
        obj.str = obj.str +'a'
        return obj
    }
    operator fun dec() : OperatorOverloading
    {
        val obj = OperatorOverloading(this.str)
        obj.str = obj.str.substring(0,obj.str.length-1)
        return obj
    }
    override fun toString(): String {
        return str
    }

}
fun main(args: Array<String>) {
    var obj = OperatorOverloading("Hello")
    println(obj++)
    println(obj--)
    println(++obj)
    println(--obj)
}