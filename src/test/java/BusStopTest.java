import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("THE Bus Stop");
        person = new Person();
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.getQueueLength());
    }

    @Test
    public void canAddPerson(){
        busStop.addPerson(person);
        assertEquals(1, busStop.getQueueLength());
    }

    @Test
    public void canRemovePerson(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson();
        busStop.removePerson();
        assertEquals(0, busStop.getQueueLength());
    }


}
