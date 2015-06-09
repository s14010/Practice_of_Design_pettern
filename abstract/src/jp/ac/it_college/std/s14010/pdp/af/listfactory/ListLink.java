package jp.ac.it_college.std.s14010.pdp.af.listfactory;

import jp.ac.it_college.std.s14010.pdp.af.factory.Link;

/**
 * Created by s14010 on 15/06/10.
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
