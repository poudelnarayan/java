public class Main {
    public static void main(String[] args){
        PoorPlayer p1 =new PoorPlayer();
        p1.name = "Bob";
        p1.health = 100;
        p1.loseHealth(10);
        System.out.println( p1.getHealth());


        EnhancedPlayer p2 = new EnhancedPlayer("Tom" , 80 , "x90");
        p2.loseHealth(70);
        System.out.println(p2.getHealth());

        EnhancedPlayer p3 = new EnhancedPlayer("jack" , 400 , "XBow");
        p3.loseHealth(90);
        System.out.println(p3.getHealth());


        Printer myPrinter = new Printer(50,20,false);
        myPrinter.printPaper(200);
        myPrinter.addToner(40);

    }
}
