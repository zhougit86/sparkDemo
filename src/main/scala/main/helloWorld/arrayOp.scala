package main.helloWorld


object arrayOp {
  def main(args:Array[String]): Unit ={
    val s = Array("Hello","World")
    for (iPart <- s){
      System.err.println(iPart)
    }

    val src = Array(1,2,3,4,5,6)
    val tgt = for (i<-src) yield  i*i

//    tgt.foreach(u=>System.err.println(u))

    System.err.println(tgt.mkString(","))
  }

}
