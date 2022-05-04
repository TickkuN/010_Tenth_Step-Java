public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = (-1 < tonerLevel && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(0 < tonerAmount && tonerAmount <= 100){
            int totalTonerAmount = this.tonerLevel + tonerAmount;
            if(0 < totalTonerAmount && totalTonerAmount <= 100){
                this.tonerLevel = totalTonerAmount;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
        return this.tonerLevel;
    }

    public int printPages(int pages){
        int pagesToPrint = (duplex) ? ((pages / 2) + (pages % 2)) : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

}
