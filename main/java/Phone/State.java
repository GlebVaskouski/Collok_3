package Phone;

public class State{
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.setState(new BlockedState());
        ph.nextState();
        ph.printStatus();
    }
}


