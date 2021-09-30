package ms.zem.solid.interface_segregation.right

class Cat : Animal {
    override fun eat() {
        println("Cat is eating fish")
    }

    override fun sleep() {
        println("Cat is sleeping on its owner's bed")
    }
}