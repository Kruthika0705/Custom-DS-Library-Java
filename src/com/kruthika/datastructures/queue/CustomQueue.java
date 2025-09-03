package com.kruthika.datastructures.queue;

public class CustomQueue {
    private int[] arr;
    private int front, rear, capacity, size;

    // Constructor
    public CustomQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue (insert element at rear)
    public void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity; // circular increment
        arr[rear] = x;
        size++;
    }

    // Dequeue (remove element from front)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Peek (see front element without removing)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if full
    public boolean isFull() {
        return size == capacity;
    }

    // Get current size
    public int getSize() {
        return size;
    }
}
