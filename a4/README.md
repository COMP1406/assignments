# Assignment 4 (updated)
(Due Tuesday, August 1, at 5:30 pm)
Be sure to submit your code on cuLearn (not github)
---

---


---



## Bubbles

Consider the world of bubbles. We will only consider red and blue bubbles for now. First, look at what is in the provided abstract `Bubble` class. Your task will be to implement two subclasses: `RedBubble` and `BlueBubble`. Their  behaviour is described below.

Do not change the `Bubble` class.
 
### RedBubble
Red bubbles bounce of the world boundaries and like to eat blue bubbles. They will move towards (chase) the closest blue bubble in the world. 
This class should have the constructor 

```
public RedBubble(double x, double y, double speedX, double speedY, double radius, int health)
```

that sets its attributes based on the input parameters, and also sets its `colour` attribute to red (`Bubble.COLOURS[0]`).

The logic of a red bubble (which is driven in its `update` method) is defined as follows:

- red bubbles ignore each other. They can overlap in space and do nothing when they collide.
- red bubbles will chase (move towards) the closest blue bubble in the world.
- when a red bubble collides with a blue bubble (catches a blue bubble), the blue bubble gives all of its health points to the red bubble.
- red bubbles bounce off of the world boundaries in a natural way. For example, if a red ball hits one of the vertical walls (left or right), it negates its speedX value.

### BlueBubble
Blue bubbles always stay on either the left side of the world or the right. When two blue bubbles collide, they _share_ some health points.

This class should have the constructor 

```
public BlueBubble(double x, double y, double speedX, double speed, double radius, int health)
```

that sets its attributes based on the input parameters, and also sets its `colour` attribute to blue (`Bubble.COLOURS[1]`).

The logic of a blue bubble (`update`) is defined as follows:

- a blue bubble will always stay on the left 1/2 of the world or the right 1/2 of the world. They will bounce (in a natural way) off of the world boundaries and the invisible boundary that separates the left and right sides of the world.

- blue bubbles reverse their direction whenever they collide with another bubble (of any colour).
- when a blue bubble collides with a red bubble (as described above), it loses all of its health points. 
- when a blue bubble collides with another blue bubble, if one of the bubbles has 2 or more health points compared to the other, it gives one of them to the other. That is, they share health points. 
- if a blue bubble has zero health points, it stops moving. If another blue bubble collides with it, and shares a health point with it, it will start to move in a random direction.  
- a blue bubble is allowed to move 1.5 times faster than a red bubble. 

---

## Cards (Implementing the Comparable Interface)
Consider the provided abstract `Card` class. You will implement a __concrete__ subclass called `StandardCard`. You will also modify the `Card` class by adding appropriate (hidden) state.

A standard deck of cards consist of 52 cards. Each card has a rank (2, 3, ..., 9, 10, Jack, Queen, King, Ace) and a suit (spades, hearts, clubs, diamonds). 

The ordering of standard cards is first specified by suits and then by rank if two cards have the same suits. The ordering of suits is

```
diamonds < clubs < hearts < spades
```

If two standard cards have the same suit, then ordering is based on rank as follows

```
2 < 3 < ... < 9 < 10 < Jack < Queen < King < Ace
```

Two standard cards with the same suit and rank are equal to each other.

Be sure that all inherited methods are implemented as specified (either in this document or in the comments of `Card`).
