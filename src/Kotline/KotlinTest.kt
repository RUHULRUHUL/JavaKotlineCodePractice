import java.util.Scanner

fun main() {
    //init()
    //getInputNumber()
    ControlFlow()


}

fun ControlFlow() {
    //ifElseFunction()
    //WhenExpressen()
    // forLoop()
    whileLoop()
}

fun whileLoop() {
    var i: Int = 0
    /*    while (i < 5) {
            println(i)
            i++
        }*/

    do {
        println("Do While Loop :" + i)
        i++


    } while (i < 5)
}

fun forLoop() {
    outerLoop@ for (i in 1..5) {
        print(" " + i)
    }
    var input = "Bangla12desh12"
    println()

    var charArra: CharArray = input.toCharArray()

    for (Item in charArra) {
        println("Item : " + Item)
    }

    var digitCheck = false
    for (i in 0..charArra.size - 1) {
        if (charArra[i].isDigit()) {
            digitCheck = true
            break
        }
        println(charArra[i])
    }
    if (digitCheck) {
        println("sorry you Have Enter to Digit")
    } else {
        println("Not Problem")
    }


}

fun WhenExpressen() {
    var sc = Scanner(System.`in`)

    println("Please Enter Month: ")
    var input: Int = sc.nextInt()

    when (input) {
        1 -> {
            println("Month of January ")
        }

        2 -> {
            println("Mont of February ")
        }

        else -> {
            println("Not Match ")
        }
    }
}

fun ifElseFunction() {
    var a: Int = -1

    if (a > 0) {
        println("Positive Number")
    } else if (a < 0) {
        println("Negative Number")
    } else {
        println("Number is Zero")
    }
}

fun getInputNumber() {

    var input = Scanner(System.`in`)

    println("Please Input Value ")
    var sc = input.nextInt()

    println("Please Input Value: " + sc)
}

fun KotlinOparator() {
    var a = 10;
    var b = 5;
    println(a + b);
    println(a - b);
    println(a * b);
    println(a / b);
    println(a % b);
}

fun KotlinTypeConversion() {
    var number = 10;
    var number1: Double = number.toDouble()

    var number2: Int = number1.toInt()

    println(number2)

}

fun stringSplit() {
    var inputTxt: String = "1,2,3,4,5"
    var inputArray: List<String> = inputTxt.split(",")

    for (i in 0..inputArray.size - 1) {
        println("Split Array: " + inputArray.get(i))
    }

}

fun variableDeclaration() {
    var name = "Md Rahul"
    val age = 22
    var depertment: String = "CSE"
    var isPassed = false;

    println(name)
    println(age)
    println("Department:  $depertment")

}

fun init() {
    println("hello")
    variableDeclaration()
    DataTypePractice()
    stringSplit()
    KotlinTypeConversion()
    KotlinOparator()
}

fun DataTypePractice() {
    /*    Number
        Character
        Boolean
        Array
        String*/

    NumberDataType()
    var c: Char = 'c'
    var status: Boolean = false
    ArrayDeclaretion()
    StringDataType()

}

fun StringDataType() {

    /*1. Escaped String:*/
    var input = "Md, \n Ruhul"
    /*2.Raw String*/
    var rawString = """
        this is the test Raw String
    """.trimIndent()

    println("Escaped String: " + input)
    println("Raw String: " + rawString)
}

fun ArrayDeclaretion() {
    val input = Scanner(System.`in`)

    var inputTxt = "1,2,3,4,5"

    var array = arrayOf(1, 2, 3, 4, 5)
    var array1 = arrayOf<String>("1,2,3,4,5", "Bangladesh")
    var array2 = arrayOf(1, "Rahul", 100)
    var array3: IntArray = intArrayOf(1, 2, 3, 4, 5)
    var array4 = Array<Int>(5) { 0 }



    for (i in 0..array4.size - 1) {
        println("Please Enter Number: ")
        array4[i] = input.nextInt()
    }

    for (i in 0..array4.size - 1) {
        print("array[]4 Item  " + array4[i])
    }

    var inputArray: List<String> = inputTxt.split(",")


}

fun NumberDataType() {
    var ByteData: Byte = 1;
    var ShortData: Short = 12
    var intData: Int = 1
    var longData: Long = 22222
    var floatData = 1.00f
    var doubleData = 111.00


}
