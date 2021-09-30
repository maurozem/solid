package ms.zem.solid.open_closed.right

class AreaFactory {

    fun calculateArea(shapes: ArrayList<Shape>): Double =
        shapes.sumOf { shape -> shape.getArea() }

}