package jp.ac.it_college.std.s14010.pdp.state;

/**
 * Created by s14010 on 15/06/17.
 */
public interface State {
    public abstract void doClock (Context context, int hour);
    public abstract void doUse(Context context);
    public abstract void doAlarm(Context context);
    public abstract void doPhone(Context context);
}
