package menu_commands

//******* BOARD *******
/** A board for when this game is run with text display. It is primarily used for testing purposes.
  *
  * @constructor returns a string which is a board, this is only for text display purposes.
  */

object Board {



  def show : String = {

    var firstANDlast = "             **********             \n"
    var midLINE = "             *        *             \n"
    var playerSCOREline1 = "             * " + PlayerOrder(0).name + ", " + PlayerOrder(0).showSCORE + "  *             \n"
    var playerSCOREline2 = "             * " + PlayerOrder(2).name + ", " + PlayerOrder(2).showSCORE + "  *             \n"
    var midLINEmiddle = "*        *   *        *   *        *\n"
    var midSCOREandDECK = "*  " + PlayerOrder(3).name + ", " + PlayerOrder(3).showSCORE + " *   *   " + Discard.cardsLEFTstr + "   *   *  " + PlayerOrder(1).name + ", " + PlayerOrder(1).showSCORE + " *\n"
   
    
    var result = "Board:\n"
    result += firstANDlast
    result += midLINE*2
    result += playerSCOREline1
    result += midLINE*3
    result += firstANDlast
    result += midLINEmiddle*2
    result += midSCOREandDECK
    result += midLINEmiddle*3
    result += firstANDlast
    result += midLINE*2
    result += playerSCOREline2
    result += midLINE*3
    result += firstANDlast
    result
  }

}