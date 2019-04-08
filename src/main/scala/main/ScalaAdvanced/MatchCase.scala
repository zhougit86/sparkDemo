package main.ScalaAdvanced

/**
  * Created by zhou1 on 2019/3/24.
  */
object MatchCase {

  //Any就是类似于Java Object
  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
      //匹配到特定类型的输入的时候
    case y: Int => "scala.Int"
      //这个类似于是兜底的default
    case _ => "many"
  }

  def main(args: Array[String]) {
    println(matchTest("two"))
    println(matchTest("test"))
    println(matchTest(1))
    println(matchTest(6))

  }

}
