fun main()
{
    println("")
    val obj = XYZ()
    obj.add()
    obj.sub()
}

interface Dimensions {
    val x : Int
    val y : Int
}

interface CalculateParameters : Dimensions {
    fun add()
    fun sub()
}

class XYZ : CalculateParameters {
    override val x : Int
        get() = 8
    override val y : Int
        get()= 4

    override fun add()
    {
        println("$x + $y = ${x + y}")
    }

    override fun sub()
    {
        println("$x - $y = ${(x - y)}")
    }
}