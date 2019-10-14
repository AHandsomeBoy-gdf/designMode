package Command;

public class BuyCommand implements Command {
    private Receiver stock;

    public BuyCommand(Receiver stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
