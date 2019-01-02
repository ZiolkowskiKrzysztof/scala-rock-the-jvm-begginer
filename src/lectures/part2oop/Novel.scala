package lectures.part2oop

class Novel(name: String, yearOfRelease: Int, author: Writer) {

  def authorAge: Int = yearOfRelease - author.year

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYearOfRelease: Int): Novel = new Novel(this.name, newYearOfRelease, this.author)
}