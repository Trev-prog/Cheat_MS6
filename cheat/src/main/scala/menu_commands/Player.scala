package menu_commands
import scala.collection.mutable.ListBuffer

/** A player in the game.
  *
  * @constructor creates a new player with a name and age.
  * @param name the player's name
  * @param num the player's aggression level for strategy 
  */

class Player (val num : Int, val name : String) {
  
  var howAgress = 1
  
  var myHand = ListBuffer[Card]()
  
  def inIT {
    myHand.clear()
    myHand += Deck.deal
    myHand += Deck.deal
    myHand += Deck.deal
    myHand += Deck.deal
    myHand += Deck.deal
    myHand += Deck.deal
    myHand += Deck.deal
    myHand += Deck.deal
    myHand += Deck.deal
    myHand += Deck.deal
    myHand += Deck.deal
    myHand += Deck.deal
    myHand += Deck.deal
  }
  
  var bluffer = false
   
  def addCard {
  	this.myHand += Deck.deal
  }
  var score = this.myHand.length

 //ALTERED 
  def bluffCalled {
//    if (this.myHand.length < 19){
      for (c <- Discard){
  //      if (this.myHand.length < 19) {
          this.myHand += Discard.pop()
        }
  //    }
      score = this.myHand.length
//    }
  }
  
  def bluff {
    if (this.myHand.length > 1){
        Discard.addCard(this.myHand(0))
        this.myHand.remove(0)
        score = this.myHand.length
    }
    CountCard.advance
    bluffer = true
  }

  
  def playCard {
    for (c <- this.myHand){
      if (c.num == CountCard.current) {
        Discard.addCard(c)
        myHand -= c
        score = this.myHand.length
      }
    }
    CountCard.advance
  }
  
  
  def showSCORE : String = {
    score = this.myHand.length
    if (score < 10) return "0" + score.toString
    else return score.toString
  }

  def setStrategy(howAgressive : Int): Unit = {
    ???
    //howAgressive can be between 1 and 4
    //1 --> Never bluff or call
    //2 --> Bluff 2 if hand contains 1 of desired value, and 3 if hand contains 2, 30% of the time
    //3 --> Call bluff 25% of the time when a player < 5 cards AND item 2
    //4 --> Call bluff 25% of the time when a player < 10 cards AND item 2 at 45%
  }

  def callBluff: Unit = {
    ???
    // Transfers card in the pile to the previous player if he cheated.
    // Else, transfers card in the pile to the current player.
  }
}