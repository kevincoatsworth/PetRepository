package petRepo.App

import petRepo.models.{Cat, Dog, Mouse}
import petRepo.repositories.PetRepository

object PetRepo extends App {

  //instantiate pet repo - call all on repo - add pets - remove pets -

  //val pets = PetRepository.all()

  //println(pets)

  //create dog example. new keyword not needed in front of Dog as it's a case class.

  val d1 = Dog("Jessie", 3)

  val c1 = Cat("Brian", 5)

  val d2 = Dog("Snoopy", 3)

  val c2 = Cat("Garfield", 5)

  val m1 = Mouse("Jerry", 2)

  val m2 = Mouse("Tim", 3)

  PetRepository.add(d1, c1, d2, c2, m1, m2)

  //println(PetRepository.cats())

  //println(PetRepository.dogs())

  /*
  val x = PetRepository.findByName("Brian")

  if(x.isDefined) {

    println(x.get)
  }
  else{
    None
  }
  */

  /*
  val y = PetRepository.removeByName("Brian")
  println(y)
  */

  //println(PetRepository.other())

  val m3 = Mouse("Tom", 4)

  println(PetRepository.update(m2, m3))



  //generate 100 dogs by foreach.

  //PetRepository.findByName(d1.name)

  //val dogs = for(i<- 1 to 5) yield Dog(s"Dog $i", 5)

  //adds list of 100 dogs to list individually
  //PetRepository.add(dogs: _*)

  //assign list of all items to val
  //val p2 = PetRepository.all()
  //println(p2)

  //PetRepository.removeByName(c1.name)

  //val p3 = PetRepository.all()
  //println(p3)

}

