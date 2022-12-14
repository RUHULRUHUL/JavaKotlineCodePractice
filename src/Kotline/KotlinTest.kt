import java.util.Scanner
import kotlin.math.sin

fun main() {
    //init()
    //getInputNumber()
    //ControlFlow()
    //FunctionKotlin()
    //ExceptionHandling()
    //NullSafety()
    //SmartCast()
    //UnsafeandSafeCastOperator()
    //ElvisOperator()
    //CollectionPractice()
    //oopPractice()
    //SingletoneObject()
    operator()


}

fun operator() {
    //Safe call Operator =  ?
    var input: String? = null

    println(input?.uppercase())
}

fun SingletoneObject() {
    val singlePatten = SinglePatten1()
    println(singlePatten)

    val singlePatten1 = SinglePatten1()
    println(singlePatten1)

    println(SinglePatten.getInstance())

}

class SinglePatten private constructor() {
    companion object {
        private var instance: SinglePatten? = null
        fun getInstance() {
            if (instance == null) {
                instance = SinglePatten()
            }
        }
    }

}

class SinglePatten1 {

}

fun oopPractice() {

    // ClassPractice()
    //NestedIneerClass()
    //ConstratorPractice()
    //DataClass()
    Extensionfun()
}

fun String.getTotalCharCount(input: String?): Int {
    return input?.length ?: 0
}

fun Extensionfun() {
    var input: String = "Bangladesh"

    var result: Int = input.getTotalCharCount(input)

    println("Extension Function total Char count : " + result)
}

fun DataClass() {

    val list: ArrayList<String> = ArrayList<String>()
    list.add("ruhul")

    list[0].toString()
    list[1].toString()

    val countryList: ArrayList<Country> = arrayListOf()

    countryList.add(Country("Bangladesh", 88))
    countryList.add(Country("usa", 1))
    countryList.add(Country("japan", 25))

    for (Country in countryList) {
        println("Country Name: " + Country.name + " country Code: " + Country.countryCode)
    }

}

data class Country(val name: String?, val countryCode: Int)

fun ConstratorPractice() {
    PrimaryConstractor()
    Secondaryconstructor()
    SecondaryConstractorCallSuperDerived();
}

fun SecondaryConstractorCallSuperDerived() {

    var persion1 = MdRahul("", "")

}

open class Persion {

    constructor(name: String?, id: String?) {
        println(name)
        println(id)
    }

    constructor(name: String?, id: String?, password: String?) {
        println(name)
        println(id)
        println(password)
    }
}

class MdRahul : Persion {
    constructor(name: String?, id: String?) : super(name, id) {

    }

    constructor(name: String?, id: String?, password: String?) : super(name, id, password) {

    }

}

fun Secondaryconstructor() {
    val s1 = Student2("Md", 510, "Cse")
    s1.display()
}

fun PrimaryConstractor() {
    val student1 = Student1("Md", 510, "Cse")
    student1.display()
}

class Student2() {
    var name: String? = null
    var roll: Int? = null
    var department: String? = null

    constructor(name: String?, roll: Int?, department: String?) : this() {
        this.name = name
        this.roll = roll
        this.department = department
    }

    constructor(name: String?, roll: Int?) : this() {
        this.department = department
    }

    fun display() {
        println("Name: " + name)
        println("roll: " + roll)
        println("depertment: " + department)
    }

}

class Student1(name: String?, roll: Int?, department: String) {
    var name: String? = null
    var roll: Int? = null
    var department: String? = null

    init {
        println("Primary Constructor")
        this.name = name
        this.roll = roll
        this.department = department
    }

    fun display() {
        println("Name: " + name)
        println("roll: " + roll)
        println("depertment: " + department)
    }
}

fun NestedIneerClass() {
    val student = Student("ruhul", 510, "01767051482")
    student.display()
    //Inner Class
    println(student.StudentDepartment().departmentOfGroup)

    //Nested class
    val common = Student.studentCommon()
    println(common.depertment)
    println(common.name)

}

fun ClassPractice() {
    val student = Student(null, 510, "01767051482")
    student.display()

}

class Student() {

    var name: String? = null
    var roll: Int? = null
    var phone: String? = null

    constructor(name: String?, roll: Int?, phone: String?) : this() {
        this.name = name
        this.roll = roll
        this.phone = phone
    }

    fun display() {
        if (name != null && roll != null && phone != null) {
            println("Student Name: " + name)
            println("Student roll: " + roll)
            println("Student phone: " + phone)
        } else {
            println("Problem...")
        }

    }

    class studentCommon() {
        var name: String = "Cse"
        var depertment: String = "Computer Technology"
    }

    inner class StudentDepartment() {
        var departmentOfGroup: String = "Science"
    }


}


fun CollectionPractice() {

    MapPractice()
    SetPractice()
    ListPractice()


}

fun ListPractice() {

    var listItem = listOf<Int>()

    var listItem1: ArrayList<Int> = arrayListOf<Int>()
    listItem1.add(1)

}

fun SetPractice() {
    val setList = setOf<Int>(1, 1, 2, 3, 4, 5, 5, 1, 4)
    for (item in setList) {
        println("Set item : " + item)
    }

    var setList1: MutableSet<Int> = mutableSetOf<Int>()
    setList1.add(10)

    var hashSet: HashSet<Int> = HashSet<Int>()
    hashSet.add(10)

    var hassetList = setOf<Int>()


}

fun MapPractice() {

    val ranks = mapOf(1 to "India", 2 to "Australia", 3 to "England", 4 to "Africa")

    var mapList: Map<Int, String> = mapOf<Int, String>()
    mapList = ranks

    for (i in 1..mapList.size) {
        println(mapList.get(i))
    }


    var hasMapList: HashMap<String, String> = HashMap<String, String>()
    hasMapList.put("Name", "MD Ruhul Amin")
    hasMapList.put("Subject", "CSE")

    for (item in hasMapList) {
        println(item.value)
    }

    var mutableMapList: MutableMap<String, String> = mutableMapOf<String, String>()
    mutableMapList.put("Name", "Md Rahul ")
    mutableMapList.put("Roll", "300510")


}

fun ElvisOperator() {
    var text: String = null ?: "Test Txt"
    println(text)
}

fun UnsafeandSafeCastOperator() {
    /*Unsafe cast operator: as*/
    var input: Any? = null
    var number: Int = 10

    /*    var res = input as String
        var num = number as String

        println(res)
        println(num)*/


    /*safe cast operator: as?*/
    var res1 = input as? String
    var num1 = number as? String

    println(res1)
    println(num1)

}

fun SmartCast() {

    var name: String? = "Rahul Amin"
    if (name != null) {
        println(name.length)
    }

    var name1: String? = "Amin"

    // println(name1.length)

    if (name1 is String) {
        println(name1.length)
    }


}

fun NullSafety() {

    var input: String?
    var input1: String?

    input = null
    input = "this is test"
    input1 = input

    if (input == null) {
        println("null value")
    }

    println(input)
    println(input1)

    /*    val str: String = null // compile error
        str = "hello" // compile error Val cannot be reassign
        var str2: String = "hello"
        str2 = null // compile error  */


}

fun ExceptionHandling() {
    /*   try
         catch
         finally
         throw
         */



    try {
        var number: Int = 20;
        var res: Int = number / 0


    } catch (e: Exception) {
        println("Exception: " + e)

    } catch (e: ArithmeticException) {
        println("ArithmeticException ")
    } finally {
        println("Ok Next Step Execute")

    }

}

fun FunctionKotlin() {
    /*    Standard library function
            User defined function*/

    //UserDefineAndLibraryFunction();
    var totalFactorial = factorialValue(5)
    println("total Factorial: " + totalFactorial)

    KotlinDefaultArgument(10)

    HigherOrderFunctionWithLamda(10, 20) { result ->
        println("Higher Order Function: " + result)

    };

    HOrderfunc(10, 10) { result ->

    }

    HigherOrderFunctionWithLamda1(10, result = { result ->
        println("Higher Order Function: " + result)

    }, 10)

    higherOrderfun(10, 20) { result ->
        println(result)

    }


}

fun HOrderfunc(i: Int, i2: Int, result: (Int) -> Unit) {


}

fun higherOrderfun(i: Int, i1: Int, result: (Int) -> Unit) {
    val res = i + i1
    result(res)
}

fun HigherOrderFunctionWithLamda(i: Int, i1: Int, result: (Int) -> Unit) {
    val res = i + i1
    result(res)

}

fun TestFun(i: Int, i2: Int, result: (Int) -> Unit) {

    result(i + i2)

}

fun HigherOrderFunctionWithLamda1(i: Int, result: (Int) -> Unit, i1: Int) {
    val res = i + i1
    result(res)

}

fun KotlinDefaultArgument(i: Int = 1, i1: Int = 2, latter: Char = 'c') {

    println("i " + i)
    println("i1 " + i1)
    println("latter " + latter)

}

fun factorialValue(i: Int): Int {
    if (i == 0) {
        return 1
    } else {
        return i * factorialValue(i - 1)
    }
}

fun UserDefineAndLibraryFunction() {
    var i = 10
    var result = Math.sqrt(i.toDouble())
    println("Result: " + result)

    //User Defined Function
    var r = add(1, 2)
    println("Result of two Value: " + r)
}

fun add(i: Int, i1: Int): Int {

    return i + i1
}

fun ControlFlow() {
    //ifElseFunction()
    //WhenExpressen()
    // forLoop()
    whileLoop()
}

fun whileLoop() {
    var i: Int = 0/*    while (i < 5) {
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

fun DataTypePractice() {/*    Number
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
    var input = "Md, \n Ruhul"/*2.Raw String*/
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