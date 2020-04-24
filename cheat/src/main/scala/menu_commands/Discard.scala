package menu_commands
import scala.util.Random


/** A discard pile implemented with a stack
  *
  * @constructor creates an object discard which holds cards
  */

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