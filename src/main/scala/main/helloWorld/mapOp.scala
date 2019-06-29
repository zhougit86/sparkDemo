package main.helloWorld

import scala.collection.mutable


object mapOp {

  def main(args:Array[String]): Unit ={
    //map  ,   只有这边写的时候是有new的
    val myMap = new mutable.HashMap[Int,String]
    myMap.+((1,"haha"))

    //元祖
    val myTuple = (1,'a',"haha")

    System.err.println(myTuple)


    val left = Array("a","b","c")
    val right = Array(1,2,3)

    val combine = left.zip(right)

    combine.foreach(u=>System.err.println(u))
  }

}
