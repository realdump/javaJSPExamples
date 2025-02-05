/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abmn.demo1;

/**
 *
 * @author abdul
 */
public class MetaspaceExample {
    public static void main(String[] args) {
        // Class loading can cause Metaspace usage
        for (int i = 0; i < 100000; i++) {
            new StringBuilder(); // Creating a new object continuously to simulate memory usage
            if (i % 1000 == 0) {
                System.out.println("Creating object " + i);
            }
        }
        System.out.println("Completed object creation.");
    }
}
