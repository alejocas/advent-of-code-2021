object Day2 extends App {
  def commandsCounter(commandList: List[String], command: String): Int  = {
    commandList.filter(_.startsWith(command)).map(comm => comm.slice(command.length + 1, comm.length).toInt).sum
  }

  val commands = Reader.readMultipleLinesFromInput()
  val upCommands = commandsCounter(commands, "up")
  val downCommands = commandsCounter(commands, "down")
  val forwardCommands = commandsCounter(commands, "forward")

  val depth = downCommands - upCommands
  val result = forwardCommands * depth
  println(s"Result: $result")
}
