package lectures.part1Basics

object Expressions extends App {
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)


  // Everything is Scala is an Expression!
   val bool = true

  val someValue = if(bool) "Yeah, it's true" else "No, it's false!"

  println(someValue)

  var aVariable = 10

  val wtf = (aVariable = 15)
  println(wtf)

  val aCodeBlock = {
     val y = 2
    val x = y * 50
    if (x > 50) "Over 50" else "50 or under"
  }

  println(aCodeBlock)

}


