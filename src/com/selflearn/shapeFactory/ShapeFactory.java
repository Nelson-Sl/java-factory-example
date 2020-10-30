package com.selflearn.shapeFactory;

import com.selflearn.shapeInterface.Shape;
import com.selflearn.shapes.Circle;
import com.selflearn.shapes.Rectangle;
import com.selflearn.shapes.Square;

public class ShapeFactory {
    public static Shape getShape(String shape) {
        if(shape == null || shape.isEmpty()) {
            return null;
        }
        switch (shape.toLowerCase()) {
            case "rectangle":
                return new Rectangle();
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
