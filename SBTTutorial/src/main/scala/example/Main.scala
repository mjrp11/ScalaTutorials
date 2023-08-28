package example

@main def run(): Unit =
  val ages = Seq(42, 31, 29, 64)
  println(s"The oldest person is ${ages.max}")

  val ageToCompare = 50
  println(s"There are ${ages.count(age => age > ageToCompare)} people with age greater than $ageToCompare")

object CubeCalculator:
  def cube(x: Int): Int =
    x * x * x