abstract class Car {
    abstract fun on()
    abstract fun run()
    abstract fun stop()
    abstract fun off()
    fun horn()
    {
        println("Sound Horn....")
    }
}
class Functionality : Car()
{
    override fun on() {
        println("Car started....")
    }
    override fun run()
    {
        println("Car moving....")
    }
    override fun stop()
    {
        println("Car stoped....");
    }

    override fun off() {
        println("Car off....")
    }
}
fun main()
{
    val obj = Functionality()
    obj.on();
    obj.run();
    obj.horn();
    obj.stop();
    obj.off();
}