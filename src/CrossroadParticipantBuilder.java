/**
 * Created by janmoder on 23.09.17.
 */
public class CrossroadParticipantBuilder implements  Runnable{
    @Override
    public void run() {
        
    }

    private static CrossroadParticipantBuilder INSTANCE= new CrossroadParticipantBuilder();
    private CrossroadParticipantBuilder(){
    }
    public static CrossroadParticipantBuilder getINSTANCE(){
        return INSTANCE;
    }

}
