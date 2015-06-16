package jp.ac.it_college.std.s14010.pdp.state;

/**
 * Created by s14010 on 15/06/17.
 */
public interface Context {
    public abstract void setClock(int hour);
    public abstract void changeState(State state);
    public abstract void callSecurityCenter(String msg);
    public abstract void recordLog(String msg);
}
