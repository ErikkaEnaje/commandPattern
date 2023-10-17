package commandPattern;
public class ThermostatCmd implements Appliance {
    private int temperature;
    public ThermostatCmd() {
        temperature = 30; // Set on the initial temperature
    }
    @Override
    public void switchOn() {
        System.out.println("The Thermostat is the ON");
    }
    @Override
    public void switchOff() {
        System.out.println("The Thermostat is the OFF");
    }
    @Override
    public void High() {
        temperature++;
        System.out.println("The Temperature High to " + temperature);
    }
    @Override
    public void Low() {
        temperature--;
        System.out.println("The Temperature Low to " + temperature);
    }
    @Override
    public void playMusic(String songName) {
    }
    @Override
    public void stopMusic() {
    }
}
