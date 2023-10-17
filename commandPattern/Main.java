package commandPattern;
import java.util.*;
public class Main {

    public static void main(String[] args) {
         int opt = 1, in = 1;
         Light light = new Light();

        Controller lightControl = new Controller(light);

        ThermostatCmd thermostat = new ThermostatCmd();

        Controller thermosControl = new Controller(thermostat);

        ShareIT musicPlayer = new ShareIT();

        Controller shareControl = new Controller(musicPlayer);

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.print(
                    "Appliance Menu\n" +
                    "[1]Light\n" +
                    "[2]Thermostat\n" +
                    "[3]Music Player\n" +
                    "[4]Exit\n" +
                            "Press Selection: ");
            opt = sc.nextInt();
            System.out.println();
            switch(opt) {


                case 1:
                    System.out.print(
                            "[1]Switch On\n" +
                            "[2]Switch Off\n" +
                            "[3]High Brightness\n" +
                            "[4]Low Brightness\n");
                    in = sc.nextInt();
                    switch(in) {

                        case 01:
                            lightControl.switchOn();
                            System.out.println();
                            break;

                        case 02:
                            lightControl.switchOff();
                            System.out.println();
                            break;

                        case 03:
                            lightControl.highBrightness();
                            System.out.println();
                            break;

                        case 04:
                            lightControl.lowBrightness();
                            System.out.println();
                            break;
                        default:
                            System.out.print("Incorrect Word Enter!");
                            break;
                    }
                    break;

                case 2:
                    System.out.print(
                            "[1]Switch On\n" +
                            "[2]Switch Off\n" +
                            "[3]High Temp\n" +
                            "[4]Low Temp\n");
                    in = sc.nextInt();
                    switch(in) {

                        case 01:
                            thermosControl.On();
                            System.out.println();
                            break;

                        case 02:
                            thermosControl.Off();
                            System.out.println();
                            break;

                        case 03:
                            thermosControl.highTemperature();
                            System.out.println();
                            break;

                        case 04:
                            thermosControl.lowTemperature();
                            System.out.println();
                            break;
                        default:
                            System.out.print("Incorrect Word Enter!");
                            break;
                    }
                    break;

                case 3:
                    System.out.println(
                            "[1]Switch On\n" +
                            "[2]Switch Off\n" +
                            "[3]High Volume\n" +
                            "[4]Low Volume\n" +
                            "[5]Play Music\n" +
                            "[6]Stop Music\n");
                    in = sc.nextInt();
                    switch(in) {

                        case 01:
                            shareControl.onTurn();
                            System.out.println();
                            break;

                        case 02:
                            shareControl.offTurn();
                            System.out.println();
                            break;

                        case 03:
                            shareControl.highVolume();
                            System.out.println();
                            break;

                        case 04:
                            shareControl.lowVolume();
                            System.out.println();
                            break;

                        case 05:
                            shareControl.playSong("All too well 10 minutes version");
                            System.out.println();
                            break;

                        case 06:
                            shareControl.stopPlayback();
                            System.out.println();
                            break;
                        default:
                            System.out.println("Incorrect Word Enter!");
                            break;
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect Word Enter, try again!");
            }
        }
    }
}
