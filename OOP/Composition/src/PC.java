public class PC {
    private Case theCase;  // composition (PC has a  Case)
    private Monitor monitor; // composition (PC has a Monitor)
    private MotherBoard motherBoard; // composition (PC has a MotherBoard)

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
