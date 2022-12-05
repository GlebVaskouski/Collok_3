package Phone;

public class UnblockedState implements PhoneState {

    @Override
    public void next(Phone ph) {
        ph.setState(new GameState());
    }

    @Override
    public void prev(Phone ph) {
        ph.setState(new BlockedState());
    }

    @Override
    public void printStatus() {
        System.out.println("The phone is unblocked.");
    }
}
