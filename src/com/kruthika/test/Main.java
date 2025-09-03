package com.kruthika.test;

import com.kruthika.datastructures.trie.CustomTrie;

public class Main {
    public static void main(String[] args) {
        CustomTrie trie = new CustomTrie();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");

        System.out.println(trie.search("apple"));   // true
        System.out.println(trie.search("app"));     // true
        System.out.println(trie.search("appl"));    // false
        System.out.println(trie.startsWith("ap"));  // true
        System.out.println(trie.startsWith("ba"));  // true
        System.out.println(trie.startsWith("cat")); // false
    }
}
