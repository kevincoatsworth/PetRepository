package petRepo


import scala.collection.mutable.ArrayBuffer

/**
  * Created by digital032676 on 05/02/18.
  */
class PetRepository extends Pet {

  private val Pets : ArrayBuffer[Pet] = new ArrayBuffer[Pet]()

  def all() : List[Pet] = Pets.toList

  def findByName(name: String) : Option[Pet] = None

  def dogs() : List[Pet] = Pets.toList

  def cats() : List[Pet] = Pets.toList

  def other() : List[Pet] = Pets.toList

  def add(pet : Pet*) : List[Pet] = Pets.toList

  def removeByName(name : String) : List[Pet] = Pets.toList

  def update(pet: Pet) : List[Pet] = Pets.toList

}
