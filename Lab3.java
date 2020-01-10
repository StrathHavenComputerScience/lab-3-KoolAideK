public class Lab3
{
    public static void turnRight(){
        Robot.turnLeft();
        Robot.turnLeft();
        Robot.turnLeft();
    }

    public static void lightCandle(){
        Robot.turnLeft();
        Robot.move();
        turnRight();
        if(Robot.frontIsClear()){
            Robot.move();
            Robot.makeDark();
        }
        else{
            Robot.turnLeft();
            Robot.move();
            turnRight();
            if(Robot.frontIsClear()){
                Robot.move();
                Robot.makeDark();
            }
            else{
                Robot.turnLeft();
                Robot.turnLeft();
                Robot.move();
                turnRight();
            }
        }
    }

    public static void reset(){
        Robot.move();
        turnRight();
        Robot.move();
        if(Robot.frontIsClear()){
            Robot.move();
            if(Robot.frontIsClear()){
                Robot.move();
            }
            else{
                Robot.turnLeft();
            }
        }
        else{
            Robot.turnLeft();
        }
    }

    public static void testLightCandles1()
    {
        Robot.load("candles1.txt");
        Robot.setDelay(0.05);
        lightCandles();

    }

    public static void testLightCandles2()
    {
        Robot.load("candles2.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void lightCandles()
    {
        //insert instructions below
        lightCandle();
        reset();
        lightCandle();
        reset();
        lightCandle();
        reset();
        lightCandle();
        reset();
        lightCandle();
        reset();
        lightCandle();
        reset();
        lightCandle();
        reset();
        lightCandle();
        reset();
        lightCandle();
        reset();
        lightCandle();
        reset();
    }

    public static void turnAround(){
        Robot.turnLeft();
        Robot.turnLeft();
    }
    //takes robot out of room and sets it up for next room
    public static void escapeRoom(){
        //this means you successfully checked a room
        if(!Robot.frontIsClear()){
            turnAround();
            Robot.move();
            Robot.turnLeft();
            Robot.move();
        }
    }

    public static void nextRoom(){
        //if you hit a wall
        turnRight();
        Robot.move();

    }
    //checks if a room is dark and if it isn't makes it dark
    public static void makeRoom(){
        Robot.turnLeft();
        if(Robot.frontIsClear()){
            Robot.move();
            if(!Robot.onDark()){
                Robot.makeDark();
                escapeRoom();
            }
            else{
                escapeRoom();
            }
        }else{
            nextRoom();
        }
    }

    public static void finalRoom(){
        Robot.turnLeft();
        if(Robot.frontIsClear()){
            Robot.move();
            if(!Robot.onDark()){
                Robot.makeDark();
                turnAround();
                Robot.move();
            }
            else{
                turnAround();
                Robot.move();
            }
        }else{
            turnAround();
        }
    }
    //completes an entire wall
    public static void completeWall(){
        makeRoom();
        makeRoom();
        makeRoom();
        makeRoom();
        finalRoom();

    }
    //Run this method to test completeRoom on map room1.txt
    public static void testCompleteRoom1()
    {
        Robot.load("room1.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    //Run this method to test completeRoom on map room2.txt
    public static void testCompleteRoom2()
    {
        Robot.load("room2.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    //Complete this method.  You will need to write additional helper methods.
    public static void completeRoom()
    {
        //insert instructions below
        completeWall();
        completeWall();
        completeWall();
        completeWall();
    }
    //Run this method to test swapAll on map swap1.txt
    public static void testSwapAll1()
    {
        Robot.load("swap1.txt");
        Robot.setDelay(0.05);
        swapAll();
    }
    //change block color and go to the next one
    public static void swapBlock(){
        if(Robot.onDark()){
            Robot.makeLight();
            Robot.move();
        }
        else{
            Robot.makeDark();
            Robot.move();
        }
    }
    //changes the tenth blocks color
    public static void finalBlock(){
        if(Robot.onDark()){
            Robot.makeLight();
        }
        else{
            Robot.makeDark();
        }
    }
    //goes to the left row
    public static void leftRow(){
        Robot.turnLeft();
        Robot.move();
        Robot.turnLeft();
    }
    //goes to the row on the Right
    public static void rightRow(){
        Robot.turnLeft();
        Robot.move();
        Robot.move();
        Robot.turnLeft();
    }
    //swaps an entire column
    public static void swapColumn(){
        swapBlock();
        swapBlock();
        swapBlock();
        swapBlock();
        swapBlock();
        swapBlock();
        swapBlock();
        swapBlock();
        swapBlock();
        finalBlock();
    }
    //swaps the entire board
    public static void swapBoard(){
        swapColumn();
        leftRow();
        swapColumn();
        rightRow();
        swapColumn();
    }
    //Run this method to test swapAll on map swap2.txt
    public static void testSwapAll2()
    {
        Robot.load("swap2.txt");
        Robot.setDelay(0.05);
        swapAll();
    }

    //Complete this method.  You will need to write additional helper methods.
    public static void swapAll()
    {
        //insert instructions below
        swapBoard();
    }
    //Don't run these. I will!
    public static void testLightCandles3()
    {
        Robot.load("candles3.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void testLightCandles4()
    {
        Robot.load("candles4.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void testCompleteRoom3()
    {
        Robot.load("room3.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    public static void testCompleteRoom4()
    {
        Robot.load("room4.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    public static void testSwapAll3()
    {
        Robot.load("swap3.txt");
        Robot.setDelay(0.05);
        swapAll();
    }

    //Run this method to test swapAll on map swap2.txt
    public static void testSwapAll4()
    {
        Robot.load("swap4.txt");
        Robot.setDelay(0.05);
        swapAll();
    }
}
