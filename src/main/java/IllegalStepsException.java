public class IllegalStepsException extends RuntimeException {
    public IllegalStepsException (int step) {
            super ("Количество шагов не может быть отрицательным");
        System.out.println("Количество шагов не может быть отрицательным");
        }
}
