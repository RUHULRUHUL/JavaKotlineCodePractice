package Kotline

abstract class Department {
    val departmentCode: String = "...123...456"
    var CollageName: String = "TPI"
    var Semester: String = "8th"
    var Group: String = "B"
    var Subject: String = "Computer"

    var test: String? = null

    abstract fun display()

    fun info() {
        println("CollageName " + CollageName)
        println("Semester " + Semester)
        println("Group " + Group)
        println("Subject " + Subject)
    }

}

class Student : Department {

    var name: String? = null

    constructor(name: String?) {
        this.name = name

    }

    override fun display() {
        println("Student Name: " + name)
        info()

    }

}

abstract class Bank {
    abstract fun interest(p: Int, r: Double, t: Int): Double
}

class Sbi : Bank() {
    override fun interest(p: Int, r: Double, t: Int): Double {
        return (p * r * t) / 100
    }

}

class BangladeshBank : Bank() {
    override fun interest(p: Int, r: Double, t: Int): Double {
        return (p * r * t) / 100
    }

}

fun main() {
    val student = Student("Md Rahul")
    student.display()

/*    var bank = Sbi()
    var totalInterest: Double? = bank.interest(100, 5.00, 15)
    println("Sbi Bank Intereste: " + totalInterest)
    println()

    var bdBank = BangladeshBank()
    var bdtotalInterest: Double? = bdBank.interest(100, 5.00, 15)
    println("Bd Bank Intereste: " + bdtotalInterest)*/


}