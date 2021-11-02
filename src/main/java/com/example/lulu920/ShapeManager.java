package com.example.lulu920;

public class ShapeManager {
    private static final int Max_NUM = 100;
    private Shape[]  shapes =  new  Shape[Max_NUM];
    private int shapeNum=0;
    public void addShape(Shape shape){
        if (shapeNum<Max_NUM){
            shapes[shapeNum++]=shape;
        }
    }
    public void draw(){
        for (int i=0;i<shapeNum;i++){
            shapes[i].draw();
        }
    }

    public static void main(String[] args) {
        ShapeManager manager =  new ShapeManager();
        manager.addShape(new Circle(new Point(4,4),3));
        manager.addShape(new Line(new Point(2,3),new Point(3,4),"green"));
        manager.addShape(new ArrorwLine(new Point(1,2),new Point(5,5),"black",false,true));
        manager.draw();

    }
}
