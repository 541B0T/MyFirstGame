package mainClass;

import javax.swing.*;

public class GameWindow{
    private JFrame jframe;

    //GameWindown main methods
    public GameWindow(GamePanel gamePanel){
        jframe=new JFrame();

        jframe.setSize(400,400);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setVisible(true);
    }

}
