package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String, val age: Int) {
    def likes(movie: String): Boolean = movie == favouriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}."
    def +(text: String): Person = new Person(s"$name ($text)", favouriteMovie, age)
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def unary_! : String = s"$name, what the heck?!"
    def isAlive: Boolean = true
    def learns(sth: String): String = s"$name learns $sth"
    def learnsScala = this learns "Scala"
    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"
    def apply(n: Int): String = s"$name watched $favouriteMovie $n times."
  }


  val mary = new Person("Mary", "Inception", 20)
  println(mary.likes("Inception"))
  println(mary likes "Inception") // infix notation

  val tom = new Person("Tom", "Fight Club", 21)
  println(mary + tom)

  // prefix notation

  val x = -1
  println(!mary)

  // postfix notation

  println(mary.isAlive)
  println(mary isAlive)

  // apply

  println(mary.apply())
  println(mary())


  /*
    1. Overload the + operator
       mary + "the rockstar" => new person "Mary (the rockstar)"


    2. Add an age to the Person class
       Add a unary + operator => new person with the age + 1
       +mary => mary with the age incrementer

    3. Add a "learns" method in the Person class = "Mary learns Scala"
       Add a learnsScala method, calls method with "Scala".
       Use it in postfix notation.

    4. Overload the apply method
       mary.apply(2) => "Mary watched Inception 2 times"
   */

  println((mary + "the Rockstar")())

  println((+mary).age)

  println(mary learns "Scala")
  println(mary learnsScala)

  println(mary(2))

}
