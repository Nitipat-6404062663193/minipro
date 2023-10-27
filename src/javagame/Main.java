

package javagame;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Frame Ghost = new Frame();
        Ghost.setTitle("วิวัฒนาการหรรษา");
        Ghost.setSize(1100, 620);
        Ghost.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ghost.setLocationRelativeTo(null);
        Ghost.setResizable(false);
        Ghost.setVisible(true);
        //Add song
        Sound.RunMusic("Music/song.mp3");

    }
}

