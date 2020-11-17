import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    BusStop busStop;
    Person person1;
    Person person2;

    @Before
    public void before() {
        bus = new Bus("London", 10);
        busStop = new BusStop("Hospital");
        person1 = new Person();
        person2 = new Person();
        busStop.addPersonToQueue(person1);
        busStop.addPersonToQueue(person2);
    }

    @Test
    public void checkStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus.pickUpPassengerFromBusStop(busStop);
        assertEquals(1, bus.passengerCount());
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.pickUpPassengerFromBusStop(busStop);
        bus.pickUpPassengerFromBusStop(busStop);
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());
    }
}
