
package frames;

/*****************************************
* Class Name: MainGameFrame
* Purpose: A JFrame that displays the game. This is the
* frame in which the game is played
*******************************************/

import monopoly.engine.Game;
import monopoly.engine.Space;
import java.util.Random;

public class MainGameFrame extends javax.swing.JFrame 
{

    //constructor takes an initialized game as a parameter
    public MainGameFrame(Game a_currentGame) 
    {
        m_currentGame = a_currentGame; 
        m_placement = m_currentGame.getNumPlayers();
        mainGameFrame = this;
        m_playerBankcrupt = false;
        m_rolledDoublesCount = 0;
        initComponents();
        initBoard();
    }

    @SuppressWarnings("unchecked")
       
    //this function was heavely refactored to fit design needs
    private void initComponents() 
    {

        m_boardContainer = new javax.swing.JPanel();
        m_desktopPane = new javax.swing.JDesktopPane();
        m_boardImg = new javax.swing.JLabel();
        m_rollBtn = new javax.swing.JButton();
        m_diceOne = new java.awt.Label();
        m_diceTwo = new java.awt.Label();
        m_finalRollResult = new java.awt.Label();
        m_playerOnePanel = new javax.swing.JPanel();
        m_playerOneName = new javax.swing.JLabel();
        m_playerOneProperties = new javax.swing.JButton();
        m_playerTwoPanel = new javax.swing.JPanel();
        m_playerTwoName = new javax.swing.JLabel();
        m_playerTwoProperties = new javax.swing.JButton();
        m_playerThreePanel = new javax.swing.JPanel();
        m_playerThreeName = new javax.swing.JLabel();
        m_playerThreeProperties = new javax.swing.JButton();
        m_playerFourPanel = new javax.swing.JPanel();
        m_playerFourName = new javax.swing.JLabel();
        m_playerFourProperties = new javax.swing.JButton();
        m_tradeBtn = new javax.swing.JButton();
        m_getOutOfJailBtn = new javax.swing.JButton();
        m_continueBtn = new javax.swing.JButton();
        m_bankruptBtn = new javax.swing.JButton();
        m_endTurnBtn = new javax.swing.JButton();
        m_buildHouseBtn = new javax.swing.JButton();
        m_jailSpace = new javax.swing.JPanel();
        m_jailSpcaeImg = new javax.swing.JLabel();
        m_turnIndicator = new java.awt.Label();
        m_playerOnePieceImg = new javax.swing.JLabel();
        m_playerTwoPieceImg = new javax.swing.JLabel();
        m_playerThreePieceImg = new javax.swing.JLabel();
        m_playerFourPieceImg = new javax.swing.JLabel();
        m_buttonControler = false;
        m_scrollPane = new javax.swing.JScrollPane();
        m_houseLabels = new java.awt.Label[22];
        m_playerMoneyInd = new javax.swing.JLabel[4];
        m_allBoardSpaces = new javax.swing.JLabel[40][4];
        
        for(int i = 0; i < 4;i++)
        {
            m_playerMoneyInd[i] = new javax.swing.JLabel();
        }
        
        //bottem
        javax.swing.JLabel go[] = new javax.swing.JLabel[4];
        initPosition(go);
        
        javax.swing.JLabel MA[] = new javax.swing.JLabel[4];
        initPosition(MA);
        
        javax.swing.JLabel CCBot[] = new javax.swing.JLabel[4];
        initPosition(CCBot);
        
        javax.swing.JLabel BA[] = new javax.swing.JLabel[4];
        initPosition(BA);
        
        javax.swing.JLabel IT[] = new javax.swing.JLabel[4];
        initPosition(IT);
      
        javax.swing.JLabel RRR[] = new javax.swing.JLabel[4];
        initPosition(RRR);
      
        javax.swing.JLabel OA[] = new javax.swing.JLabel[4];
        initPosition(OA);
        
        javax.swing.JLabel CHBot[] = new javax.swing.JLabel[4];
        initPosition(CHBot);
     
        javax.swing.JLabel VA[] = new javax.swing.JLabel[4];
        initPosition(VA);
        
        javax.swing.JLabel CA[] = new javax.swing.JLabel[4];
        initPosition(CA);
        
        //left
        javax.swing.JLabel VJ[] = new javax.swing.JLabel[4];
        initPosition(VJ);
        
        javax.swing.JLabel STP[] = new javax.swing.JLabel[4];
        initPosition(STP);
       
        javax.swing.JLabel EC[] = new javax.swing.JLabel[4];
        initPosition(EC);
        
        javax.swing.JLabel SA[] = new javax.swing.JLabel[4];
        initPosition(SA);
        
        javax.swing.JLabel ViA[] = new javax.swing.JLabel[4];
        initPosition(ViA);
        
        javax.swing.JLabel PRR[] = new javax.swing.JLabel[4];
        initPosition(PRR);
        
        javax.swing.JLabel SJP[] = new javax.swing.JLabel[4];
        initPosition(SJP);
        
        javax.swing.JLabel CCLeft[] = new javax.swing.JLabel[4];
        initPosition(CCLeft);
        
        javax.swing.JLabel TA[] = new javax.swing.JLabel[4];
        initPosition(TA);
        
        javax.swing.JLabel NYA[] = new javax.swing.JLabel[4];
        initPosition(NYA);
        
        //top
        javax.swing.JLabel FP[] = new javax.swing.JLabel[4];
        initPosition(FP);
        
        javax.swing.JLabel KA[] = new javax.swing.JLabel[4];
        initPosition(KA);
        
        javax.swing.JLabel CHTop[] = new javax.swing.JLabel[4];
        initPosition(CHTop);
        
        javax.swing.JLabel IA[] = new javax.swing.JLabel[4];
        initPosition(IA);
        
        javax.swing.JLabel ILA[] = new javax.swing.JLabel[4];
        initPosition(ILA);
        
        javax.swing.JLabel BOR[] = new javax.swing.JLabel[4];
        initPosition(BOR);
        
        javax.swing.JLabel AA[] = new javax.swing.JLabel[4];
        initPosition(AA);
        
        javax.swing.JLabel VeA[] = new javax.swing.JLabel[4];
        initPosition(VeA);
        
        javax.swing.JLabel WW[] = new javax.swing.JLabel[4];
        initPosition(WW);
        
        javax.swing.JLabel MG[] = new javax.swing.JLabel[4];
        initPosition(MG);
        
        //right
        javax.swing.JLabel jail[] = new javax.swing.JLabel[4];
        initPosition(jail);
        
        javax.swing.JLabel PaA[] = new javax.swing.JLabel[4];
        initPosition(PaA);
        
        javax.swing.JLabel NCA[] = new javax.swing.JLabel[4];
        initPosition(NCA);
        
        javax.swing.JLabel CCRight[] = new javax.swing.JLabel[4];
        initPosition(CCRight);
        
        javax.swing.JLabel PeA[] = new javax.swing.JLabel[4];
        initPosition(PeA);
        
        javax.swing.JLabel SLRR[] = new javax.swing.JLabel[4];
        initPosition(SLRR);
        
        javax.swing.JLabel CHRight[] = new javax.swing.JLabel[4];
        initPosition(CHRight);
        
        javax.swing.JLabel PP[] = new javax.swing.JLabel[4];
        initPosition(PP);
        
        javax.swing.JLabel LT[] = new javax.swing.JLabel[4];
        initPosition(LT);
        
        javax.swing.JLabel B[] = new javax.swing.JLabel[4];
        initPosition(B);
        
        m_jailsp = new javax.swing.JLabel[4];
        initPosition(m_jailsp);
        
        initHouseSpaces();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1350, 800));
        setPreferredSize(new java.awt.Dimension(1350, 800));

        m_boardContainer.setLayout(null);
        
        m_scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        m_scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        //********START**********Initiate all spaces on the board***************
        
        //add the spaces to the container
        m_boardContainer.add(go[0]);
        go[0].setBounds(820, 890, 70, 30);

        m_boardContainer.add(go[1]);
        go[1].setBounds(820, 860, 70, 30);

        m_boardContainer.add(go[2]);
        go[2].setBounds(820, 830, 70, 30);

        m_boardContainer.add(go[3]);
        go[3].setBounds(820, 800, 70, 30);
        //set the tokens on go
        setPieceImg(go);
        
       
        m_boardContainer.add(MA[0]);
        MA[0].setBounds(720, 890, 70, 30);

        m_boardContainer.add(MA[1]);
        MA[1].setBounds(720, 860, 70, 30);

        m_boardContainer.add(MA[2]);
        MA[2].setBounds(720, 830, 70, 30);

        m_boardContainer.add(MA[3]);
        MA[3].setBounds(720, 800, 70, 30);
        setPieceImg(MA);
        
        
        m_boardContainer.add(CCBot[0]);
        CCBot[0].setBounds(650, 890, 70, 30);

        m_boardContainer.add(CCBot[1]);
        CCBot[1].setBounds(650, 860, 70, 30);

        m_boardContainer.add(CCBot[2]);
        CCBot[2].setBounds(650, 830, 70, 30);

        m_boardContainer.add(CCBot[3]);
        CCBot[3].setBounds(650, 800, 70, 30);
        setPieceImg(CCBot);

        
        m_boardContainer.add(BA[0]);
        BA[0].setBounds(570, 890, 70, 30);

        m_boardContainer.add(BA[1]);
        BA[1].setBounds(570, 860, 70, 30);

        m_boardContainer.add(BA[2]);
        BA[2].setBounds(570, 830, 70, 30);

        m_boardContainer.add(BA[3]);
        BA[3].setBounds(570, 800, 70, 30);
        setPieceImg(BA);
        

        m_boardContainer.add(IT[0]);
        IT[0].setBounds(500, 890, 70, 30);

        m_boardContainer.add(IT[1]);
        IT[1].setBounds(500, 860, 70, 30);

        m_boardContainer.add(IT[2]);
        IT[2].setBounds(500, 830, 70, 30);

        m_boardContainer.add(IT[3]);
        IT[3].setBounds(500, 800, 70, 30);
        setPieceImg(IT);

        m_boardContainer.add(RRR[0]);
        RRR[0].setBounds(430, 890, 70, 30);

        m_boardContainer.add(RRR[1]);
        RRR[1].setBounds(430, 860, 70, 30);

        m_boardContainer.add(RRR[2]);
        RRR[2].setBounds(430, 830, 70, 30);

        m_boardContainer.add(RRR[3]);
        RRR[3].setBounds(430, 800, 70, 30);
        setPieceImg(RRR);
        

        m_boardContainer.add(OA[0]);
        OA[0].setBounds(350, 890, 70, 30);

        m_boardContainer.add(OA[1]);
        OA[1].setBounds(350, 860, 70, 30);

        m_boardContainer.add(OA[2]);
        OA[2].setBounds(350, 830, 70, 30);

        m_boardContainer.add(OA[3]);
        OA[3].setBounds(350, 800, 70, 30);
        setPieceImg(OA);

        
        m_boardContainer.add(CHBot[0]);
        CHBot[0].setBounds(280, 890, 70, 30);

        m_boardContainer.add(CHBot[1]);
        CHBot[1].setBounds(280, 860, 70, 30);

        m_boardContainer.add(CHBot[2]);
        CHBot[2].setBounds(280, 830, 70, 30);

        m_boardContainer.add(CHBot[3]);
        CHBot[3].setBounds(280, 800, 70, 30);
        setPieceImg(CHBot);
        

        m_boardContainer.add(VA[0]);
        VA[0].setBounds(200, 890, 70, 30);

        m_boardContainer.add(VA[1]);
        VA[1].setBounds(200, 860, 70, 30);

        m_boardContainer.add(VA[2]);
        VA[2].setBounds(200, 830, 70, 30);

        m_boardContainer.add(VA[3]);
        VA[3].setBounds(200, 800, 70, 30);
        setPieceImg(VA);
        

        m_boardContainer.add(CA[0]);
        CA[0].setBounds(130, 890, 70, 30);

        m_boardContainer.add(CA[1]);
        CA[1].setBounds(130, 860, 70, 30);

        m_boardContainer.add(CA[2]);
        CA[2].setBounds(130, 830, 70, 30);

        m_boardContainer.add(CA[3]);
        CA[3].setBounds(130, 800, 70, 30);
        setPieceImg(CA);


        m_boardContainer.add(KA[0]);
        KA[0].setBounds(130, 0, 70, 30);

        m_boardContainer.add(KA[1]);
        KA[1].setBounds(130, 30, 70, 30);

        m_boardContainer.add(KA[2]);
        KA[2].setBounds(130, 60, 70, 30);

        m_boardContainer.add(KA[3]);
        KA[3].setBounds(130, 90, 70, 30);
        setPieceImg(KA);

        m_boardContainer.add(CHTop[0]);
        CHTop[0].setBounds(200, 0, 70, 30);

        
        m_boardContainer.add(CHTop[1]);
        CHTop[1].setBounds(200, 30, 70, 30);

        m_boardContainer.add(CHTop[2]);
        CHTop[2].setBounds(200, 60, 70, 30);

        m_boardContainer.add(CHTop[3]);
        CHTop[3].setBounds(200, 90, 70, 30);
        setPieceImg(CHTop);
        
        
        m_boardContainer.add(IA[0]);
        IA[0].setBounds(280, 0, 70, 30);

        m_boardContainer.add(IA[1]);
        IA[1].setBounds(280, 30, 70, 30);

        m_boardContainer.add(IA[2]);
        IA[2].setBounds(280, 60, 70, 30);

        m_boardContainer.add(IA[3]);
        IA[3].setBounds(280, 90, 70, 30);
        setPieceImg(IA);
        

        m_boardContainer.add(ILA[0]);
        ILA[0].setBounds(350, 0, 70, 30);

        m_boardContainer.add(ILA[1]);
        ILA[1].setBounds(350, 30, 70, 30);

        m_boardContainer.add(ILA[2]);
        ILA[2].setBounds(350, 60, 70, 30);

        m_boardContainer.add(ILA[3]);
        ILA[3].setBounds(350, 90, 70, 30);
        setPieceImg(ILA);
        

        m_boardContainer.add(BOR[0]);
        BOR[0].setBounds(430, 0, 70, 30);

        m_boardContainer.add(BOR[1]);
        BOR[1].setBounds(430, 30, 70, 30);
        
        m_boardContainer.add(BOR[2]);
        BOR[2].setBounds(430, 60, 70, 30);

        m_boardContainer.add(BOR[3]);
        BOR[3].setBounds(430, 90, 70, 30);
        setPieceImg(BOR);
        

        m_boardContainer.add(AA[0]);
        AA[0].setBounds(500, 0, 70, 30);

        m_boardContainer.add(AA[1]);
        AA[1].setBounds(500, 30, 70, 30);

        m_boardContainer.add(AA[2]);
        AA[2].setBounds(500, 60, 70, 30);

        m_boardContainer.add(AA[3]);
        AA[3].setBounds(500, 90, 70, 30);
        setPieceImg(AA);
        

        m_boardContainer.add(VeA[0]);
        VeA[0].setBounds(570, 0, 70, 30);

        m_boardContainer.add(VeA[1]);
        VeA[1].setBounds(570, 30, 70, 30);

        m_boardContainer.add(VeA[2]);
        VeA[2].setBounds(570, 60, 70, 30);

        m_boardContainer.add(VeA[3]);
        VeA[3].setBounds(570, 90, 70, 30);
        setPieceImg(VeA);
        

        m_boardContainer.add(WW[0]);
        WW[0].setBounds(650, 0, 70, 30);

        m_boardContainer.add(WW[1]);
        WW[1].setBounds(650, 30, 70, 30);

        m_boardContainer.add(WW[2]);
        WW[2].setBounds(650, 60, 70, 30);

        m_boardContainer.add(WW[3]);
        WW[3].setBounds(650, 90, 70, 30);
        setPieceImg(WW);
        

        m_boardContainer.add(MG[0]);
        MG[0].setBounds(720, 0, 70, 30);

        m_boardContainer.add(MG[1]);
        MG[1].setBounds(720, 30, 70, 30);

        m_boardContainer.add(MG[2]);
        MG[2].setBounds(720, 60, 70, 30);

        m_boardContainer.add(MG[3]);
        MG[3].setBounds(720, 90, 70, 30);
        setPieceImg(MG);
        

        m_boardContainer.add(FP[0]);
        FP[0].setBounds(30, 0, 70, 30);

        m_boardContainer.add(FP[1]);
        FP[1].setBounds(30, 30, 70, 30);

        m_boardContainer.add(FP[2]);
        FP[2].setBounds(30, 60, 70, 30);

        m_boardContainer.add(FP[3]);
        FP[3].setBounds(30, 90, 70, 30);
        setPieceImg(FP);
        

        m_boardContainer.add(VJ[0]);
        VJ[0].setBounds(10, 850, 30, 70);

        m_boardContainer.add(VJ[1]);
        VJ[1].setBounds(40, 850, 30, 70);

        m_boardContainer.add(VJ[2]);
        VJ[2].setBounds(70, 850, 30, 70);

        m_boardContainer.add(VJ[3]);
        VJ[3].setBounds(100, 850, 30, 70);
        setPieceImg(VJ);
        

        m_boardContainer.add(STP[0]);
        STP[0].setBounds(10, 730, 30, 70);

        m_boardContainer.add(STP[1]);
        STP[1].setBounds(40, 730, 30, 70);

        m_boardContainer.add(STP[2]);
        STP[2].setBounds(70, 730, 30, 70);

        m_boardContainer.add(STP[3]);
        STP[3].setBounds(100, 730, 30, 70);
        setPieceImg(STP);
        

        m_boardContainer.add(EC[0]);
        EC[0].setBounds(10, 650, 30, 70);

        m_boardContainer.add(EC[1]);
        EC[1].setBounds(40, 650, 30, 70);

        m_boardContainer.add(EC[2]);
        EC[2].setBounds(70, 650, 30, 70);

        m_boardContainer.add(EC[3]);
        EC[3].setBounds(100, 650, 30, 70);
        setPieceImg(EC);
        

        m_boardContainer.add(SA[0]);
        SA[0].setBounds(10, 580, 30, 70);

        m_boardContainer.add(SA[1]);
        SA[1].setBounds(40, 580, 30, 70);

        m_boardContainer.add(SA[2]);
        SA[2].setBounds(70, 580, 30, 70);

        m_boardContainer.add(SA[3]);
        SA[3].setBounds(100, 580, 30, 70);
        setPieceImg(SA);
        

        m_boardContainer.add(ViA[0]);
        ViA[0].setBounds(10, 500, 30, 70);

        m_boardContainer.add(ViA[1]);
        ViA[1].setBounds(40, 500, 30, 70);

        m_boardContainer.add(ViA[2]);
        ViA[2].setBounds(70, 500, 30, 70);

        m_boardContainer.add(ViA[3]);
        ViA[3].setBounds(100, 500, 30, 70);
        setPieceImg(ViA);
        

        m_boardContainer.add(PRR[0]);
        PRR[0].setBounds(10, 430, 30, 70);

        m_boardContainer.add(PRR[1]);
        PRR[1].setBounds(40, 430, 30, 70);

        m_boardContainer.add(PRR[2]);
        PRR[2].setBounds(70, 430, 30, 70);

        m_boardContainer.add(PRR[3]);
        PRR[3].setBounds(100, 430, 30, 70);
        setPieceImg(PRR);
        

        m_boardContainer.add(SJP[0]);
        SJP[0].setBounds(10, 350, 30, 70);

        m_boardContainer.add(SJP[1]);
        SJP[1].setBounds(40, 350, 30, 70);

        m_boardContainer.add(SJP[2]);
        SJP[2].setBounds(70, 350, 30, 70);

        m_boardContainer.add(SJP[3]);
        SJP[3].setBounds(100, 350, 30, 70);
        setPieceImg(SJP);
        

        m_boardContainer.add(CCLeft[0]);
        CCLeft[0].setBounds(10, 270, 30, 70);
        
        m_boardContainer.add(CCLeft[1]);
        CCLeft[1].setBounds(40, 270, 30, 70);

        m_boardContainer.add(CCLeft[2]);
        CCLeft[2].setBounds(70, 270, 30, 70);

        m_boardContainer.add(CCLeft[3]);
        CCLeft[3].setBounds(100, 270, 30, 70);
        setPieceImg(CCLeft);
        

        m_boardContainer.add(TA[0]);
        TA[0].setBounds(10, 200, 30, 70);

        m_boardContainer.add(TA[1]);
        TA[1].setBounds(40, 200, 30, 70);

        m_boardContainer.add(TA[2]);
        TA[2].setBounds(70, 200, 30, 70);

        m_boardContainer.add(TA[3]);
        TA[3].setBounds(100, 200, 30, 70);
        setPieceImg(TA);
        

        m_boardContainer.add(NYA[0]);
        NYA[0].setBounds(10, 130, 30, 70);

        m_boardContainer.add(NYA[1]);
        NYA[1].setBounds(40, 130, 30, 70);

        m_boardContainer.add(NYA[2]);
        NYA[2].setBounds(70, 130, 30, 70);

        m_boardContainer.add(NYA[3]);
        NYA[3].setBounds(100, 130, 30, 70);
        setPieceImg(NYA);
        

        m_boardContainer.add(PaA[0]);
        PaA[0].setBounds(880, 120, 30, 70);

        m_boardContainer.add(PaA[1]);
        PaA[1].setBounds(850, 120, 30, 70);

        m_boardContainer.add(PaA[2]);
        PaA[2].setBounds(820, 120, 30, 70);

        m_boardContainer.add(PaA[3]);
        PaA[3].setBounds(790, 120, 30, 70);
        setPieceImg(PaA);
        

        m_boardContainer.add(NCA[0]);
        NCA[0].setBounds(880, 200, 30, 70);

        m_boardContainer.add(NCA[1]);
        NCA[1].setBounds(850, 200, 30, 70);

        m_boardContainer.add(NCA[2]);
        NCA[2].setBounds(820, 200, 30, 70);

        m_boardContainer.add(NCA[3]);
        NCA[3].setBounds(790, 200, 30, 70);
        setPieceImg(NCA);
        

        m_boardContainer.add(CCRight[0]);
        CCRight[0].setBounds(880, 270, 30, 70);

        m_boardContainer.add(CCRight[1]);
        CCRight[1].setBounds(850, 270, 30, 70);

        m_boardContainer.add(CCRight[2]);
        CCRight[2].setBounds(820, 270, 30, 70);

        m_boardContainer.add(CCRight[3]);
        CCRight[3].setBounds(790, 270, 30, 70);
        setPieceImg(CCRight);
        

        m_boardContainer.add(PeA[0]);
        PeA[0].setBounds(880, 350, 30, 70);

        m_boardContainer.add(PeA[1]);
        PeA[1].setBounds(850, 350, 30, 70);

        m_boardContainer.add(PeA[2]);
        PeA[2].setBounds(820, 350, 30, 70);

        m_boardContainer.add(PeA[3]);
        PeA[3].setBounds(790, 350, 30, 70);
        setPieceImg(PeA);
        

        m_boardContainer.add(SLRR[0]);
        SLRR[0].setBounds(880, 420, 30, 70);

        m_boardContainer.add(SLRR[1]);
        SLRR[1].setBounds(850, 420, 30, 70);

        m_boardContainer.add(SLRR[2]);
        SLRR[2].setBounds(820, 420, 30, 70);

        m_boardContainer.add(SLRR[3]);
        SLRR[3].setBounds(790, 420, 30, 70);
        setPieceImg(SLRR);
        

        m_boardContainer.add(CHRight[0]);
        CHRight[0].setBounds(880, 500, 30, 70);

        m_boardContainer.add(CHRight[1]);
        CHRight[1].setBounds(850, 500, 30, 70);

        m_boardContainer.add(CHRight[2]);
        CHRight[2].setBounds(820, 500, 30, 70);

        m_boardContainer.add(CHRight[3]);
        CHRight[3].setBounds(790, 500, 30, 70);
        setPieceImg(CHRight);
        

        m_boardContainer.add(PP[0]);
        PP[0].setBounds(880, 570, 30, 70);

        m_boardContainer.add(PP[1]);
        PP[1].setBounds(850, 570, 30, 70);

        m_boardContainer.add(PP[2]);
        PP[2].setBounds(820, 570, 30, 70);

        m_boardContainer.add(PP[3]);
        PP[3].setBounds(790, 570, 30, 70);
        setPieceImg(PP);

        
        m_boardContainer.add(LT[0]);
        LT[0].setBounds(880, 650, 30, 70);

        m_boardContainer.add(LT[1]);
        LT[1].setBounds(850, 650, 30, 70);

        m_boardContainer.add(LT[2]);
        LT[2].setBounds(820, 650, 30, 70);

        m_boardContainer.add(LT[3]);
        LT[3].setBounds(790, 650, 30, 70);
        setPieceImg(LT);

        
        m_boardContainer.add(B[0]);
        B[0].setBounds(880, 720, 30, 70);

        m_boardContainer.add(B[1]);
        B[1].setBounds(850, 720, 30, 70);

        m_boardContainer.add(B[2]);
        B[2].setBounds(820, 720, 30, 70);

        m_boardContainer.add(B[3]);
        B[3].setBounds(790, 720, 30, 70);
        setPieceImg(B);
        
        //********END************Initiate all spaces on the board***************
        
        //***********************Initiate purple properties houses**************
        
        m_houseLabels[0].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[0]);
        m_houseLabels[0].setBounds(720, 780, 70, 20);
        
        m_houseLabels[1].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[1]);
        m_houseLabels[1].setBounds(570, 780, 70, 20);
        
     
        //***********************Initiate light blue properties houses**********

        m_houseLabels[2].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[2]);
        m_houseLabels[2].setBounds(350, 780, 70, 20);

        m_houseLabels[3].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[3]);
        m_houseLabels[3].setBounds(200, 780, 70, 20);

        m_houseLabels[4].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[4]);
        m_houseLabels[4].setBounds(130, 780, 70, 20);
        
        
        //***********************Initiate pink properties houses****************
        
        m_houseLabels[5].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[5]);
        m_houseLabels[5].setBounds(130, 720, 20, 60);
        
        m_houseLabels[6].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[6]);
        m_houseLabels[6].setBounds(130, 570, 20, 70);
        
        m_houseLabels[7].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[7]);
        m_houseLabels[7].setBounds(130, 500, 20, 70);
        
        //***********************Initiate orange properties houses**************
        
        m_houseLabels[8].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[8]);
        m_houseLabels[8].setBounds(130, 350, 20, 70);
        
        m_houseLabels[9].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[9]);
        m_houseLabels[9].setBounds(130, 200, 20, 70);
        
        m_houseLabels[10].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[10]);
        m_houseLabels[10].setBounds(130, 140, 20, 60);

        
        //***********************Initiate red properties houses*****************
        
        m_houseLabels[11].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[11]);
        m_houseLabels[11].setBounds(130, 120, 70, 20);

        m_houseLabels[12].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[12]);
        m_houseLabels[12].setBounds(280, 120, 70, 20);

        m_houseLabels[13].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[13]);
        m_houseLabels[13].setBounds(350, 120, 70, 20);
        
        
        //***********************Initiate yellow properties houses**************

        m_houseLabels[14].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[14]);
        m_houseLabels[14].setBounds(500, 120, 70, 20);

        m_houseLabels[15].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[15]);
        m_houseLabels[15].setBounds(570, 120, 70, 20);

        m_houseLabels[16].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[16]);
        m_houseLabels[16].setBounds(720, 120, 70, 20);
        
        
        //***********************Initiate green properties houses***************

        m_houseLabels[17].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[17]);
        m_houseLabels[17].setBounds(770, 140, 20, 60);
        
        m_houseLabels[18].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[18]);
        m_houseLabels[18].setBounds(770, 200, 20, 70);
        
        m_houseLabels[19].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[19]);
        m_houseLabels[19].setBounds(770, 350, 20, 70);
        
        //***********************Initiate blue properties houses****************
        
        m_houseLabels[20].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[20]);
        m_houseLabels[20].setBounds(770, 570, 20, 80);

        m_houseLabels[21].setBackground(new java.awt.Color(0, 153, 0));
        m_boardContainer.add(m_houseLabels[21]);
        m_houseLabels[21].setBounds(770, 720, 20, 60);

        
        m_allBoardSpaces[0] = go;
        m_allBoardSpaces[1] = MA;
        m_allBoardSpaces[2] = CCBot;
        m_allBoardSpaces[3] = BA;
        m_allBoardSpaces[4] = IT;
        m_allBoardSpaces[5] = RRR;
        m_allBoardSpaces[6] = OA;
        m_allBoardSpaces[7] = CHBot;
        m_allBoardSpaces[8] = VA;
        m_allBoardSpaces[9] = CA;
        m_allBoardSpaces[10] = VJ;
        m_allBoardSpaces[11] = STP;
        m_allBoardSpaces[12] = EC;
        m_allBoardSpaces[13] = SA;
        m_allBoardSpaces[14] = ViA;
        m_allBoardSpaces[15] = PRR;
        m_allBoardSpaces[16] = SJP;
        m_allBoardSpaces[17] = CCLeft;
        m_allBoardSpaces[18] = TA;
        m_allBoardSpaces[19] = NYA;
        m_allBoardSpaces[20] = FP;
        m_allBoardSpaces[21] = KA;
        m_allBoardSpaces[22] = CHTop;
        m_allBoardSpaces[23] = IA;
        m_allBoardSpaces[24] = ILA;
        m_allBoardSpaces[25] = BOR;
        m_allBoardSpaces[26] = AA;
        m_allBoardSpaces[27] = VeA;
        m_allBoardSpaces[28] = WW;
        m_allBoardSpaces[29] = MG;
        m_allBoardSpaces[30] = jail;
        m_allBoardSpaces[31] = PaA;
        m_allBoardSpaces[32] = NCA;
        m_allBoardSpaces[33] = CCRight;
        m_allBoardSpaces[34] = PeA;
        m_allBoardSpaces[35] = SLRR;
        m_allBoardSpaces[36] = CHRight;
        m_allBoardSpaces[37] = PP;
        m_allBoardSpaces[38] = LT;
        m_allBoardSpaces[39] = B;
        
        
//*******Add all buttons and panels to frame************************************
//*******Most of the following was created by the generator*********************
//*******I refactored some of the generated code for design sake****************
        
        m_boardImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/Monopoly_Board.png"))); // NOI18N
        m_boardImg.setText("");
        m_boardContainer.add(m_boardImg);
        m_boardImg.setBounds(10, -30, 900, 990);

        m_rollBtn.setText("Roll");
        m_rollBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rollBtnMousePressed(evt);
            }
        });
        m_boardContainer.add(m_rollBtn);
        m_rollBtn.setBounds(940, 90, 180, 70);
        m_diceOne.setBackground(new java.awt.Color(153, 153, 153));

        m_diceTwo.setBackground(new java.awt.Color(153, 153, 153));

        m_finalRollResult.setBackground(new java.awt.Color(153, 153, 153));


        m_diceOne.setAlignment(java.awt.Label.CENTER);
        m_diceOne.setBackground(new java.awt.Color(255, 255, 255));
        m_diceOne.setFont(new java.awt.Font("Blackadder ITC", 0, 24)); // NOI18N
        m_boardContainer.add(m_diceOne);
        m_diceOne.setBounds(950, 180, 60, 60);
        
        m_diceTwo.setAlignment(java.awt.Label.CENTER);
        m_diceTwo.setBackground(new java.awt.Color(255, 255, 255));
        m_diceTwo.setFont(new java.awt.Font("Blackadder ITC", 0, 24)); // NOI18N
        m_boardContainer.add(m_diceTwo);
        m_diceTwo.setBounds(1040, 180, 60, 60);
        
        m_finalRollResult.setAlignment(java.awt.Label.CENTER);
        m_finalRollResult.setBackground(new java.awt.Color(153, 153, 153));
        m_finalRollResult.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        m_boardContainer.add(m_finalRollResult);
        m_finalRollResult.setBounds(960, 260, 130, 60);
        
        m_playerOnePanel.setBackground(new java.awt.Color(0, 204, 255));
        m_playerOnePanel.setBorder(new javax.swing.border.MatteBorder(null));

        m_playerOneName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        m_playerOneProperties.setBackground(new java.awt.Color(240,240,240));
        m_playerOneProperties.setText("Owed Properties");

        
        
        javax.swing.GroupLayout playerOnePanelLayout = new javax.swing.GroupLayout(m_playerOnePanel);
        m_playerOnePanel.setLayout(playerOnePanelLayout);
        playerOnePanelLayout.setHorizontalGroup(
            playerOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerOnePanelLayout.createSequentialGroup()
                .addGroup(playerOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerOnePanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(playerOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playerOnePanelLayout.createSequentialGroup()
                                .addComponent(m_playerOneName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(m_playerOnePieceImg, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(m_playerMoneyInd[0], javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(playerOnePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(m_playerOneProperties)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        playerOnePanelLayout.setVerticalGroup(
            playerOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerOnePanelLayout.createSequentialGroup()
                .addGroup(playerOnePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerOnePanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(m_playerOneName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playerOnePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(m_playerOnePieceImg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_playerMoneyInd[0], javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(m_playerOneProperties)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        m_boardContainer.add(m_playerOnePanel);
        m_playerOnePanel.setBounds(1140, 50, 200, 175);
        
        m_playerTwoPanel.setBackground(new java.awt.Color(255, 51, 51));
        m_playerTwoPanel.setBorder(new javax.swing.border.MatteBorder(null));

        m_playerTwoName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        m_playerTwoProperties.setBackground(new java.awt.Color(240,240,240));
        m_playerTwoProperties.setText("Owed Properties");


        javax.swing.GroupLayout playerTwoPanelLayout = new javax.swing.GroupLayout(m_playerTwoPanel);
        m_playerTwoPanel.setLayout(playerTwoPanelLayout);
        playerTwoPanelLayout.setHorizontalGroup(
            playerTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerTwoPanelLayout.createSequentialGroup()
                .addGroup(playerTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerTwoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(m_playerTwoProperties))
                    .addGroup(playerTwoPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(m_playerTwoName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m_playerTwoPieceImg, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playerTwoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(m_playerMoneyInd[1], javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        playerTwoPanelLayout.setVerticalGroup(
            playerTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerTwoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(playerTwoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_playerTwoName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_playerTwoPieceImg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_playerMoneyInd[1], javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(m_playerTwoProperties)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        m_boardContainer.add(m_playerTwoPanel);
        m_playerTwoPanel.setBounds(1140, 250, 200, 175);
        
        m_playerThreePanel.setBackground(new java.awt.Color(102, 255, 102));
        m_playerThreePanel.setBorder(new javax.swing.border.MatteBorder(null));

        m_playerThreeName.setFont(new java.awt.Font("Segoe UI", 0, 24));

        m_playerThreeProperties.setBackground(new java.awt.Color(240,240,240));
        m_playerThreeProperties.setText("Owed Properties");


        javax.swing.GroupLayout playerThreePanelLayout = new javax.swing.GroupLayout(m_playerThreePanel);
        m_playerThreePanel.setLayout(playerThreePanelLayout);
        playerThreePanelLayout.setHorizontalGroup(
            playerThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerThreePanelLayout.createSequentialGroup()
                .addGroup(playerThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerThreePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(m_playerThreeProperties))
                    .addGroup(playerThreePanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(m_playerThreeName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m_playerThreePieceImg, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playerThreePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(m_playerMoneyInd[2], javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        playerThreePanelLayout.setVerticalGroup(
            playerThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerThreePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(playerThreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_playerThreeName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_playerThreePieceImg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_playerMoneyInd[2], javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(m_playerThreeProperties)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        m_boardContainer.add(m_playerThreePanel);
        m_playerThreePanel.setBounds(1140, 440, 200, 175);

        m_playerFourPanel.setBackground(new java.awt.Color(255, 255, 51));
        m_playerFourPanel.setBorder(new javax.swing.border.MatteBorder(null));

        m_playerFourName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        m_playerFourProperties.setBackground(new java.awt.Color(240,240,240));
        m_playerFourProperties.setText("Owed Properties");
        
        javax.swing.GroupLayout playerFourPanelLayout = new javax.swing.GroupLayout(m_playerFourPanel);
        m_playerFourPanel.setLayout(playerFourPanelLayout);
        playerFourPanelLayout.setHorizontalGroup(
            playerFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerFourPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerFourPanelLayout.createSequentialGroup()
                        .addGroup(playerFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_playerFourProperties)
                            .addGroup(playerFourPanelLayout.createSequentialGroup()
                                .addComponent(m_playerFourName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(m_playerFourPieceImg, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(playerFourPanelLayout.createSequentialGroup()
                        .addComponent(m_playerMoneyInd[3], javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        playerFourPanelLayout.setVerticalGroup(
            playerFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerFourPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerFourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_playerFourName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_playerFourPieceImg, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(m_playerMoneyInd[3], javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(m_playerFourProperties)
                .addGap(30, 30, 30))
        );
        m_boardContainer.add(m_playerFourPanel);
        m_playerFourPanel.setBounds(1140, 640, 200, 175);

        m_tradeBtn.setText("Request Trade");
        m_boardContainer.add(m_tradeBtn);
        m_tradeBtn.setBounds(940, 350, 180, 70);
        m_tradeBtn.setVisible(false);

        m_getOutOfJailBtn.setText("Get Out of Jail Free");
        m_boardContainer.add(m_getOutOfJailBtn);
        m_getOutOfJailBtn.setBounds(940, 510, 180, 70);
        m_getOutOfJailBtn.setVisible(false);
        
        m_getOutOfJailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) 
            {
                getOutOfJailBtnPressed(evt);
            }
        });

        m_continueBtn.setText("Continue");
        m_boardContainer.add(m_continueBtn);
        m_continueBtn.setBounds(1150, 850, 160, 80);
        m_continueBtn.setVisible(false);
        m_continueBtn.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mousePressed(java.awt.event.MouseEvent evt) 
            {
                System.out.println(m_currentGame.getTurn());
                m_currentGame.removePlayer(m_currentGame.getTurn());
                ResultFrame results = new ResultFrame(m_currentGame);
                results.setVisible(true);
                dispose();
            }
        });

        m_bankruptBtn.setText("Declare Bankruptcy");
        m_boardContainer.add(m_bankruptBtn);
        m_bankruptBtn.setBounds(960, 850, 160, 80);
        
        m_bankruptBtn.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mousePressed(java.awt.event.MouseEvent evt) 
            {
                declareBankruptcy(evt);
            }
        });
        
        m_endTurnBtn.setText("End Turn");
        m_boardContainer.add(m_endTurnBtn);
        m_endTurnBtn.setBounds(940, 590, 180, 40);
        
        m_endTurnBtn.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mousePressed(java.awt.event.MouseEvent evt) 
            {
                endTurnPressed(evt);
            }
        });
        m_endTurnBtn.setVisible(false);
        
        m_buildHouseBtn.setText("Build House");
        m_boardContainer.add(m_buildHouseBtn);
        m_buildHouseBtn.setBounds(940, 430, 180, 70);
        
        m_buildHouseBtn.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mousePressed(java.awt.event.MouseEvent evt) 
            {
                buildHousePressed(evt);
            }
        });
        
        m_turnIndicator.setAlignment(java.awt.Label.CENTER);
        m_turnIndicator.setBackground(new java.awt.Color(255, 153, 51));
        m_turnIndicator.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        m_turnIndicator.setText("Turn:");
        m_boardContainer.add(m_turnIndicator);
        m_turnIndicator.setBounds(940, 10, 180, 70);

        //initiate the jail space
        m_jailSpace.setBackground(new java.awt.Color(0, 0, 0));
        m_jailSpace.setLayout(null);

        m_jailsp[0].setBackground(new java.awt.Color(255, 255, 255));
        m_jailSpace.add(m_jailsp[0]);
        m_jailsp[0].setBounds(20, 10, 80, 30);

        m_jailsp[1].setBackground(new java.awt.Color(255, 255, 255));
        m_jailSpace.add(m_jailsp[1]);
        m_jailsp[1].setBounds(20, 40, 80, 30);

        m_jailsp[2].setBackground(new java.awt.Color(255, 255, 255));
        m_jailSpace.add(m_jailsp[2]);
        m_jailsp[2].setBounds(20, 70, 80, 30);

        m_jailsp[3].setBackground(new java.awt.Color(255, 255, 255));
        m_jailSpace.add(m_jailsp[3]);
        m_jailsp[3].setBounds(20, 100, 80, 30);
        
        setPieceImg(m_jailsp);
        for(int i = 0; i < 4; i++)
        {
            m_jailsp[i].setVisible(false);
        }
        
        m_jailSpcaeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/resources/JailSpace.png"))); // NOI18N
        m_jailSpace.add(m_jailSpcaeImg);
        m_jailSpcaeImg.setBounds(10, 20, 90, 90);

        m_boardContainer.add(m_jailSpace);
        m_jailSpace.setBounds(960, 650, 130, 170);

        
       m_scrollPane.setViewportView(m_boardContainer);

        m_desktopPane.setLayer(m_boardContainer, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(m_desktopPane);
        m_desktopPane.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(m_boardContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 1358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(m_boardContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        m_scrollPane.setViewportView(m_desktopPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m_scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m_scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        
        

        pack();
    }                

/*
NAME
        initBoard

SYNOPSIS
        initBoard()
    
            No parameters.

DESCRIPTION
        Initiates the starting state of the frame when a new game is started.

RETURNS
        void

AUTHOR
        William Ryan
*/  
    private void initBoard()
    {
         //set all space sections invisible
        for(int i = 0; i < 40; i++)
        {
            for(int ii = 0; ii < 4; ii++)
            {
                m_allBoardSpaces[i][ii].setVisible(false);
            }
        }
        
        //set all players at go
        for(int i = 0; i < m_currentGame.getNumPlayers(); i++)
        {
            m_allBoardSpaces[0][i].setVisible(true);
        }
        
        //set the panels according to how many players there are
        switch (m_currentGame.getNumPlayers())
        {
            //if there are two players
            case 2:
                m_playerOneName.setText(m_currentGame.getPlayerName(1));
                m_playerOnePieceImg.setIcon(new javax.swing.ImageIcon(getClass().getResource(m_currentGame.getPlayerPieceImg(1))));
                m_playerMoneyInd[0].setText("Money: $1500");
                
                m_playerTwoName.setText(m_currentGame.getPlayerName(2));
                m_playerTwoPieceImg.setIcon(new javax.swing.ImageIcon(getClass().getResource(m_currentGame.getPlayerPieceImg(2))));
                m_playerMoneyInd[1].setText("Money: $1500");
                
                m_playerThreePanel.setVisible(false);
                m_playerFourPanel.setVisible(false);
                break;
            //if there are three players
            case 3:
                m_playerOneName.setText(m_currentGame.getPlayerName(1));
                m_playerOnePieceImg.setIcon(new javax.swing.ImageIcon(getClass().getResource(m_currentGame.getPlayerPieceImg(1))));
                m_playerMoneyInd[0].setText("Money: $1500");
                
                m_playerTwoName.setText(m_currentGame.getPlayerName(2));
                m_playerTwoPieceImg.setIcon(new javax.swing.ImageIcon(getClass().getResource(m_currentGame.getPlayerPieceImg(2))));
                m_playerMoneyInd[1].setText("Money: $1500");
                
                m_playerThreeName.setText(m_currentGame.getPlayerName(3));
                m_playerThreePieceImg.setIcon(new javax.swing.ImageIcon(getClass().getResource(m_currentGame.getPlayerPieceImg(3))));
                m_playerMoneyInd[2].setText("Money: $1500");
                
                m_playerFourPanel.setVisible(false);
                break;
            //if there are four players
            case 4:
                m_playerOneName.setText(m_currentGame.getPlayerName(1));
                m_playerOnePieceImg.setIcon(new javax.swing.ImageIcon(getClass().getResource(m_currentGame.getPlayerPieceImg(1))));
                m_playerMoneyInd[0].setText("Money: $1500");
                
                m_playerTwoName.setText(m_currentGame.getPlayerName(2));
                m_playerTwoPieceImg.setIcon(new javax.swing.ImageIcon(getClass().getResource(m_currentGame.getPlayerPieceImg(2))));
                m_playerMoneyInd[1].setText("Money: $1500");
                
                m_playerThreeName.setText(m_currentGame.getPlayerName(3));
                m_playerThreePieceImg.setIcon(new javax.swing.ImageIcon(getClass().getResource(m_currentGame.getPlayerPieceImg(3))));
                m_playerMoneyInd[2].setText("Money: $1500");
                
                m_playerFourName.setText(m_currentGame.getPlayerName(4));
                m_playerFourPieceImg.setIcon(new javax.swing.ImageIcon(getClass().getResource(m_currentGame.getPlayerPieceImg(4))));
                m_playerMoneyInd[3].setText("Money: $1500");
        }
        
        //set all players positions at go
        for(int i = 0; i < m_currentGame.getNumPlayers(); i++)
        {
            m_currentGame.setPlayerPosition(i + 1, 0);
        }
        
        //on click listener for player one's properties
        m_playerOneProperties.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mousePressed(java.awt.event.MouseEvent evt) 
            {
                PlayerPropertiesFrame playerProperties = new PlayerPropertiesFrame(m_currentGame, 1, m_playerMoneyInd);
                m_desktopPane.add(playerProperties);
                playerProperties.setVisible(true);
            }
        });
        //on click listener for player two's properties
        m_playerTwoProperties.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mousePressed(java.awt.event.MouseEvent evt) 
            {
                PlayerPropertiesFrame playerProperties = new PlayerPropertiesFrame(m_currentGame, 2, m_playerMoneyInd);
                m_desktopPane.add(playerProperties);
                playerProperties.setVisible(true);
            }
        });
        //on click listener for player three's properties
        m_playerThreeProperties.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mousePressed(java.awt.event.MouseEvent evt) 
            {
                PlayerPropertiesFrame playerProperties = new PlayerPropertiesFrame(m_currentGame, 3, m_playerMoneyInd);
                m_desktopPane.add(playerProperties);
                playerProperties.setVisible(true);
            }
        });
        //on click listener for player four's properties
        m_playerFourProperties.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mousePressed(java.awt.event.MouseEvent evt) 
            {
                PlayerPropertiesFrame playerProperties = new PlayerPropertiesFrame(m_currentGame, 4, m_playerMoneyInd);
                m_desktopPane.add(playerProperties);
                playerProperties.setVisible(true);
            }
        });
        
        m_currentGame.setPlayersAtGo();
        m_currentGame.setTurn(1);
        m_turnIndicator.setText("Turn: " + m_currentGame.getTurnPlayerName());
    }
/*
NAME
        setHouse

SYNOPSIS
        setHouse(int a_houseNum, int a_numOfHouses)
    
            a_houseNum --> the index the house is located on in m_houseLabels.
            a_numOfHouses --> The number of houses on the property.

DESCRIPTION
        Used to add or remove houses on specified properies.

RETURNS
        void

AUTHOR
        William Ryan
*/    
    public void setHouse(int a_houseNum, int a_numOfHouses)
    {
        //if the property has a hotel
        if(a_numOfHouses == 5)
        {
            m_houseLabels[a_houseNum].setBackground(new java.awt.Color(255,51,51));
        }
        //if the property has no houses
        else if(a_numOfHouses == 0)
        {
            m_houseLabels[a_houseNum].setVisible(false);
        }
        //if the property has houses
        else
        {
            m_houseLabels[a_houseNum].setVisible(true);
            m_houseLabels[a_houseNum].setBackground(new java.awt.Color(0, 153, 0));
        }
        
        //set the text to display the level of the property
        m_houseLabels[a_houseNum].setText(Integer.toString(a_numOfHouses));
        
    }
    
    //if the player clicks the bulid house button, add a BuildHouseFrame to the desktop panel
    private void buildHousePressed(java.awt.event.MouseEvent evt)
    {
        if(!m_buttonControler)
        {
            BuildHouseFrame buildHouse = new BuildHouseFrame(m_currentGame);
            m_desktopPane.add(buildHouse);
            buildHouse.setVisible(true);
        }
    }
/*
NAME
        declareBankruptcy

SYNOPSIS
        declareBankruptcy(java.awt.event.MouseEvent evt)
    
            evt --> The event info.

DESCRIPTION
        Listener for when a player presses the declare bankruptcy button.

RETURNS
        void

AUTHOR
        William Ryan
*/     
    public void declareBankruptcy(java.awt.event.MouseEvent evt)
    {
        //if the button should not be pressed at the given time, do not execute the code
        if(!m_buttonControler)
        {
            //set the player bankrupt
            m_currentGame.getFinishedPlayer(m_currentGame.getTurn()).setBankrupt();
            //remove the player from the game
            m_currentGame.getPlayer(m_currentGame.getTurn()).removePlayerFromGame(m_currentGame.getBoard());
            //set the players money to 0
            m_playerMoneyInd[m_currentGame.getTurn() - 1].setText("Money: $0");
            //remove the player from the current space
            m_currentGame.getBoard().getSpace(m_currentGame.getPlayer(m_currentGame.getTurn()).getPlayerPosition()).removePlayerFromSpace(m_currentGame.getTurn());
            m_endTurnBtn.setVisible(true);
            m_buildHouseBtn.setVisible(false);
            m_rollBtn.setVisible(false);
            m_bankruptBtn.setVisible(false);

            //set the players position
            m_currentGame.getPlayer(m_currentGame.getTurn()).setPlayerPlacement(m_placement);
            m_placement--;

            //if the player was in jail, remove the displayed token
            if(m_currentGame.getPlayer(m_currentGame.getTurn()).isInJail())
            {
                removePlayerFromJail(m_currentGame.getTurn());
            }

            //set the name on the appropriate player panel to bankrupt
            switch(m_currentGame.getTurn())
            {
                case 1:
                    m_playerOneName.setText("(Bankcrupt)");
                    break;
                case 2:
                    m_playerTwoName.setText("(Bankcrupt)");
                    break;
                case 3:
                    m_playerThreeName.setText("(Bankcrupt)");
                    break;
                case 4:
                    m_playerThreeName.setText("(Bankcrupt)");
                    break;

            }
            //remove the player and update the board
            m_currentGame.removePlayer(m_currentGame.getTurn());
            m_playerBankcrupt = true;
            updateBoard();
        }
    }
/*
NAME
        nextTurn

SYNOPSIS
        nextTurn()
    
            No parameters.

DESCRIPTION
        Increments the turn to the next player in line.

RETURNS
        void

AUTHOR
        William Ryan
*/ 
    private void nextTurn()
    {
        //if the last player to go did not declare bankruptcy
        if(!m_playerBankcrupt)
        {
            //if the player did not roll doubles, incerement the turn
            if(m_rolledDoublesCount == 0)
            {
                m_currentGame.incrementTurn();
            }

            //set the turn indicator to display the next player's name
            m_turnIndicator.setText("Turn: " + m_currentGame.getTurnPlayerName());

            //if the next player is in jail
            if(m_currentGame.getPlayer(m_currentGame.getTurn()).isInJail())
            {
                //if the next player has a get out of jail free card
                if(m_currentGame.getPlayer(m_currentGame.getTurn()).getGetOutOfJailCard() > 0)
                {
                    //give the user the option to get out of jail
                    m_getOutOfJailBtn.setVisible(true);
                    return;
                }
            }
        }
        //if the last player to go declared bankruptcy
        else
        {
            //set the bankrupt indicator back to false
            m_playerBankcrupt = false;
            
            //if all but one player has declared bankruptcy
            if(m_currentGame.getNumPlayers() - 1 == m_currentGame.getNumOfBankruptPlayers())
            {
                //display that the game is over and set the buttons visible/invisible appropriatly
                m_turnIndicator.setText("Game Over");
                m_continueBtn.setVisible(true);
                m_bankruptBtn.setVisible(false);
                m_rollBtn.setVisible(false);
                m_buildHouseBtn.setVisible(false);
            }
            //otherwise increment the turn normally
            else
            {
                m_currentGame.incrementTurn();
                m_turnIndicator.setText("Turn: " + m_currentGame.getTurnPlayerName());
            }
        }
        m_getOutOfJailBtn.setVisible(false);
    }
    
    //if the player uses a get out of jail free card
    private void getOutOfJailBtnPressed(java.awt.event.MouseEvent evt)
    {
        //remove the player from jail
        m_currentGame.getPlayer(m_currentGame.getTurn()).takeGetOutOfJailCard();
        //set the player at visiting jail
        m_currentGame.getPlayer(m_currentGame.getTurn()).setPlayerPosition(10);
        m_currentGame.getBoard().addPlayerToSpace(m_currentGame.getTurn(), 10);
        m_currentGame.getPlayer(m_currentGame.getTurn()).setPlayerInJail(false);
        removePlayerFromJail(m_currentGame.getTurn());
        updateBoard();
        //set the get out of jail card button invisible
        m_getOutOfJailBtn.setVisible(false);
    }
    
    //When the used clicks the end turn button, set all buttons to there original
    //state and increment the turn
    private void endTurnPressed(java.awt.event.MouseEvent evt)
    {
        m_buttonControler = false;
        m_endTurnBtn.setVisible(false);
        m_bankruptBtn.setVisible(true);
        m_rollBtn.setEnabled(true);
        m_buildHouseBtn.setEnabled(true);
        m_bankruptBtn.setEnabled(true);
        m_rollBtn.setVisible(true);
        m_buildHouseBtn.setVisible(true);
        nextTurn();
    }
    
    //used to set the imgages for each player's token displayed on the board
    private void setPieceImg(javax.swing.JLabel[] space)
    {
        for(int i = 0; i < m_currentGame.getNumPlayers(); i++)
        {
            space[i].setIcon(new javax.swing.ImageIcon(getClass().getResource(m_currentGame.getPlayerPieceImg(i + 1))));
        }
    }
    
    //used to initiate all spaces on the board
    private void initPosition(javax.swing.JLabel[] space)
    {
        for(int i = 0; i < 4 ;i++)
        {
            space[i] = new javax.swing.JLabel();
        }
    }
    
    //sets all the houses on the board to invisible
    private void initHouseSpaces()
    {
        for(int i = 0; i < 22; i ++)
        {
            m_houseLabels[i] = new java.awt.Label();
            m_houseLabels[i].setVisible(false);
        }
    }
    
/*
NAME
        rollBtnMousePressed

SYNOPSIS
        rollBtnMousePressed(java.awt.event.MouseEvent evt)
    
            evt --> The event info.

DESCRIPTION
        Moves the player based on the roll. Preforms an action based on where the
        player moved to, if the player is in jail or not, and if the player rolled
        3 doubles in a row

RETURNS
        void

AUTHOR
        William Ryan
*/
    private void rollBtnMousePressed(java.awt.event.MouseEvent evt) 
    {
        //if the button should not be pressed, do not execute the following code
        if(!m_buttonControler)
        {
            Random diceOneRoll = new Random();
            Random diceTwoRoll = new Random();

            //generate random numbers for the players roll
            int  rollOne = diceOneRoll.nextInt(6) + 1;
            int  rollTwo = diceTwoRoll.nextInt(6) + 1;
            int rollSum;
            
            //display the roll to the user
            m_diceOne.setText(Integer.toString(rollOne));
            m_diceTwo.setText(Integer.toString(rollTwo));
            
            rollSum = rollOne + rollTwo;
            
            m_finalRollResult.setText(Integer.toString(rollSum));
            
            //if the player is currently not in jail
            if(!m_currentGame.getPlayer(m_currentGame.getTurn()).isInJail())
            {
                //if the player rolled double, increment the number of doubles rolled in one turn
                if(rollOne == rollTwo)
                {
                    m_rolledDoublesCount++;
                }
                //otherwise revert the doubles count back to 0 for the next players turn
                else
                {
                    m_rolledDoublesCount = 0;
                }
                
                //if the player has not roll 3 doubles in a row
                if(m_rolledDoublesCount != 3)
                {
                    //move the player an store the result of the move
                    int result = m_currentGame.movePlayer(m_currentGame.getTurn(), rollSum);

                    //if the player passed go
                    if(result == 1)
                    {
                        //give the player $200 and update their money displayed
                        m_currentGame.getPlayer(m_currentGame.getTurn()).addToPlayerMoney(200);
                        m_playerMoneyInd[m_currentGame.getTurn() - 1].setText("Money: $" + m_currentGame.getPlayer(m_currentGame.getTurn()).getMoney());
                    }
                    //if the player landed on go to jail
                    else if(result == 2)
                    {
                        //set the player in jail
                        m_currentGame.getPlayer(m_currentGame.getTurn()).setPlayerInJail(true);
                        m_rolledDoublesCount = 0;
                        setPlayerInJail(m_currentGame.getTurn());
                    }
                    
                    //disable the appropriate buttons
                    m_rollBtn.setEnabled(false);
                    m_bankruptBtn.setEnabled(false);
                    m_buildHouseBtn.setEnabled(false);
                    m_buttonControler = true;

                }
                //if the player has rolled 3 doubles in a row
                else
                {
                    m_rolledDoublesCount = 0;
                    //remove the player from their current position
                    m_currentGame.getBoard().getSpace(m_currentGame.getPlayer(m_currentGame.getTurn()).getPlayerPosition()).removePlayerFromSpace(m_currentGame.getTurn());
                    //display the player in jail
                    m_currentGame.getPlayer(m_currentGame.getTurn()).setPlayerInJail(true);
                    //set the player in jail
                    setPlayerInJail(m_currentGame.getTurn());
                    //set the players position to the jail space
                    m_currentGame.getPlayer(m_currentGame.getTurn()).setPlayerPosition(30);
                    m_currentGame.movePlayerToSpace(m_currentGame.getTurn(), 30);
                    
                }
            }
            //if the player is in jail
            else
            {
                //if the player rolled doubles
                if(rollOne == rollTwo)
                {
                    //remove the player from jail
                    m_currentGame.getPlayer(m_currentGame.getTurn()).setPlayerInJail(false);
                    removePlayerFromJail(m_currentGame.getTurn());
                    //move the player to visiting jail space plus their roll
                    m_currentGame.getPlayer(m_currentGame.getTurn()).setPlayerPosition(10);
                    m_currentGame.movePlayerToSpace(m_currentGame.getTurn(), rollSum + 10);
                }
                //if the player did not roll doubles
                else
                {
                    //if the player has gone 3 turns in jail
                    if(m_currentGame.getPlayer(m_currentGame.getTurn()).getJailRolls() == 3)
                    {
                        //remove the player from jail
                        m_currentGame.getPlayer(m_currentGame.getTurn()).setPlayerInJail(false);
                        removePlayerFromJail(m_currentGame.getTurn());
                        //move the player to visiting jail space
                        m_currentGame.getPlayer(m_currentGame.getTurn()).setPlayerPosition(10);
                        m_currentGame.movePlayerToSpace(m_currentGame.getTurn(), rollSum);
                    }
                    //if the player has gone less than 3 turns in jail
                    else
                    {
                        //increment the amount of turns spent in jail
                        m_currentGame.getPlayer(m_currentGame.getTurn()).incrementJailRoll();
                        m_endTurnBtn.setVisible(true);
                    }
                }
            }
            //update the board and preform the action
            updateBoard();
            preformAction();
        }
        
    }
    
/*
NAME
        preformAction

SYNOPSIS
        preformAction()
    
            No parameters

DESCRIPTION
        Preforms an action based on the space a player landed on after advancing
        to it. Adds an ActionFrame to the desktop panel.

RETURNS
        void

AUTHOR
        William Ryan
*/
    private void preformAction()
    {
        //get the players current position
        int currentPlayerSpace = m_currentGame.getPlayer(m_currentGame.getTurn()).getPlayerPosition();
        //get the space the player is on
        Space currentSpace = m_currentGame.getSpace(currentPlayerSpace);
        //send appropriate info to the ActionFrame and add it to the desktop panel
        ActionFrame action = new ActionFrame(m_endTurnBtn, m_currentGame, currentSpace, m_playerMoneyInd);
        m_desktopPane.add(action);
        action.setVisible(true);
    }
    
    //Adds a component to the desktop pane
    public void addToDeskTopPane(ActionFrame a_action)
    {
        m_desktopPane.add(a_action);
        a_action.setVisible(true);
    }
    
    //Displays a player in jail based on the player number provided
    public void setPlayerInJail(int a_playerNum)
    {
        m_jailsp[m_currentGame.getTurn() - 1].setVisible(true);
    }
    //Displays a player to not be in jail based on the player number provided
    public void removePlayerFromJail(int a_playerNum)
    {
        m_jailsp[m_currentGame.getTurn() - 1].setVisible(false);
    }
/*
NAME
        updateBoard

SYNOPSIS
        updateBoard()
    
            No parameters

DESCRIPTION
        Syncs the view of the board with the games current internal state.

RETURNS
        void

AUTHOR
        William Ryan
*/
    public void updateBoard()
    {
        //for each space on the board
        for(int i = 0; i < 40; i++)
        {
            //if there are players on the space
            if(m_currentGame.getNumOfPlayersOnSpace(i) > 0)
            {
                boolean []pieces = new boolean[4];
                
                //for each section on the space
                for(int ii = 0; ii < 4; ii++)
                {
                    switch (m_currentGame.getPlayersOnSpace(i)[ii]) 
                    {
                        //if player one is on the space
                        case 1:
                            m_allBoardSpaces[i][0].setVisible(true);
                            pieces[0] = true;
                            break;
                        //if player two is on the space
                        case 2:
                            m_allBoardSpaces[i][1].setVisible(true);
                            pieces[1] = true;
                            break;
                        //if player three is on the space
                        case 3:
                            m_allBoardSpaces[i][2].setVisible(true);
                            pieces[2] = true;
                            break;
                        //if player four is on the space
                        case 4:
                            m_allBoardSpaces[i][3].setVisible(true);
                            pieces[3] = true;
                            break;
                        default:
                            break;
                    }
                    
                }
                
                //set all sections of the space not occupied invisible
                for(int ii = 0; ii < 4; ii++)
                {
                    if(!pieces[ii])
                    {
                        m_allBoardSpaces[i][ii].setVisible(false);
                    }
                }
            }
            //if there are no players on the space
            else
            {
                //set all the sections of the space invisible
                for(int ii = 0; ii < 4; ii++)
                {
                    if(m_allBoardSpaces[i][ii].isVisible())
                    {
                        m_allBoardSpaces[i][ii].setVisible(false);
                    }
                }
            }
        }
    } 

    //Holds the current game
    private Game m_currentGame;
    //Holds all the spaces a player can be displayed on the board
    private javax.swing.JLabel[][] m_allBoardSpaces;
    //Holds all the houses that can be displayed on the board
    private java.awt.Label[] m_houseLabels;
    //An array the holds the labels that display each players current worth
    private javax.swing.JLabel[] m_playerMoneyInd;
    //Holds the jail space that players can be displayed on
    private javax.swing.JLabel[] m_jailsp;
    //m_buttonControler --> Used to control whether a button can be clicked or not
    //m_playerBankcrupt --> Used to tell if a player is bankrupt
    private boolean m_buttonControler, m_playerBankcrupt;
    //m_rolledDoublesCount --> Holds the amount of times a player has rolled doubles in one turn
    //m_placement --> Used to give players a placement when he/she declares bankruptcy
    private int m_rolledDoublesCount, m_placement;
    //Panel that contains the jail space
    private javax.swing.JPanel m_jailSpace;
    //Used to show the img for the jail space
    private javax.swing.JLabel m_jailSpcaeImg;
    
    //A JPanel which holds each players info
    private javax.swing.JPanel m_playerOnePanel;
    private javax.swing.JPanel m_playerTwoPanel;
    private javax.swing.JPanel m_playerThreePanel;
    private javax.swing.JPanel m_playerFourPanel;
    
    //Used to display each players name in their own panel
    private javax.swing.JLabel m_playerOneName;
    private javax.swing.JLabel m_playerTwoName;
    private javax.swing.JLabel m_playerThreeName;
    private javax.swing.JLabel m_playerFourName;
    
    //Holds the token img displayed in each player panel
    private javax.swing.JLabel m_playerOnePieceImg;
    private javax.swing.JLabel m_playerTwoPieceImg;
    private javax.swing.JLabel m_playerThreePieceImg;
    private javax.swing.JLabel m_playerFourPieceImg;
    
    //Button for each player to view their owned properties
    private javax.swing.JButton m_playerOneProperties;
    private javax.swing.JButton m_playerTwoProperties;
    private javax.swing.JButton m_playerThreeProperties;
    private javax.swing.JButton m_playerFourProperties;
    
    //Button used to continue to results page
    private javax.swing.JButton m_continueBtn;
    //Button used to roll the dice
    private javax.swing.JButton m_rollBtn;
    //button used to declare bankruptcy
    private javax.swing.JButton m_bankruptBtn;
    //button used for player to trade with one another
    //(did not finish implementation)
    private javax.swing.JButton m_tradeBtn;
    //Button used to build a house
    private javax.swing.JButton m_buildHouseBtn;
    //Label used to display whos turn it is
    private java.awt.Label m_turnIndicator;
    //The desktop panel that contains all the elements
    private javax.swing.JDesktopPane m_desktopPane;
    //Used to display the img of the board
    private javax.swing.JLabel m_boardImg;
    //Used to display roll for dice one
    private java.awt.Label m_diceOne;
    //Used to display roll for dice two
    private java.awt.Label m_diceTwo;
    //Used to display the roll total
    private java.awt.Label m_finalRollResult;
    //The JPanel the game board img and all space representations are contained in
    private javax.swing.JPanel m_boardContainer;
    //The scroll bar
    private javax.swing.JScrollPane m_scrollPane;
    //Button used to get out of jail
    private javax.swing.JButton m_getOutOfJailBtn;
    //Button used to end a players turn
    private javax.swing.JButton m_endTurnBtn;
    //used to manipulate the frame from other classes
    public static MainGameFrame mainGameFrame;
         
}

