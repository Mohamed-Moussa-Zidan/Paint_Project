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
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Raffy
 */
public class Paint extends Canvas implements MouseListener, ActionListener {

    private static Paint paint = null;
    ArrayList<MyShape> shapes = new ArrayList<MyShape>();
    int x1, x2, y1, y2;
    static String type = null;
    int x3, y3;
    static Color newColor = null;
    static Color fillColor = null;
    static String method = "Draw";
    private int selectedShapeIndex = -1;

    public static void setFillColor(Color c) {
        fillColor = c;
    }

    public static void setColor(Color c) {
        newColor = c;
    }

    public static void setType(String type) {
        Paint.type = type;
    }

    private Paint() {
        setSize(400, 400);
        setBackground(Color.white);
        this.addMouseListener(this);
    }
    public static Paint getInstance(){
        Paint p =null;
        if(paint==null){
        p=new Paint();
        
        }
        return p;
    
    }

    public void paint(Graphics g) {

        for (MyShape shape : shapes) {
            g.setColor(shape.getColor());
            shape.paint(g);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

        x1 = e.getX();
        y1 = e.getY();

        if (method.equals("Move")) {
            int i = 0;
            for (MyShape shape : shapes) {
                if (shape.contains(new Point(x1, y1))) {
                    selectedShapeIndex = i;
break;
                   
                    

                } i++;
            }
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        if (method.equals("Draw")) {

            MyShape s = null;

            s = ShapeFactory.createShape(type, x1, y1, x2, y2);
            s.setColor(newColor);
            shapes.add(s);

            repaint();
        } else if (method.equals("Move") && selectedShapeIndex != -1) {

            shapes.get(selectedShapeIndex).respondToMove(new Point(x1, y1), new Point(x2, y2));
            System.out.println(selectedShapeIndex);
            selectedShapeIndex = -1;

            repaint();
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (method.equals("Fill")) {
            for (MyShape shape : shapes) {

                if (shape.contains(new Point(e.getX(), e.getY()))) {
                    shape.setFillColor(fillColor);

                }
                repaint();

            }

        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        MyJFrame jframe = new MyJFrame();
       Paint paint =Paint.getInstance();
        jframe.add(paint);
        jframe.setVisible(true);

    }
}
