public class YMotionSensor implements SensorForMotion, SensorListener {

    House house;
    static final String DESCRIPTION = "This is the FactoryY made Motion Sensor.";

    public YMotionSensor(House house) {
        this.house = house;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    public void detected() {
        Sms sms = new MotionSmsAdapter(new MotionSms());
        if(house.getmotionState() == motionState.MotionDetected){
            sms.sendMessage("(Ymotion-Sensor:"+motionState.MotionDetected+")");
        }
        else {
            sms.sendMessage("(Ymotion-Sensor:motion has stopped )");
        }

    }
}