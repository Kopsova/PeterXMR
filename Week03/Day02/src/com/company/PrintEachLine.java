package com.company;


import jdk.nashorn.api.tree.NewTree;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("my-file.txt");
            List<String> lines = Files.readAllLines(filePath);
        } catch (Exception notHere) {
            System.out.println("Unable to read file: my-file.txt");
        }
                // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"

    }
}

