package com.rmj.patterns.simple_factory.factory;

import com.rmj.patterns.simple_factory.device.Device;
import com.rmj.patterns.simple_factory.device.Device_50EW;
import com.rmj.patterns.simple_factory.device.Device_VESD;

/**
 * Created by G11 on 2014/8/25.
 */
public class DeviceFactory {
    public static Device createDevice(String deviceID) {
        Device _device = null;
        switch (deviceID) {
            case "50ew":
                _device = new Device_50EW();
                break;
            case "vesd":
                _device = new Device_VESD();
                break;
        }
        return _device;
    }
}
