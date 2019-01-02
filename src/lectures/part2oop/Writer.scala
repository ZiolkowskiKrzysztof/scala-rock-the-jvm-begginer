package lectures.part2oop

class Writer(firstname: String, surname: String, val year: Int) {
  def fullname(): String = firstname + " " + surname
}