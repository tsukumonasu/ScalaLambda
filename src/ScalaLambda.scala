
object ScalaLambda {
  def main(args: Array[String]) {

    for (i <- 1 to 20) {
      println("引数" + i + "=" + fibo(i))
    }

    for (i <- 1 to 30) {
      println("引数" + i + "=" + fizzbuzz(i))
    }
  }

  // 関数fibo、引数nはInt,戻り値はBigint、中身はもしnが0か1であれば1を返し、nが再帰でfibo n-1 と fibo n -2の話を返す。
  //def fibo(n: Int): BigInt = if (n <= 1) 1 else fibo(n - 1) + fibo(n - 2)
  //  Lambda式で書き換え
  val fibo: Int => BigInt = n => if (n <= 1) 1 else fibo(n - 1) + fibo(n - 2)

  //	def fizzbuzz(x: Int) : String = {
  //			(x % 3, x % 5) match {
  //			case (0, 0) => "FizzBuzz"
  //			case (0, _) => "Fizz"
  //			case (_, 0) => "Buzz"
  //			case (_, _) => x.toString
  //			}
  //	}

  // Lambda式で書き換え
  val fizzbuzz: Int => String = x => {
    (x % 3, x % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case (_, _) => x.toString
    }
  }
}