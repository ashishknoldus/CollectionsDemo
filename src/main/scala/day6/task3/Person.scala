package day6.task3

class Person(val name: String, val age: Int) extends Ordered[Person] {

  override def compare(that: Person): Int = {

    if ((this.name == that.name) || this.name.length == that.name.length) {
      val result = this.age - that.age
      if (this.age > that.age) 1
      else if (this.age < that.age) -1
      else 0
    }
    else if (this.name.length > that.name.length) 1 else -1
  }
}

object Comparison {

  def main(args: Array[String]): Unit = {
    val personOne = new Person("AshishJi", 28)
    val personTwo = new Person("Ashish", 28)

    //println(personTwo.compare(personOne))
    println(personOne < personTwo)
  }
}
