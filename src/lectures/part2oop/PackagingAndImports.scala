package lectures.part2oop

import playground.{Cindarella => Princess, PrinceCharming}

object PackagingAndImports extends App {

  // package members are accesible by their simple name
  val writer = new Writer("Daniel", "RockTheJVM", 2018)

  // import the package
  val princess = new Princess
  // val princess = new playground.Cindarella

  // packages are in hierarchy
  // matching folder structure.

  // package object
  sayHello
  println(SPEED_OF_LIGHT)

  // imports
  val prince = new PrinceCharming

}
