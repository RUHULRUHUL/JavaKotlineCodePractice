package Kotline

class Test {

    var de:String? = "Computer"

    constructor(name: String, id: Int) : this(name,id,"") {

        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int, department: String?) {
        println("Name = ${name}")
        println("Id = ${id}")

    }

}

fun main(args: Array<String>) {
    val test1 = Test("Ashu", 101)


}