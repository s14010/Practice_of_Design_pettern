package jp.ac.it_college.std.s14010.pdp.adapter;

import jp.ac.it_college.std.s14010.pdp.adapter.Print;

/**
 * Created by s14010 on 15/06/03.
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
