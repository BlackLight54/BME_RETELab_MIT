package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;

public class TrainSensorImpl implements TrainSensor {

	private TrainController controller;
	private TrainUser user;
	private int speedLimit = 5;

	public TrainSensorImpl(TrainController controller, TrainUser user) {
		this.controller = controller;
		this.user = user;
	}

	@Override
	public int getSpeedLimit() {
		return speedLimit;
	}

	@Override
	public void overrideSpeedLimit(int speedLimit) {
		//This is where the feature is implemented
		// Absolute margin
		if(speedLimit < 0 || 500 < speedLimit) user.setAlarmState(true);
		// relative margin 
		if(speedLimit < controller.getReferenceSpeed() * 0.5) user.setAlarmState(true);
		this.speedLimit = speedLimit;
		controller.setSpeedLimit(speedLimit);
	}

}
