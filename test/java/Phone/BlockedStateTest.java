package Phone;

import static org.junit.jupiter.api.Assertions.*;

class BlockedStateTest {

    @org.junit.jupiter.api.Test
    void next() {
        Phone ph = new Phone();
        ph.setState(new BlockedState());
        ph.nextState();
        assertSame(ph.getState().getClass(), new UnblockedState().getClass());
    }

    @org.junit.jupiter.api.Test
    void prev() {
        Phone ph = new Phone();
        ph.setState(new BlockedState());
        ph.nextState();
        assertSame(new BlockedState().getClass(),ph.getState().getClass());
    }
}