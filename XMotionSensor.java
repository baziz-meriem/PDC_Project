public class XMotionSensor implements SensorForMotion, SensorListener {
    House house;
    static final String DESCRIPTION = "This is the FactoryX made Motion Sensor.";

    public XMotionSensor(House house) {
        this.house = house;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }


    public void detected() {

       Sms sms = new MotionSmsAdapter(new MotionSms());
        if(house.getmotionState() == motionState.MotionDetected){
            sms.sendMessage("(Xmotion-Sensor:"+motionState.MotionDetected+")");
        }
        else {
            sms.sendMessage("(Xmotion-Sensor:motion has stopped)");
        }
    }
}