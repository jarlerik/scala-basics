package lectures.part1Basics

object Expressions extends App {
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)


  // Everything is Scala is an Expression!
   val bool = true

  val someValue = if(bool) "Yeah, it's true" else "No, it's false!"

  println(someValue)
}
