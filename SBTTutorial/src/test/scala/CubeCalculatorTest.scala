import example.CubeCalculator
import org.scalatest.Inspectors.forAll
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must.Matchers

class CubeCalculatorTest extends AnyFunSuite with Matchers:
  test("Cube of 3 static value") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("Cube of 2 compare with math.pow") {
    assert(CubeCalculator.cube(2) === scala.math.pow(2,3))
  }

  ignore("Purposely ignored failing Test") {
    assert(CubeCalculator.cube(3) === 26)
  }

  forAll(MyTestsFactory.testCases) {
    x => {
      test(s"Test Dynamic Tests. Input $x") {
        assert(CubeCalculator.cube(x) === scala.math.pow(x,3))
      }
    }
  }

  object MyTestsFactory {
    val testCases: Seq[Int] = Seq(1, 2, 5, 8)
  }