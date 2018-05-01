package monopoly.engine;




/*****************************************
* Class Name: Card
* Purpose: Represents a Community Chest or Chance card.
*******************************************/

public class Card 
{

    //Holds a description of what the card does
    private String m_message;
    //m_charge - holds how much money the card gives/takes from a player
    //m_spaceNumToMoveTo - holds the space number the card advances the players
    //                     token to (-1 if it doesn't move the player)
    private int m_charge, m_spaceNumToMoveTo;
    
    //An enum to specify what the card does
    //CHARGE - the card takes/gives money to the player
    //MOVE - the card moves the player to a different space
    //GETOUTOFJAIL - gives the player a get out of jail free card
    public enum m_actionType
    {
        CHARGE, MOVE, GETOUTOFJAIL
    };
    m_actionType m_action;
    
    public Card(String a_message, int a_charge , int a_action)
    {
        //initialize all members
        m_message = a_message;
        m_charge = a_charge;
        m_spaceNumToMoveTo = -1;
        
        //set the action appropriately
        switch(a_action)
        {
            case 0:
                m_action = m_actionType.CHARGE;
                break;
            case 1:
                m_action = m_actionType.MOVE;
                break;
            case 2:
                m_action = m_actionType.GETOUTOFJAIL;
                break;
        }
    }
    
    public Card(String a_message, int a_charge , int a_action, int a_spaceNum)
    {
        //initialize all members
        m_message = a_message;
        m_charge = a_charge;
        m_spaceNumToMoveTo = a_spaceNum;
        
        //set the action appropriately
        switch(a_action)
        {
            case 0:
                m_action = m_actionType.CHARGE;
                break;
            case 1:
                m_action = m_actionType.MOVE;
                break;
            case 2:
                m_action = m_actionType.GETOUTOFJAIL;
                break;
        }
    }
    
    //************Getters Start*********************
    public m_actionType getCardType()
    {
        return m_action;
    }
    public int getSpaceToMoveTo()
    {
        return m_spaceNumToMoveTo;
    }
    
    public String getMessage()
    {
        return m_message;
    }
    
    public int getCharge()
    {
        return m_charge;
    }
    //************Getters End*********************
    
}
