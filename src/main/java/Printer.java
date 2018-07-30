public class Printer {
    private int sheetsAvailable;
    private int toner;

    public Printer(int sheetsAvailable, int toner){
        this.sheetsAvailable = sheetsAvailable;
        this.toner = toner;
    }

    public void print(int pages, int copies){
        int pagesWanted = pages * copies;
        if (this.sheetsAvailable - pagesWanted < 0 || this.toner - pagesWanted < 0){
            return;
        }
        else {
            this.sheetsAvailable -= pagesWanted;
            this.toner -= pagesWanted;
        }
    }

    public void refill(int numberOfSheets){
        this.sheetsAvailable += numberOfSheets;
    }

}
