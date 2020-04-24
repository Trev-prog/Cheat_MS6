package menu_commands

object CountCard extends scala.collection.mutable.Queue[Int] {

def inIT{
  this.clear()
  this += 1
  this += 2
  this += 3
  this += 4
  this += 5
  this += 6
  this += 7
  this += 8
  this += 9
  this += 10
  this += 11
  this += 12
  this += 13
}


  def advance {
    this += this.dequeue //Put front in back
  }

  def current : Int = {
    return this.head
  }

}