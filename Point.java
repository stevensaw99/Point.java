// Created by Steven Saw
package com.csc205.project1;

public class Point
{
    public double x;
    public double y;

    // default constructor
    public Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    // return distance between 2 points
    public static double distance (Point p1, Point p2)
    {
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    // shift points
    public Point shift(double x, double y)
    {
        return new Point(this.x + dx, this.y + dy)
    }

    //rotate method
    public void rotate(double theta)
    {
        double x1 = this.x;
        double y1 = this.y;

        x = (x * Math.cos(theta)) - (y * Math.sin(theta));
        y = (x * Math.sin(theta)) + (y * Math.cos(theta));
    }

    //to String


    @Override
    public String toString()
    {
        return "Point{" +
                "x=" + x +
                ", y=" + y + "}";
}
