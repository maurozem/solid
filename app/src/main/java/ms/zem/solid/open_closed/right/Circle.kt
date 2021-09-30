package ms.zem.solid.open_closed.right

data class Circle (
    var radius: Double
) : Shape {
    override fun getArea(): Double = radius * radius * Math.PI
}