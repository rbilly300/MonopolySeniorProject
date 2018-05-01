
package monopoly.engine;

/*****************************************
* Class Name: Player
* Purpose: Represents a player.
*******************************************/

import java.util.ArrayList;

public class Player 
{
    //m_pieceNum --> An int to represent the token the player had chosen
    //m_playerNum --> The number of the player
    //m_money --> Holds the players money
    //m_currentPosition --> The space number the player is currently on
    //m_getOutOfJailCards --> Holds how many get out of jail free cards the player has
    //m_jailRolls --> Holds the number of times the player has rolled while in jail
    //m_finishingPlace --> Holds the players finishing place
    private int m_pieceNum, m_playerNum, m_money, m_currentPosition, m_getOutOfJailCards, m_jailRolls, m_finishingPlace;
    //m_playerName --> Holds the players name
    //m_pieceImg --> Holds the path to the image of the token the player has chosen 
    private String m_playerName, m_pieceImg;
    //m_isHuman --> Holds true if the player is a human(Computer players were not implemented)
    //m_inJail --> Holds true if the player is in jail
    //m_isBankrupt --> Holds true if the player is bankrupt
    private boolean m_isHuman, m_inJail, m_isBankrupt;
    //m_owendProperties --> An ArrayList of boolean arrays, each boolean array represents properties 
    //holds true if the property is owned by the player, fakse otherwise
    private ArrayList <boolean[]>m_owendProperties;
    //m_monopoly --> An array used to tell if the player has a monopoly on a certain major property
    private boolean[] m_monopoly;
    
    //default constructor
    public Player()
    {
        m_pieceNum = -1;
        m_playerNum = -1;
        m_jailRolls = 0;
        m_getOutOfJailCards = 0;
        m_finishingPlace = 1;
        m_money = 1500;
        m_monopoly = new boolean[8];
        m_isBankrupt = false;
        m_inJail = false;
        
        setProperties();
    }
    
    //overloaded constructor
    public Player(String a_playerName)
    {
        m_playerName = a_playerName;
        m_money = 1500;
        m_inJail = false;
        m_isBankrupt = false;
        m_monopoly = new boolean[8];
        m_getOutOfJailCards = 0;
        m_finishingPlace = 1;
        
        setProperties();
    }
    
    //initializes all the of the player's properties
    public void setProperties()
    {
        m_owendProperties = new ArrayList();
        
        boolean[] purple = {false, false};
        boolean[] lBlue = {false, false, false};
        boolean[] pink = {false, false, false};
        boolean[] orange = {false, false, false};
        boolean[] red = {false, false, false};
        boolean[] yellow = {false, false, false};
        boolean[] green = {false, false, false};
        boolean[] dBlue = {false, false};
        boolean[] RR = {false, false, false, false};
        boolean[] U = {false, false};
        
        m_owendProperties.add(purple);
        m_owendProperties.add(lBlue);
        m_owendProperties.add(pink);
        m_owendProperties.add(orange);
        m_owendProperties.add(red);
        m_owendProperties.add(yellow);
        m_owendProperties.add(green);
        m_owendProperties.add(dBlue);
        m_owendProperties.add(RR);
        m_owendProperties.add(U);
    }
/*
NAME
        buyProperty

SYNOPSIS
        public void buyProperty(int a_property, int a_propertyNum, int a_price)
    
            a_property  --> A number representing which color the property is.
            a_propertyNum  --> A number representing which property is being bought.
            a_price --> The price of the property being purchased.

DESCRIPTION
        Buys a property and sets its owner to the player

RETURNS
        void

AUTHOR
        William Ryan
*/
    public void buyProperty(int a_property, int a_propertyNum, int a_price)
    {
        boolean []oldProp = m_owendProperties.get(a_property);
        boolean []updatedProp = new boolean[oldProp.length];
        m_money = m_money - a_price;
        
        for(int i = 0; i < oldProp.length; i++)
        {
            updatedProp[i] = oldProp[i];
        }
        updatedProp[a_propertyNum] = true;
        
        m_owendProperties.set(a_property, updatedProp);
    }
/*
NAME
        removePlayerFromGame

SYNOPSIS
        removePlayerFromGame(Board a_currentBoard)
    
            a_currentBoard --> The board of the current game.

DESCRIPTION
        removes a player from the current game and sets their owned properties 
        un-owned.

RETURNS
        void

AUTHOR
        William Ryan
*/
    public void removePlayerFromGame(Board a_currentBoard)
    {
        for(int i = 0; i < m_owendProperties.size();i++)
        {
            for(int ii = 0; ii < m_owendProperties.get(i).length;ii++)
            {
                //remove the owner of each property
                if(m_owendProperties.get(i)[ii])
                {
                    int propertyNum = a_currentBoard.getPropertyNumById(i, ii);
                    a_currentBoard.getMinorProperty(propertyNum).setOwner(-1);
                }
            }
        }
        //take away all players owned properties
        for(int i = 0; i < m_owendProperties.size();i++)
        {
            for(int ii = 0; ii < m_owendProperties.get(i).length;ii++)
            {
                m_owendProperties.get(i)[ii] = false;
            }
        }
    }
    
    //*****************************Setter Start*********************************
    
    public void incrementJailRoll()
    {
        m_jailRolls++;
    }
    public void giveGetOutOfJailCard()
    {
        m_getOutOfJailCards = m_getOutOfJailCards + 1;
    }
    public void takeGetOutOfJailCard()
    {
        m_getOutOfJailCards = m_getOutOfJailCards - 1;
    }
    public void setMonopoly(int a_propertyFamily, boolean a_monopoly)
    {
        m_monopoly[a_propertyFamily] = a_monopoly;
    }
    
    public void setJailRollToZero()
    {
        m_jailRolls = 0;
    }
    public void setBankrupt()
    {
        m_isBankrupt = true;
    }
    
    public void setPlayer(int a_pieceNum, int a_playerNum, boolean a_isHuman)
    {
        m_playerNum = a_playerNum;
        m_isHuman = a_isHuman;
        
        switch (a_pieceNum)
        {
            case 1:
                m_pieceImg = "/monopoly/resources/Hat.png";
                break;
            case 2:
                m_pieceImg = "/monopoly/resources/Battleship.png";
                break;
            case 3:
                m_pieceImg = "/monopoly/resources/Racecar.png";
                break;
            case 4:
                m_pieceImg = "/monopoly/resources/WheelBarrel.png";
                break;
            case 5:
                m_pieceImg = "/monopoly/resources/Shoe.png";
                break;
            default:
                System.exit(1);   
        }
    }
    
    public void setPlayerName(String a_name)
    {
        m_playerName = a_name;
    }
    public void setPlayerPosition(int a_space)
    {
        m_currentPosition = a_space;
    }
    public void setPlayerPlacement(int a_placement)
    {
        m_finishingPlace = a_placement;
    }
    public void setPlayerType(boolean a_isHuman)
    {
        m_isHuman = a_isHuman;
    }
    public boolean getPlayerType()
    {
        return m_isHuman;
    }
    public void addToPlayerMoney(int a_money)
    {
        m_money = m_money + a_money;
    }
    
    public void setPlayerInJail(boolean a_inJail)
    {
        m_inJail = a_inJail;
    }
    
    public void setPlayerPiece(int a_pieceNum)
    {
        m_pieceNum = a_pieceNum;
        
        switch (a_pieceNum)
        {
            case 1:
                m_pieceImg = "/monopoly/resources/Hat.png";
                break;
            case 2:
                m_pieceImg = "/monopoly/resources/Battleship.png";
                break;
            case 3:
                m_pieceImg = "/monopoly/resources/Racecar.jpg";
                break;
            case 4:
                m_pieceImg = "/monopoly/resources/WheelBarrel.png";
                break;
            case 5:
                m_pieceImg = "/monopoly/resources/Shoe.png";
                break;
            default:
                System.exit(1);   
        }   
    }
    //*****************************Setter End***********************************
    
    //*****************************Getters Start********************************
    
    public int getJailRolls()
    {
        return m_jailRolls;
    }
    public boolean[] getMonopoly()
    {
        return m_monopoly;
    }
    public int getPlayerPieceNum()
    {
        return m_pieceNum;
    }
    public String getPlayerPieceImg()
    {
        return m_pieceImg;
    }
    public int getPlayerPlacement()
    {
        return m_finishingPlace;
    }
    public String getPlayerName()
    {
        return m_playerName;
    }
    public int getPlayerNum()
    {
        return m_playerNum;
    }
    public int getMoney()
    {
        return m_money;
    }
    public int getGetOutOfJailCard()
    {
        return m_getOutOfJailCards;
    }
    
    public boolean isInJail()
    {
        return m_inJail;
    }
    public boolean isBankrupt()
    {
        return m_isBankrupt;
    }
    
    public int getPlayerPosition()
    {
        return m_currentPosition;
    }
    public ArrayList<boolean[]> getOwnedProperties()
    {
        return m_owendProperties;
    }
    //*****************************Getters End**********************************
}
