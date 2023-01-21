public class MainProject{
    public static void main(String[] arg) {
        //create the concrete subject to be observed
        SensorSystem house = new House();
        //create factory for sensors of brand Y
        SensorFactory factoryY;
        factoryY = new FactoryY(house);

        //create factory for sensors of brand X
        SensorFactory factoryX;
        factoryX = new FactoryX(house);

        //create different sensors
        SensorForMotion motionsensorY =  factoryY.createMotionSensor();
        SensorForMotion motionsensorX = factoryX.createMotionSensor();

        SensorForSmoke smokesensorY =  factoryY.createSmokeSensor();
        SensorForSmoke smokesensorX = factoryX.createSmokeSensor();

        //register motion sensors as observers
        house.registerMotionObserver((SensorListener) motionsensorY);
        house.registerMotionObserver((SensorListener) motionsensorX);

        //register smoke sensors as observers
        house.registerSmokeObserver((SensorListener) smokesensorY);
        house.registerSmokeObserver((SensorListener) smokesensorX);


        ((House) house).setSmokeState(smokeState.SmokeDetected);//simulate detected smoke in the house
        ((House) house).setmotionState(motionState.MotionDetected);//simulate detected motion in the house
        ((House) house).setmotionState(motionState.noMotionDetected);//simulate stopped motion in the house
       // ((House) house).setSmokeState(smokeState.noSmokeDetected);//simulate stopped smoke in the house
    }
}