package printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();

        printer.print(new ConsolePrinter.Message("Вітаю!", "Анастсія"));
        printer.print(new ConsolePrinter.Message("Привіт усім, колеги", null));
        printer.print(new ConsolePrinter.Message("Є хтось тут?", ""));
        printer.print(new ConsolePrinter.Message(null, null));
    }
}