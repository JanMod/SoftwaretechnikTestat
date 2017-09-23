package CrossroadParticipant;

/**
 * Created by janmoder on 23.09.17.
 */
public class Pedestrian {
    protected static int id =0;
    protected boolean moving = false;

    protected enum Position
    {
        SouthCrossroad, WestCrossroad, NorthCrossroad, EastCrossroad, CrossroadSouth, CrossroadWest, CrossroadNorth, CrossroadEast
    }



    protected Position myPos;
    protected Position targetPos;
    protected Position startPos;





}
