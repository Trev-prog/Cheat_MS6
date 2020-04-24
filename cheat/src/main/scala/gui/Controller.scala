package gui

import scala.swing._
import BorderPanel.Position._
import java.awt.geom.Rectangle2D
import java.awt.geom.Ellipse2D
import java.awt.Color
import scala.collection.mutable.ArrayBuffer
import java.awt.image.BufferedImage
import scala.swing.Orientation

/** A class which defines events' occurances for various user commands.
  *
  * @constructor creates a class for which can define GUI actions at user commands.
  */

class Controller(view: View, model: Model) {

  def showGameArea = Action("Show Game Area") {
    view.textArea.text = model.getBoard
  }
  def advanceOrder = Action("Advance Player Order") {
    model.advance
    view.textArea.text = model.getPlayerOrder
  }
  def showPlayerOrder = Action("Show Player Order") {
    view.textArea.text = model.getPlayerOrder
  }

  def initialize = Action("Initialize") {
    model.initialize
    view.update
  }
  
  def initializeRAND = Action("Initialize with Random") {
    model.initializeRAND
    //view.textArea.text = model.getBoard
    view.update
  }

  def checkForWinner : String = {
    model.showWinner
  }
  
  def showPOrder : String = {
    model.showPOrder
  }
  
  def doMove = Action("Do Move") {
    model.doMove
    //view.textArea.text = model.getBoard
    view.update
  }
  def doTurn = Action("Do Turn") {
    model.doTurn
    //view.textArea.text = model.getBoard
    view.update
  }

  def doGame = Action("Do Game") {
    model.doGame
    //view.textArea.text = model.getBoard
    view.update
  }
  
def ShowCards = Action("Show Cards"){
  model.ShowCards
  view.update
}

def HideCards = Action("Hide Cards"){
  model.HideCards
  view.update
}


  def exit = Action("Exit") {
    sys.exit(0)
  }
  
  def SetStratP0to1 = Action("Level 1") {model.SetStratP0to1}
  def SetStratP0to2 = Action("Level 2") {model.SetStratP0to2}
  def SetStratP0to3 = Action("Level 3") {model.SetStratP0to3}
  def SetStratP0to4 = Action("Level 4") {model.SetStratP0to4}
  
  def SetStratP1to1 = Action("Level 1") {model.SetStratP1to1}
  def SetStratP1to2 = Action("Level 2") {model.SetStratP1to2}
  def SetStratP1to3 = Action("Level 3") {model.SetStratP1to3}
  def SetStratP1to4 = Action("Level 4") {model.SetStratP1to4}
  
  def SetStratP2to1 = Action("Level 1") {model.SetStratP2to1}
  def SetStratP2to2 = Action("Level 2") {model.SetStratP2to2}
  def SetStratP2to3 = Action("Level 3") {model.SetStratP2to3}
  def SetStratP2to4 = Action("Level 4") {model.SetStratP2to4}
  
  def SetStratP3to1 = Action("Level 1") {model.SetStratP3to1}
  def SetStratP3to2 = Action("Level 2") {model.SetStratP3to2}
  def SetStratP3to3 = Action("Level 3") {model.SetStratP3to3}
  def SetStratP3to4 = Action("Level 4") {model.SetStratP3to4}
  
  def showALLplayerSTRATEGY : String = model.showALLplayerSTRATEGY
 
}