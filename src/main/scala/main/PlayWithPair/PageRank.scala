package main.PlayWithPair

import org.apache.spark.{HashPartitioner, SparkContext}

/**
  * Created by zhou1 on 2019/3/24.
  */
object PageRank {
  def main(args: Array[String]) {
    val master = args.length match {
      case x: Int if x > 0 => args(0)
      case _ => "local"
    }
    val sc = new SparkContext(master, "BasicMap", System.getenv("SPARK_HOME"))


    //scala的seq是java的list，list是linkedList
    var links = sc.parallelize(List((1,Seq(2,3,4)), (2,Seq(1,3)), (3,Seq(1)),(4,Seq(3)))).partitionBy(new HashPartitioner(100)).persist()

//    println(links.groupByKey().collect().mkString(","))
    // 将每个页面的排序值初始化为1.0;由于使用mapValues，生成的RDD
    // 的分区方式会和"links"的一样
//    println(links.collect().mkString(","))
    var ranks = links.mapValues(v => 1.0)
//    println(ranks.collect().mkString(","))

    //在这一时刻，有两个
//     运行10轮PageRank迭代
    for(i <- 0 until 1) {
      val contributions = links.join(ranks).flatMap {
        case (pageId, (links, rank)) =>
//          println((links,rank).getClass())

          links.map(dest => (dest, rank / links.size))
      }
      println(contributions.collect().mkString(","))
      ranks = contributions.reduceByKey((x, y) => x + y).mapValues(v => 0.15 + 0.85*v)
    }
    // 写出最终排名
//    ranks.saveAsTextFile("ranks")
  }
}
