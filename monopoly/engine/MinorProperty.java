
package monopoly.engine;

/*****************************************
* Class Name: MinorProperty
* Purpose: Represents a railroad or utility space on the game board.
* (Inherits Space class)
*******************************************/
public class MinorProperty extends Space
{
    //m_rent --> holds the rent of the property
    //m_initialPrice --> holds the price of the property
    //m_mortgage --> holds the money gain from morgaging the property
    protected int m_rent, m_initialPrice, m_mortgage;
    //m_isOwned --> holds true if the property is owned
    //m_isMortgaged --> holds true if the property is mortgaged
    protected boolean m_isOwned, m_isMortgaged;
    //m_isRailroad --> holds true if the property is a railroad, false if the proerty is a UtilityS
    private boolean m_isRailroad;
            
    //default constructor
    public MinorProperty()
    {
        m_name = "";
        m_isOwned = false;
        m_playersOnSpace = new int[4];
        m_owner = -1;
        m_isMortgaged = false;
        
        for(int i = 0; i < 4; i++)
        {
            m_playersOnSpace[i] = -1;
        }
    }
    //overloaded constructor
    public MinorProperty(String a_name, int a_spaceNum)
    {
        m_name = a_name;
        m_isOwned = false;
        m_spaceNum = a_spaceNum;
        m_owner = -1;
        m_isMortgaged = false;
        
        for(int i = 0; i < 4; i++)
        {
            m_playersOnSpace[i] = -1;
        }
    }
    //****************************Setters Start********************************
    
    //sets the values of the properties
    public void setPropertyValue(boolean a_isRailroad, int a_mortgage)
    {
        m_isRailroad = a_isRailroad;
        m_mortgage = a_mortgage;
        
        //set the buy price and rent based on wether the property type
        if(m_isRailroad)
        {
            m_initialPrice = 200;
            m_rent = 25;
        }
        else
        {
            m_initialPrice = 150;
            m_rent = 4;
        }
    }
    public void setMortgaged(boolean a_isMortgaged)
    {
        m_isMortgaged = a_isMortgaged;
    }
    public void setRent(int a_rent)
    {
        m_rent = a_rent;
    }
    //****************************Setters End***********************************
    
    //****************************Getters Start*********************************
    public boolean propStatus()
    {
        return m_isOwned;
    }
    public int getInitialPrice()
    {
        return m_initialPrice;
    }
    
    public boolean isMortgaged()
    {
        return m_isMortgaged;
    }
    public int getRent()
    {
        return m_rent;
    }
    public int getOwner()
    {
        return m_owner;
    }
    
    public int getMorgage()
    {
        return m_mortgage;
    }
    //converts the property number to the proeprties ID
    public int[] getPropertyNum(int a_prop)
    {
        int []propNum = new int[2];
        
        switch (a_prop) 
        {
            case 1:
                propNum[0] = 0;
                propNum[1] = 0;
                break;
            case 3:
                propNum[0] = 0;
                propNum[1] = 1;
                break;
            case 6:
                propNum[0] = 1;
                propNum[1] = 0;
                break;
            case 5:
                propNum[0] = 8;
                propNum[1] = 0;
                break;
            case 8:
                propNum[0] = 1;
                propNum[1] = 1;
                break;
            case 9:
                propNum[0] = 1;
                propNum[1] = 2;
                break;
            case 12:
                propNum[0] = 9;
                propNum[1] = 0;
                break;
            case 11:
                propNum[0] = 2;
                propNum[1] = 0;
                break;
            case 13:
                propNum[0] = 2;
                propNum[1] = 1;
                break;
            case 14:
                propNum[0] = 2;
                propNum[1] = 2;
                break;
            case 15:
                propNum[0] = 8;
                propNum[1] = 1;
                break;
            case 16:
                propNum[0] = 3;
                propNum[1] = 0;
                break;
            case 18:
                propNum[0] = 3;
                propNum[1] = 1;
                break;
            case 19:
                propNum[0] = 3;
                propNum[1] = 2;
                break;
            case 21:
                propNum[0] = 4;
                propNum[1] = 0;
                break;
            case 23:
                propNum[0] = 4;
                propNum[1] = 1;
                break;
            case 24:
                propNum[0] = 4;
                propNum[1] = 2;
                break;
            case 25:
                propNum[0] = 8;
                propNum[1] = 2;
                break;
            case 26:
                propNum[0] = 5;
                propNum[1] = 0;
                break;
            case 27:
                propNum[0] = 5;
                propNum[1] = 1;
                break;
            case 28:
                propNum[0] = 9;
                propNum[1] = 1;
                break;
            case 29:
                propNum[0] = 5;
                propNum[1] = 2;
                break;
            case 31:
                propNum[0] = 6;
                propNum[1] = 0;
                break;
            case 32:
                propNum[0] = 6;
                propNum[1] = 1;
                break;
            case 34:
                propNum[0] = 6;
                propNum[1] = 2;
                break;
            case 35:
                propNum[0] = 8;
                propNum[1] = 3;
                break;
            case 37:
                propNum[0] = 7;
                propNum[1] = 0;
                break;
            case 39:
                propNum[0] = 7;
                propNum[1] = 1;
                break;
        }
        return propNum;
    }
    //****************************Getters End***********************************
}
