package com.example.lulu920;

public class ArrorwLine extends Line{
    private boolean startArrow;
    private boolean endArrow;

    public ArrorwLine(Point start, Point end, String color,boolean startArrow, boolean endArrow) {
        super(start, end, color);
        this.startArrow = startArrow;
        this.endArrow =  endArrow;

    }
    @Override
    public void  draw(){
        super.draw();
        if(startArrow){
            System.out.println("draw  start arrow");
        }
        if(endArrow){
            System.out.println("draw end arrow");
        }
    }
}
