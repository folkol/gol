

public class Gol {
    public static void main(String[] args){
        new Gol().run();
    }
    void run(){
        CellKlump cellKlump = new CellKlump();

        cellKlump.getCell(15, 15).setAlive(true);
        cellKlump.getCell(15, 16).setAlive(true);
        cellKlump.getCell(15, 17).setAlive(true);

        Gui gui = new Gui();
        gui.launchFrame(cellKlump);

        while(true){
            cellKlump = new CellKlump(cellKlump);
            gui.getGrid().setCellKlump(cellKlump);
            gui.reDraw();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
