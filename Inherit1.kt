open class Account(_name :String, _amount: Int) {
    var name : String
    var amount : Int
    init {
        this.name = _name
        this.amount = _amount
    }
    fun deposit(amount:Int)
    {
        this.amount += amount
    }
    @JvmName("getName1")
    fun getName() : String{
        return name
    }
    @JvmName("getAmount1")
    fun getAmount() : Int = amount
    @JvmName("setAmount1")
    fun setAmount(amount : Int)
    {
        this.amount = amount
    }
}
class Saving(amount:Int) : Account("saving",amount)
{

}
class Current(amount : Int) :Account("current ", amount)
{
    fun withdraw(amount:Int)
    {
        setAmount(getAmount()- amount)
    }
}
fun main()
{
    var amount : Int
    println("Enter initial amount ")
    amount = Integer.valueOf(readLine())
    val acc = Current(1000)
    acc.deposit(amount)
    println(acc.getAmount())
}
