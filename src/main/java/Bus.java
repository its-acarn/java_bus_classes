import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus (String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }

    public void pickUpPassengerFromBusStop(BusStop busStop) {
        if (this.capacity > this.passengerCount()) {
            Person person = busStop.removePersonFromQueue();
            this.passengers.add(person);
        }
    }
}
