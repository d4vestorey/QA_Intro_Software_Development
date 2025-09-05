package Labs.O3;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

//Enums and Strings

public class Game extends Canvas {
    Shape[] shapes = new Shape[3];

Game() {
        JFrame frame = new JFrame();
        Shape.setWorld(700,800);
        this.setSize(Shape.worldW,Shape.worldH);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);

        //shapes[0] = new Shape(0,0,10,10,0,10);
        //shapes[1] = new Shape(20,20,20,20,5,52);
        //shapes[2] = new Shape(50,50,5,5,10,20);
        shapes[0] = new Shape(0,0,50,50,0,10,ShapeType.Rectangle, Color.RED);
        shapes[1] = new Shape(20,20,100,50,5,52,ShapeType.Oval, Color.BLUE);
        //shapes[2] = new Shape(50,50,150,100,10,20,ShapeType.ThreeDRectangle, Color.GREEN);
        shapes[2] = new Shape(50,50,50,40,40);

Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                draw();
            }
        };

t.schedule(tt, 0, 50);
               
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                t.cancel();
                tt.cancel();
            }
        });
    }

public void draw() {
        // call the move() method of each balls
        // Tip: use an enhanced for loop to pick
        //    each ball in the balls array.
        for (Shape shape : shapes) {
            shape.move();
        }
        this.repaint();
    }

public void paint(Graphics g) {
        g.drawRect(0, 0, Shape.worldW, Shape.worldH);
        for (Shape shape : shapes) {
            ShapeType type = shape.getShapeType(); //gets the shape type
            g.setColor(shape.getColor()); //sets the color
            if(type == ShapeType.Rectangle)
                g.drawRect(shape.x,shape.y,shape.w,shape.h);
            else if(type == ShapeType.ThreeDRectangle)
                g.draw3DRect(shape.x,shape.y,shape.w,shape.h,true);
            else if(type == ShapeType.RoundRectangle)
                g.drawRoundRect(shape.x,shape.y,shape.w,shape.h,10,10);
            else if(type == ShapeType.Oval)
                g.drawOval(shape.x,shape.y,shape.w,shape.h);
            else if(type == ShapeType.Arc)  
                g.drawArc(shape.x,shape.y,shape.w,shape.h,0,270);
            
        }
        // move and draw each ball in balls array
        // Tip: use an enhanced for loop to pick
        //    each ball in the balls array.
    }

}
