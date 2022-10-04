package Kotline

class SealedTry {
}

 sealed class Slider {

    data class Success(var success: String) : Slider()
    data class Fail(var fail: String) : Slider()
    data class Response(var status: Boolean) : Slider()

    object Loading : Slider()


}

fun getSlidersResponse(): Slider {
    return Slider.Success("Data Successfully Fetch")
}


fun main() {

    val  slider = getSlidersResponse()
    when(slider){
        is Slider.Success ->{
            println("Connect Successfully")
        }
        is Slider.Fail ->{
            println("Data Fetch Fail ")
        }

        else -> {}
    }

}