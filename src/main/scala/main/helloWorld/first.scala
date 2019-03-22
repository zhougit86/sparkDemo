package main.helloWorld

import main.DemoClass.DemoClass

/**
  * Created by zhou1 on 2019/3/22.
  */
object first {
  def main(args:Array[String]):Unit = {
    println("haha")

    //class的定义方法
    var aa: DemoClass = new DemoClass()
    aa.shout()

    val square2 = (x:Int)=>{println(x*2)}

    //函数式编程的方法
    val numList = List(1, 2, 3, 4, 5, 6)
//    for(a<-numList){
//      println(a)
//    }
    //函数方法1
    numList.foreach(square)
    //函数方法2
    numList.foreach(square2)


  }

  //方法的定义方法
  def square(a: Int):Unit = {
    println(a*a)
  }
}
