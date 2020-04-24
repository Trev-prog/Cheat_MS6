package menu_commands

import org.scalatest.FunSpec
import org.scalatest.Matchers


class Turn_Test extends FunSpec with Matchers {

   describe("Cheat Simulation") {
    describe("has a menu") {

      //******* INITIALIZE GAME ******* //PASSED
      it("Can show initial game state") {

        val expectedResult1 = 
          "Board:\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * A, 13  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*  D, 13 *   *   00   *   *  B, 13 *\n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * C, 13  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n"
        Menu.initialize should be(expectedResult1)
        Menu.checkForWinner should be (false)
      } 
 

      //******* Do Move 1*******

        it("Can show board after one move, where current player plays 1 card") {

        val expectedResult2 = 
          "Board:\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * B, 13  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*  A, 12 *   *   01   *   *  C, 13 *\n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * D, 13  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n" 
        Menu.doMove
        Menu.advancePlayerOrder
        Menu.checkForWinner should be (false)
        Menu.showGameArea should be(expectedResult2)
      }

        it("Can show board after two moves, where current player plays 1 card") {

      //******* Do Move 2*******

        val expectedResult3 = 
          "Board:\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * C, 13  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*  B, 12 *   *   02   *   *  D, 13 *\n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * A, 12  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n" 
        Menu.doMove
        Menu.advancePlayerOrder
        Menu.checkForWinner should be (false)
        Menu.showGameArea should be(expectedResult3)
        //Deck.display_contents should be(expectedResult5)
      }

            //******* Do Move 3*******
        it("Can show board after three moves, where current player plays 1 card") {

        val expectedResult4 = 
          "Board:\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * D, 13  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*  C, 12 *   *   03   *   *  A, 12 *\n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * B, 12  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n"
        Menu.doMove
        Menu.advancePlayerOrder
        Menu.checkForWinner should be (false)
        Menu.showGameArea should be(expectedResult4)
      }


            //******* Do Move 4*******
        it("Can show board after four moves, where current player plays 1 card") {

        val expectedResult5 = 
          "Board:\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * A, 12  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*  D, 12 *   *   04   *   *  B, 12 *\n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * C, 12  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n"
        Menu.doMove
        Menu.advancePlayerOrder
        Menu.checkForWinner should be (false)
        Menu.showGameArea should be(expectedResult5)
      }


        //******* Do Turn (Each player will play 2 cards) *******
        it("Can show board after 1 turn (four moves, where current player plays 1 card") {

        val expectedResult6 = 
          "Board:\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * A, 11  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*  D, 11 *   *   08   *   *  B, 11 *\n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * C, 11  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n"
        Menu.doTurn
        Menu.checkForWinner should be (false)
        Menu.showGameArea should be(expectedResult6)
      }

        //******* Check for Winner *******
        it("Can check for winner (will be false since no player has zero cards in hand)") {
        Menu.checkForWinner should be (false)
      }

            //******* SET AND SHOW PLAYER STRATEGY *******
      it("can show player strategies (levels of aggressiveness)") {     
        val expectedResult = "A is not aggressive, B is mildly aggressive, C is moderately aggressive, D is highly aggressive"
        Menu.doTurn
        Menu.doTurn
        PlayerOrder(0).setStrategy(1)
        PlayerOrder(1).setStrategy(2)
        PlayerOrder(2).setStrategy(3)
        PlayerOrder(3).setStrategy(4)
        Menu.showALLplayerSTRATEGY should be(expectedResult)  
      }

      //******* SHOW doMOVE for most aggressive player move *******
      it("Since D is highly aggressive, it will call bluff on A's move since a <= 10 cards") {

        val expectedResult = 
          "Board:\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * A, 10  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*  D, 09 *   *  ?15?  *   *  B, 10 *\n" +
          "*CALLING *   *        *   *        *\n" +
          "*BLUFF!! *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * C, 10  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n" +
          "P1 as A, 13. P2 as B, 13. P3 as C, 13. P4 as D, 13. "
        Menu.doMove
        Menu.showGameArea should be(expectedResult)
      } 


            //******* Do Game (where each player plays two cards until player 1, A, wins)*******
        it("Can show board game when a player wins.") {

        val expectedResult7 = 
          "Board:\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * B, 02  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*  A, 02 *   *   45   *   *  C, 02 *\n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "*        *   *        *   *        *\n" +
          "             **********             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             * D, 01  *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             *        *             \n" +
          "             **********             \n" +
          "Game Over!!!"
        Menu.doGame
        Menu.checkForWinner should be (true)
        Menu.showGameArea should be(expectedResult7)
      }

    }
  }
} 