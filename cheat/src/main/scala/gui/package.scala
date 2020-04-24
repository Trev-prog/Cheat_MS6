package gui

/** Kicks of the GUI
  *
  * @constructor creates a class which initiates the GUI.
  */

object gui{
  def main(args: Array[String]): Unit = {

    val model = new Model
    val view  = new View
    val controller = new Controller(view, model)

    view.init(controller)
  }
}
