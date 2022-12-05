package Phone;

public class BlockedState implements PhoneState {

    @Override
    public void next(Phone ph) {
        ph.setState(new UnblockedState());
    }

    @Override
    public void prev(Phone ph) {
        System.out.println("The phone is blocked.");
    }

    @Override
    public void printStatus() {
        System.out.println("The phone is blocked.");
    }
}
