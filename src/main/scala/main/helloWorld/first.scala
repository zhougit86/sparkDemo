package main.helloWorld

import main.DemoClass.DemoClass

/**
  * Created by zhou1 on 2019/3/22.
  */
object first {
  def main(args:Array[String]){
    println("haha")

    //class的定义方法
//    var aa: DemoClass = new DemoClass()
//    aa.shout()
//
//    val square2 = (x:Int)=>{println(x*2)}
//
//    //函数式编程的方法
//    val numList = List(1, 2, 3, 4, 5, 6)
////    for(a<-numList){
////      println(a)
////    }
//    //函数方法1
//    numList.foreach(square)
//    //函数方法2
//    numList.foreach(square2)


    val answer = 2;
    var answer1 = 2;

    answer1 = answer1 +1 ;
//    System.err.println(answer)
//    System.err.println(answer1)
//
//    1.to(10).foreach(u=>println(u))
    for (i <- 1 until 10){
      System.err.println(i)
    }

    undefArgs(1,8,6,9,66);

  }

  //方法的定义方法
  def square(a: Int):Unit = {
    println(a*a)
  }

  def undefArgs(input: Int*) {
    var result :Int = 0;
    for ( i <- input) result+=i
    System.err.println(result)
  }
}
