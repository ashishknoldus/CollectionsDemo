package com.list

object ListDemo {
  def main(args: Array[String]):Unit ={
    var myList: List[String]= List("This","Is","List","Demo")
    myList = myList :+ "Live"
    var index : Int = myList.size-1
    println(myList.apply(index))
    //println(myList(index))  //same o/p

    println(myList)
  }
}
