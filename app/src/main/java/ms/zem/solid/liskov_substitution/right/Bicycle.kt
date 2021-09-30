package ms.zem.solid.liskov_substitution.right

class Bicycle : Vehicle {
    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}