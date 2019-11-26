package com.explorati.scala.chapterFour

/**
  *
  * @ Author : Weijian_Wang
  * @ Date : Created in 18:44 2019/11/26 0026
  * @ Description ： 
  */
object Apply {
  def main(args: Array[String]): Unit = {
//    for(i <- 1 to 10) {
//      ApplyTest.incr
//    }
//
//    println(ApplyTest.count)  //10  说明object本身就是一个单例对象

    val b = ApplyTest()  // ==> object.apply

    println("----------------------")
    var c = new ApplyTest()
    println(c)
    c()

    //类名() => object.apply
    //对象() => class.apply
  }
}

/**
  * 伴生类和伴生对象
  * 如果有一个class，还有一个与class同名的object 互为 伴生类和伴生对象
  */
class ApplyTest{
  def apply() = {
    println("Object ApplyTest apply...")

  }
}

object ApplyTest{
  println("Object ApplyTest enter...")

  var count = 0
  def incr = {
    count += 1
  }

  def apply() = {
    println("Object ApplyTest apply...")

    //在object中的apply中new class
    new ApplyTest
  }

  println("Object ApplyTest leave...")
}
