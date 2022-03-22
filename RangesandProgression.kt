class RangesAndProgression {
    fun rangeSample()
    {
        for(i in 1..10)
            print("$i  ")
        println()
    }
    fun progressionSample()
    {
        var range:IntProgression=1..10
        for(i in range)
            print("$i  ")
        println()
    }
    fun stepSample()
    {
        for(i in 1..10 step 2)
            print("$i  ")
        println()
    }
    fun reverseSample()
    {
        for(i in (1..10).reversed())
            print("$i  ")
        println()
    }
    fun downToSample()
    {
        for(i in 10 downTo 0)
            print("$i  ")
        println()
    }
    fun filterSample()
    {
        for(i in (1..20).filter{it%2!=0}) {
            print("$i  ")
        }
        println()
    }
}
fun main()
{
    var rp = RangesAndProgression()
    rp.rangeSample()
    rp.progressionSample()
    rp.reverseSample()
    rp.stepSample()
    rp.downToSample()
    rp.filterSample()
}