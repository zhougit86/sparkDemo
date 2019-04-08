package main.ScalaAdvanced

/**
  * Created by zhou1 on 2019/3/24.
  */
object Closure {
  //第一种闭包
  def multiplier (i: Int): Int = {
    factor = factor + 1
    return i * factor
  }

  var factor: Int = 6

  //第二种闭包
  def multiMake(a:Int) = (b:Int) => a*b

  def main(args: Array[String]) {
    System.err.println(multiplier(1))
    System.err.println(multiplier(1))

    val multiTwo = multiMake(2)
    System.err.println(multiTwo(5))


    //用于初始化一个Array，scala中的()可以类比[],[]可以类比<>
    var z = new Array[String](3)
    z(0) = "Runoob"; z(1) = "Baidu"; z(2) = "Google"
    for ( x <- z ) {
      println( x )
    }

    val it = z.toIterator
    while(it.hasNext){
      println(it.next())
    }
  }
}
