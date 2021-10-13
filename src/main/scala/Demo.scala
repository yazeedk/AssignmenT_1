import scala.io.Source

object Demo {
  def main(args: Array[String]) {
    val fpath = "C:\\spark-3.1.2-bin-hadoop3.2\\elonmusk_tweets.csv"
    val fSource = Source.fromFile(fpath)
    println {
      "Reading File:"
    }
    for (line <- fSource.getLines) {
      println(line)

    }
    fSource.close()
  }
}