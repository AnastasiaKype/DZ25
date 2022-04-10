import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PedometerCompareTest {

    @Test
    public void compareToTest() {
        
        Pedometer p1 = new Pedometer();
        Pedometer p2 = new Pedometer();
        
        p1.addStep(1,10000);
        p2.addStep(1,15000);

        p1.addStep(2,100);
        p2.addStep(2,150);
        
        int expected = -5050;
        int actual = p1.compareTo(p2);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void comparatorTest() {
        Pedometer p1 = new Pedometer();
        Pedometer p2 = new Pedometer();

        p1.addStep(1,10000);
        p2.addStep(1,15000);

        p1.addStep(2,100);
        p2.addStep(2,150);

        PedometerComparator comparator = new PedometerComparator(12000);
        int expected = -1;
        int actual = comparator.compare(p1,p2);

        Assertions.assertEquals(expected,actual);

    }


}
