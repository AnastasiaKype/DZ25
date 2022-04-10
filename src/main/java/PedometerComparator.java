import java.util.Comparator;

public class PedometerComparator implements Comparator<Pedometer> {
    private int minSteps;


    @Override
    public int compare(Pedometer o1, Pedometer o2) {
        return o1.minCntSteps(minSteps) - o2.minCntSteps(minSteps);
    }

    public PedometerComparator(int minSteps) {
        this.minSteps = minSteps;
    }
}
