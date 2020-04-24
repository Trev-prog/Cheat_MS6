package menu_commands
import scala.collection.mutable.ArrayBuffer

/** A queue which holds the players in the game.
  *
  * @constructor creates an object playerorder which is a queue which rotates through the players in accordance with whose turn it is.
  */

//******* PLAYER_ORDER *******
object PlayerOrder extends scala.collection.mutable.Queue[Player] {



  def inIT {
    
    //var Deck1 = ArrayBuffer[Card](Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal)
    //var Deck2 = ArrayBuffer[Card](Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal)
    //var Deck3 = ArrayBuffer[Card](Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal)
    //var Deck4 = ArrayBuffer[Card](Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal, Deck.deal)
    
    this.clear()
//    this += new Player(1, "A", Deck.slice(0,13), 3)
    this += new Player(1, "A")
    this += new Player(2, "B")
    this += new Player(3, "C")
    this += new Player(4, "D")
    
    for (p <- this){
      p.inIT
    }
   }
  
  def advance {
    this += this.dequeue //Put front in back
  }

  def showDescription : String = {
    var result = ""    
    for (p <- this.toArray) 
      result += "P" + p.num.toString + " as " + p.name + ", " + p.score.toString + ". "
    result
    //result.substring(0, result.length-2)
  }


def show : String  = {
    var result = ""    
    for (p <- this.toArray) 
      result += p.name + ", "
    result.substring(0, result.length-2)
}

def showCards : String  = {
    var result = ""    
    for (p <- this.toArray){
      result += p.name + ": " + p.myHand(0).suit + p.myHand(0).num.toString + ", "
    }
    result.substring(0, result.length-2)
}

def doMovePO {
  this.head.playCard
}


def current : Player = {
    return this.head
  }

def previous : Player = {
  return this(3)
  }
  


}
