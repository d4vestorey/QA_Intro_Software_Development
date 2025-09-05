package Labs.O3;

import java.awt.Color;

class Shape {
    public int x, y, w, h;
    private int dirX, dirY;
    static int worldW;
    static int worldH;
    private ShapeType shapeType;
    private Color color;

public Color getColor() {
        return color;
    }

public ShapeType getShapeType() {
        return shapeType;
    }

public static void setWorld(int w, int h) {
        worldW = w;
        worldH = h;
    }

public Shape(int x, int y, int w, int h, int dirX, int dirY, ShapeType shapeType, Color color) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dirX = dirX;
        this.dirY = dirY;
        this.shapeType = shapeType;
        this.color = color;
    }

public Shape(int x, int y, int w, int h, ShapeType shapeType, Color color) {
        this(x, y, w, h, 0, 0, shapeType, color); //this calls the main constructor with dirX and dirY set to 0 by default
    }

    //default shape, color and height calling the main constructor
public Shape(int x, int y, int w, int dirX, int dirY){
        this(x,y,w,50,dirX,dirY,ShapeType.Oval, Color.BLACK); 
    }   


public void move() {
        this.x += dirX;
        this.y += dirY;
        if (x < 0) {
            x = 0;
            dirX = -dirX;
        }
        if (y < 0) {
            y = 0;
            dirY = -dirY;
        }
        if (x > (worldW - h)) {
            x = worldW - h;
            dirX = -dirX;
        }
        if (y > (worldH - h)) {
            y = worldH - h;
            dirY = -dirY;
        }
    }
}
