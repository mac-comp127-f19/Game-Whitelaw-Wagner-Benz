import cantrell.animations.completed.Animator;
import comp127graphics.CanvasWindow;
import comp127graphics.GraphicsGroup;
import comp127graphics.GraphicsObject;
import comp127graphics.Line;
import comp127graphics.Rectangle;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Boundary{
    private GraphicsGroup group;
    private GraphicsGroup bounds;

    private Line line1;
    private Line line2;
    private Line line3;
    private Line line4;
    private Line line5;
    private Line line6;
    private Line line7;
    private Line line8;
    private Line line9;
    private Line line10;
    private Line line11;
    private Line line12;
    private Line line13;
    private Line line14;
    private Line line15;
    private Line line16;
    private Rectangle startRectangle;
    private Rectangle endRectangle;
    private Rectangle middleRectangle;
    private Rectangle leftFillRectangle;
    private Rectangle rightFillRectangle;
    private Rectangle leftFillRectangle2;
    private Rectangle rightFillRectangle2;
    private CanvasWindow canvas;

    public Boundary(CanvasWindow canvas){
        this.canvas= canvas;
        group = new GraphicsGroup();
        bounds = new GraphicsGroup();

        line1 = new Line(40,200,40,600);
        line1.setStrokeWidth(7.5);
        group.add(line1);

        line2 = new Line(860,200,860,600);
        line2.setStrokeWidth(7.5);
        group.add(line2);

        line3 = new Line(40,200,200,200);
        line3.setStrokeWidth(7.5);
        group.add(line3);

        line4 = new Line(600,200,860,200);
        line4.setStrokeWidth(7.5);
        group.add(line4);

        line5 = new Line(40,600,300,600);
        line5.setStrokeWidth(7.5);
        group.add(line5);

        line6 = new Line(700,600,860,600);
        line6.setStrokeWidth(7.5);
        group.add(line6);

        line7 = new Line(700,250,700,600);
        line7.setStrokeWidth(7.5);
        group.add(line7);

        line8 = new Line(650,250,700,250);
        line8.setStrokeWidth(7.5);
        group.add(line8);

        line9 = new Line(200,200,200,550);
        line9.setStrokeWidth(7.5);
        group.add(line9);

        line10 = new Line(200,550,250,550);
        line10.setStrokeWidth(7.5);
        group.add(line10);

        line11 = new Line(250,250,250,550);
        line11.setStrokeWidth(7.5);
        group.add(line11);

        line12 = new Line(650,250,650,550);
        line12.setStrokeWidth(7.5);
        group.add(line12);

        line13 = new Line(250,250,600,250);
        line13.setStrokeWidth(7.5);
        group.add(line13);

        line14 = new Line(300,550,650,550);
        line14.setStrokeWidth(7.5);
        group.add(line14);

        line15 = new Line(600,200,600,250);
        line15.setStrokeWidth(7.5);
        group.add(line15);

        line16 = new Line(300,550,300,600);
        line16.setStrokeWidth(7.5);
        group.add(line16);

        startRectangle = new Rectangle(43.75,203.75,152.5,392.5);
        startRectangle.setFillColor(Color.GREEN);
        group.add(startRectangle);

        endRectangle = new Rectangle(703.75,203.75,152.5,392.5);
        endRectangle.setFillColor(Color.GREEN);
        group.add(endRectangle);

        middleRectangle = new Rectangle(253.75,253.75,392.5,292.5);
        middleRectangle.setFillColor(Color.gray);
        middleRectangle.setStrokeColor(Color.gray);
        group.add(middleRectangle);
        bounds.add(middleRectangle);

        leftFillRectangle = new Rectangle(196.5,553.75,57.5,50-8);
        leftFillRectangle.setFillColor(Color.gray);
        leftFillRectangle.setStrokeColor(Color.gray);
        group.add(leftFillRectangle);

        rightFillRectangle = new Rectangle(646.5,203.75,57.5,50-8);
        rightFillRectangle.setFillColor(Color.gray);
        rightFillRectangle.setStrokeColor(Color.gray);
        group.add(rightFillRectangle);

        leftFillRectangle2 = new Rectangle(254,546.5,50-8,49.5);
        leftFillRectangle2.setFillColor(Color.gray);
        leftFillRectangle2.setStrokeColor(Color.gray);
        group.add(leftFillRectangle2);

        rightFillRectangle2 = new Rectangle(603.75,203.5,50-8,49.5);
        rightFillRectangle2.setFillColor(Color.gray);
        rightFillRectangle2.setStrokeColor(Color.gray);
        group.add(rightFillRectangle2);
    }
    public void addBoundary(){
        this.canvas.add(group);
    }
    public GraphicsGroup getBound(){
        return bounds;
    }
}
