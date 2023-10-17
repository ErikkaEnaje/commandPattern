package commandPattern;
public class Light implements Appliance {
    private boolean isOpen;
    public Light() {
        isOpen = false;
    }
    @Override
    public void switchOn() {
        isOpen = true;
        System.out.println("The Light is ON");
    }
    @Override
    public void switchOff() {
        isOpen = false;
        System.out.println("The Light is OFF");
    }
    @Override
    public void High() {
        System.out.println("The Brightness Low!");
    }
    @Override
    public void Low() {
        System.out.println("The Brightness High!");
    }
    @Override
    public void playMusic(String musicName) {
    }
    @Override
    public void stopMusic() {
    }
}
