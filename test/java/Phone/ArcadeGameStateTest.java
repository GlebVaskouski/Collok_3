package Phone;

import static org.junit.jupiter.api.Assertions.*;

class ArcadeGameStateTest {

    @org.junit.jupiter.api.Test
    void next() {
        Phone ph = new Phone();
        ph.setState(new ArcadeGameState());
        ph.nextState();
        assertSame(ph.getState().getClass(), new ArcadeGameState().getClass());
    }

    @org.junit.jupiter.api.Test
    void prev() {
        Phone ph = new Phone();
        ph.setState(new ArcadeGameState());
        ph.nextState();
        assertSame(ph.getState().getClass(), new GameState().getClass());
    }
}