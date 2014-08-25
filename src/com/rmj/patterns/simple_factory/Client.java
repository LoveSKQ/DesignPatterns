package com.rmj.patterns.simple_factory;

import com.rmj.patterns.simple_factory.device.Device;
import com.rmj.patterns.simple_factory.factory.DeviceFactory;

/**
 * Created by G11 on 2014/8/25.
 */
public class Client {
    public static void main(String[] args) {

        Device _device1 = DeviceFactory.createDevice("50ew");
        Device _device2 = DeviceFactory.createDevice("vesd");
        _device1.process();
        _device2.process();
    }
}
