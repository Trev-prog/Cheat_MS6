package menu_commands
import scala.util.Random
import java.util.Collections
import java.util.Arrays
import collection.mutable.ArrayBuffer


/** A deck to deal at cards with at the start of the game, made from an arraybuffer.
  *
  * @constructor creates an object deck which holds cards
  */

object Deck extends scala.collection.mutable.ArrayBuffer[Card] {

def shuffle(a: Int, b: Int) {
    Collections.shuffle(Arrays.asList(array: _*).subList(a, b))
  }
//shuffle code taken from https://stackoverflow.com/questions/9572408/shuffling-part-of-an-arraybuffer-in-place/9572703

def inIT {
  this.clear()
  this += new Card(14, "S")
  this += new Card(2, "S")
  this += new Card(3, "S")
  this += new Card(4, "S")
  this += new Card(5, "S")
  this += new Card(6, "S")
  this += new Card(7, "S")
  this += new Card(8, "S")
  this += new Card(9, "S")
  this += new Card(10,"S")
  this += new Card(11, "S") //Jack
  this += new Card(12, "S") //Queen
  this += new Card(13, "S") //King
  
  this += new Card(14, "H")
  this += new Card(2, "H")
  this += new Card(3, "H")
  this += new Card(4, "H")
  this += new Card(5, "H")
  this += new Card(6, "H")
  this += new Card(7, "H")
  this += new Card(8, "H")
  this += new Card(9, "H")
  this += new Card(10,"H")
  this += new Card(11, "H") //Jack
  this += new Card(12, "H") //Queen
  this += new Card(13, "H") //King
  
  this += new Card(14, "C")
  this += new Card(2, "C")
  this += new Card(3, "C")
  this += new Card(4, "C")
  this += new Card(5, "C")
  this += new Card(6, "C")
  this += new Card(7, "C")
  this += new Card(8, "C")
  this += new Card(9, "C")
  this += new Card(10,"C")
  this += new Card(11, "C") //Jack
  this += new Card(12, "C") //Queen
  this += new Card(13, "C") //King
  
  this += new Card(14, "D")
  this += new Card(2, "D")
  this += new Card(3, "D")
  this += new Card(4, "D")
  this += new Card(5, "D")
  this += new Card(6, "D")
  this += new Card(7, "D")
  this += new Card(8, "D")
  this += new Card(9, "D")
  this += new Card(10,"D")
  this += new Card(11, "D") //Jack
  this += new Card(12, "D") //Queen
  this += new Card(13, "D") //King
  //this.shuffle(0,51)
}

def inITrand {
  this.clear()
  this += new Card(14, "S")
  this += new Card(2, "S")
  this += new Card(3, "S")
  this += new Card(4, "S")
  this += new Card(5, "S")
  this += new Card(6, "S")
  this += new Card(7, "S")
  this += new Card(8, "S")
  this += new Card(9, "S")
  this += new Card(10,"S")
  this += new Card(11, "S") //Jack
  this += new Card(12, "S") //Queen
  this += new Card(13, "S") //King
  
  this += new Card(14, "H")
  this += new Card(2, "H")
  this += new Card(3, "H")
  this += new Card(4, "H")
  this += new Card(5, "H")
  this += new Card(6, "H")
  this += new Card(7, "H")
  this += new Card(8, "H")
  this += new Card(9, "H")
  this += new Card(10,"H")
  this += new Card(11, "H") //Jack
  this += new Card(12, "H") //Queen
  this += new Card(13, "H") //King
  
  this += new Card(14, "C")
  this += new Card(2, "C")
  this += new Card(3, "C")
  this += new Card(4, "C")
  this += new Card(5, "C")
  this += new Card(6, "C")
  this += new Card(7, "C")
  this += new Card(8, "C")
  this += new Card(9, "C")
  this += new Card(10,"C")
  this += new Card(11, "C") //Jack
  this += new Card(12, "C") //Queen
  this += new Card(13, "C") //King
  
  this += new Card(14, "D")
  this += new Card(2, "D")
  this += new Card(3, "D")
  this += new Card(4, "D")
  this += new Card(5, "D")
  this += new Card(6, "D")
  this += new Card(7, "D")
  this += new Card(8, "D")
  this += new Card(9, "D")
  this += new Card(10,"D")
  this += new Card(11, "D") //Jack
  this += new Card(12, "D") //Queen
  this += new Card(13, "D") //King
  this.shuffle(0,51)
}


//ADDED


//var deckLIST = Random.shuffle(this.toList)

//this = deckLIST.toArrayBuffer

  def cardsLEFTstr : String = {
    if (this.size < 10) return "0" + this.size.toString
    else return this.size.toString
  }

  def cardsLEFTint : Int = {
    this.size
  }

  def deal : Card = {
    var cardOUT = this.head
    this.remove(0)
    cardOUT
  }
/*
  def showDECK : String = {
    val newSTR = deckLIST(0).showCARD + deckLIST(1).showCARD + deckLIST(2).showCARD
    newSTR

  }
*/

}