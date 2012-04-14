import java.awt.Button;

import javax.swing.JFrame;

public class Gui {
    private JFrame f;
    private Grid myGrid;
    private Button button;

    void launchFrame(CellKlump cellKlump) {
        f = new JFrame("Game of Life");
        f.setVisible(true);
        myGrid = new Grid();
        myGrid.setCellKlump(cellKlump);
        myGrid.setVisible(true);
        myGrid.setButton(button);

        button = new Button();
        button.setVisible(true);
        button.setLabel("Hej");
        button.setBounds(230, 600, 75, 35);
        f.add(button);

        f.add(myGrid);
        f.setSize(601, 601);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void reDraw() {
        System.out.print(".");
        myGrid.repaint();
    }

    public Grid getGrid() {
        return myGrid;
    }
}
