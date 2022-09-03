package Kotline

interface Eat {
    fun eat()
}

interface Moved {
    fun moved()
}

interface Look {
    fun look()
}

abstract class Animal : Eat, Moved, Look {
    var isLife: Boolean = true
    override fun eat() {
        println("I can Eat")

    }

    override fun look() {
        println("I can look")
    }

    override fun moved() {
        println("I can moved")
    }

}

class Human : Animal {
    var name: String? = null

    constructor(name: String) {
        this.name = name
    }

    override fun eat() {
        println("Im a ${name} . I Can Eat")
    }

    override fun look() {
        println("Im a ${name} . I Can look")
    }

    override fun moved() {
        println("Im a ${name} . I Can Moved")
    }

    fun Speak() {
        println("Im a ${name} . I Can Speak")

    }
}

class Dog : Animal {

    var name: String? = null

    constructor(name: String) {
        this.name = name
    }

    override fun eat() {
        println("Im a ${name} . I Can Eat")
    }

    override fun look() {
        println("Im a ${name} . I Can look")
    }

    override fun moved() {
        println("Im a ${name} . I Can moved")
    }

    fun bark() {
        println("Im a ${name} . I Can bark")

    }
}

fun main() {

    var human: Human = Human("Human")
    human.eat()
    human.Speak()
    human.isLife
    human.moved()
    human.look()

    println()


    var dog: Dog = Dog("Dog")
    dog.eat()
    dog.isLife
    dog.moved()
    dog.look()
    dog.bark()


}