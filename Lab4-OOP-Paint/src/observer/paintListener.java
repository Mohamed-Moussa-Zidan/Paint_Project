package observer;

import Factory.ShapeFactory;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import model.*;
import view.*;
import static view.MyPaint.shapes;

/**
 *
 * @author Raffy
 */
public class paintListener implements MouseListener {

    private static MyPaint paint = MyPaint.getInstance();

    int x1, x2, y1, y2, x3, y3;

    static String type = null;
    static Color newColor = null;
    static Color fillColor = null;

    int clickCounter = 0;

    static String method = "Draw";

    private int selectedShapeIndex = -1;

    public static void setMethod(String s) {
        paintListener.method = s;
    }

    public static void setFillColor(Color c) {
        fillColor = c;
    }

    public static void setColor(Color c) {
        newColor = c;
    }

    public static void setType(String type) {
        paintListener.type = type;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (method.equals("Fill")) {
            for (MyShape shape : MyPaint.shapes) {

                if (shape.contains(new Point(e.getX(), e.getY()))) {
                    shape.setFillColor(fillColor);

                }
                paint.repaint();

            }
        } else if (method.equals("Delete")) {
            for (MyShape shape : MyPaint.shapes) {
                int i = 0;
                if (shape.contains(new Point(e.getX(), e.getY())) || shape.isOnLine(new Point(shape.getX1(), shape.getY1()), new Point(shape.getX2(), shape.getY2()), new Point(x1, y1))) {
                    {
                        shapes.remove(i);
                        break;
                    }

                }
                i++;
            }
            paint.repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (method.equals("Draw") && !type.equals("Triangle")) {
            x1 = e.getX();
            y1 = e.getY();
        }
        if (method.equals("Move")) {
            x1 = e.getX();
            y1 = e.getY();
            int i = 0;
            for (MyShape shape : MyPaint.shapes) {
                if (shape.contains(new Point(x1, y1))
                        || shape.isOnLine(new Point(shape.getX1(), shape.getY1()), new Point(shape.getX2(), shape.getY2()), new Point(x1, y1))) {
                    selectedShapeIndex = i;
                    break;

                }
                i++;
            }
        } else if (method.equals("Draw") && type.equals("Triangle")) {

            switch (clickCounter) {
                case 0:
                    x1 = e.getX();
                    y1 = e.getY();
                    clickCounter++;
                    break;
                case 1:
                    x2 = e.getX();
                    y2 = e.getY();
                    clickCounter++;
                    break;
                case 2:
                    x3 = e.getX();
                    y3 = e.getY();

                    clickCounter = 0;
                    MyPaint.shapes.add(new MyTriangle(x1, x2, x3, y1, y2, y3));
                    break;
            }

            paint.repaint();
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        if (method.equals("Draw") && !type.equals("Triangle")) {

            MyShape s = null;

            s = ShapeFactory.createShape(type, x1, y1, x2, y2);
            s.setColor(newColor);
            MyPaint.shapes.add(s);

            paint.repaint();
        } else if (method.equals("Move") && selectedShapeIndex != -1) {

            shapes.get(selectedShapeIndex).respondToMove(new Point(x1, y1), new Point(x2, y2));
            System.out.println(selectedShapeIndex);
            selectedShapeIndex = -1;

            paint.repaint();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
