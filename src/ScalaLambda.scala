object ScalaLambda {
  def main(args: Array[String]) {
    if (args.size == 0) {
      val strs = Array("Hello", "World")
      output(strs)
    } else {
      printf("Invalid args.")
    }

    val inc: Int => Int = x => x + 1
    println(inc(5))

    for (i <- 0 to 20) {
      println("引数"+ i + "=" +fibo(i))
    }

  }

  // 関数fibo、引数nはInt,戻り値はBigint、中身はもしnが0か1であれば1を返し、nが再帰でfibo n-1 と fibo n -2の話を返す。
  def fibo(n: Int): BigInt = if (n == 0 || n == 1) 1 else fibo(n - 1) + fibo(n - 2)

  // 引数iはInt,中身は引数に対するマッチング結果
  def fizzBuzz4(i: Int) = i match {
    // 倍数
    case i if i % 15 == 0 => "FizzBuzz"
    // 3の倍数
    case i if i % 3 == 0  => "Fizz"
    // 5の倍数
    case i if i % 5 == 0  => "Buzz"
    case _                => i.toString()
  }

  def output(strs: Array[String]) {
    strs.foreach(printf("%s ", _))
  }
}