public class CellKlump {
    Cell[] celler = new Cell[10000];

    CellKlump() {
        for (int i = 0; i < 10000; i++) {
            celler[i] = new Cell();
        }
    }

    public CellKlump(CellKlump cellKlump) {
        for (int i = 0; i < 100; i++) {
            for (int k = 0; k < 100; k++) {
                Cell cell = new Cell();
                boolean isAlive = false;
                int neighborsAlive = 0;
                if (cellKlump.getCell(i - 1, k - 1).isAlive()) {
                    neighborsAlive++;
                }
                if (cellKlump.getCell(i, k - 1).isAlive()) {
                    neighborsAlive++;
                }
                if (cellKlump.getCell(i + 1, k - 1).isAlive()) {
                    neighborsAlive++;
                }
                if (cellKlump.getCell(i - 1, k).isAlive()) {
                    neighborsAlive++;
                }
                if (cellKlump.getCell(i + 1, k).isAlive()) {
                    neighborsAlive++;
                }
                if (cellKlump.getCell(i - 1, k + 1).isAlive()) {
                    neighborsAlive++;
                }
                if (cellKlump.getCell(i, k + 1).isAlive()) {
                    neighborsAlive++;
                }
                if (cellKlump.getCell(i + 1, k + 1).isAlive()) {
                    neighborsAlive++;
                }
                boolean wasAlive = cellKlump.getCell(i, k).isAlive();

                if(wasAlive) {
                    isAlive = neighborsAlive > 1 && neighborsAlive < 4;
                } else {
                    isAlive = neighborsAlive == 3;
                }

                cell.setAlive(isAlive);
                setCell(i, k, cell);
            }
        }
    }

    public void update() {
    }

    public Cell getCell(int i, int k) {
        Cell defaultCell = new Cell();
        defaultCell.setAlive(false);
        if (i < 0 || i >= 100) {
            return defaultCell;
        }
        if (k < 0 || k >= 100) {
            return defaultCell;
        }
        i = i * 100;
        int l = i + k;
        return celler[l];
    }

    public void setCell(int i, int k, Cell c) {
        i = i * 100;
        int l = i + k;
        celler[l] = c;
    }
}
