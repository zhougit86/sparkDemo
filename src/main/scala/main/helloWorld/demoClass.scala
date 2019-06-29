package main.helloWorld

import main.DemoClass.Person

object demoClass {
  def main(args:Array[String]): Unit ={
    var person = new Person(30)
    System.err.println(person.age)
    person.age = 10
    System.err.println(person.age)

  }
}
