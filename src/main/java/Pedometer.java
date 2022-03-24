import java.util.HashMap;
import java.util.Map;

public class Pedometer {

    private Map<Integer,Integer> data = new HashMap<>();


    public int addStep(int day, int step) {

        if (data.containsKey(day)) {
            data.put(day, data.get(day) + step);
        } else {
            data.put(day, step);
        } return stepsToOvercomeTheMaximum(day);
    }


    private int maxSteps() {

        int max = 0;
        for (int value : data.values()) {
            if (value > max) {
                max = value;
            }
        } return max;
    }

    private int stepsToOvercomeTheMaximum(int day) {
        int maxSumStep = maxSteps();
        int stepsInDay = data.getOrDefault(day,0);
        return maxSumStep - stepsInDay + 1;

    }


}
