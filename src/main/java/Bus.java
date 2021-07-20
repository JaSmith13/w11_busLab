import javax.print.attribute.standard.Destination;
import java.util.ArrayList;

public class Bus {

    private int capacity;
    private String destination;
    private ArrayList<Person> passengers;

    public Bus(String destination){
        this.destination = destination;
        this.capacity = 5;
        this.passengers = new ArrayList<>();
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(BusStop busStop) {
        if(passengers.size() < capacity){
            Person person = busStop.removePerson();
            this.passengers.add(person);
        }
    }

    public void removePassager() {
        this.passengers.remove(0);
    }
}
