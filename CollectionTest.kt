class CollectionTest {
}
fun main()
{
    var numbers = listOf<Int>(2, 1, 3, 4)
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf(3)}")


}