package com.explorati.scala.chapterFour

/**
  *
  * @ Author : Weijian_Wang
  * @ Date : Created in 10:55 2019/11/26 0026
  * @ Description ： 
  */
object Constructor {

  def main(args: Array[String]): Unit = {
    val person = new Person("Messi", 32)
    ////    println(person.name + " : " + person.age + " : " + person.school)
    ////
    ////    val person2 = new Person("C罗", 34, "M")
    ////    println(person2.name + " : "
    ////           + person2.age + " : "
    ////           + person2.gender + " : "
    ////           + person2.school
    ////    )
    println(person)
    val student = new Student("PK", 18, "Math")
    println(student.name + " : " + student.age + " : " + student.major + student.school)
  }
}

//主构造器
class Person(val name: String, val age: Int){
  println("Person constructor enter...")

  val school = "ustc"
  var gender: String = _

  //附属构造器
  def this(name: String , age: Int, gender: String){
    this(name, age)   //必须要调用主构造器或者其他附属构造器
    this.gender = gender
  }

  override def toString = "test override"
  println("Person Constructor leave...")
}

class Student(name: String, age: Int, var major: String) extends Person(name, age) {

  override val school = "female"
  println("Person Student enter...")

  println("Person Student leave...")
}