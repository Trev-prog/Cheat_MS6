package gui
import menu_commands._

/** A class which defines the logic for what is used in the GUI.
  *
  * @constructor creates a class which can declare functions and variables to be used in the GUI.
  */

class Model {
  def getBoard:String = Menu.showGameArea
  def advance:Unit = PlayerOrder.advance
  def getPlayerOrder:String =  PlayerOrder.show
  def initialize:Unit = Menu.initialize
  def initializeRAND:Unit = Menu.initializeRAND
  def checkForWinner:String = if(Menu.checkForWinner) "We have a winner." else "We don't have a winner."
  def doMove:Unit = Menu.doMove
  def doTurn:Unit = Menu.doTurn
  def doGame:Unit = Menu.doGame
  def ShowCards:Unit = Menu.showcards = true
  def HideCards:Unit = Menu.showcards = false
  def bluffMode:Boolean = if (Menu.bluffMode == false) false else true
  def showWinner:String = Menu.showWinner
  def showPOrder: String = Menu.showPOrder
  def SetStratP0to1:Unit = Menu.SetStrat(PlayerOrder(0), 1)
  def SetStratP0to2:Unit = Menu.SetStrat(PlayerOrder(0), 2)
  def SetStratP0to3:Unit = Menu.SetStrat(PlayerOrder(0), 3)
  def SetStratP0to4:Unit = Menu.SetStrat(PlayerOrder(0), 4)
  
  def SetStratP1to1:Unit = Menu.SetStrat(PlayerOrder(1), 1)
  def SetStratP1to2:Unit = Menu.SetStrat(PlayerOrder(1), 2)
  def SetStratP1to3:Unit = Menu.SetStrat(PlayerOrder(1), 3)
  def SetStratP1to4:Unit = Menu.SetStrat(PlayerOrder(1), 4)

  
  def SetStratP2to1:Unit = Menu.SetStrat(PlayerOrder(2), 1)
  def SetStratP2to2:Unit = Menu.SetStrat(PlayerOrder(2), 2)
  def SetStratP2to3:Unit = Menu.SetStrat(PlayerOrder(2), 3)
  def SetStratP2to4:Unit = Menu.SetStrat(PlayerOrder(2), 4)
  
  def SetStratP3to1:Unit = Menu.SetStrat(PlayerOrder(3), 1)
  def SetStratP3to2:Unit = Menu.SetStrat(PlayerOrder(3), 2)
  def SetStratP3to3:Unit = Menu.SetStrat(PlayerOrder(3), 3)
  def SetStratP3to4:Unit = Menu.SetStrat(PlayerOrder(3), 4)
  
  def showALLplayerSTRATEGY = Menu.showALLplayerSTRATEGY
  
  Menu.initialize
  //PlayerOrder.inIT
}