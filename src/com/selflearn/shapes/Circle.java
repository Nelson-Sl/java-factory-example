package com.selflearn.shapes;

import com.selflearn.shapeInterface.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("use Circle::draw to print this line");
    }
}
