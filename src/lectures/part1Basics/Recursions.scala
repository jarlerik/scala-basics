package lectures.part1Basics

import scala.annotation.tailrec

object Recursions extends App {

  def factorial(n: Int): BigInt =
    if (n <= 1) 1
    else {
      n * factorial(n - 1)
    }

  def factorialWithAccumulator(n: Int): BigInt = {

    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt):BigInt =
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator)
    factorialHelper(n, 1)
  }


  // stack overflows
  //println(factorial(10000))

  // When need for loops - use tail recursion

  // Do recursively

  // Concat a string n times

  @tailrec
  def concat(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concat(aString, n - 1, accumulator + aString)

  def isPrime(n: Int): Boolean = {

    @tailrec
    def isPrimeTail(m: Int): Boolean =
      if (m <= 1) true
      else n % m != 0 && isPrimeTail(m - 1)
    isPrimeTail(n / 2)
  }

  def fibonacci(n: Int): Int = {

    @tailrec
    def fiboTail(i: Int, nMinus1: Int, nMinus2: Int): Int =
      if (i >= n) nMinus1
      else fiboTail(i + 1, nMinus1 + nMinus2, nMinus1)

    if(n <= 2) 1
    else fiboTail(2, 1, 1)
  }

  println(fibonacci(8))

}
