package ms.zem.solid.dependency_inversion.right

class Main {
    fun main(){
        val developers = arrayListOf(
            AndroidDeveloper(AndroidDeveloper.MobileServices.HMS),
            IosDeveloper()
        )
        developers.forEach { developer ->
            developer.developMobileApp()
        }
    }
}