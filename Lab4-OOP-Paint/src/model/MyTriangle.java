package model;

import java.awt.*;
import java.awt.Point;

public class MyTriangle extends MyShape {

    
    
    public static int counter = 0;

    public MyTriangle(int x1, int x2, int x3, int y1, int y2, int y3) {
        super(x1, x2, x3, y1, y2, y3);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.drawPolygon(x,y,3);
        if(fillColor!=null){
            g.setColor(fillColor);
        g.fillPolygon(x,y,3);}// TODO Auto-generated method stub

    }

    @Override
    public boolean contains(Point p) {
        // TODO Auto-generated method stub
        return false;
    }

  

    @Override
    public void respondToResize(Point newPoint, int oldPoint) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean creation(Point p, boolean clicked) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void select() {
        // TODO Auto-generated method stub

    }

    @Override
    public void deSelect() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isSelected() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isFilled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setFilled(boolean b) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getLineThickness() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setLineThickness(int thickness) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isMovepoint(Point point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int isResizepoint(Point Point) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Point getMovePoint() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ShapeInterface copy() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean intialized() {
        // TODO Auto-generated method stub
        return false;
    }

}
