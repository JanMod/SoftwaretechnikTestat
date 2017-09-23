package CrossroadParticipant;

/**
 * Created by janmoder on 23.09.17.
 */
public class Car extends StreetParticipant {
    protected String name;
    private static int id=0;
    public Car( Pedestrian.Position start, Pedestrian.Position target){
        myPos= start;
        startPos = start;
        targetPos= target;
        name = ""+id++;
    }

    public String toString(){
        return "Car: "+name + " Aktuelle Position "+ myPos + "; Startposition: "+ startPos+ "; Zielposition: "+targetPos+ "; Am Bewegen? "+moving;
    }
}
