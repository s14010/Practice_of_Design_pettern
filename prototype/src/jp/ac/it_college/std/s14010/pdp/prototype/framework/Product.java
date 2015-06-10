package jp.ac.it_college.std.s14010.pdp.prototype.framework;

/**
 * Created by s14010 on 15/06/04.
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}
