package hu.bme.mit.train.tachograph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrainTachographTest {
    TrainTachograph trainTachograph;
    @Before
    public void before(){
        trainTachograph = new TrainTachograph();
    }
    @Test
    public void canContainElementsTest() {
        trainTachograph.addEntry(0,0d,0d);
        Assert.assertFalse(trainTachograph.tachographTable.isEmpty());
    }
}
