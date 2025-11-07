import greenfoot.*;  

public class MyWorld extends World
{
    
     
    public MyWorld()
    {    
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player1 = new Player(); 
        addObject(player1, 150, 200);  

        Player2 player2 = new Player2(); 
        addObject(player2, 450, 200);   

        for (int i = 0; i < 10; i++) {
            Gold gold = new Gold();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(gold, x, y);
        if (getObjects(Gold.class).isEmpty()) {
            removeObjects(getObjects(null));
            setBackground("gameover.png");
            Greenfoot.stop();
            }
        }
    }
}