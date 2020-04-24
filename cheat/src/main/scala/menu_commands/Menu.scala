package menu_commands
import scala.util.control.Breaks._
import scala.util.Random
import scala.collection.mutable.ArrayBuffer



object Menu {
    
  var exitGame = false
  var showcards = false
  var bluffMode = false

  def showPlayerOrder: String = {
    PlayerOrder.show
  }

  def advancePlayerOrder : Unit = {
    PlayerOrder.advance
  }

  def cardsOUT : String = {
    PlayerOrder.showCards
  }

 def SetStrat (p: Player, agressLEVEL: Int ) {
   p.howAgress = agressLEVEL
 }
  
  def initialize : String = {
    exitGame = false
    Deck.inIT
    PlayerOrder.inIT
    SetStrat(PlayerOrder(0), 3)
    SetStrat(PlayerOrder(1), 2)
    SetStrat(PlayerOrder(2), 3)
    SetStrat(PlayerOrder(3), 4)
    Discard.inIT
    CountCard.inIT
    var result = Board.show
    result
  }
  
  def initializeRAND : String = {
    exitGame = false
    Deck.inITrand
    PlayerOrder.inIT
    SetStrat(PlayerOrder(0), 1)
    SetStrat(PlayerOrder(1), 1)
    SetStrat(PlayerOrder(2), 1)
    SetStrat(PlayerOrder(3), 1)
    Discard.inIT
    CountCard.inIT
    var result = Board.show
    result
  }

  def checkForWinner : Boolean = {
    if (exitGame == true) true
    else false
  }

def showALLplayerSTRATEGY : String = {
  var strat = "\n" + "Player Strategies:" + "\n"
  for (p <- PlayerOrder){
    if (p.howAgress == 1) strat += p.name + " " + "is not aggressive at all" + "\n"
    if (p.howAgress == 2) strat += p.name + " " + "is somewhat aggressive" + "\n"
    if (p.howAgress == 3) strat += p.name + " " + "is aggressive" + "\n"
    if (p.howAgress == 4) strat += p.name + " " + "is extremely aggressive" + "\n"
  }
  strat
}

var bluffFLAG = false
  def doMove : Unit = {
    //bluffMode = false
    var r = scala.util.Random
    var odds = r.nextFloat
    for (p <- PlayerOrder){
      if (p.score == 1 || p.score == 0) exitGame = true
    }
    if (exitGame == false) { //Never bluffs or calls   
      if (PlayerOrder.head.howAgress == 1){
        PlayerOrder.head.playCard 
      }
      
      else if (PlayerOrder.head.howAgress == 2){ //bluffs 30%, Never calls
        if (odds > .7){
          PlayerOrder.head.bluff
          PlayerOrder.head.bluff          
        }
        else{
          PlayerOrder.head.playCard
        }

      }
      
      else if (PlayerOrder.head.howAgress == 3){ //bluffs 30% calls 30%
        
        if (odds > .7){
          //bluffMode = true
          if (PlayerOrder.previous.bluffer == true) {
            PlayerOrder.previous.bluffCalled
          }
          else {
            PlayerOrder.current.bluffCalled
          }
        }
        
        PlayerOrder.previous.bluffer = false //bluffing flag to false for prev player
        
        if (odds > .7){
          PlayerOrder.head.bluff
          PlayerOrder.head.bluff          
        }
        else{
          PlayerOrder.head.playCard
        }
      }
      
      else if (PlayerOrder.head.howAgress == 4){ //never bluffs calls 30%
        
        if (odds > .7){
          //bluffMode = true
          if (PlayerOrder.previous.bluffer == true) {
            PlayerOrder.previous.bluffCalled
          }
          else {
            PlayerOrder.current.bluffCalled
          }
        }
        
        PlayerOrder.previous.bluffer = false //bluffing flag to false for prev player
        
        PlayerOrder.head.playCard
      }
      
    }
    PlayerOrder.advance
  }
//create call bluff and more strategies

  def doTurn : Unit = {
    for (i <- 1 to 4){
      if (exitGame == false){
        this.doMove
      }
    }
  }

  def doGame : Unit = {
    while (exitGame == false){
      if (exitGame == false) {
        this.doTurn
      }
    }
  }

//Update to show if player is calling bluff
def showGameArea:String = {
  var result = Board.show
  for (p <- PlayerOrder){
    result += p.name + "   "
    for (c <- p.myHand){
      result += c.showCARD
      result += " "
    }
    result += "\n"
  }
  //result += showALLplayerSTRATEGY
  if (exitGame == true){
    result += "Game Over!!!"
  }
  result
  }

def showWinner: String = {
  var winner = ""
  if (exitGame == true){
    for(p<- PlayerOrder){
      if (p.myHand.length < 2) winner = p.name
    }
    "The winner is " + winner
  }
  else "There is no winner yet!"
}

def showPOrder: String = {
  var pOrder = PlayerOrder(0).name + ", " + PlayerOrder(1).name + ", " + PlayerOrder(2).name + ", " + PlayerOrder(3).name
  pOrder
}

}


