package com.sorting
object SortingDemo {
  def main(args: Array[String]): Unit ={
    val a = Array(5, 3, 4, 7, 1)
    var needsSorting = true

    while (needsSorting) {
      needsSorting = false
      for (i <- 0 until (a.length - 1)) {
        if (a(i) > a(i + 1)) {
          var tempVal: Int = a(i)
          a(i) = a(i + 1)
          a(i + 1) = tempVal
          needsSorting = true
        }
      }
    }

    println(a.iterator.mkString(", "))
  }
}
