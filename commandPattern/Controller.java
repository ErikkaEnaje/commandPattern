package commandPattern;
public class Controller {
    private Light light;
    private ThermostatCmd thermostat;
    private ShareIT musicPlayer;
    public Controller(Light light) {
        this.light = light;
    }
    public void switchOn() {
        light.switchOn();
    }
    public void switchOff() {
        light.switchOff();
    }
    public void highBrightness() {
        light.High();
    }
    public void lowBrightness() {
        light.Low();
    }
    public Controller(ThermostatCmd thermostat) {
        this.thermostat = thermostat;
    }
    public void On() {
        thermostat.switchOn();
    }
    public void Off() {
        thermostat.switchOff();
    }
    public void highTemperature() {
        thermostat.High();
    }
    public void lowTemperature() {
        thermostat.Low();
    }
    public Controller(ShareIT musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    public void onTurn() {
        musicPlayer.switchOn();
    }
    public void offTurn() {
        musicPlayer.switchOff();
    }
    public void highVolume() {
        musicPlayer.High();
    }
    public void lowVolume() {
        musicPlayer.Low();
    }
    public void playSong(String musicName) {
        musicPlayer.playMusic(musicName);
    }
    public void stopPlayback() {
        musicPlayer.stopMusic();
    }
}
