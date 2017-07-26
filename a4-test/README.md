# a4-test  


## Cards  
`TestCard` is a simple program that generates a deck of cards, shuffles the deck and then sort it. This program should __compile__ and __run__ if you have implemented your `StandardCard` and `Card` classes properly.

## Bubbles
You can visualize your Bubble classes with the `Bubbles` processing sketch provided (`Bubbles.zip`). You can either do this in the lab computers or at home. At home, you will need to install Processing 3 

[https://processing.org/download/](https://processing.org/download/)

Once you have it installed, unzip the archive and add your `RedBubble` and `BlueBubble` classes to this folder. Open the `Bubbles.pde` file with Processing and this will open a simple IDE from where you can run the program.

What is the `.pde` file? What is Processing? Processing essentially allows you to write interactive Java programs without having to deal with some the clunkiness that Java has (for graphics, mouse input, etc). When you run the `Bubble.pde` program, the `setup()` method is executed and then the `draw()` method is repeatedly called until the program is terminated (when you close the graphics window). You don't have to change much in the pde file. Right now it only has four red bubbles. Change two of the bubbles to be blue bubbles and this should be sifficient to visualize your bubbles. (add more, less, modify the code in whatever you wish to further test it).

But what is the .pde file really? It is the interior of a class that Processing creates for you. Both `setup` and `draw` are instance methods of the class. Varibales you declare outside of method are instance methods of this processing class.

We used to use Processing in COMP1405 as a lead in to Java in 1406. (We may do this again in the future.) It is actualy a pretty good prototyping tool for Java programs though, as it allows you to have easy graphics and mouse/keyboard interactions.
