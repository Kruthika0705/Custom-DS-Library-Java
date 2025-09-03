# Custom Data Structures Library in Java

A **custom-built Java library** that implements fundamental data structures from scratch.  
This project demonstrates mastery of **DSA + OOP in Java** by building reusable, modular classes similar to `java.util`.

---

## 📂 Implemented Data Structures
- **Stack** (Array-based implementation)
- **Queue** (Circular Array-based implementation)
- **Linked List** (Singly Linked List with add/remove/print)
- **Heap** (Min Heap with insert & extract)
- **Graph** (Adjacency List with BFS & DFS traversals)
- **Binary Tree** (Insert, Search, Inorder, Preorder, Postorder)
- **Trie** (Insert, Search, Prefix Matching)

---

## 🚀 Usage Example

```java
import com.kruthika.datastructures.stack.CustomStack;

public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());   // Output: 20
        System.out.println(stack.peek());  // Output: 10
    }
}
