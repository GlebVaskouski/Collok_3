package Phone;

public class ArcadeGameState implements PhoneState {

    @Override
    public void next(Phone ph) {
        System.out.println("You are already playing.");
    }

    @Override
    public void prev(Phone ph) {
        ph.setState(new GameState());
    }

    @Override
    public void printStatus() {
        System.out.println("You are already playing.");
    }
}
