
package monopoly.engine;

/*****************************************
* Class Name: Space
* Purpose: Represents a space on the game board.
*******************************************/

public class Space 
{
    //m_name --> Holds the name of the space
    //m_message --> Holds a message that displays when the player lands on the space
    protected String m_name, m_message;
    //m_playersOnSpace --> Holds the player numbers that are on the space 
    //(-1 if the player is not on the space)
    protected int[] m_playersOnSpace;
    //m_numOfPlayersOnSpace --> Holds the number of player on the space
    //m_spaceNum --> Holds the number of the space
    //m_currentPrice --> Holds the current price of the space if it is a tax space
    //m_owner --> Holds the player number of the player that ownes the space
    protected int m_numOfPlayersOnSpace, m_spaceNum, m_currentPrice, m_owner;
    //m_charge --> Holds the charge of the space if it charges the player
    private int m_charge;
    //m_isOwned --> Holds true if a player ownes the space
    protected boolean m_isOwned;
    
    //enum that represents the type of space
    //NORMAL -> If the space is a colored property
    //RAILROAD -> If the space is a railroad
    //UTILITY -> If the space is a utility
    //GO -> If the space is go
    //TAX -> If the space charges the player
    //CHANCE -> If the space is chance
    //CC -> If the space is community chest
    //VJAIL -> If the space is visiting jail
    //JAIL -> If the space is go to jail
    //FP -> If the space is free parking
    public enum m_propertyType
    {
        NORMAL, RAILROAD, UTILITY, GO, TAX, 
        CHANCE, CC, VJAIL, JAIL, FP
    };
    protected m_propertyType m_type;
    
    //default constructor
    public Space()
    {
        m_playersOnSpace = new int[4];
        m_isOwned = false;
        m_message = "";
        m_spaceNum = -1;
        
        for(int i = 0; i < 4; i++)
        {
            m_playersOnSpace[i] = -1;
        }
    }
    //overloaded constructor
    public Space(String a_name)
    {
        m_name = a_name;
        m_numOfPlayersOnSpace = 0;
        m_playersOnSpace = new int[4];
        m_isOwned = false;
        m_message = "";
        m_charge = 0;
        m_spaceNum = -1;
        
        for(int i = 0; i < 4; i++)
        {
            m_playersOnSpace[i] = -1;
        }
    }
    //overloaded constructor
    public Space(String a_name, int a_charge, int a_spaceNum)
    {
        m_name = a_name;
        m_numOfPlayersOnSpace = 0;
        m_playersOnSpace = new int[4];
        m_isOwned = false;
        m_message = "";
        m_charge = a_charge;
        m_spaceNum = a_spaceNum;
        
        for(int i = 0; i < 4; i++)
        {
            m_playersOnSpace[i] = -1;
        }
    }
/*
NAME
        addPlayerToSpace

SYNOPSIS
        public void addPlayerToSpace(int a_playerNum)
    
            a_playerNum --> The number of the player to be added

DESCRIPTION
        Adds a player to the space

RETURNS
        void

AUTHOR
        William Ryan
*/
    public void addPlayerToSpace(int a_playerNum)
    {
        for(int i = 0; i < 4; i++)
        {
            
            if(m_playersOnSpace[i] == -1)
            {
                m_playersOnSpace[i] = a_playerNum;
                m_numOfPlayersOnSpace++;
                break;
            }
        }
    }
/*
NAME
        removePlayerFromSpace

SYNOPSIS
        public void removePlayerFromSpace(int a_playerNum)
    
            a_playerNum --> The number of the player to be removed

DESCRIPTION
        Removes a player from a space

RETURNS
        void

AUTHOR
        William Ryan
*/
    public void removePlayerFromSpace(int a_playerNum)
    {
        for(int i = 0; i < 4; i++)
        {
            if(m_playersOnSpace[i] == a_playerNum)
            {
                m_playersOnSpace[i] = -1;
                m_numOfPlayersOnSpace--;
                break;
            }
        }
    }
    //****************************Setters Start********************************
    
    //sets the type based on the int (a_type) provided
    public void setSpaceType(int a_type)
    {
        switch(a_type)
        {
            case 0:
                m_type = m_propertyType.NORMAL;
                m_message = "You Landed on " + m_name;
                break;
            case 1:
                m_type = m_propertyType.RAILROAD;
                m_message = "You Landed on " + m_name;
                break;
            case 2:
                m_type = m_propertyType.UTILITY;
                m_message = "You Landed on " + m_name;
                break;
            case 3:
                m_type = m_propertyType.GO;
                m_message = "You Landed on Go, Collect $200";
                break;
            case 4:
                m_type = m_propertyType.TAX;
                m_message = "You Landed on " + m_name + ", Pay " + m_charge;
                break;
            case 5:
                m_type = m_propertyType.CHANCE;
                m_message = "You Landed on Chance";
                break;
            case 6:
                m_type = m_propertyType.CC;
                m_message = "You Landed on Community Chest";
                break;
            case 7:
                m_type = m_propertyType.VJAIL;
                m_message = "You Landed on Visiting Jail";
                break;
            case 8:
                m_type = m_propertyType.JAIL;
                m_message = "Go to Jail";
                break;
            case 9:
                m_type = m_propertyType.FP;
                m_message = "You Landed on Free Parking";
                break;
            default:
                System.out.println("Error: Space type set improperly.");
                System.exit(0);
        }
    }
    public void setCurrentPrice(int a_price)
    {
        m_currentPrice = a_price;
    }
    public void setOwned()
    {
        m_isOwned = true;
    }
    public void setOwner(int a_owner)
    {
        m_owner = a_owner;
    }
    //****************************Setters End***********************************
    
    //****************************Getters Start*********************************
    public String getName()
    {
        return m_name;
    }
    public int getCharge()
    {
        return m_charge;
    }
    public int getCurrentPrice()
    {
        return m_currentPrice;
    }
    public int getNumPlayersOnSpace()
    {
        return m_numOfPlayersOnSpace;
    }
    
    public int[] getSpace()
    {
        return m_playersOnSpace;
    }
    public int getSpaceNum()
    {
        return m_spaceNum;
    }
    public int getOwner()
    {
        return m_owner;
    }
    
    public m_propertyType getSpaceType()
    {
        return m_type;
    }
    
    public boolean isOwned()
    {
        return m_isOwned;
    }
    //****************************Getters End***********************************
    @Override
    public String toString()
    {
        return m_name;
    }
}
