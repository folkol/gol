import javax.swing.JFrame;


public class Gui {

    private JFrame f;
    private Grid myGrid;

    void launchFrame(CellKlump cellKlump){
        f = new JFrame("Game of Life");
        f.setVisible(true);
        myGrid = new Grid();
        myGrid.setCellKlump(cellKlump);
        myGrid.setVisible(true);
        f.add(myGrid);
        f.setSize(1000, 1000);
    }

    void reDraw() {
        f.setVisible(false);
        f.setVisible(true);
    }

    public Grid getGrid() {
        return myGrid;
    }
}
