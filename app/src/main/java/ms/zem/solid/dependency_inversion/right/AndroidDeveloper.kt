package ms.zem.solid.dependency_inversion.right

class AndroidDeveloper(private val mobileService: MobileServices) : MobileDeveloper {
    override fun developMobileApp(){
        println("Developing Android Application by using Kotlin. " +
                "Application will work with ${mobileService.serviceName}")
    }
    enum class MobileServices(val serviceName: String){
        HMS("Huawei Mobile Services"),
        GMS("Google Mobile Services"),
        BOTH("Huawei Mobile Services and Google Mobile Services")
    }
}