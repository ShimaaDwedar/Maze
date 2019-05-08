package eg.edu.alexu.csd.datastructure.maze.cs15cs23cs36;

public class PriorityQueue {
    private int QueArr[];
    private int max;
    private int n;
    
    public PriorityQueue (int max){
        this.max = max;
        QueArr = new int[max];
        n=0;
    }
    public void insert (int item) {
        if (n == 0) {
            QueArr[n] = item;
            n++;
        }else {
            int k;
            for (k = n - 1; k > -1; k--) {
                if (item > QueArr[k]) {
                    QueArr[k+1] = QueArr[k];
                }else {
                    break;
                }
            }
            QueArr[k+1] = item;
            n++;
        }
    }
    public int deleteMin () {
        n--;
        return QueArr[n];
    }
    public int deleteMax () {
        int max = QueArr[0];
        int k;
        for (k = 0; k< n; k++) {
            QueArr[k] = QueArr[k+1];
        }
        n--;
        return max;
    }
    public boolean isEmpty (){
        if (n == 0) {
            return true;
        }else {
            return false;
        }
    }
}
