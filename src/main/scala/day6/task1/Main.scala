package day6.task1

object Main extends App {

  var list: LinkedList[Int] = new LinkedList()

  list.push(1)
  list.push(2)
  list.push(3)
  list.print()
  list.delete(1)
  list.print()
  list.reverse()
  list.print()
  println(list.getDataByIndex(1))
  list.prepend(23)
  list.print()
  list.reverse()
  list.print()
}