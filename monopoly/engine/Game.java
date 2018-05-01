
package monopoly.engine;

/*****************************************
* Class Name: Game
* Purpose: Represents a game in play.
* Holds the game board, players, and all necessary game info.
*******************************************/

import java.util.ArrayList;
import java.util.Random;

public class Game 
{
    //Holds the current game board
    private Board m_gameBoard;
    //m_numPlayers - Holds the number of players in the game
    //m_turn - Holds the number of the player whos turn it is
    //m_numOfBankruptPlayers - Holds the number of players that have declared bankruptcy
    //m_placement - Gives the placement of a finished player
    private int m_numPlayers, m_turn, m_numOfBankruptPlayers, m_placement;
    //m_currentPlayers - Holds the current players
    //m_players,m_finishedPlaerys - Holds the current players for placement
    private ArrayList<Player> m_currentPlayers, m_players, m_finishedPlayers;
    //m_chance - Holds the chance cards
    //m_communityChest - Holds the community chest cards
    //m_drawnCommChes,m_drawnChance - holds the drawn cards
    private ArrayList<Card> m_chance, m_communityChest, m_drawnCommChest, m_drawnChance;
    //A 2D list of bool values to represent whcih properties are owned
    private ArrayList <boolean[]>m_properties;
    
    public Game()
    {
        //initialize all member variables
        m_currentPlayers = new ArrayList<Player>();
        m_players = new ArrayList<Player>();
        m_finishedPlayers = new ArrayList<Player>();
        m_gameBoard = new Board();
        m_numOfBankruptPlayers = 0;
        m_numPlayers = 2;
        m_placement = m_numPlayers;
        m_turn = 1;
        m_chance = new ArrayList<Card>();
        m_communityChest = new ArrayList<Card>();
        m_drawnCommChest = new ArrayList<Card>();
        m_drawnChance = new ArrayList<Card>();
        
        setChanceCards();
        setCommunityChestCards();
        initiateProperties();
    }
    
    //initiates the properties
    private void initiateProperties()
    {
        m_properties = new ArrayList();
        
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
        
        m_properties.add(purple);
        m_properties.add(lBlue);
        m_properties.add(pink);
        m_properties.add(orange);
        m_properties.add(red);
        m_properties.add(yellow);
        m_properties.add(green);
        m_properties.add(dBlue);
        m_properties.add(RR);
        m_properties.add(U);
    }
    //Initializes the Chance cards
    private void setChanceCards()
    {
        m_chance.add(new Card("Advance to Go (Collect $200)", 0, 1, 0));
        m_chance.add(new Card("Advance to Illinois Ave. If you pass Go, collect $200", 0, 1, 24));
        m_chance.add(new Card("Income tax refund, Collect $20", 20, 0));
        m_chance.add(new Card("Go directly to Jail. Do not pass Go, do not collect $200", 0, 1, 30));
        m_chance.add(new Card("Advance token to Boardwalk", 0, 1, 39));
        m_chance.add(new Card("Pay hospital fees of $100", -100, 0));
        m_chance.add(new Card("Your building {and} loan matures,  Collect $150", 150, 0));
        m_chance.add(new Card("Pay poor tax of $15", -15, 0));
        m_chance.add(new Card("Get out of Jail free card", 0, 2));
    }
    
    //Initializes the Community Chest cards
    private void setCommunityChestCards()
    {
        m_communityChest.add(new Card("Advance to St. Charles Place If you pass Go, collect $200", 0, 1, 11));
        m_communityChest.add(new Card("Bank error in your favor, Collect $200", 200, 0));
        m_communityChest.add(new Card("Doctor's fees Pay $50", -50, 0));
        m_communityChest.add(new Card("Get out of Jail free card", 0, 2));
        m_communityChest.add(new Card("Go directly to Jail. Do not pass Go, do not collect $200", 0, 1, 30));
        m_communityChest.add(new Card("Advance token to Reading Railroad", 0, 1, 5));
        m_communityChest.add(new Card("Life insurance matures, Collect $100 ", 100, 0));
        m_communityChest.add(new Card("You won second prize in a Beauty contest, Collect $10", 10, 0));
        m_communityChest.add(new Card("From sale of stock you get $50", 50, 0));
        m_communityChest.add(new Card("You have won a crossword competition, Collect $100", 100, 0));
    }
     
/*
NAME
        setPropertyOwned

SYNOPSIS
        public void setPropertyOwned(int a_property, int a_propertyNum)
    
            a_property  --> A number representing which color the property is.
            a_propertyNum  --> A number representing which property is being set owned.

DESCRIPTION
        Sets a specified property as owned.

RETURNS
        void

AUTHOR
        William Ryan
*/
    public void setPropertyOwned(int a_property, int a_propertyNum)
    {
        boolean []oldProp = m_properties.get(a_property);
        boolean []updatedProp = new boolean[oldProp.length];
        
        for(int i = 0; i < oldProp.length; i++)
        {
            updatedProp[i] = oldProp[i];
        }
        updatedProp[a_propertyNum] = true;
        
        m_properties.set(a_property, updatedProp);
    }
    
    
/*
NAME
        drawFromChance

SYNOPSIS
        public Card drawFromChance()
    
            No parameters.

DESCRIPTION
        Draws a card from Chance

RETURNS
        A Card object which holds the card thats been drawn

AUTHOR
        William Ryan
*/
    public Card drawFromChance()
    {
        Random draw = new Random();
        
        //if the chance cards are exhausted, re-fill the cards
        if(m_chance.size() == 0)
        {
            m_chance = m_drawnChance;
            m_drawnChance.clear();
        }
        //draw a random card and add it to the list of the cards drawn
        int drawFrom = draw.nextInt(m_chance.size() - 1) + 1;
        Card card = m_chance.remove(drawFrom);
        m_drawnChance.add(card);
        
        return card;
    }
/*
NAME
        drawFromCommunityChest

SYNOPSIS
        public Card drawFromCommunityChest()
    
            No parameters.

DESCRIPTION
        Draws a card from Community Chest

RETURNS
        A Card object which holds the card thats been drawn

AUTHOR
        William Ryan
*/
    public Card drawFromCommunityChest()
    {
        Random draw = new Random();
        
        //if the chance cards are exhausted, re-fill the cards
        if(m_communityChest.size() == 0)
        {
            m_communityChest = m_drawnCommChest;
            m_drawnCommChest.clear();
        }
        
        //draw a random card and add it to the list of the cards drawn
        int drawFrom = draw.nextInt(m_chance.size() - 1) + 1;
        Card card = m_communityChest.remove(drawFrom);
        m_drawnCommChest.add(card);

        return card;
    }
/*
NAME
        removePlayer

SYNOPSIS
        public void removePlayer(int a_playerNum)
    
            a_playerNum --> The number of the player to remove

DESCRIPTION
        Removes a specified player from the current game.

RETURNS
        void

AUTHOR
        William Ryan
*/
    public void removePlayer(int a_playerNum)
    {
        //get the player to be removed
        Player playerRemoved = m_currentPlayers.get(a_playerNum - 1);
        //increment the number bankrupt players and set the removed player bankrupt
        m_numOfBankruptPlayers++;
        playerRemoved.setBankrupt();
        //mark the player removed and add it to the finished players list
        m_currentPlayers.set(a_playerNum - 1, playerRemoved);
        m_finishedPlayers.add(playerRemoved);
    }
/*
NAME
        payPlayer

SYNOPSIS
        public void payPlayer(int a_playerToPay, int a_playerPaying, Space a_property, int a_utilPrice)
    
            a_playerToPay --> The number of the player to pay
            a_playerPaying --> The number of the player thats paying
            a_property --> A Space object which holds the info on the property being payed for
            a_utilPrice --> If the properry is a utility, holds the amount to be paied. Otherwise its 0

DESCRIPTION
        Transfers money from one player to another based on the current rent of the property landed on.

RETURNS
        void

AUTHOR
        William Ryan
*/
    public void payPlayer(int a_playerToPay, int a_playerPaying, Space a_property, int a_utilPrice)
    {
        if(a_utilPrice > 0)
        {
            m_currentPlayers.get(a_playerToPay - 1).addToPlayerMoney(a_utilPrice);
            m_currentPlayers.get(a_playerPaying - 1).addToPlayerMoney(-1 * a_utilPrice);
        }
        else
        {
            MinorProperty tempProp = (MinorProperty) a_property;
            int price = tempProp.getCurrentPrice();

            m_currentPlayers.get(a_playerToPay - 1).addToPlayerMoney(price);
            m_currentPlayers.get(a_playerPaying - 1).addToPlayerMoney(-1 * price);
        }
    }
/*
NAME
        movePlayer

SYNOPSIS
        public int movePlayer(int a_playerNum, int a_roll)
    
            a_playerNum --> The number of the player to move
            a_roll --> The players roll

DESCRIPTION
        Moves a player to a space based on the roll

RETURNS
        int 
            Returns 1 if the player passed go
            Returns 2 if the player landed on go to jail
            Returns 0 if the player moved normally

AUTHOR
        William Ryan
*/
    public int movePlayer(int a_playerNum, int a_roll)
    {
        //move the player and get the position the player moved to
        int newPlayerPosition = m_gameBoard.moveToPosition(a_playerNum, m_currentPlayers.get(a_playerNum - 1).getPlayerPosition(), a_roll);
        int result;
        
        //if the player passed go
        if(newPlayerPosition - a_roll < 0)
        {
            result = 1;
        }
        //if the player landed on go to jail
        else if(newPlayerPosition == 30)
        {
            result = 2;
        }
        //if the player moved normally
        else
        {
            result = 0;
        }
        //set the player at the new position
        m_currentPlayers.get(a_playerNum - 1).setPlayerPosition(newPlayerPosition);
        return result;
    }
/*
NAME
        movePlayerToSpace

SYNOPSIS
        public int movePlayerToSpace(int a_playerNum, int a_spaceTo)
    
            a_playerNum --> The number of the player to be moved
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
    public int movePlayerToSpace(int a_playerNum, int a_spaceTo)
    {
        //get the players current position
        int currentPos = m_currentPlayers.get(a_playerNum - 1).getPlayerPosition();
        //get the result of the move
        int result = m_gameBoard.moveToSpecificPosition(a_playerNum, currentPos, a_spaceTo);
        //set the players position to the new position
        m_currentPlayers.get(a_playerNum - 1).setPlayerPosition(a_spaceTo);
        
        //if the player passed go, give him/her $200
        if(currentPos - a_spaceTo > 0)
        {
            m_currentPlayers.get(a_playerNum - 1).addToPlayerMoney(200);
        }
        return result;
    }
/*
NAME
        setPlayers

SYNOPSIS
        public void setPlayers(Player a_players[], int a_numPlayers)
    
            a_players --> Holds the players to be added to the game
            a_numPlayers --> Holds the number of players tp be in the game

DESCRIPTION
        Adds initialized players to the game.

RETURNS
        void

AUTHOR
        William Ryan
*/
    public void setPlayers(Player a_players[], int a_numPlayers)
    {
        m_numPlayers = a_numPlayers;
        
        for(int i = 0; i < m_numPlayers; i++)
        {
            m_currentPlayers.add(a_players[i]);
            m_players.add(a_players[i]);
        }
    }
    //sets the turn to the player number provided (a_turn)
    public void setTurn(int a_turn)
    {
        if(a_turn > m_numPlayers)
        {
            m_turn = 1;
        }
        else
        {
            m_turn = a_turn;
        }
    }
    //increments the turn
    public void incrementTurn()
    {
        //if all players but one have declared bankruptcy, return
        if(m_numOfBankruptPlayers == m_numPlayers - 1)
        {
            return;
        }
        //if the turn is greater than the number of players, set the turn to player one
        if(m_turn >= m_numPlayers)
        {
            m_turn = 1;
        }
        //increment the turn normally
        else
        {
            m_turn++;
        }
        //if the next players whos turn it is is bankrupt
        //increment the turn again
        if(m_currentPlayers.get(m_turn - 1).isBankrupt())
        {
            incrementTurn();
        }
    }
    //sets all the players at go
     public void setPlayersAtGo()
    {
        for(int i = 0; i < m_numPlayers; i++)
        {
            m_gameBoard.addPlayerToSpace(i + 1, 0);
        }
    }
     
    //****************Setters Start***********************************
    public void setPlayerPosition(int a_playerNum, int a_pos)
    {
        m_currentPlayers.get(a_playerNum - 1).setPlayerPosition(a_pos);
    }
    //****************Setters End***********************************
    
    //****************Getters Start***********************************
    public int getTurn()
    {
        return m_turn;
    }
    
    public Player getPlayer(int a_playerNum)
    {
        return m_currentPlayers.get(a_playerNum - 1);
    }
     public Player getFinishedPlayer(int a_playerNum)
    {
        return m_players.get(a_playerNum - 1);
    }
    
    public String getTurnPlayerName()
    {
        return m_currentPlayers.get(m_turn - 1).getPlayerName();
    }
    public ArrayList<Player> getFinishedPlayers()
    {
        return m_players;
    }
    public boolean getPlayerType(int a_playerNum)
    {
        return m_currentPlayers.get(a_playerNum).getPlayerType();
    }
    
    public String getPlayerName(int a_playerNum)
    {
        return m_currentPlayers.get(a_playerNum - 1).getPlayerName();
    }
    
    public Board getBoard()
    {
        return m_gameBoard;
    }
    public int getPlayerPieceNum(int a_playerNum)
    {
        if(a_playerNum <= m_numPlayers && a_playerNum > 0)
        {
            return m_currentPlayers.get(a_playerNum - 1).getPlayerPieceNum();
        }
        else
        {
            return -1;
        }
    }
    public int getNumPlayers()
    {
        return m_numPlayers;
    }
    public int getNumOfBankruptPlayers()
    {
        return m_numOfBankruptPlayers;
    }
    public int getPlayerPosition(int a_playerNum)
    {
        return m_currentPlayers.get(a_playerNum - 1).getPlayerPosition();
    }
    public String getPlayerPieceImg(int a_playerNum)
    {
        return m_currentPlayers.get(a_playerNum - 1).getPlayerPieceImg();
    }
    public int getNumOfPlayersOnSpace(int a_spaceNum)
    {
        return m_gameBoard.getNumOfPlayersOnSpace(a_spaceNum);
    }
    public int[] getPlayersOnSpace(int a_spaceNum)
    {
        return m_gameBoard.getPlayersOnSpace(a_spaceNum);
    }
    public String getSpaceName(int a_spaceNum) 
    {
        return m_gameBoard.getSpaceName(a_spaceNum);
    }
    public Space getSpace(int a_playerPosition)
    {
        return m_gameBoard.getSpace(a_playerPosition);
    }    
    //****************Getters End***********************************
}
