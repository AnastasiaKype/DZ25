import java.util.HashMap;
import java.util.Map;

public class Pedometer implements Comparable <Pedometer>{

    private Map<Integer,Integer> data = new HashMap<>();


    public int addStep(int day, int step) {

        if (data.containsKey(day)) {
            data.put(day, data.get(day) + step);
        } else {
            data.put(day, step);
        } return stepsToOvercomeTheMaximum(day);
    }


    public int maxSteps() {

        int max = 0;
        for (int value : data.values()) {
            if (value > max) {
                max = value;
            }
        } return max;
    }

    public int sum(){
        int sum = 0;
        for (int step : data.keySet()) {
            sum += data.get(step);
        } return sum;
    }


    public int stepsToOvercomeTheMaximum(int day) {
        int maxSumStep = maxSteps();
        int stepsInDay = data.getOrDefault(day,0);
        return maxSumStep - stepsInDay + 1;

    }

    public int minCntSteps (int minSteps){
        int min = 0;
        for (int value : data.values()) {
            if (value > minSteps) {
               min++;
            }
        } return min;
    }

    public int compareTo(Pedometer pedometer) {
        return sum() - pedometer.sum();
    }


}
