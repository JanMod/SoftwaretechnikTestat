package CrossroadParticipant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by janmoder on 23.09.17.
 */
class CarTest {
    @Test
    void testtoString() {
        Car c1 = new Car(Pedestrian.Position.EastCrossroad,Pedestrian.Position.CrossroadNorth);
        Car c2 = new Car(Pedestrian.Position.NorthCrossroad,Pedestrian.Position.CrossroadWest);
        Car c3 = new Car(Pedestrian.Position.EastCrossroad,Pedestrian.Position.CrossroadNorth);
        assertEquals("Car: 0 Aktuelle Position EastCrossroad; Startposition: EastCrossroad; Zielposition: CrossroadNorth; Am Bewegen? false", c1.toString());
        assertEquals("Car: 1 Aktuelle Position NorthCrossroad; Startposition: NorthCrossroad; Zielposition: CrossroadWest; Am Bewegen? false", c2.toString());
        assertEquals("Car: 2 Aktuelle Position EastCrossroad; Startposition: EastCrossroad; Zielposition: CrossroadNorth; Am Bewegen? false", c3.toString());
    }

}