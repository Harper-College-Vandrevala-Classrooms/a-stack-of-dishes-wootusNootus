package com.example;

class DishStack {

    private Dish[] stack;
    private int top;      
    private int capacity; 

    public DishStack() {
        capacity = 10; 
        stack = new Dish[capacity];
        top = -1;
    }

    // Pushing on top of stack
    public void push(Dish dish) {
        if (isFull()) {
            System.out.println("The stack is full! Cannot push the dish: " + dish.description);
            return; 
        }

        stack[++top] = dish;
    }

    // Pop a Dish object from the stack
    public Dish pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty! Cannot pop a dish.");
            return null; 
        }

        Dish poppedDish = stack[top--];
        return poppedDish;
    }

    // Peek at the top Dish object without removing it
    public Dish peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty! Nothing to peek at.");
            return null;
        }

        return stack[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
