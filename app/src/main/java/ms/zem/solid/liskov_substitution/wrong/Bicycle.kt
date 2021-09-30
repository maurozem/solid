package ms.zem.solid.liskov_substitution.wrong

class Bicycle : Vehicle() {
    override fun startEngine() {
        // TODO("Not yet implemented")
    }

    override fun stopEngine() {
        // TODO("Not yet implemented")
    }

    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}