package com.selflearn;

import com.selflearn.shapeFactory.ShapeFactory;
import com.selflearn.shapeInterface.Shape;

public class Main {

    public static void main(String[] args) {
	    Shape circle = ShapeFactory.getShape("Circle");
        circle.draw();

        Shape rectangle = ShapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape square = ShapeFactory.getShape("Shape");
        square.draw();
    }
}
