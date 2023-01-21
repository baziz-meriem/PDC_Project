public class YSmokeSensor implements SensorForSmoke, SensorListener {
    House house;
    static final String DESCRIPTION = "This is the FactoryY made Smoke Sensor.";

    public YSmokeSensor(House house) {
       this.house = house;
    }


    @Override
    public String getDescription() {
        return DESCRIPTION;
    }


    public void detected() {
        Sms sms = new SmokeSmsAdapter(new SmokeSms());
        if(house.getSmokeState() == smokeState.SmokeDetected){
            sms.sendMessage("(Ysmoke-Sensor:"+smokeState.SmokeDetected+")");
        }
        else {
            sms.sendMessage("(Ysmoke-Sensor:smoke has stopped)");
        }
    }
}