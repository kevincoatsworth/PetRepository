package petRepo.models

sealed trait Pet {
  val name: String
  val age: Int
}

trait Talking {
  def talk: String
}

trait Woof extends Talking {

  override def talk: String = "woof"
}
trait Meow extends Talking {
  override def talk: String = "meow"
}

trait Squeak extends Talking {
  override def talk: String = "squeak"
}

final case class Dog(override val name: String, override val age : Int) extends Pet with Woof {

  override def toString = s"The Dogs name is $name. $name is $age years old and goes $talk"

}

final case class Cat (override val name : String, override val age : Int) extends Pet with Meow {

  override def toString = s"The Cats name is $name. $name is $age years old and goes $talk"

}

final case class Mouse (override val name : String, override val age : Int) extends Pet with Squeak {

  override def toString = s"The Mouses name is $name. $name is $age years old and goes $talk"

}