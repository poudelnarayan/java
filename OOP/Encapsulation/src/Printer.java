public class Printer {
    private int tonerLevel = 100;
    private int pagePrinted = 0;
    private boolean isDuplex ;

    public Printer(int tonerLevel, int numOfPagePrinted, boolean isDuplex) {
        if(tonerLevel >= 0 && tonerLevel <=100)
            this.tonerLevel = tonerLevel;
        this.pagePrinted = numOfPagePrinted;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <=100){
            if((this.tonerLevel + tonerAmount) >= 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;

        } else{
            return -1;
        }
    }

    public int printPaper(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex){
            pagesToPrint = (pages/2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagePrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
