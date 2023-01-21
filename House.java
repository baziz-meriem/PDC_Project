public class House extends SensorSystem{
    private motionState motionState;
    private smokeState smokeState;

    House(){
        this.motionState = motionState.noMotionDetected;//initializing the sensor
        this.smokeState = smokeState.noSmokeDetected;//initializing the sensor

    }
    public motionState getmotionState() {  return this.motionState ;}
    public smokeState getSmokeState() {  return this.smokeState ;}

    public void setmotionState(motionState state) {
        this.motionState = state;
            notifyMotionObservers();
}
    public void setSmokeState(smokeState state) {
        this.smokeState = state;
        notifySmokeObservers();
    }
}
