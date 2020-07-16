package view;

import Factory.ShapeFactory;
import controller.Controller;
import observer.*;
import model.MyShape;
import model.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import observer.paintListener;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Raffy
 */
public class MyPaint extends Canvas {

    private static MyPaint paint = null;
    public static ArrayList<MyShape> shapes = new ArrayList<MyShape>();

    private MyPaint() {
        setSize(400, 400);
        setBackground(Color.white);
        
    }

    public static MyPaint getInstance() {

        if (paint == null) {
            paint = new MyPaint();

        }
        MyPaint p = paint;
        return p;

    }

    

    public void paint(Graphics g) {

        for (MyShape shape : shapes) {
            g.setColor(shape.getColor());
            shape.paint(g);
        }
    }

}
