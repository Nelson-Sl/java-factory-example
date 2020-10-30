package com.selflearn.shapes;

import com.selflearn.shapeInterface.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("use Rectangle::draw to print this line");
    }
}
