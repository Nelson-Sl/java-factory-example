package com.selflearn.shapes;

import com.selflearn.shapeInterface.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("use Square::draw to print this line");
    }
}
