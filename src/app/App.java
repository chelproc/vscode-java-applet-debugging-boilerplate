package app;

import java.applet.Applet;
import java.awt.Graphics;

public class App extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello world!", 50, 50);
    }
}