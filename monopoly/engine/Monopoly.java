package monopoly.engine;

import frames.MainMenu;

public class Monopoly 
{
    public static void main(String[] args) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                MainMenu app = new MainMenu();
                app.setVisible(true);
            }
        });
    }
    
}
