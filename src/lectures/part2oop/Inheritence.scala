package lectures.part2oop

object Inheritence extends App {

  // single class inheritance
  sealed class Animal {

    val creatureType = "wild"
    def eat = println("omnomnom")

  }


  class Cat extends Animal {

    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch


  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
//    override val creatureType: String = "domestic"

    override def eat: Unit = {
      super.eat
      println("crunch, crunch")
    }
  }

//  class Dog(dogType: String) extends Animal {
//    override val creatureType: String = dogType
//  }

  val dog = new Dog("K9")
  dog.eat

  println(dog.creatureType)


  // type substitution
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // overRIDING vs overLOADING

  // super

  // preventing overrides
  // 1 - final on member
  // 2 - final on entire class
  // 3 - seal the class = extend classes in THIS FILE, prevent extension in other files




}
