class FieldsAndProperties {
    var full_name: String = "Holmes, Sherlock"

    var street: String = "Baker"
    var city: String = "London"
        get() = this.street
    var state: String? = null
    var zip: String = "123456"
        set(value: String)
        {
            field= value
            println("value setted")
        }
}
fun main()
{
    var obj = FieldsAndProperties()
    println(obj.full_name)
    println(obj.city)
    obj.zip ="234"
    println(obj.zip)
}