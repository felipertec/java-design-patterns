package classes;

public class HPPrinter implements Printer{

    @Override
    public void print(String content) {
        System.out.println("imprimindo via impressora HP: " + content);
    }
    
}
