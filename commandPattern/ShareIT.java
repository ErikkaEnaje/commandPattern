package commandPattern;
public class ShareIT implements Appliance {
    private boolean isOpen;
    private int volume;
    private String currentmusic;
    public ShareIT() {
        isOpen = false;
        volume = 100; // Set on the initial volume
        currentmusic = "No music is playing";
    }
    @Override
    public void switchOn() {
        isOpen = true;
        System.out.println("The Music Player is ON");
    }
    @Override
    public void switchOff() {
        isOpen = false;
        System.out.println("The Music Player is OFF");
    }
    @Override
    public void High() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume High to " + volume);
        }
    }
    @Override
    public void Low() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume Low to " + volume);
        }
    }
    @Override
    public void playMusic(String musicname) {
        currentmusic = musicname;
        System.out.println("Playing music: " + musicname);
    }
    @Override
    public void stopMusic() {
        currentmusic = "No music playing";
        System.out.println("The music has stopped");
    }
}