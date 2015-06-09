package jp.ac.it_college.std.s14010.pdp.af.tablefactory;

import jp.ac.it_college.std.s14010.pdp.af.factory.Page;

/**
 * Created by s14010 on 15/06/10.
 */
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}
