package main.BasicMap

import org.apache.spark._

/**
  * Created by zhou1 on 2019/3/22.
  */
object BasicMap {
  def main(args: Array[String]) {
    val master = args.length match {
      case x: Int if x > 0 => args(0)
      case _ => "local"
    }
    val sc = new SparkContext(master, "BasicMap", System.getenv("SPARK_HOME"))
    var input = sc.parallelize(List(1,2,3,4))
    val input1 = sc.parallelize(List(5,4))
    val input2= input.union(input1)
    input = input2.filter(filterFun)

    val result = input.map(x => "number:" + x)
    println(result.collect().mkString(","))
  }

  def filterFun(a:Int):Boolean={
//    )    println(a
    return a!=3
  }
}
