import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class PedometerTest {
 
    @Test
    public void maximumPedometerTest(){

        Pedometer pedometer = new Pedometer();

        assertEquals(1, pedometer.addStep(1,500));
        assertEquals(1, pedometer.addStep(1,500));
        assertEquals(801, pedometer.addStep(2,200));
        assertEquals(1, pedometer.addStep(3,1200));
        assertEquals(101, pedometer.addStep(1,100));
    }

    @Test
    public void ShouldDaysByCriteria() {

        Pedometer pedometer = new Pedometer();


        pedometer.addStep(1,15000);
        pedometer.addStep(2,1000);
        pedometer.addStep(3,11000);

      pedometer.printAllDaysByCriteria (data -> data > 10000 );
    }

}
