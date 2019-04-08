package hu.bme.mit.train.sensor;


import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TrainSensorTest {

    @Mock
    TrainController trainController;

    @Mock
    TrainUser trainUser;

    TrainSensor sensor;

    @Before
    public void before() {
        trainController = mock(TrainController.class);
        trainUser = mock(TrainUser.class);

        sensor= new TrainSensorImpl(trainController, trainUser);



    }

    @Test
    public void overrideSpeedLimitTest_alarmNotSet() {
        Mockito.when(trainController.getReferenceSpeed()).thenReturn(100);
        sensor.overrideSpeedLimit(150);
        verify(trainUser, Mockito.times(0)).setAlarmState(true);

    }

    @Test
    public void overrideSpeedLimitTest_alarmSet() {
        Mockito.when(trainController.getReferenceSpeed()).thenReturn(100);
        sensor.overrideSpeedLimit(45);
        verify(trainUser).setAlarmState(true);

    }

    @Test
    public void overrideSpeedLimitTest_alarmSetSpeed600() {
        Mockito.when(trainController.getReferenceSpeed()).thenReturn(100);
        sensor.overrideSpeedLimit(600);
        verify(trainUser).setAlarmState(true);

    }

    @Test
    public void overrideSpeedLimitTest_alarmSetSpeed_10() {
        Mockito.when(trainController.getReferenceSpeed()).thenReturn(100);
        sensor.overrideSpeedLimit(-10);
        verify(trainUser).setAlarmState(true);

    }

}
