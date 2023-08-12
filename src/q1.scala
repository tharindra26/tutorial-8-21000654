object q1 {
  def calculateInterest(depositAmount: Double): Double = {
    val interestRateFunction: Double => Double = {
      case amount if amount <= 20000 => amount * 0.02
      case amount if amount <= 200000 => amount * 0.04
      case amount if amount <= 2000000 => amount * 0.035
      case amount => amount * 0.065
    }

    val interest = interestRateFunction(depositAmount)
    interest
  }

  def main(args: Array[String]): Unit = {
    val depositAmount = 250000
    val interest = calculateInterest(depositAmount)
    println(s"The interest earned on Rs. $depositAmount deposit is Rs. $interest")
  }
}
