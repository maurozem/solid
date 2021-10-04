package ms.zem.solid.open_closed.right

data class Rectangle (
    var lenght: Double,
    var height: Double
) : Shape {
    override fun getArea(): Double = lenght * height
}