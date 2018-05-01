
package monopoly.engine;

/*****************************************
* Class Name: Board
* Purpose: Represents the game board.
* Composed with objects of Space, MinorProperty, and MajorProperty classes
*******************************************/

import java.util.ArrayList;

public class Board 
{
    //private 
    
    private ArrayList<Space> m_board = new ArrayList<Space>();
    //private int railRoadVal = 25;
    
    public Board()
    {
        //used to initialize board
        Space initSpace;
        MajorProperty initMajorProperty;
        MinorProperty initMinorProperty;
        
        /*********initialize all the spaces on the board***********************/
        
       /************************initialize bottom side*************************/
       
        initSpace = new Space("Go", -1, 0);
        initSpace.setSpaceType(3);
        m_board.add(initSpace);
        
        initMajorProperty = new MajorProperty("Mediterranean Avenue", 1);
        initMajorProperty.setPropertyValues(2, 10, 30, 90, 160, 250, 30, 60, 50);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initSpace = new Space("Comunity Chest", -1, 2);
        initSpace.setSpaceType(6);
        m_board.add(initSpace);
        
        initMajorProperty = new MajorProperty("Baltic Avenue", 3);
        initMajorProperty.setPropertyValues(4, 20, 60, 180, 320, 450, 30, 60, 50);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initSpace = new Space("Income Tax", 200, 4);
        initSpace.setSpaceType(4);
        m_board.add(initSpace);
        
        initMinorProperty = new MinorProperty("Reading Railroad", 5);
        initMinorProperty.setSpaceType(1);
        initMinorProperty.setPropertyValue(true, 100);
        m_board.add(initMinorProperty);
        
        initMajorProperty = new MajorProperty("Oriental Avenue", 6);
        initMajorProperty.setPropertyValues(6, 30, 90, 270, 400, 550, 50, 100, 50);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initSpace = new Space("Chance", -1, 7);
        initSpace.setSpaceType(5);
        m_board.add(initSpace);
        
        initMajorProperty = new MajorProperty("Vermont Avenue", 8);
        initMajorProperty.setPropertyValues(6, 30, 90, 270, 400, 550, 50, 100, 50);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initMajorProperty = new MajorProperty("Connecticut Railroad", 9);
         initMajorProperty.setPropertyValues(8, 40, 100, 300, 450, 600, 60, 120, 50);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
         
        /******************************initialize left side********************/
        
        initSpace = new Space("Visiting Jail", -1, 10);
        initSpace.setSpaceType(7);
        m_board.add(initSpace);
        
        initMajorProperty = new MajorProperty("ST. Charles Place", 11);
        initMajorProperty.setPropertyValues(10, 50, 150, 450, 525, 750, 70, 140, 100);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initMinorProperty = new MinorProperty("Electric Company", 12);
        initMinorProperty.setSpaceType(2);
        initMinorProperty.setPropertyValue(false, 75);
        m_board.add(initMinorProperty);
        
        initMajorProperty = new MajorProperty("States Avenue", 13);
        initMajorProperty.setPropertyValues(10, 50, 150, 450, 525, 750, 70, 140, 100);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initMajorProperty = new MajorProperty("Virginia Avenue", 14);
        initMajorProperty.setPropertyValues(12, 60, 180, 500, 700, 900, 80, 160, 100);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initMinorProperty = new MinorProperty("Pensylvania Railroad", 15);
        initMinorProperty.setSpaceType(1);
        initMinorProperty.setPropertyValue(true, 100);
        m_board.add(initMinorProperty);
        
        initMajorProperty = new MajorProperty("ST. James Place", 16);
        initMajorProperty.setPropertyValues(14, 70, 200, 550, 750, 950, 90, 180, 100);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initSpace = new Space("Chance", -1, 17);
        initSpace.setSpaceType(5);
        m_board.add(initSpace);
        
        initMajorProperty = new MajorProperty("Tennesse Avenue", 18);
        initMajorProperty.setPropertyValues(14, 70, 200, 550, 750, 950, 90, 180, 100);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initMajorProperty = new MajorProperty("New York Avenue", 19);
        initMajorProperty.setPropertyValues(16, 80, 220, 600, 800, 1000, 100, 200, 100);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        
        /********************initialize top side*******************************/
        
        initSpace = new Space("Free Parking", -1, 20);
        initSpace.setSpaceType(9);
        m_board.add(initSpace);
        
        initMajorProperty = new MajorProperty("Kentucky Avenue", 21);
        initMajorProperty.setPropertyValues(18, 90, 250, 700, 875, 1050, 110, 220, 150);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initSpace = new Space("Chance", -1, 22);
        initSpace.setSpaceType(5);
        m_board.add(initSpace);
        
        initMajorProperty = new MajorProperty("Indiana Avenue", 23);
        initMajorProperty.setPropertyValues(18, 90, 250, 700, 875, 1050, 110, 220, 150);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initMajorProperty = new MajorProperty("Illinois Avenue", 24);
        initMajorProperty.setPropertyValues(20, 100, 300, 750, 925, 1100, 120, 240, 150);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initMinorProperty = new MinorProperty("B&O. Railroad", 25);
        initMinorProperty.setSpaceType(1);
        initMinorProperty.setPropertyValue(true, 100);
        m_board.add(initMinorProperty);
        
        initMajorProperty = new MajorProperty("Atlantic Avenue", 26);
        initMajorProperty.setPropertyValues(22, 110, 330, 800, 975, 1150, 130, 260, 150);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initMajorProperty = new MajorProperty("Ventnor Avenue", 27);
        initMajorProperty.setPropertyValues(22, 110, 330, 800, 975, 1150, 130, 260, 150);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initMinorProperty = new MinorProperty("Water Works", 28);
        initMinorProperty.setSpaceType(2);
        initMinorProperty.setPropertyValue(false, 75);
        m_board.add(initMinorProperty);
        
        initMajorProperty = new MajorProperty("Marvin Gardens", 29);
        initMajorProperty.setPropertyValues(24, 120, 360, 850, 1025, 1200, 140, 280, 150);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        
        /************************initialize right side*************************/
        
        initSpace = new Space("Go to Jail", -1, 30);
        initSpace.setSpaceType(8);
        m_board.add(initSpace);
        
        initMajorProperty = new MajorProperty("Pacific Avenue", 31);
        initMajorProperty.setPropertyValues(26, 130, 390, 900, 1100, 1275, 150, 300, 200);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initMajorProperty = new MajorProperty("North Carolina Avenue", 32);
        initMajorProperty.setPropertyValues(26, 130, 390, 900, 1100, 1275, 150, 300, 200);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initSpace = new Space("Comunity Chest", -1, 33);
        initSpace.setSpaceType(6);
        m_board.add(initSpace);
        
        initMajorProperty = new MajorProperty("Pennsylvania Avenue", 34);
        initMajorProperty.setPropertyValues(28, 150, 450, 1000, 1200, 1400, 160, 320, 200);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initMinorProperty = new MinorProperty("Short Line Railroad", 35);
        initMinorProperty.setSpaceType(1);
        initMinorProperty.setPropertyValue(true, 100);
        m_board.add(initMinorProperty);
        
        initSpace = new Space("Chance", -1, 36);
        initSpace.setSpaceType(5);
        m_board.add(initSpace);
           
        initMajorProperty = new MajorProperty("Park Place", 37);
        initMajorProperty.setPropertyValues(35, 175, 500, 1100, 1300, 1500, 175, 350, 200);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
        
        initSpace = new Space("Luxury Tax", 75, 38);
        initSpace.setSpaceType(4);
        m_board.add(initSpace);
        
        initMajorProperty = new MajorProperty("Boardwalk", 39);
        initMajorProperty.setPropertyValues(50, 200, 600, 1400, 1700, 2000, 200, 400, 200);
        initMajorProperty.setSpaceType(0);
        m_board.add(initMajorProperty);
    }
    
/*
NAME
        moveToPosition

SYNOPSIS
        public int moveToPosition(int a_playerNum, int a_spaceFromNum, int a_roll)
    
            a_playerNum --> The number of the player to move
            a_spaceFromNum --> The space the player was previously on
            a_roll --> The players roll

DESCRIPTION
        Moves a player to a space based on the roll

RETURNS
        int 
            Returns the space number the player is on after the move 

AUTHOR
        William Ryan
*/
    public int moveToPosition(int a_playerNum, int a_spaceFromNum, int a_roll)
    {
        int r;
        m_board.get(a_spaceFromNum).removePlayerFromSpace(a_playerNum);
        r = a_spaceFromNum + a_roll;
        
        if(r >= m_board.size())
        {
            r = r - m_board.size();
        }
       
        m_board.get(r).addPlayerToSpace(a_playerNum);
        return r;
    }
/*
NAME
        moveToSpecificPosition

SYNOPSIS
        public int moveToSpecificPosition(int a_playerNum, int a_spaceFrom, int a_spaceTo)
    
            a_playerNum --> The number of the player to be moved
            a_spaceFrom --> The number of the space the player is moving from
            a_spaceTo --> The number of the space the player is moving to

DESCRIPTION
        Moves a player to a specific space on the board

RETURNS
        int 
            Returns 1 if the player passed go
            Returns 2 if the player landed on go to jail
            Returns 0 if the player moved normally

AUTHOR
        William Ryan
*/
    public int moveToSpecificPosition(int a_playerNum, int a_spaceFrom, int a_spaceTo)
    {
        m_board.get(a_spaceFrom).removePlayerFromSpace(a_playerNum);
        m_board.get(a_spaceTo).addPlayerToSpace(a_playerNum);
        
        if(a_spaceFrom > a_spaceTo)
        {
            return 1;
        }
        else if(a_spaceTo == 30)
        {
            return 2;
        }
        else
        {
            return 0;
        }
    }
    
    //adds a player to a space
    //@a_playerNum -> The number of the player being added
    //@a_spaceNum -> The number of the space the player is being added to
    public void addPlayerToSpace(int a_playerNum, int a_spaceNum)
    {
        m_board.get(a_spaceNum).addPlayerToSpace(a_playerNum);
    }
    //*****************************Getters Start********************************
    public int getNumOfPlayersOnSpace(int a_spaceNum)
    {
        return m_board.get(a_spaceNum).getNumPlayersOnSpace();
    }
    public String getSpaceName(int a_spaceNum)
    {
        return m_board.get(a_spaceNum).getName();
    }
    
    public int[] getPlayersOnSpace(int a_spaceNum)
    {
        return m_board.get(a_spaceNum).getSpace();
    }
    
    public Space getSpace(int a_pos)
    {
        return m_board.get(a_pos);
    }
    public MinorProperty getMinorProperty(int a_pos)
    {
        return (MinorProperty) m_board.get(a_pos);
    }
    
    public MajorProperty getMajorProperty(int a_pos)
    {
        return (MajorProperty) m_board.get(a_pos);
    }
    //returns the space number based on the id provided
    public int getPropertyNumById(int a_propFamily, int a_propNum)
    {
        switch(a_propFamily)
        {
            case 0:
                if(a_propNum == 0)
                {
                    return 1;
                }
                if(a_propNum == 1)
                {
                    return 3;
                }
            case 1:
                if(a_propNum == 0)
                {
                    return 6;
                }
                if(a_propNum == 1)
                {
                    return 8;
                }
                if(a_propNum == 2)
                {
                    return 9;
                }
            case 2:
                if(a_propNum == 0)
                {
                    return 11;
                }
                if(a_propNum == 1)
                {
                    return 13;
                }
                if(a_propNum == 2)
                {
                    return 14;
                }
            case 3:
                if(a_propNum == 0)
                {
                    return 16;
                }
                if(a_propNum == 1)
                {
                    return 18;
                }
                if(a_propNum == 2)
                {
                    return 19;
                }
            case 4:
                if(a_propNum == 0)
                {
                    return 21;
                }
                if(a_propNum == 1)
                {
                    return 23;
                }
                if(a_propNum == 2)
                {
                    return 24;
                }
            case 5:
                if(a_propNum == 0)
                {
                    return 26;
                }
                if(a_propNum == 1)
                {
                    return 27;
                }
                if(a_propNum == 2)
                {
                    return 29;
                }
            case 6:
                if(a_propNum == 0)
                {
                    return 31;
                }
                if(a_propNum == 1)
                {
                    return 32;
                }
                if(a_propNum == 2)
                {
                    return 34;
                }
            case 7:
                if(a_propNum == 0)
                {
                    return 37;
                }
                if(a_propNum == 1)
                {
                    return 39;
                }
            case 8:
                if(a_propNum == 0)
                {
                    return 5;
                }
                if(a_propNum == 1)
                {
                    return 15;
                }
                if(a_propNum == 2)
                {
                    return 25;
                }
                if(a_propNum == 3)
                {
                    return 35;
                }
            case 9:
                if(a_propNum == 0)
                {
                    return 12;
                }
                if(a_propNum == 1)
                {
                    return 28;
                }
            default:
                return -1;
        }
    }
    //gets the property number cooresponding to the property name(a_name)
    public MinorProperty getPropertyByName(String a_name)
    {
        switch(a_name)
        {
            case "Mediterranean Ave":
                return (MinorProperty)getSpace(1);
            case "Baltic Ave":
                return (MinorProperty)getSpace(3);
            case "Oriental Ave":
                return (MinorProperty)getSpace(6);
            case "Vermont Ave":
                return (MinorProperty)getSpace(8);
            case "Connecticut Ave":
                return (MinorProperty)getSpace(9);
            case "ST. Charles":
                return (MinorProperty)getSpace(11);
            case "States Ave":
                return (MinorProperty)getSpace(13);
            case "Virginia Ave":
                return (MinorProperty)getSpace(14);
            case "ST. James":
                return (MinorProperty)getSpace(16);
            case "Tennessee Ave":
                return (MinorProperty)getSpace(18);
            case "New York Ave":
                return (MinorProperty)getSpace(19);
            case "Kentucky Ave":
                return (MinorProperty)getSpace(21);
            case "Indiana Ave":
                return (MinorProperty)getSpace(23);
            case "Illinois Ave":
                return (MinorProperty)getSpace(24);
            case "Atliantic Ave":
                return (MinorProperty)getSpace(26);
            case "Ventnor Ave":
                return (MinorProperty)getSpace(27);
            case "Marvin Gardens":
                return (MinorProperty)getSpace(29);
            case "Pacific Ave":
                return (MinorProperty)getSpace(31);
            case "North Carolina Ave":
                return (MinorProperty)getSpace(32);
            case "Pennsylvania Ave":
                return (MinorProperty)getSpace(34);
            case "Park Place":
                return (MinorProperty)getSpace(37);
            case "Boardwalk":
                return (MinorProperty)getSpace(39);
            case "Reading RR.":
                return (MinorProperty)getSpace(5);
            case "Penn. RR.":
                return (MinorProperty)getSpace(15);
            case "B&O RR.":
                return (MinorProperty)getSpace(25);
            case "Short Line RR.":
                return (MinorProperty)getSpace(35);
            case "Electric Company":
                return (MinorProperty)getSpace(12);
            case "Water Works":
                return (MinorProperty)getSpace(28);
            default:
                return (MinorProperty)getSpace(0);
        }
    }
    //*****************************Getters End********************************
}
