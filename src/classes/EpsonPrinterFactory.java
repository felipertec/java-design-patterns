package classes;

public class EpsonPrinterFactory implements PrinterFactory {

    @Override
    public Printer createPrinter() {
        return new EpsonPrinter();
    }
    
}
