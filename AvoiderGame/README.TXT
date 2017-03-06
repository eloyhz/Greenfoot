1. Create the AvoiderGame scenario.

2. Create the AvoiderWorld subclass from World (rename MyWorld class)

3. Set the background image for the world, i.e. space1.jpg

4. Create the Avatar subclass from Actor and set the skull.png image from symbols

5. Create the Enemy subclass from Actor and set the smiley1.png image from symbols

6. Add the hero to the world by creating and instance, putting into the world and saving it.

7. Write a method inside the Avatar class called followMouse() wich get the mouse info 
x, y and set the avatar's location.

8. Call  followMouse()  from the Avatar's act() method.

9. Make the Enemy fall down changing its y's location inside the act() method. 
Add an enemy to the world and test it.

10. Add the act() method in the AvoiderWorld to create random enemies to appear from top.

11. Make enemies disapear when they reach the bottom. This can be done by unbounding the world
makeing  false the last parameter in the call to World constructor.

12. Remove the enemies by themselves writing a method in the Enemy class. This method will be
called from the act() method and will test if its y position is greater than height's 
world + 30, if so then call the remove method from the world.

13. Add a turn(5) inside the enemy's act() method.

14. Check the collisions using the Actor's getOneIntersectingObject(). If there is a collision
then remove the hero and stop the world.

15. Make a AvoiderGameOverWorld subclass from World and assign it a new image created by
any image editor.

16. Switch the world when the game is over using the setWorld() method from World class.

17. Add an act() method in the AvoiderGameOverWorld class to make switch world when the
user make a click.

18. Add an AvoiderGameIntroScreen subclass from World and assign it a new image created
with an editor.

19. Add an act() method to the AvoiderGameIntroScreen class to make switch world to
AvoiderWorld whenever the user make a click.

20. Create a new AvoiderGameIntroScreen world to set as the initial world.

21. Add audio file ufo.mp3 to sounds directory (source: http://djgubkafish.newgrounds.com)

22. 
