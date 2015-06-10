package jp.ac.it_college.std.s14010.pdp.composite;

/**
 * Created by s14010 on 15/06/11.
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public void printLine() {
        printList(" ");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
