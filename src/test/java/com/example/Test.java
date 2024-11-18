package com.example;

public class Test {
    public static void main(String[] args) {
        DishStack stack = new DishStack();

        // Creating Dish objects
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");

        System.out.println("Initial stack size: " + stack.size()); // Should print 0

        // Pushing onto the stack
        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.push(blueDish);

        System.out.println("Size after pushes: " + stack.size()); 

        Dish peekedDish = stack.peek(); 
        System.out.println("Peeked dish: " + (peekedDish != null ? peekedDish.description : "null")); // return null if nonexistent

        Dish poppedDish = stack.pop(); 
        System.out.println("Popped dish: " + (poppedDish != null ? poppedDish.description : "null")); // return null if nonexistent

        Dish anotherPoppedDish = stack.pop(); 
        System.out.println("Second popped dish: " + (anotherPoppedDish != null ? anotherPoppedDish.description : "null"));

        System.out.println("Final stack size: " + stack.size()); 
    }
}

