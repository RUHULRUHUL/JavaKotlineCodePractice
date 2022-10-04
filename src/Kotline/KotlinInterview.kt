package Kotline

import higherOrderfun
import java.util.Arrays
import java.util.Scanner

class Stu() {
    lateinit var department: String

    var roll: Int = 100


}

fun main() {
    //SpecalOprator()
    // lateOperator()
    //lazyOperator()
    //UserInput()
    higherOrder(10, 10) {
        println(it)
    }

    hOrder1(10, {
        println("Defrent System : " + it)
    }, 10);

    val length = String().lengthCalculate("Md Rahul")
    println("Extension Function: "+length)

    setList()

}

fun setList() {
    val list:ArrayList<Int> = arrayListOf(1,2,3,4,5,5,4,1,2)

    println("Duplicated Number With List: $list ")

    val setItem = mutableSetOf<Int>()
    setItem.addAll(list)

    println("Duplicated Number Removed List: $setItem ")

}


fun String.lengthCalculate(input:String):Int{
    return input.length
}



fun higherOrder(i: Int, i1: Int, total: (Int) -> Unit) {

    var result = i + i1
    total(result)


}

fun hOrder1(i: Int, total: (Int) -> Unit, i1: Int) {
    val sum = i + i1
    total(sum)
}


fun UserInput() {
    val input = Scanner(System.`in`)
    var number = input.nextInt()
    println("Your Input Number - " + number)

    val list = mutableListOf<Int>()

    for (i in 0..4) {
        print("Please Input Number - ")
        list.add(input.nextInt())
    }

    for (i in 0..list.size - 1) {
        println("list item Number : " + list.get(i))
    }


}

fun lazyOperator() {
    val name: String by lazy { "MD Rahul Amin" }
    val stu = Stu()
    stu.roll
    println(name)

}

fun lateOperator() {
    val stu = Stu().let {
        it.department = "Ruhul"
        println(it.department)
    }


}

fun SpecalOprator() {

    // ? nullable operator
    // ?. safeCall operator
    // !! Not Null Insertion
    // ?: Elvis Operator


    var name: String? = null
    var name1: String = "Rahul"

    println(name?.length ?: -1)
    println(name1.length)


}
