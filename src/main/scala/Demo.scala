import scala.io.Source

object Demo {
  def main(args: Array[String]) {
    val firstpath = "C:\\spark-3.1.2-bin-hadoop3.2\\elonmusk_tweets.csv"
    val firatSource = Source.fromFile(fpath)
    println {
      "Reading File:"
    }
    for (line <- fSource.getLines) {
      println(line)

    }
    fSource.close()
  }
}
