import java.util.Enumeration;
import java.util.Vector;

public abstract class SensorSystem {
    private Vector MotionObservers = new Vector();
    private Vector SmokeObservers = new Vector();


    public void registerMotionObserver(SensorListener sensorListener) {
        MotionObservers.addElement(sensorListener);
    }

    public void registerSmokeObserver(SensorListener sensorListener) {
        SmokeObservers.addElement(sensorListener);
    }
    public void notifyMotionObservers() {
        for (Enumeration e = MotionObservers.elements(); e.hasMoreElements();) {
            ((SensorListener) e.nextElement()).detected();
        }
    }
    public void notifySmokeObservers() {
        for (Enumeration e = SmokeObservers.elements(); e.hasMoreElements();) {
            ((SensorListener) e.nextElement()).detected();
        }
    }
}