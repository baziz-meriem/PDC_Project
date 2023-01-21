public class FactoryY implements SensorFactory {
    House house;
    public FactoryY(SensorSystem house) {
        this.house = (House) house;
    }
    @Override
    public SensorForMotion createMotionSensor() {
        System.out.println("Ymotion Sensor created by FactoryY");
        return new YMotionSensor(this.house);
    }

    @Override
    public SensorForSmoke createSmokeSensor() {
        System.out.println("Ysmoke Sensor created by FactoryY");

        return new YSmokeSensor(this.house);
    }
}