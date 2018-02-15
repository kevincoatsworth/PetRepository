package petRepo.repositories

import petRepo.models.{Cat, Dog, Mouse, Pet}

import scala.collection.mutable.ArrayBuffer

object PetRepository {

  private val _pets: ArrayBuffer[Pet] = new ArrayBuffer[Pet]()

  def all(): List[Pet] = _pets.toList

  def findByName(name: String): Option[Pet] = {
    _pets.find(p => p.name == name)
  }

  def dogs(): List[Dog] =
    _pets.toList.flatMap {
      case d@Dog(_, _) => Some(d)
      case _ => None
    }

  def cats(): List[Cat] =
    _pets.toList.flatMap {
      case c@Cat(_, _) => Some(c)
      case _ => None
    }

  def other(): List[Pet] =

    _pets.toList.flatMap {
      case _@Cat(_, _) => None
      case _@Dog(_, _) => None
      case o => Some(o)
    }

  //Pet* means you can either pass one or multiple of the same type through
  def add(pet: Pet*): List[Pet] = {

    //_pets.++=(pet)
    pet.foreach(p => _pets.+=(p))
    all()
  }

  def removeByName(name: String): List[Pet] = {
    _pets.toList.filter(pet => pet.name != name)
  }

 // def update(pet: Pet): List[Pet] = {

  def update(oldPet : Pet, newPet : Pet) : List[Pet] = {
    println("List before update: " + all())
    val x =_pets.indexOf(oldPet)
    _pets.update(x, newPet)
    print("List after update: ")
    all()
  }
}