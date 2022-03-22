sealed class Shape {
    data class Circle(var radius: Double) : Shape()
    data class Square(var length: Double) : Shape()
    data class Rectangle(var length: Double, var breadth: Double) : Shape()
}

fun takeArear(s:Shape) {
    return when(s)
    {
        is Shape.Circle -> println("Math.PI* (this.radius)*(this.radius)")
        is Shape.Square -> println("(this.length)*(this.length)")
        is Shape.Rectangle -> println("this.breadth * this.length")
    }
}
fun main()
{
    val r = Shape.Circle(12.9)
    takeArear(r)
}
