public class Printer {
    private int pages;
    private int copies;

    public Printer(int pages, int copies) {
        this.pages = pages;
        this.copies = copies;
    }

    public int getPages() {
        return this.pages;
    }

    public int getCopies() {
        return this.copies;
    }
}
