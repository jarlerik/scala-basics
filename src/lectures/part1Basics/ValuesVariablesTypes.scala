package lectures.part1Basics

object ValuesVariablesTypes extends App {

  // values are immutable
  val x = 42

  println(x)
  val aString: String = "Hello"
  val anotherString = "Goodbye"

  println(aString + anotherString)
  val aBoolean: Boolean = true
  val anotherBoolean = false

  val aChar: Char = 'a'

  val anInt: Int = x
  val aShort: Short = 9999
  val aLong: Long = 56787654567L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // Variables

  var aVariable: Int = 4 // side effects
  aVariable = 5
  aVariable = 6

}
