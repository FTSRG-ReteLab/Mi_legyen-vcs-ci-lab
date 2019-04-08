package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;

public class TrainSensorImpl implements TrainSensor {

	private TrainController controller;
	private TrainUser user;
	//Itt inicializaljuk a sebesseghatart
	private int speedLimit = 15;


	public TrainSensorImpl(TrainController controller, TrainUser user) {
		this.controller = controller;
		this.user = user;
	}
	//Ezzel lehet lekerni a sebesseghatart
	@Override
	public int getSpeedLimit() {
		return speedLimit;
	}



	//Ezzel atirjuk a sebesseghatart
	@Override
	public void overrideSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;

		if(!(speedLimit<0) && !(speedLimit>500) && !(speedLimit<controller.getReferenceSpeed()*0.5)){
			user.setAlarmState(false);
			controller.setSpeedLimit(speedLimit);
		}
		else {
			user.setAlarmState(true);
		}
	}

}
