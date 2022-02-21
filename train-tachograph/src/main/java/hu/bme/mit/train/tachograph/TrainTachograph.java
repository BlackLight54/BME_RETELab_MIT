package hu.bme.mit.train.tachograph;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class TrainTachograph {
    Table<Integer, String, Double> tachographTable = HashBasedTable.create();

    public void addEntry(Integer time, double joystickPosition, double referenceSpeed ) {
        tachographTable.put(time, "Joystick",joystickPosition);
        tachographTable.put(time, "Reference",referenceSpeed);
    }
}
