import org.apache.spark.sql.expressions._
import org.apache.spark.sql.functions._



object percentage {
  var df=sc.textFile("C:\\spark-3.1.2-bin-hadoop3.2\\elonmusk_tweets.csv")

  val df = sc.parallelize(Seq(
    ("A", "X", 2, 100), ("A", "X", 7, 100), ("B", "X", 10, 100),
    ("C", "X", 1, 100), ("D", "X", 50, 100), ("E", "X", 30, 100)
  )).toDF("c1", "c2", "Val1", "Val2")

  val df2 = df
    .groupBy("c1")
    .agg(sum("Val1").alias("sum"))
    .withColumn("fraction", col("sum") /  sum("sum").over())

  df2.show


}
