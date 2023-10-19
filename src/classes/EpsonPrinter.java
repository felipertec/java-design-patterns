package classes;

public class EpsonPrinter implements Printer{

    @Override
    public void print(String content) {
        System.out.println("imprimindo via impressora Epson: " + content);
    }
    
}
