import scala.io.StdIn

object Day1 extends App {
  var input = ""
  var line = ""
  while ({line = StdIn.readLine(); line != ""}) {
    input += s"$line,"
  }
  val reports = input.split(",").map(x => x.toInt)
  val zippedReports = reports zip reports.tail

  val result = zippedReports
    .map {
      case (measure1, measure2) if measure1 < measure2 => "increase"
      case (measure1, measure2) if measure1 > measure2 => "decrease"
      case _ => "maybe info"
    }.count(_ == "increase")

  println(s"Resultado: $result")
}