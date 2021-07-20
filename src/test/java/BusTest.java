import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

   private Bus bus;
   private Person passenger;
   private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Jamaica");
        passenger = new Person();
        busStop = new BusStop("THE Bus Stop");
        busStop.addPerson(passenger);
    }

    @Test
    public void busStartsWithNoPassengers(){
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void busCanTakePassengers(){
        bus.addPassenger(busStop);
        assertEquals(1, bus.getPassengerCount());
        assertEquals(0, busStop.getQueueLength());
    }

    @Test
    public void busCannotPickUpPassengersWhenFull(){
        busStop.addPerson(passenger);
        busStop.addPerson(passenger);
        busStop.addPerson(passenger);
        busStop.addPerson(passenger);
        busStop.addPerson(passenger);
        busStop.addPerson(passenger);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        assertEquals(5, bus.getPassengerCount());
        assertEquals(2, busStop.getQueueLength());
    }

    @Test
    public void canBootAPassenger(){
        bus.addPassenger(busStop);
        bus.removePassager();
        assertEquals(0, bus.getPassengerCount());
    }
}


