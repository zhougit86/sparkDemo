package main.WordCount

import org.apache.spark._
import org.apache.spark.SparkContext._

/**
  * Created by zhou1 on 2019/3/22.
  */

//spark-submit --class main.WordCount.WordCount ./sparkdemo-1.0-SNAPSHOT.jar  /input/myfile.txt /output/out
object WordCount {
  def main(args: Array[String]) {
    val inputFile = args(0)
    val outputFile = args(1)
    val conf = new SparkConf().setAppName("wordCount")
    // Create a Scala Spark Context.
    val sc = new SparkContext(conf)
    // Load our input data.
    val input =  sc.textFile(inputFile)
    // Split up into words.
    val words = input.flatMap(line => line.split(" "))
    // Transform into word and count.
    //todo: check what is this reduceByKey
    val counts = words.map(word => (word, 1)).reduceByKey{case (x, y) => x + y}
    // Save the word count back out to a text file, causing evaluation.
    counts.saveAsTextFile(outputFile)
  }
}
