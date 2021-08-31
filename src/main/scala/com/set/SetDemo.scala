package com.set

object SetDemo {
  def main(args: Array[String]): Unit = {
    val fruit = Set("apples", "oranges", "pears")
    val fruit1 = Set("mangoes", "banana")
    val nums: Set[Int] = Set()

    println( "Head of fruit : " + fruit.head )
    println( "Tail of fruit : " + fruit.tail )
    println( "Check if fruit is empty : " + fruit.isEmpty )
    println( "Check if nums is empty : " + nums.isEmpty )

    // use two or more sets with ++ as operator
    var fruit2 = fruit ++ fruit1
    println( "fruit1 ++ fruit2 : " + fruit2 )

    // use two sets with ++ as method
    fruit2 = fruit.++(fruit1)
    println( "fruit1.++(fruit2) : " + fruit2 )

    val num1 = Set(5,6,9,20,30,45)
    val num2 = Set(50,60,9,20,35,55)

    // find common elements between two sets
    println( "num1.&(num2) : " + num1.&(num2) )
    println( "num1.intersect(num2) : " + num1.intersect(num2) )
  }
}
