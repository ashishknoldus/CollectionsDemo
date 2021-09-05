package day6.task1

object StackImpl {

  def main(args: Array[String]): Unit = {

    // How to initialize a Stack using an Immutable List
    val stack1: List[String] = List("Plain Donut", "Strawberry Donut", "Chocolate Donut")
    println(s"Using an Immutable List for stack, elements are = $stack1")

    //Push one element at the top of the stack using :: of Immutable List
    val stack2: List[String] = "Vanila Donut" :: stack1
    println(s"Using an Immutable List for stack, elements after push = $stack2")

    //Push N elements at the top of the stack using :: of Immutable List
    val stack3: List[String] = "Glazed Donut" :: "Vanila Donut" :: stack1
    println(s"Using an Immutable List for stack, elements after push = $stack3")

    //Pop Element
    val stack4: List[String] = stack3.tail
    println(stack3.tail)

    //Step 6: How to initialize an empty Stack using Immutable List
    val emptyStack: List[String] = List.empty[String]
    println(s"Using an Immutable List for stack, the empty stack = $emptyStack")

  }
}
