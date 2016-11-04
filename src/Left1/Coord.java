package Left1;
//EM MEMORIA DE JOSE PINTO DE CARVALHO\\
public class Coord {
    private int i,j;

    public Coord() {
        this.i = -1;
        this.j = -1;
    }

    public int getI() {
        return i;
    }
    
    public int getJ() {
        return j;
    }

    public void set(int i,int j) {
        if(i<0||i>=7||j<0||j>=7){
            i=-1;
            j=-1;
        }
        this.i = i;
        this.j = j;
    }
    public Coord(int i, int j) {
        this.i = i;
        this.j = j;
    }
    
}
