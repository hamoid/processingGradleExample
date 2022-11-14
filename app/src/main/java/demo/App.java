package demo;

import processing.core.PApplet;

public class App extends PApplet {
    @Override
    public void settings() {
        size(400, 400);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        background(40);
        fill(200, 50, 100);
        noStroke();
        circle(width / 2f, height / 2f, 80f);
    }

    public static void main(String[] args) {
        PApplet.main(App.class.getName());
    }
}
