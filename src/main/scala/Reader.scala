import scala.io.StdIn

object Reader {
  def readMultipleLinesFromInput(): List[String] = {
    var input = ""
    var line = ""
    while ({line = StdIn.readLine(); line != ""}) {
      input += s"$line,"
    }
    input.split(",").toList
  }
}
