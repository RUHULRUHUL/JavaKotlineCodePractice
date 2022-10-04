package Kotline

class SealedClassPractice {
}

sealed class Data{
    data class Success(var success:String):Data()
    data class Error(var error:String):Data()
    object Loading:Data()
}

fun  getData():Data{
    return Data.Error((10..100).random().toString())
}
fun  getValue():Data{
    return Data.Success("ruhul")
}


fun main(){

    val data  = getData()
    when(data){

        is Data.Success ->{
            println(data)
        }
        is Data.Error ->{
            println(data)
        }
        is Data.Loading ->{
            println(data)
        }
        else -> {}
    }

}