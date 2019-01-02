package lectures.part2oop

// constructor
class Person(name: String, val age: Int) {
  // body
  val x = 2

  println(1 + 3)

  def greet(name: String) = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet()= println(s"Hi, I am ${this.name}")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}
