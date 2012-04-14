public class Cell {
    int size = 5;
    boolean f = false;

    public int getSize() {
        return size;
    }

    public boolean isAlive() {
        return f;
    }

    public void setAlive(boolean b) {
        f = b;
    }
}
