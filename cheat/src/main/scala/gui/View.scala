package gui
import menu_commands._

import scala.swing._
import BorderPanel.Position._
import java.awt.geom.Rectangle2D
import java.awt.geom.Ellipse2D
import java.awt.Color
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ArrayBuffer
import java.awt.image.BufferedImage
import scala.swing.Orientation
import java.awt.Graphics2D

class View extends MainFrame {

  var _controller : Option[Controller] = None
  var showCardsBool = false
  var startGame = false
  // Components
  val textArea = new TextArea {
    font = new Font("Lucida Console", 0, 12)
  }

  //

  
  object gameArea extends BorderPanel {
  background = Color.lightGray
  preferredSize = new Dimension(1000, 800)
  layout += cardSpaces -> Center
  layout += menuBar -> North
  }
  
  

  object cardSpaces extends BorderPanel {
      layout += new Label("Current Player") -> North
      layout += new Label("Just Played") -> West
      layout += new Label("Next Up") -> East
      layout += new Label("Two Turns Away") -> South
    layout += playArea -> Center
    background = Color.yellow
    preferredSize = new Dimension(900, 700)
  }
  
  //Added
  //object GreenTable extends Color(132, 91, 56)
  object playArea extends BorderPanel {
    background = Color.red
    //background = Color. //Needs to be card table color
    preferredSize = new Dimension(500, 300)
    layout += playerHands(0) -> West
    layout += playerHands(1) -> North
    layout += playerHands(2) -> East
    layout += playerHands(3) -> South
    layout += middle -> Center
  }

  object discard extends CardPanel

  object middle extends BoxPanel(Orientation.Horizontal){
    contents += discard
    background = Color.blue
    preferredSize = new Dimension(600, 198)
  }
  
  val playerHands = new ArrayBuffer[PlayerHandPanel] {

    this += new PlayerHandPanel('v')
    this += new PlayerHandPanel('h')
    this += new PlayerHandPanel('v')
    this += new PlayerHandPanel('h')

    def reset {
      for (panel <- this) panel.showAsEmpty
    }
  }
  
  class PlayerHandPanel(orientation : Char) extends Panel {

    preferredSize = new Dimension(72,96)

    var images = new ArrayBuffer[BufferedImage]

    images += javax.imageio.ImageIO.read(new java.io.File("resources/empty.jpg"))

    def showAsEmpty {
      images.clear
      images += javax.imageio.ImageIO.read(new java.io.File("resources/empty.jpg"))
      this.repaint
    }

    def showCards(cards : ListBuffer[Card]) {
      images.clear
      for (card <- cards) {
        if (Menu.showcards == false) images += javax.imageio.ImageIO.read(new java.io.File("resources/back.jpg"))
        else images += javax.imageio.ImageIO.read(new java.io.File("resources/" + card.num.toString + card.suit.toLowerCase() + ".jpg"))
      }
      super.repaint
    }
    def show(player: Player) {
      if (player.myHand.length == 0) showAsEmpty
      else showCards(player.myHand)
    }

    override def paint(g: Graphics2D) {
      var offset = 36
      for (image <- images) {
        if (orientation == 'v') g.drawImage(image, 0, offset, null)
        else g.drawImage(image, offset+72, 0, null)
        offset += 30
      }
    }
  }
  //Needs work
  class CardPanel extends Panel {
    background = Color.green

    var image = javax.imageio.ImageIO.read(new java.io.File("resources/empty.jpg"))

    def showAsEmpty {
      image = javax.imageio.ImageIO.read(new java.io.File("resources/empty.jpg"))
      this.repaint
    }

    def changeCard(card : Card) {
      image = javax.imageio.ImageIO.read(new java.io.File("resources/" + card.num.toString + card.suit.toLowerCase() + ".jpg"))
      this.repaint
      background = Color.green
    }
    def backCard(card : Card) {
      image = javax.imageio.ImageIO.read(new java.io.File("resources/back.jpg"))
      this.repaint
      background = Color.green
    }
    
    def show {
      if (Discard.isEmpty) showAsEmpty
      else if (Menu.bluffMode == false) backCard(Discard.top)
      else backCard(Discard.top)
    }
    override def paint(g: Graphics2D) {
      g.drawImage(image, 18, 48, null)
    }
  }
  
  def update {
    this.repaint
    discard.show
    playArea.repaint
    //cardSpaces.repaint
    //super.repaint
    //stockpileDeck.show
    playerHands(0).show(PlayerOrder(3))
    playerHands(1).show(PlayerOrder(0))
    playerHands(2).show(PlayerOrder(1))
    playerHands(3).show(PlayerOrder(2))
  }
  
  //Until here
  
  /**
   * View.init
   * @param controller
   */
  def init(controller: Controller) {
    _controller = Some(controller)
    title = "Cheat"
    contents = gameArea
    centerOnScreen

    menuBar = new MenuBar {
      contents += new Menu("Start") {
        contents += new MenuItem(controller.initialize)
        contents += new MenuItem(controller.initializeRAND)
      }
      
      contents += new Menu("About") {
        contents += new MenuItem(Action("Check For Winner") {
           Dialog.showMessage(null, controller.checkForWinner)
         })
        
        contents += new MenuItem(Action("Show Player Order") {
           Dialog.showMessage(null, controller.showPOrder)
         })
        contents += new MenuItem(Action("Show Strategies") {
          Dialog.showMessage(null, controller.showALLplayerSTRATEGY)
        })
      }

     contents += new Menu("Play!") {
        contents += new MenuItem(controller.doMove)
        contents += new MenuItem(controller.doTurn)
        contents += new MenuItem(controller.doGame)
    }

      contents += new Menu("Adjust Cards") {
        contents += new MenuItem(controller.ShowCards)
        contents += new MenuItem(controller.HideCards)
    }
      

      //PLAYER STRATEGIES
      contents += new Menu("Adjust Strategy") {

        contents += new Menu("Player 1"){
          contents += new MenuItem(controller.SetStratP0to1)
          contents += new MenuItem(controller.SetStratP0to2)
          contents += new MenuItem(controller.SetStratP0to3)
          contents += new MenuItem(controller.SetStratP0to4)
        }
        contents += new Menu("Player 2"){
          contents += new MenuItem(controller.SetStratP1to1)
          contents += new MenuItem(controller.SetStratP1to2)
          contents += new MenuItem(controller.SetStratP1to3)
          contents += new MenuItem(controller.SetStratP1to4)
        }
        contents += new Menu("Player 3"){
          contents += new MenuItem(controller.SetStratP2to1)
          contents += new MenuItem(controller.SetStratP2to2)
          contents += new MenuItem(controller.SetStratP2to3)
          contents += new MenuItem(controller.SetStratP2to4)
        }
        contents += new Menu("Player 4"){
          contents += new MenuItem(controller.SetStratP3to1)
          contents += new MenuItem(controller.SetStratP3to2)
          contents += new MenuItem(controller.SetStratP3to3)
          contents += new MenuItem(controller.SetStratP3to4)
        }
        //super.repaint()
      }
      //END PLAYER STRATEGIES 
      
      
      contents += new MenuItem(controller.exit)
    }

    size = new Dimension(700, 500)
    visible = true
  }

}