package Phone;

import java.util.Scanner;

public class GameState implements PhoneState {

    @Override
    public void next(Phone ph) {
                ph.setState(new ArcadeGameState());
    }

    @Override
    public void prev(Phone ph) {
        ph.setState(new UnblockedState());
    }

    @Override
    public void printStatus() {
        System.out.println("You are in game directory.");
    }
}
