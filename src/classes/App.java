package classes;

public class App {

    public static void main(String[] args) throws Exception {
        //Criando uma fabrica de impressora HP
        PrinterFactory hpFactory = new HPPrinterFactory();
        Printer hpPrinter = hpFactory.createPrinter();

        //Imprimindo impressora HP
        hpPrinter.print("Este é um documento de teste impresso na HP");

        //Criando uma fabrica de impressora Epson
        PrinterFactory epsonFactory = new EpsonPrinterFactory();
        Printer epsoPrinter = epsonFactory.createPrinter();

        //Imprimindo impressora HP
        epsoPrinter.print("Este é um documento de teste impresso na Epson");

    }

}
