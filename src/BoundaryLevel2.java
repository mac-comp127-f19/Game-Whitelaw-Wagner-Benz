import comp127graphics.CanvasWindow;
import comp127graphics.GraphicsGroup;
import comp127graphics.GraphicsObject;
import comp127graphics.Line;
import comp127graphics.Rectangle;
import java.util.List;
import java.awt.*;



public class BoundaryLevel2 {
    private GraphicsGroup group;
    private CanvasWindow canvas;
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
    private Rectangle startRectangle;
    private Rectangle middleRectangle;
    private Rectangle endRectangle;



    public BoundaryLevel2(CanvasWindow canvas){
        this.canvas = canvas;
        group = new GraphicsGroup();

        line1 = new Line(200,250,700,250);
        line1.setStrokeWidth(7.5);
        group.add(line1);

        line2 = new Line(200,550,700,550);
        line2.setStrokeWidth(7.5);
        group.add(line2);

        line3 = new Line(200,250,200,350);
        line3.setStrokeWidth(7.5);
        group.add(line3);

        line4 = new Line(700,250,700,350);
        line4.setStrokeWidth(7.5);
        group.add(line4);

        line5 = new Line(700,450,700,550);
        line5.setStrokeWidth(7.5);
        group.add(line5);

        line6 = new Line(200,450,200,550);
        line6.setStrokeWidth(7.5);
        group.add(line6);

        line7 = new Line(100,350,200,350);
        line7.setStrokeWidth(7.5);
        group.add(line7);

        line8 = new Line(100,450,200,450);
        line8.setStrokeWidth(7.5);
        group.add(line8);

        line9 = new Line(700,450,800,450);
        line9.setStrokeWidth(7.5);
        group.add(line9);

        line10 = new Line(700,350,800,350);
        line10.setStrokeWidth(7.5);
        group.add(line10);

        line11 = new Line(800,350,800,450);
        line11.setStrokeWidth(7.5);
        group.add(line11);

        line12 = new Line(100,350,100,450);
        line12.setStrokeWidth(7.5);
        group.add(line12);

        startRectangle = new Rectangle(103.75,353.75,100,93.5);
        startRectangle.setFillColor(Color.GREEN);
        group.add(startRectangle);

        endRectangle = new Rectangle(697.5,353.75,100,93.5);
        endRectangle.setFillColor(Color.GREEN);
        group.add(endRectangle);

        middleRectangle = new Rectangle(203.5,253.5,493.5,293.5);
        middleRectangle.setFillColor(Color.gray);
        group.add(middleRectangle);
    }
    public void addBoundaryLevel2(){
        this.canvas.add(group);
    }
    public GraphicsGroup getBound(){
        return group;
    }
}
