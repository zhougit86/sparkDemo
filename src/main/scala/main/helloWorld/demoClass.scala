package main.helloWorld

import main.DemoClass.Person

object demoClass {
  def main(args:Array[String]): Unit ={
    var person = new Person(30)
    var person1 = new Person(30)
    var person2 = new Person(30)
    var person3 = new Person(30)
    System.err.println(person.age)
    person.age = 10
    System.err.println(person.age)

  }
}
