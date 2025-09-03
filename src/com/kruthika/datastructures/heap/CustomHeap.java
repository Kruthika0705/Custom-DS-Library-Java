package com.kruthika.datastructures.heap;

public class CustomHeap {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor
    public CustomHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Get parent, left child, right child
    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }

    // Insert new element
    public void insert(int val) {
        if (size == capacity) {
            System.out.println("Heap Overflow");
            return;
        }
        heap[size] = val;
        int current = size;
        size++;

        // Heapify up
        while (current > 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Extract minimum (root)
    public int extractMin() {
        if (size == 0) {
            System.out.println("Heap Underflow");
            return -1;
        }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return min;
    }

    // Heapify down
    private void heapifyDown(int i) {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            swap(i, smallest);
            heapifyDown(smallest);
        }
    }

    // Swap elements
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Utility: print heap
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
