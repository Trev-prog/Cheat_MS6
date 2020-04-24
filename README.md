# Welcome to Cheat!

## Game Rules:

Cheat is a four-player card game in which each player seeks to dispose all but one of his/her cards.
Equipment:
Cheat requires only a standard deck of cards.
Game play:
Each of the four players is dealt 13 cards. The first player puts down a one, two, three, or four cards. The card(s) they put down MUST all be an ACEs.  The next player puts down a 2 or 2s. The next 3s, and so on until one of the players gets back to ACE, and the cycle repeats until a player is out of all but one of his/her cards, that player is the winner.

## What happens when I don't have a required card?

A player may not always have the card he/she is required to put down. For example, if Player 1 does not possess any Jacks in his hand, but is required to put down a Jack, he MUST put down some card. In this case he lies, saying he is putting down a Jack, but is actually putting down a different card. 

## Calling "Cheat!":

A player can announce "cheat" in which he/she reveals the card that the previous player has put down. If the rank of the card(s) placed down matches what the previous player announced, the current player picks up all the pile. However, if the previous player lied then the previous player must pick up the pile for having "cheated." The player who announced "cheat" continues the game by putting down a card and announcing its rank.

## Objective:
A player wins by getting rid of all the cards before everyone else or having least number of cards after 100 turns.

## Open Design and Citations

I would like to thank Harry Hernberg and TJ Bordeaux for their assistance in providing me with code from their crazy-eights project.

Citation: After speaking with CDT Hernberg over a Teams call, CDT Hernberg showed me much of his code from View, Model, and Controller. I copied and pasted some of it, particularly the GUI portion focusing on displaying the cards. I then edited it significantly to fit the needs of my own game. Additionally, CDT Hernberg assisted me by explaining how his overall GUI worked and how to add GUI functionality.

## Strategies:

There are four strategy options:

Level 1: Not aggressive at all
With this strategy, a player never bluffs or calls another player's bluff.

Level 2: Somewhat aggressive
With this strategy, a player bluffs 30% of the time but never calls another player's bluff.

Level 3: Aggressive
This player bluffs 30% of the time and calls 30% of the time.

Level 4: Extremely aggressive
This player never bluffs but calls 50% of the time.

## Fail-Safe Attributes

If the user selects Do Move, Turn, or Game without first initializing the game, the game will automatically initialize without random and carry out the user's command.
