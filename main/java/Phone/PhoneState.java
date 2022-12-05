package Phone;

public interface PhoneState {

    void next(Phone ph);

    void prev(Phone ph);

    void printStatus();
}
