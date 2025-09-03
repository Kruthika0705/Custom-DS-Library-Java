package com.kruthika.datastructures.stack;

public class CustomStack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor
    public CustomStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push element onto stack
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Pop element from stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek top element
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}
