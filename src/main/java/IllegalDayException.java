public class IllegalDayException extends RuntimeException{
    public IllegalDayException (int day) {
        super ("День" + day + "введен некорректно");
        System.out.println("День " + day + " введен некорректно");
    }
}
