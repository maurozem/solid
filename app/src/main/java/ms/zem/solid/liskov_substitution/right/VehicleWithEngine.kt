package ms.zem.solid.liskov_substitution.right

abstract class VehicleWithEngine : Vehicle {
    private var isEngineWorking = false
    open fun startEngine(){ isEngineWorking = true }
    open fun stopEngine(){ isEngineWorking = false }
}