package com.explorati.scala.chapterFour

/**
  *
  * @ Author : Weijian_Wang
  * @ Date : Created in 0:41 2019/11/26 0026
  * @ Description ： 
  */
object SimpleObject {

  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name = "Messi"
//    println(person.name + ".." + person.age)
    println("invoke eat method: " + person.eat)
    person.watchFootball("Barcelona")

    person.printInfo()
    //编译不通过 private 修饰
//    println(person.gender)
  }
}

class People {
  //var(变量)类型自动生成getter/setter
  var name: String = _
  //val(常量)类型自动生成getter
  val age: Int = 10

  private [this] var gender = "male"

  def printInfo() : Unit = {
    print("gender: " + gender)
  }

  def eat(): String = {
    name + " eat..."
  }

  def watchFootball(teamName: String): Unit = {
    println(name + " is watching match of " + teamName)
  }
}