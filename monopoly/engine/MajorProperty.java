
package monopoly.engine;

/*****************************************
* Class Name: MajorProperty
* Purpose: Represents a normal property on the game board.
* (Inherits MinorProperty class)
*******************************************/

public class MajorProperty extends MinorProperty
{
    
    private int  m_oneHouse, m_twoHouse, m_threeHouse, m_monopolyRent,
                m_fourHouse, m_hotel, m_numHouses, m_buildPrice;
    //m_oneHouse --> Holds the rent for one House
    //m_twoHouse --> Holds the rent for two Houses
    //m_threeHouse --> Holds the rent for three Houses
    //m_monopolyRent --> Holds the rent of the property if the player has a monopoly
    //m_fourHouse --> Holds the rent for four Houses
    //m_hotel --> Holds the rent for one hotel
    //m_numHouses --> Holds the number of houses on the property
    //m_buildPrice --> Holds the price to buy a house
    
    public MajorProperty()
    {
        m_name = "";
        m_isOwned = false;
        m_currentPrice = 0;
        m_numHouses = 0;
        m_buildPrice = 0;
        m_playersOnSpace = new int[4];
        m_spaceNum = -1;
        
        for(int i = 0; i < 4; i++)
        {
            m_playersOnSpace[i] = -1;
        }
    }
    public MajorProperty(String a_name, int a_spaceNum)
    {
        m_name = a_name;
        m_isOwned = false;
        m_currentPrice = 0;
        m_numHouses = 0;
        m_buildPrice = 0;
        m_spaceNum = a_spaceNum;
        
        for(int i = 0; i < 4; i++)
        {
            m_playersOnSpace[i] = -1;
        }
    }
    public boolean propStatus()
    {
        return m_isOwned;
    }
    //initializes the property values
    public void setPropertyValues(int a_rent, int a_oneHouse, int a_twoHouse, 
                                    int a_threeHouse, int a_fourHouse, int a_hotel, 
                                    int a_mortgage, int a_price, int a_buildPrice)
    {
        m_rent = a_rent;
        m_currentPrice = m_rent;
        m_monopolyRent = a_rent * 2;
        m_oneHouse = a_oneHouse;
        m_twoHouse = a_twoHouse;
        m_threeHouse = a_threeHouse;
        m_fourHouse = a_fourHouse;
        m_hotel = a_hotel;
        m_mortgage = a_mortgage;
        m_initialPrice = a_price;
        m_buildPrice = a_buildPrice;
    }
    //increments the number of houses if a_increment is true
    //decrements the number of houses if a_increment is false
    public void incNumHouses(boolean a_increment)
    {
        if(a_increment)
        {
            m_numHouses++;
        }
        else
        {
            m_numHouses--;
        }
    }
    /****************************Getters Start*********************************/
    
    //returns the rent of houses formated for a JLabel
    public String getFormatedHouseInfo()
    {
        String houseInfo = "<br/>1 House: " + m_oneHouse +
                            "<br/>2 Houses: " + m_twoHouse +
                            "<br/>3 Houses: " + m_threeHouse +
                            "<br/>4 Houses: " + m_fourHouse + 
                            "<br/>Hotel: " + m_hotel;
        
        return houseInfo;
    }
    //returns the rent of the property based on how many houses it has
    public int getHouseRent()
    {
        switch(m_numHouses)
        {
            case 0:
                return m_monopolyRent;
            case 1:
                return m_oneHouse;
            case 2:
                return m_twoHouse;
            case 3:
                return m_threeHouse;
            case 4:
                return m_fourHouse;
            case 5:
                return m_hotel;
            default:
                return -1;
        }
    }
    
    public int getBuildPrice()
    {
        return m_buildPrice;
    }
    
    public int getMonopolyRent()
    {
        return m_monopolyRent;
    }
    
    public int getNumHouses()
    {
        return m_numHouses;
    }
    /****************************Getters End***********************************/
    
}
