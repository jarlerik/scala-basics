package lectures.part1Basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  def aParameterlessFunction(): Int = 42

  def aRepeatedFunction( aString: String, n: Int): String =
    if (n <= 1 ) aString
    else aString + aRepeatedFunction(aString, n - 1)

  def greet( name: String, age: Int) =
    println("Hi, my name is " + name + " and I'm " + age + " years old")

  def factorial(n: Int): Int =
    if (n == 1) 1
    else n * factorial(n - 1)

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)


  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(m: Int): Boolean =
     if (m <= 1) true
     else n % m != 0 && isPrimeUntil(m - 1)
    isPrimeUntil(n / 2)
  }

  println(isPrime(13))


}
