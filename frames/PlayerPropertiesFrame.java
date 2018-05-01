
package frames;

/*****************************************
* Class Name: PlayerPropertiesFrame
* Purpose: An internal frame that displays a chosen
* player's properties, allows the player to mortgage properties
*******************************************/

import monopoly.engine.MinorProperty;
import monopoly.engine.Game;
import java.util.ArrayList;

public class PlayerPropertiesFrame extends javax.swing.JInternalFrame 
{
    
    //This constructor is used when a player clicks on their property button in the MainGameFrame
    //@param a_currentGame --> The current game in play.
    //@param a_playerNum --> The number of the player whos properties are being viewed
    //@param a_playerMoneyInd --> The money indicators in the MainGameFrame
    public PlayerPropertiesFrame(Game a_currentGame, int a_playerNum, javax.swing.JLabel[] a_playerMoneyInd) 
    {
        m_playerNum = a_playerNum;
        m_currentGame = a_currentGame;
        m_lastPropertyCoords = new int[2];
        m_lastLabelClicked = new java.awt.Label();
        m_playerMoneyInd = a_playerMoneyInd;
        m_ownedProperties = m_currentGame.getPlayer(m_playerNum).getOwnedProperties();
        initComponents();
    }
    
    //This constructor is used when a player needs to mortgaged a property from the ActionFrmae
    //@param a_currentGame --> The current game in play.
    //@param a_playerNum --> The number of the player whos properties are being viewed
    //@param a_playerMoneyInd --> The money indicators in the MainGameFrame
    //@param a_actionFrame --> The ActionFrame that called the class
    //@param a_endTurnBtn --> The end turn button on the MainGameFrame
    //@param a_utilPrice --> The price to be paid if the space the player is paying for is a utility
    public PlayerPropertiesFrame(Game a_currentGame, int a_playerNum, javax.swing.JLabel[] a_playerMoneyInd, ActionFrame a_actionFrame, javax.swing.JButton a_endTurnBtn, int a_utilPrice) 
    {
        m_playerNum = a_playerNum;
        m_currentGame = a_currentGame;
        m_lastPropertyCoords = new int[2];
        m_lastLabelClicked = new java.awt.Label();
        m_playerMoneyInd = a_playerMoneyInd;
        m_actionFrame = a_actionFrame;
        m_endTurnBtn = a_endTurnBtn;
        m_utilPrice = a_utilPrice;
        m_ownedProperties = m_currentGame.getPlayer(m_playerNum).getOwnedProperties();
        initComponents();
    }
    
    //**************************************************************************
    //The following function was originally genereated by the form editor. I've 
    //refactored it so it works better with the design of the application.
    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        m_properties = new ArrayList<java.awt.Label[]>();
        playerName = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        morgageBtn = new javax.swing.JButton();
        moneyInd = new javax.swing.JLabel();
        
        m_purple = new java.awt.Color(153, 0, 255);
        m_lBlue = new java.awt.Color(0, 204, 255);
        m_pink = new java.awt.Color(204, 0, 204);
        m_orange = new java.awt.Color(255, 153, 51);
        m_red = new java.awt.Color(255, 51, 51);
        m_yellow = new java.awt.Color(255, 255, 0);
        m_green = new java.awt.Color(0, 204, 51);
        m_blue = new java.awt.Color(0, 51, 255);
        m_rGrey = new java.awt.Color(153, 153, 153);
        m_white = new java.awt.Color(255, 255, 255);
        m_black = new java.awt.Color(0, 0, 0);
        m_mortgageColor = new java.awt.Color(204,255,255);
        
        

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        playerName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        playerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerName.setText(m_currentGame.getPlayerName(m_playerNum));

        exitBtn.setText("Exit");
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        
        java.awt.Label[] purpleProps = new java.awt.Label[2];
        java.awt.Label[] lBlueProps = new java.awt.Label[3];
        java.awt.Label[] pinkProps = new java.awt.Label[3];
        java.awt.Label[] orangeProps = new java.awt.Label[3];
        java.awt.Label[] redProps = new java.awt.Label[3];
        java.awt.Label[] yellowProps = new java.awt.Label[3];
        java.awt.Label[] greenProps = new java.awt.Label[3];
        java.awt.Label[] dBlueProps = new java.awt.Label[3];
        java.awt.Label[] railRoads = new java.awt.Label[4];
        java.awt.Label[] utilities = new java.awt.Label[2];
        
        initPropertyArray(purpleProps);
        initPropertyArray(lBlueProps);
        initPropertyArray(pinkProps);
        initPropertyArray(orangeProps);
        initPropertyArray(redProps);
        initPropertyArray(yellowProps);
        initPropertyArray(greenProps);
        initPropertyArray(dBlueProps);
        initPropertyArray(railRoads);
        initPropertyArray(utilities);
        
        //***************initialize purple properties**********
        
        purpleProps[0].setAlignment(java.awt.Label.CENTER);
        purpleProps[0].setText("Mediterranean Ave");
         
        purpleProps[1].setAlignment(java.awt.Label.CENTER);
        purpleProps[1].setText("Baltic Ave");
        
        initProperty(purpleProps, m_purple, 0);
        m_properties.add(purpleProps);
        
        //***************initialize light blue properties**********

        lBlueProps[0].setAlignment(java.awt.Label.CENTER);
        lBlueProps[0].setText("Oriental Ave");

        lBlueProps[1].setAlignment(java.awt.Label.CENTER);
        lBlueProps[1].setText("Vermont Ave");

        lBlueProps[2].setAlignment(java.awt.Label.CENTER);
        lBlueProps[2].setText("Connecticut Ave");
        
        initProperty(lBlueProps, m_lBlue, 1);
        m_properties.add(lBlueProps);

        //***************initialize pink properties**********
        
        pinkProps[0].setAlignment(java.awt.Label.CENTER);
        pinkProps[0].setText("ST. Charles");

        pinkProps[1].setAlignment(java.awt.Label.CENTER);
        pinkProps[1].setText("States Ave");

        pinkProps[2].setAlignment(java.awt.Label.CENTER);
        pinkProps[2].setText("Virginia Ave");
        
        initProperty(pinkProps, m_pink, 2);
        m_properties.add(pinkProps);
        
        //***************initialize orange properties**********

        orangeProps[0].setAlignment(java.awt.Label.CENTER);
        orangeProps[0].setText("ST. James");

        orangeProps[1].setAlignment(java.awt.Label.CENTER);
        orangeProps[1].setText("Tennessee Ave");

        orangeProps[2].setAlignment(java.awt.Label.CENTER);
        orangeProps[2].setText("New York Ave");
        
        initProperty(orangeProps, m_orange, 3);
        m_properties.add(orangeProps);
        
        //***************initialize red properties**********

        redProps[0].setAlignment(java.awt.Label.CENTER);
        redProps[0].setText("Kentucky Ave");

        redProps[1].setAlignment(java.awt.Label.CENTER);
        redProps[1].setText("Indiana Ave");

        redProps[2].setAlignment(java.awt.Label.CENTER);
        redProps[2].setText("Illinois Ave");
        
        initProperty(redProps, m_red, 4);
        m_properties.add(redProps);
        
        //***************initialize yellow properties**********

        yellowProps[0].setAlignment(java.awt.Label.CENTER);
        yellowProps[0].setText("Atliantic Ave");

        yellowProps[1].setAlignment(java.awt.Label.CENTER);
        yellowProps[1].setText("Ventnor Ave");

        yellowProps[2].setAlignment(java.awt.Label.CENTER);
        yellowProps[2].setText("Marvin Gardens");
        
        initProperty(yellowProps, m_yellow, 5);
        m_properties.add(yellowProps);
        
        //***************initialize green properties**********

        greenProps[0].setAlignment(java.awt.Label.CENTER);
        greenProps[0].setText("Pacific Ave");

        greenProps[1].setAlignment(java.awt.Label.CENTER);
        greenProps[1].setText("North Carolina Ave");

        greenProps[2].setAlignment(java.awt.Label.CENTER);
        greenProps[2].setText("Pennsylvania Ave");
        
        initProperty(greenProps, m_green, 6);
        m_properties.add(greenProps);
        
        //***************initialize dark blue properties**********

        dBlueProps[0].setAlignment(java.awt.Label.CENTER);
        dBlueProps[0].setText("Park Place");

        dBlueProps[1].setAlignment(java.awt.Label.CENTER);
        dBlueProps[1].setText("Boardwalk");
        
        initProperty(dBlueProps, m_blue, 7);
        m_properties.add(dBlueProps);
        
        //***************initialize railroads**********

        railRoads[0].setAlignment(java.awt.Label.CENTER);
        railRoads[0].setText("Reading RR.");

        railRoads[1].setAlignment(java.awt.Label.CENTER);
        railRoads[1].setText("Penn. RR.");

        railRoads[2].setAlignment(java.awt.Label.CENTER);
        railRoads[2].setText("B&O RR.");

        railRoads[3].setAlignment(java.awt.Label.CENTER);
        railRoads[3].setText("Short Line RR.");
        
        initProperty(railRoads, m_rGrey, 8);
        m_properties.add(railRoads);
        
        //***************initialize utilities**********

        utilities[0].setAlignment(java.awt.Label.CENTER);
        utilities[0].setText("Electric Company");

        utilities[1].setAlignment(java.awt.Label.CENTER);
        utilities[1].setText("Water Works");
        
        initProperty(utilities, m_white, 9);
        m_properties.add(utilities);

        morgageBtn.setVisible(false);
        morgageBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                morgageBtnMouseClicked(evt);
            }
        });

        moneyInd.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        moneyInd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(playerName, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m_properties.get(7)[0], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_properties.get(7)[1], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m_properties.get(6)[0], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_properties.get(6)[1], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(m_properties.get(6)[2], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m_properties.get(2)[0], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_properties.get(2)[1], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_properties.get(2)[2], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(m_properties.get(1)[0], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m_properties.get(0)[0], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(m_properties.get(1)[1], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m_properties.get(0)[1], javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(m_properties.get(1)[2], javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(moneyInd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m_properties.get(3)[0], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_properties.get(3)[1], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_properties.get(3)[2], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m_properties.get(4)[0], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_properties.get(4)[1], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_properties.get(4)[2], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m_properties.get(5)[0], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_properties.get(5)[1], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(m_properties.get(5)[2], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m_properties.get(9)[0], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m_properties.get(9)[1], javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(m_properties.get(8)[0], javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(m_properties.get(8)[1], javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(m_properties.get(8)[2], javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(m_properties.get(8)[3], javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(morgageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_properties.get(0)[1], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_properties.get(0)[0], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moneyInd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_properties.get(1)[0], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(1)[2], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(1)[1], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_properties.get(2)[0], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(2)[1], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(2)[2], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_properties.get(3)[0], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(3)[1], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(3)[2], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_properties.get(4)[0], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(4)[1], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(4)[2], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_properties.get(5)[0], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(5)[2], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(5)[1], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_properties.get(6)[0], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(6)[1], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(6)[2], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_properties.get(7)[1], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(7)[0], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_properties.get(9)[0], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(9)[1], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_properties.get(8)[0], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(8)[1], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(8)[2], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_properties.get(8)[3], javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(morgageBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        setMaximumSize(new java.awt.Dimension(500, 600));
        setPreferredSize(new java.awt.Dimension(500, 600));
        pack();
    }// </editor-fold>                        

    //executed when the user clicks exit
    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) 
    {       
        //if an ActionFrame was provided
        if(m_actionFrame != null)
        {
            ActionFrame action = new ActionFrame(m_endTurnBtn, m_currentGame, m_actionFrame.getcurrentSpace(), m_playerMoneyInd, m_utilPrice);
            MainGameFrame.mainGameFrame.addToDeskTopPane(action);
            action.setVisible(true);
        }
        this.dispose();
    }
    //initializes property labels
    private void initPropertyArray(java.awt.Label[] a_property)
    {
        for(int i = 0; i < a_property.length;i++)
        {
            a_property[i] = new java.awt.Label();
        }
    }
    //initializes the properties state
    private void initProperty(java.awt.Label[] a_property, java.awt.Color a_color, int a_propNum)
    {
        initColorAndListener(a_property, a_color, a_propNum);
        
        for(int i = 0; i < a_property.length;i++)
        {
            a_property[i].setFont(new java.awt.Font("Rockwell", 1, 14));
            a_property[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }
    }
    
/*
NAME
        initColorAndListener

SYNOPSIS
        initColorAndListener(java.awt.Label[] a_property, java.awt.Color a_color, int a_propNum)
    
            a_color --> The color being assigned to the label.
            a_propNum --> The number of the property

DESCRIPTION
        This method initializes the color and listener to each property label. If
        the property is not owned by the current player, a listener is not assigned 
        to the label. 

RETURNS
        void

AUTHOR
        William Ryan
*/
    private void initColorAndListener(java.awt.Label[] a_property, java.awt.Color a_color, int a_propNum)
    {
        boolean[] props = m_ownedProperties.get(a_propNum);
        
        for(int i = 0; i < props.length;i++)
        {
            //if the property is owned by the player
            if(props[i])
            {
                a_property[i].setBackground(a_color);
            }
            //if the property is not owned by the player
            else
            {
                a_property[i].setBackground(m_black);
                a_property[i].setForeground(m_white);
            }
            setMortgagedProperties();
            
            a_property[i].addMouseListener(new java.awt.event.MouseAdapter() 
            {
                public void mousePressed(java.awt.event.MouseEvent evt) 
                {
                    java.awt.Label propertyClicked = (java.awt.Label)evt.getSource();
                    
                    if(propertyClicked.getBackground() != m_black)
                    {
                        propertyClicked(evt, propertyClicked);
                    }
                }
            });
        }
    }
    //sets properties that the player owns that are mortgaged to the mortgage color
    private void setMortgagedProperties()
    {
        for(int i = 0; i < m_properties.size(); i++)
        {
            for(int ii = 0; ii < m_properties.get(i).length; ii++)
            {
                int space = m_currentGame.getBoard().getPropertyNumById(i, ii);
                MinorProperty tempProp = (MinorProperty) m_currentGame.getBoard().getSpace(space);
                
                if(tempProp.isMortgaged() && tempProp.getOwner() == m_playerNum)
                {
                    m_properties.get(i)[ii].setBackground(m_mortgageColor);
                }
            }
        }
    }
/*
NAME
        morgageBtnMouseClicked

SYNOPSIS
        morgageBtnMouseClicked(java.awt.event.MouseEvent evt)
    
            evt --> The source of the event.

DESCRIPTION
        This method is executed when a player presses the mortgage button.
        It will mortgage the last property selected by the user if the property
        is not mortgaged or vise versa.

RETURNS
        void

AUTHOR
        William Ryan
*/
    private void morgageBtnMouseClicked(java.awt.event.MouseEvent evt)
    {
        //if the property is being un-mortgaged
        if(m_mortgageOption)
        {
            //get the un-mortgaged money, space, and id
            int unMortgagePrice = (int) (-1 * (m_currentGame.getBoard().getPropertyByName(m_lastLabelClicked.getText()).getMorgage() +
                                              (m_currentGame.getBoard().getPropertyByName(m_lastLabelClicked.getText()).getMorgage() * .10)));
            MinorProperty tempProp = m_currentGame.getBoard().getPropertyByName(m_lastLabelClicked.getText());
            int[] propertyId = tempProp.getPropertyNum(tempProp.getSpaceNum());
            
            //set the background color to the appropriate color
            switch(propertyId[0])
            {
                case 0:
                    m_properties.get(propertyId[0])[propertyId[1]].setBackground(m_purple);
                    break;
                case 1:
                    m_properties.get(propertyId[0])[propertyId[1]].setBackground(m_lBlue);
                    break;
                case 2:
                    m_properties.get(propertyId[0])[propertyId[1]].setBackground(m_pink);
                    break;
                case 3:
                    m_properties.get(propertyId[0])[propertyId[1]].setBackground(m_orange);
                    break;
                case 4:
                    m_properties.get(propertyId[0])[propertyId[1]].setBackground(m_red);
                    break;
                case 5:
                    m_properties.get(propertyId[0])[propertyId[1]].setBackground(m_yellow);
                    break;
                case 6:
                    m_properties.get(propertyId[0])[propertyId[1]].setBackground(m_green);
                    break;
                case 7:
                    m_properties.get(propertyId[0])[propertyId[1]].setBackground(m_blue);
                    break;
                case 8:
                    m_properties.get(propertyId[0])[propertyId[1]].setBackground(m_rGrey);
                    break;
                case 9:
                    m_properties.get(propertyId[0])[propertyId[1]].setBackground(m_white);
                    break;
            }
            
            //set the property un-mortgaged and charge the player for the transaction
            m_lastLabelClicked.setEnabled(true);
            m_currentGame.getBoard().getPropertyByName(m_lastLabelClicked.getText()).setMortgaged(false);
            m_currentGame.getPlayer(m_playerNum).addToPlayerMoney(unMortgagePrice);
        }
        //if the property is being mortgaged
        else
        {
            //mortgage the property
            m_lastLabelClicked.setEnabled(true);
            m_lastLabelClicked.setBackground(m_mortgageColor);
            m_currentGame.getBoard().getPropertyByName(m_lastLabelClicked.getText()).setMortgaged(true);
            m_currentGame.getPlayer(m_playerNum).addToPlayerMoney(m_currentGame.getBoard().getPropertyByName(m_lastLabelClicked.getText()).getMorgage());
        }
        m_playerMoneyInd[m_playerNum - 1].setText("Money: $" + m_currentGame.getPlayer(m_playerNum).getMoney());
        moneyInd.setText("");
    }
/*
NAME
        propertyClicked

SYNOPSIS
        private void propertyClicked(java.awt.event.MouseEvent evt, java.awt.Label a_propertyClicked)
    
            evt --> The source of the event.
            a_propertyClicked --> The label that was clicked.

DESCRIPTION
        This method is executed when a player clicks a property label. It stores
        the property ID and the space for later use.

RETURNS
        void

AUTHOR
        William Ryan
*/
    private void propertyClicked(java.awt.event.MouseEvent evt, java.awt.Label a_propertyClicked)
    {
        MinorProperty tempProp = m_currentGame.getBoard().getPropertyByName(a_propertyClicked.getText());
        
        m_lastLabelClicked.setEnabled(true);
        a_propertyClicked.setEnabled(false);
        m_lastLabelClicked = a_propertyClicked;
        
        //if the property is mortgaged
        if(tempProp.isMortgaged())
        {
            //set the indicators and the mortgage controler accordingly
            m_mortgageOption = true;
            moneyInd.setText("- $" + (tempProp.getMorgage() + (tempProp.getMorgage() * .10)));
            moneyInd.setForeground(m_red);
            morgageBtn.setText("Un-Mortgage Property");
            morgageBtn.setVisible(true);
        }
        //if the property is not mortgaged
        else
        {
            //set the indicators and the mortgage controler accordingly
            m_mortgageOption = false;
            moneyInd.setText("+ $" + tempProp.getMorgage());
            moneyInd.setForeground(m_green);
            morgageBtn.setText("Mortgage Property");
            morgageBtn.setVisible(true);
        }
       
    }
    
    //an ArrayList of the labels representing each property
    private ArrayList<java.awt.Label[]> m_properties;
    //Used to hold the propertys owned by the current player
    ArrayList<boolean[]> m_ownedProperties;
    //Button used for the user to exit the frame
    private javax.swing.JButton exitBtn;
    //An indicator to show how much money is gained/lossed after a mortgage/unmortgage
    private javax.swing.JLabel moneyInd;
    //Button used to mortgage oe unmortgage a property
    private javax.swing.JButton morgageBtn;
    //Used to display the players name
    private javax.swing.JLabel playerName;
    
    //*****colors used for the background color of each property START
    private java.awt.Color m_purple;
    private java.awt.Color m_lBlue;
    private java.awt.Color m_pink;
    private java.awt.Color m_orange;
    private java.awt.Color m_red;
    private java.awt.Color m_yellow;
    private java.awt.Color m_green;
    private java.awt.Color m_blue;
    private java.awt.Color m_rGrey;
    private java.awt.Color m_white;
    private java.awt.Color m_black;
    private java.awt.Color m_mortgageColor;
    //******END
    
    //Label to holds the last property clicked by the user
    private java.awt.Label m_lastLabelClicked;
    //Holds the current game in play
    private Game m_currentGame;
    //m_playerNum -->
    //m_utilPrice --> Holds the price from a utility roll if the player is coming from
    //the ActionFrame
    private int m_playerNum, m_utilPrice;
    //holds the end turn button from the MainGameFrame
    private javax.swing.JButton m_endTurnBtn;
    //Holds the ActionFrame if a player is coming from (null if player is not
    //coming from the ActionFrame)
    private ActionFrame m_actionFrame;
    //used to control whether a property should be mortgaged or un-mortgaged
    private boolean m_mortgageOption; 
    //holds the id of the last property clicked
    private int[] m_lastPropertyCoords;
    //holds the money indicator for each player from the MainGameFrame
    private javax.swing.JLabel[] m_playerMoneyInd;
}
