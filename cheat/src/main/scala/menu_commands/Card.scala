package menu_commands

/** A card used in the deck and discard object, as well as in player hands.  *
  * @constructor create a new card with a suit and number value.
  * @param num is the number value of the card
  * @param suit is the suit of the card 
  */

class Card (val num : Int, val suit : String) {
	def showCARD : String = {
		val retSTR = num.toString + suit
		retSTR
	}
}

//Let Jack == 11, Queen == 12, King == 13, Ace == 1
//Let Spade == S, Diamonds == D, Clubs == C, Hearts == H