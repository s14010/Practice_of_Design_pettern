package jp.ac.it_college.std.s14010.pdp.command.drawer;

import jp.ac.it_college.std.s14010.pdp.command.command.Command;

import java.awt.*;

/**
 * Created by s14010 on 15/06/17.
 */
public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point position;
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
