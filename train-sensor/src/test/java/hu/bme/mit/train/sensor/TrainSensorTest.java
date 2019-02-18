package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.system.TrainSystem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    TrainSensorImpl tsi;

    @Before
    public void before() {
        // TODO Add initializations
        TrainSystem system = new TrainSystem();
        tsi = new TrainSensorImpl(system.getController(), system.getUser());

    }

    @Test
    public void ThisIsAnExampleTestStub() {
        // TODO Delete this and add test cases based on the issues
        Assert.assertEquals(15, tsi.getSpeedLimit());
    }
}
