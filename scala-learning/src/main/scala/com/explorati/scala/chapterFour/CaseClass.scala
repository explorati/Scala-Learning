package com.explorati.scala.chapterFour

/**
  *
  * @ Author : Weijian_Wang
  * @ Date : Created in 20:24 2019/11/26 0026
  * @ Description ： 
  */
//通常用在模式匹配
object CaseClass {

  def main(args: Array[String]): Unit = {
    println(Dog("wangcai").name)
  }
}

//case class 不用new
case class Dog(name: String)
