package Phone;

public class Phone {

    private PhoneState state = new BlockedState();

    public PhoneState getState() {
        return state;
    }

    public void setState(PhoneState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
