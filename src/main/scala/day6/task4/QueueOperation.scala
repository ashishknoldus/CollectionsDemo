/*Task 4: Make a trait Queue which performs two functions of enqueue and dequeue.
*Two classes: DoubleQueue and SquareQueue mix in this trait.
*You may use List for the implementation and keep both the classes in the same file with proper
packaging.
DoubleQueue enqueues the element after doubling them
SquareQueue enqueues the element after squaring them
The dequeue method removes the first element from the queue(having a concrete definition in the trait
Queue).*/

package day6.task4

trait Queue {
  var queue: List[Double] = List.empty
  var front: Int = -1
  var rear: Int = -1

  def enqueue(item: Double)

  def dequeue: Unit = {
    if (front == -1 && rear == -1) {
      println("Underflow..")
    }
    else if (front == rear) {
      queue = queue.drop(1)
      front = -1
      rear = -1
      println("Item dequeued..")
    }
    else {
      queue = queue.drop(1)
      front = front + 1
      println("Item dequeued..")
    }
  }

}


class DoubleQueue extends Queue {

  override def enqueue(item: Double): Unit = {
    var res = item * 2
    if (rear == -1 && front == -1) {
      front = front + 1
      rear = rear + 1
      queue = queue ::: List(res)
      //println("Queue is : " + queue)
      //println("Item is enqueued.")
    }
    else {
      rear = rear + 1
      var res = item * 2
      queue = queue ::: List(res)
      //println("Queue is : " + queue)
      //println("Item is enqueued..")
    }
  }

  def getQueue: Unit = {
    println("Queue after doubling each element : " + queue)
  }
}

class SquareQueue extends Queue {

  override def enqueue(item: Double): Unit = {
    var res = item * 2
    if (rear == -1 && front == -1) {
      front = front + 1
      rear = rear + 1
      queue = queue ::: List(res)
      //println("Queue is : " + queue)
      //println("Item is enqueued.")
    }
    else {
      rear = rear + 1
      var res = item * 2
      queue = queue ::: List(res)
      //println("Queue is : " + queue)
      //println("Item is enqueued..")
    }
  }

  def getQueue: Unit = {
    println("Queue after squaring each element : " + queue)
  }

}

object QueueOperation {

  def main(args: Array[String]): Unit = {
    var dq = new DoubleQueue
    dq.enqueue(6)
    dq.enqueue(8)
    dq.getQueue
    dq.dequeue
    dq.getQueue
    println()
    var sq = new SquareQueue
    sq.enqueue(8)
    sq.enqueue(2)
    sq.getQueue
    sq.dequeue
    sq.getQueue

  }
}