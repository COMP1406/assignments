# Crazy 8s
---


You will implement different player strategies for the card game crazy 8s. The following description of the game is a slight modification of the rules found at 

[https://www.thespruce.com/crazy-eights-rules-card-game-411132](https://www.thespruce.com/crazy-eights-rules-card-game-411132)


---

## Crazy 8s
Crazy Eights, also known as Eights and as Swedish Rummy, is a distant relative of Rummy. It's known as a "stops" game because players can be stopped from discarding if they don't have a proper card. It's believed that Crazy Eights can trace its heritage back to the mid-1600s and a French gambling game known as Hoc.

__Players:__  2 to 4 players.

__Deck:__ Standard 52-card deck.

__Goal:__ To discard all of your cards.

__Setup:__ Choose a dealer. (The program is the dealer)


In a two-player game, each player is dealt seven cards. In a game with three or four players, each player is dealt five cards.

The remaining cards are placed face down in the center of the table, forming a __*draw pile*__. The top card of the draw pile is removed and turned face up to start the __*discard pile*__.

__Gameplay:__ A player is chosen as the first player. Play moves  clockwise. Here, clockwise means the next player in the list holding the players (wrapping around to the first when we go past the end).

On a turn, the given player adds to the discard pile by playing one card from their hand that matches the top card on the discard pile either by suit (diamonds, spades, etc) or by rank (6, 10, jack, etc.).

A player who cannot match the top card on the discard pile by suit or rank must draw cards from the draw pile until they can play one. A player is allowed to pull cards from the draw pile even if they already have a legal play (when it is their turn, before they discard to the discard pile). When the draw pile is empty, a player who cannot add to the discard pile passes their turn.

__Power Cards:__ All eights are wild and can be played on any card during a player's turn. When a player discards an eight, they chooses which suit is now in play. They do this in our game by removing the 8 from their hand and placing a _new_ card object on the discard pile that has rank 8 and the desired new suit.

The next player must play either a card of that suit or another eight.

All twos are special cards. When a player discards a two, the next player must take two cards from the draw pile and then end their turn without playing a card to the discard pile (or taking more cards from the draw pile).

All fours are special. When a player discards a four, the next player misses their turn and play goes to the following player.

All sevens are special. When a player discards a seven, the direction of play is reversed. The next player is the now the player who played just before the player who discarded the seven.


__Winning:__ The first player to discard all of his cards wins.

(With four players, it is possible to play partnership. If you do this, the game ends when both members of a partnership discard all their cards.)

To play multiple games, add up the cards remaining in the losers' hands and give the points to the winner: 10 points for each face card, 1 point for each ace, 50 points for each eight, 25 points for each two or four, 20 points for each seven and the face value for the other number cards.


Games are then played until a player reaches some predetermined goal such as 150, 200, or 1000.

---
---

## Provided Classes

You are given the following classes: `Card`, `Player` (abstract), `BadPlayer` (as an example player), `DiscardPile` and the sample program `Crazy8s`.

## Your Tasks

You will implement several new player classes that implement different strategies for players and modify `Crazy8s` to visualize game play. You must ensure that the games are played properly. You may modify any of the provided classes.

### Game Play

You must ensure that a proper game of crazy 8's is played. This means that all played cards (cards added to the discard pile) are valid. At the end of a game, points should be awarded to the winning player.

There should be choice for 2,3 or 4 player games and whether or not it is a single game play or multiple game (with a set points goal).

### Player Strategies

- `RandomPlayer` should play a random valid card. 


- `MindTheEights` should always be aware of any eights they are holding. This player will their eights until late in the game, but won't hold on to them too long (as they are worth a lot of points). Once any opponent goes down to one card, it's time to play your eight. If you have two eights, start playing them once an opponent goes down to two cards. (Expand this for 3 or 4 or more eights.)


- `HamperLeader` will try to hamper the progress of the leader if the leader is either the next or previous player.  If the next player is the leader (least amount of cards) then this player will try to hamper their progress by playing a power card. If the previous player is the leader, this player will hold on to their power cards until the direction of play is reversed and then hamper them (if this player has a seven they will change direction so that they can try to hamper the leader).

- `DiscardHighPoints` will try to discard their highest _point_ cards as soon as they can. This strategy aims to prevent the winner of a game (if is a different player) from obtaining too many points. This player will try to change suits whenever possible to a different suit if they have high point cards of that different suit. 

- `ExtraCards` will risk taking cards from the draw pile in an effort to get power cards. They will be clever with this though. If the next player only has 1 card left, they will keep picking a card until they get a power card (if they do not already have one) so that they can try to prevent the next player from winning. They will not take more than one extra card in the early rounds of the game. They will not take extra cards if they already have power cards in their hand.

- __Five player teams:__ `MemoryPlayer` will analyze the full discard pile at each turn and make decisions based on cards played by every player. A MemoryPlayer player is __not__ allowed to use the `instanceof` method to check which kind of player each player is. This player should simulate a clever player who remembers each card played by each player during the game.  

## Demonstration / Grading

When your team presents your working game, it is expected that you will have multiple versions of the game ready.

- This might be in the form of multiple java program, or
- A single program that takes command line arguments to specify which variant to run

The different versions should clearly demonstrate
- the behaviour of a single kind of player, or 
- the overall game play

When demonstrating individual players, you are free to define the deck and the hands of each player. Your demo games do not need to use a 52 card deck and cards need not be unique. Create scenarios that illustrate specific things. 

Your demonstrations must be user friendly and easy to see what it is you are trying to illustrate. For example, the sample Crazy8Game program's output is not sufficient for this. You will want to output to be easier to follow. (This may involve printing each player's hand on a single line in a nice way, the discard pile, etc.)

Your team is free to divide the work as you feel fit. Every team member is expected to fully implement at least one of the non-trivial player classes though. (Any player except `RandomPlayer` would be considered non-trivial.)

Don't repeat code! If every player has some common code, put it in the Player class and let each player inherit it.

You are free to modify the provided classes. Your final solution must be an OOP crazy 8s game though. Do not deconstruct the game into a procedural-based game. 


### Extras   


Individual team members can obtain extra credit (to offset a poor mark in a previous assignment) by extending the game further.

- In a four member team, you can implement a good `MemoryPlayer`.
- Create an interesting (non-trivial) new player.
- Create a tournament with many of your different players
- Create cheater players that work together in a 4 player game
- Create a `Game` class that oversees that a game is played correctly (ensures players do not create new cards, remove cards, play valid moves, etc)
- Add file i/o to load players (and their win/los history), play matches and then update the saved data
- Add graphics to the game
- ...

