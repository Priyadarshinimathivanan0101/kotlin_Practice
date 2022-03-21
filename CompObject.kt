object sample1 {
    var a: Int = 20
    var b: Int = 20
    fun addition() {
        println(a + b)
    }
}
class CompObject {
    companion object sample12 {
        var a: Int = 10
        var b: Int = 20
        fun addition() {
            println(a + b)
        }
    }
}
fun main() {
    println(CompObject.addition())
    println(sample1.addition())
}