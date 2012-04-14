import java.awt.Canvas;

import javax.swing.JFrame;


public class Gui {

    void launchFrame(){
        JFrame f = new JFrame("Game of Life");
        f.setVisible(true);
        Canvas canvas;
        canvas = new Grid();
        f.add(canvas);
        f.setSize(1000, 1000);
    }
}
