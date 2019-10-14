package Command;

public class SellCommand implements Command {

    private Receiver stock;

    public SellCommand(Receiver stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
