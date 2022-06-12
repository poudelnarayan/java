public class Main {
    public static void main(String[] args){
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2203" , "Dell" , "240" , dimensions);

        Monitor theMonitor = new Monitor("27inch Beast" , "Acer" , 27 , new Resolution(2540,1440));

        MotherBoard theMotherBoard = new MotherBoard("BJ-200","Asus" , 4,6, "v2.44");

        PC thePC = new PC(theCase , theMonitor , theMotherBoard);
        thePC.powerUp();
    }
}
