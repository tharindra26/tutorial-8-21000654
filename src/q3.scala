object question3 {

  // Lambda functions to perform given actions on string
  val toUpper: String => String = str => str.toUpperCase()

  val toLower: String => String = str => str.toLowerCase()

  val characterIntoUpper: (String, Int) => String = (str, index) => {
    str.updated(index, str.charAt(index).toUpper)
  }

  // Lambda function for formatNames
  val formatNames: (String => String, String) => String = (f, name) => f(name)

  val formatNamesWithIndex: ((String, Int) => String, String, Int) => String = (f, name, index) => f(name, index)

  def main(args: Array[String]): Unit = {
    println(formatNames(toUpper, "Benny"))
    println(formatNamesWithIndex(characterIntoUpper, "Niroshan", 1))
    println(formatNames(toLower, "Saman"))
    println(formatNamesWithIndex(characterIntoUpper, "Kumara", 5))
  }

}
