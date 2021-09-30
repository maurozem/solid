package ms.zem.solid.dependency_inversion.wrong

class Main {
    fun main(){
        val androidDeveloper = AndroidDeveloper()
        val iosDeveloper = IosDeveloper()

        androidDeveloper.developMobileApp()
        iosDeveloper.developMobileApp()
    }
}