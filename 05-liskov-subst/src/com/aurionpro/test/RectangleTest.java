package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle obj = new Rectangle(10, 20);
        System.out.println(obj); 

        boolean result = isRectangle(obj);
        System.out.println("Is it a rectangle? " + result);
    }

        static boolean isRectangle(Rectangle obj) {
        int prevWidth = obj.getWidth();
        obj.setHeight(100);
        int currWidth = obj.getWidth();
        return prevWidth == currWidth;
    }
}

