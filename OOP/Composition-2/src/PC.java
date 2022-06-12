public class PC {
    private Case theCase;  // composition (PC has a  Case)
    private Monitor monitor; // composition (PC has a Monitor)
    private MotherBoard motherBoard; // composition (PC has a MotherBoard)

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private  void drawLogo() {
        //Fancy graphics
        monitor.drawPixelAt(1200,50,"yellow");
    }

}
