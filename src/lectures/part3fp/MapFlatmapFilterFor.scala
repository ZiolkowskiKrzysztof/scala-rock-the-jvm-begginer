package lectures.part3fp

object MapFlatmapFilterFor extends App {

  val list = List(1, 2, 3)
  println(list)
  println(list.head)
  println(list.tail)

  // map
  println()
  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

  // filter
  println(list.filter(_ % 2 == 0))

  // flatMap
  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

  // print all combinations between two lists
  val numbers = List(1, 2, 3, 4)
  val chars = List('a', 'b', 'c', 'd')
  val colors = List("black", "white")

  // "ITERATING"
  val combinations = numbers.flatMap(n => chars.map(c => "" + c + n))
  val combinations2 = numbers.flatMap(n => chars.flatMap(c => colors.map(color => "" + c + n + "-" + color)))
  println(combinations)
  println(combinations2)

  // foreach
  list.foreach(println)

  // for-comprehansion <3
  val forCombinations = for {
    n <- numbers
    c <- chars
    color <- colors
  } yield "" + c + n + "-" + color

  println(forCombinations)

  val forCombinations2 = for {
    n <- numbers if n % 2 == 0
    c <- chars
    color <- colors if color == "white"
  } yield "" + c + n + "-" + color

  println(forCombinations2)

  println('\n')

  for {
    n <- numbers
  } println(n)

  // syntax overload
  list.map { x =>
    x * 2
  }

  /*
    1. MyList supports for comprehansions?
    2. A small collection of at most ONE element - Maybe[+T]
      - map, flatMap, filter
   */


}
