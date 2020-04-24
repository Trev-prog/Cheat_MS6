package menu_commands

class Card (val num : Int, val suit : String) {
	def showCARD : String = {
		val retSTR = num.toString + suit
		retSTR
	}
}

//Let Jack == 11, Queen == 12, King == 13, Ace == 1
//Let Spade == S, Diamonds == D, Clubs == C, Hearts == H