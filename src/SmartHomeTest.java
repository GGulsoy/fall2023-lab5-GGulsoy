import devices.*;

public class SmartHomeTest {
    public static void main(String[] args) {
        // Initial Counts
        System.out.println("Initial Smart Device Count: " + SmartDevice.getDeviceCount());

        // Creating Smart Devices
        SmartLight light1 = new SmartLight("Philips Hue", 50, "Voice");
        SmartSpeaker speaker1 = new SmartSpeaker("Amazon Echo", 100, "Voice");
        SmartLight light2 = new SmartLight("Xiaomi Yeelight", 40, "Touch");
        SmartSpeaker speaker2 = new SmartSpeaker("Google Home", 120, "Voice");

        // Counts after Creation
        System.out.println("\nSmart Device Count after Creation: " + SmartDevice.getDeviceCount());
        System.out.println("Number of SmartLights: " + SmartLight.getLightCount());
        System.out.println("Number of SmartSpeakers: " + SmartSpeaker.getSpeakerCount());

        // Testing each device's functionalities
        testDevice(light1);
        testDevice(speaker1);
        testDevice(light2);
        testDevice(speaker2);

        configureAndOperateDevice(light1);
        configureAndOperateDevice(speaker2);

    }

    private static void testDevice(InteractiveDevice device) {
        System.out.println("\nTesting Device: " + device.getDeviceName());
        System.out.println(device);
        device.operate();
        device.configure();
        device.operate();
    }

    private static void configureAndOperateDevice(InteractiveDevice device) {
        System.out.println("\nConfiguring and Operating: " + device.getDeviceName());
        device.configure();
        device.operate();
    }
}

