package main.PlayWithPair

import org.apache.spark.SparkContext

/**
  * Created by zhou1 on 2019/3/22.
  */
object PlayWithPair {
  def main(args: Array[String]) {
    val master = args.length match {
      case x: Int if x > 0 => args(0)
      case _ => "local"
    }
    val sc = new SparkContext(master, "BasicMap", System.getenv("SPARK_HOME"))
    var input = sc.parallelize(List("0 10",
      "1 70",
      "2 20",
      "3 90",
      "0 20",
      "1 100"
    ))

    val pairs = input.map(x => (x.split(" ")(0), x.split(" ")(1)))

//    println(pairs.groupByKey().collect().mkString(","))
    //实际再reduce阶段就没有key这个概念了
    val result = pairs.reduceByKey(
      (x, y) => x + y
    )

//    result.sortByKey()
//    val result = input.map(x => "number:" + x)
    println(result.collect().mkString(","))
  }

  def filterFun(a:Int):Boolean={
    return a!=3
  }
}
