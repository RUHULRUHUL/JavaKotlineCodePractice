package Kotline

fun main() {

    //with apply also let Run

    //with Scope Function
    val student1 = Student1()
    var fullName = with(student1) {
        println(name)
        println(roll)
        println(semester)

        name = name + "  Amin"
    }

    //apply Scope function
    student1.apply {
        name = "Md"
        roll = 510
        semester = "Five"
    }

    //also
    student1.also {
        it.name = "Md Ruhul Amin Thankurgaon"
        println("Full Name Change : " + it.name)
    }

    println("After Change Value With Apply ")
    with(student1) {
        println(name)
        println(roll)
        println(semester)
    }

    LetScopFuntion()


}

fun LetScopFuntion() {
    val s: Student1? = null

    val set = mutableSetOf<Int>(1, 2, 3, 4)
    val linkedList = mutableMapOf<String, String>()
    val linkList = linkedMapOf<Int, String>()




    s?.let {
        println("Let Null Automatic Check")
        println(s.name)
    }
    var list: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    list.removeAt(4)

    val newList = list?.let {
        println("After Removing List Item:$list ")

        list.add(5)
        println("After Add Item : $list")
    }

    println("original List : $list")
    println("duplicate List : $newList")


}

 class Student1() {
    var name = "Ruhul"
    var roll = 10
    var semester = "Four"

    fun display() {
        println(name)
        println(roll)
        println(semester)
    }

}