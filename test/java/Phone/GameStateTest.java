package Phone;

import static org.junit.jupiter.api.Assertions.*;

class GameStateTest {

    @org.junit.jupiter.api.Test
    void nextArcade() {
        Phone ph = new Phone();
        ph.setState(new GameState());
        ph.nextState();
        assertSame(ph.getState().getClass(), new ArcadeGameState().getClass());
    }

    @org.junit.jupiter.api.Test
    void prev() {
        Phone ph = new Phone();
        ph.setState(new GameState());
        ph.nextState();
        assertSame(ph.getState().getClass(), new UnblockedState().getClass());
    }
}