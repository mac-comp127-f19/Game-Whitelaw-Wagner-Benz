import cantrell.animations.completed.Animator;
import comp127graphics.CanvasWindow;
import comp127graphics.GraphicsGroup;
import comp127graphics.GraphicsObject;
import comp127graphics.Line;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Boundary{
    private GraphicsGroup group;

    private GraphicsObject line1;
    private GraphicsObject line2;
    private GraphicsObject line3;
    private GraphicsObject line4;
    private GraphicsObject line5;
    private GraphicsObject line6;
    private GraphicsObject line7;
    private GraphicsObject line8;
    private GraphicsObject line9;
    private GraphicsObject line10;
    private GraphicsObject line11;
    private GraphicsObject line12;
    private GraphicsObject line13;
    private GraphicsObject line14;
    private GraphicsObject line15;
    private GraphicsObject line16;
    private CanvasWindow canvas;

    public Boundary(CanvasWindow canvas){
        this.canvas= canvas;
        group = new GraphicsGroup();

        line1 = new Line(40,200,40,600);
        group.add(line1);

        line2 = new Line(860,200,860,600);
        group.add(line2);

        line3 = new Line(40,200,200,200);
        group.add(line3);

        line4 = new Line(600,200,860,200);
        group.add(line4);

        line5 = new Line(40,600,300,600);
        group.add(line5);

        line6 = new Line(700,600,860,600);
        group.add(line6);

        line7 = new Line(700,250,700,600);
        group.add(line7);

        line8 = new Line(650,250,700,250);
        group.add(line8);

        line9 = new Line(200,200,200,550);
        group.add(line9);

        line10 = new Line(200,550,250,550);
        group.add(line10);

        line11 = new Line(250,250,250,550);
        group.add(line11);

        line12 = new Line(650,250,650,550);
        group.add(line12);

        line13 = new Line(250,250,600,250);
        group.add(line13);

        line14 = new Line(300,550,650,550);
        group.add(line14);

        line15 = new Line(600,200,600,250);
        group.add(line15);

        line15 = new Line(300,550,300,600);
        group.add(line15);




    }
    public void addBoundary(){
        this.canvas.add(group);
    }
    public GraphicsGroup getBound(){
        return group;
    }

    public List getLines() {
        return List.of(line11, line12);
    }

}
