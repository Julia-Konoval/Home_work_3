public class Main {
    public static void main(String[] args) {

        Car versionBMW = new BMW();
        versionBMW.setWheels(4);
        versionBMW.setSpeed(300);
        versionBMW.setCab("Cabriolet");
        versionBMW.setTurnOnMusic("FM Lvivska Khvylya");
        versionBMW.setOutdrive("Break the rules!");


        Car versionMazda = new Mazda();
        versionMazda.setWheels(8);
        versionMazda.setSpeed(250);
        versionMazda.setCab("Pickup");
        versionMazda.setTurnOnMusic("A$AP Rocky");
        versionMazda.setOutdrive("Let's get it started!");

        Car versionTesla = new Car();
        versionTesla.setWheels(4);
        versionMazda.setSpeed(270);
        versionMazda.setCab("Roadster");
        versionTesla.setTurnOnMusic("Hip-hop music system");
        versionTesla.setOutdrive("Fasten your seatbelt, buddy");

     Conveyer letsGo = new Conveyer();
     letsGo.start();
    }
}
