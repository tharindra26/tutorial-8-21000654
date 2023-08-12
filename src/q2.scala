object q2 {
  def main(args: Array[String]): Unit = {
    print("Enter an integer:")
    val input = scala.io.StdIn.readInt()

    val printMessage: Int => String = {
      case x if x <= 0 => "Negative/Zero is input"
      case x if x % 2 == 0 => "Even number is given"
      case _ => "Odd number is given"
    }

    val message = printMessage(input)
    println(message)
  }
}
