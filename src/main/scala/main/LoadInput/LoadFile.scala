package main.LoadInput

import org.apache.spark.SparkContext

/**
  * Created by zhou1 on 2019/3/24.
  */
object LoadFile {
  def main(args:Array[String]):Unit={
    val master = args.length match {
      case x: Int if x > 0 => args(0)
      case _ => "local"
    }
    val sc = new SparkContext(master, "BasicMap", System.getenv("SPARK_HOME"))

    val input =  sc.textFile("myfile.txt")
    // Split up into words.
    val words = input.flatMap(line => line.split(" "))
    // Transform into word and count.
    //todo: check what is this reduceByKey
    val counts = words.map(word => (word, 1)).reduceByKey{case (x, y) => x + y}

    System.out.println(counts.collect().mkString(","))
  }
}
