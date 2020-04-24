package menu_commands
import scala.util.Random

object Discard extends scala.collection.mutable.Stack[Card] {

  def inIT{
    this.clear()
  }
  
  def cardsLEFTstr : String = {
    if (this.size < 10) return "0" + this.size.toString
    else return this.size.toString
  }

  def addCard (c: Card): Unit = {
    this.push(c)
  }
}