package com.github.kalimatas.c01_Intro;

import org.jsfml.graphics.*;
import org.jsfml.system.Vector2f;
import org.jsfml.window.VideoMode;
import org.jsfml.window.event.Event;

public class TestGraphics {
    private RenderWindow renderWindow = new RenderWindow(new VideoMode(200, 200), "SFML Works!");
    private CircleShape cir = new CircleShape(100.f);
    private Text text = new Text();
    private RectangleShape rect = new RectangleShape();

    public RectangleShape getRect() {
        return rect;
    }

    public void setRect(RectangleShape rect) {
        this.rect = rect;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public RenderWindow getRenderWindow() {
        return renderWindow;
    }

    public void setRenderWindow(RenderWindow renderWindow) {
        this.renderWindow = renderWindow;
    }

    public CircleShape getCir() {
        return cir;
    }

    public void setCir(CircleShape cir) {
        this.cir = cir;
    }

    public void run() {
        cir.setFillColor(Color.WHITE);
        rect.setSize(new Vector2f(renderWindow.getSize().x, renderWindow.getSize().y));
        rect.setFillColor(Color.GREEN);

        while (renderWindow.isOpen()) {
            for (Event e : renderWindow.pollEvents()) {
                if (e.type == Event.Type.CLOSED) {
                    renderWindow.close();
                }
            }

            renderWindow.clear();
            renderWindow.draw(rect);
            renderWindow.draw(cir);
            renderWindow.display();
        }
    }
}
