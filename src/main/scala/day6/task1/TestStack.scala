package day6.task1

class StackImplementation{

  var stack: List[Int] = List.empty
  var top: Int = -1

  def push(item: Int): Unit = {
    top = top + 1
    stack = stack ::: List(item)
    println("Item is pushed to stack..")
  }

  def pop(): Unit = {
    if(top == -1){
      println("Stack Underflow..")
    }
    else{
      stack = stack.dropRight(1)
      top = top - 1
      println("Item is popped from the stack..")
    }
  }

  def getStack: Unit = {
    println(stack)
  }
}

object TestStack {
  def main(args: Array[String]): Unit = {
    val stack = new StackImplementation
    stack.push(5)
    stack.push(8)
    stack.push(2)
    stack.push(16)
    stack.pop()
    stack.getStack

  }
}