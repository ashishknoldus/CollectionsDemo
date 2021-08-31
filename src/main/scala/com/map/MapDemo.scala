package com.map

object MapDemo {
  def main(args: Array[String]): Unit = {
    val stud1 = Map(12 -> "Reena", 13 -> "Meena", 14 -> "Salima")
    val stud2 = Map(15 -> "Raju", 16 -> "Manoj", 17 -> "Sanoj")

    var student = stud1 ++ stud2
    println("stud1 ++ stud2 : " + student)

    val stu = stud1.++(stud2)
    println("stud1.++(stud2)) : " + stu)

    stud2.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + stud2(i))
    }

    if (stud2.contains(15)) {
      println("Student Id 15 exists with value :" + stud2(15))
    } else {
      println("Student Id with 15 does not exist")
    }
  }
}