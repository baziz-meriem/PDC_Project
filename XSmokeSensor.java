public class XSmokeSensor implements SensorForSmoke, SensorListener {
    House house;
    static final String DESCRIPTION = "This is the FactoryX made Smoke Sensor.";
    public XSmokeSensor(House house) {
        this.house = house;
    }
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    public void detected() {
        Sms sms = new SmokeSmsAdapter(new SmokeSms());
        if(house.getSmokeState() == smokeState.SmokeDetected){
            sms.sendMessage("(Xsmoke-Sensor:"+smokeState.SmokeDetected+")");
        }
        else {
            sms.sendMessage("(Xsmoke-Sensor:smoke has stopped)");
        }

    }
}