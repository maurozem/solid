package ms.zem.solid.open_closed.wrong

class AreaFactory {

    fun calculateArea(shapes: ArrayList<Any>): Double {
        var area = 0.0
        for (shape in shapes) {
            area += if (shape is Rectangle) {
                (shape.lenght * shape.height)
            } else if (shape is Circle) {
                (shape.radius * shape.radius * Math.PI)
            } else {
                throw RuntimeException("Shape not supported")
            }
        }
        return area
    }
}