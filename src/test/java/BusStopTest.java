import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person1;
    Person person2;

    @Before
    public void before() {
        busStop = new BusStop("Hospital");
        person1 = new Person();
        person2 = new Person();
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addPersonToQueue(person1);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addPersonToQueue(person1);
        busStop.addPersonToQueue(person2);
        busStop.removePersonFromQueue();
        assertEquals(1, busStop.queueCount());
    }


}
