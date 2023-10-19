package classes;

public class HPPrinterFactory implements PrinterFactory {

    @Override
    public Printer createPrinter() {
        return new HPPrinter();
    }
    
}
