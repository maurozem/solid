package ms.zem.solid.open_closed.wrong

import ms.zem.solid.open_closed.right.Shape

data class Rectangle (
    var lenght: Double,
    var height: Double
) : Shape {
    override fun getArea(): Double = lenght * height
}