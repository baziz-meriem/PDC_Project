public class FactoryX implements SensorFactory {
    House house;

    public FactoryX(SensorSystem house) {
        this.house = (House) house;
    }

    @Override
    public SensorForMotion createMotionSensor() {
        System.out.println("Xmotion Sensor created by FactoryX");
    return new XMotionSensor(this.house);
    }

    @Override
    public SensorForSmoke createSmokeSensor() {
        System.out.println("Xsmoke Sensor created by FactoryX");

        return new XSmokeSensor(this.house);
    }
}