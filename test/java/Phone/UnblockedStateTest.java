package Phone;

import java.util.function.BiConsumer;

import static org.junit.jupiter.api.Assertions.*;

class UnblockedStateTest {

    @org.junit.jupiter.api.Test
    void next() {
        Phone ph = new Phone();
        ph.setState(new UnblockedState());
        assertSame(ph.getState().getClass(), new GameState().getClass());
    }

    @org.junit.jupiter.api.Test
    void prev() {
        Phone ph = new Phone();
        ph.setState(new UnblockedState());
        ph.nextState();
        assertSame(ph.getState().getClass(), new BlockedState().getClass());
    }
}