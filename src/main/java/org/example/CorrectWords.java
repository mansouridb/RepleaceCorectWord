package org.example;

public class CorrectWords {
    public static void main(String[] args) {
        System.out.println("Java is the worst programming language!");
      String str = "Java is the worst programming language!";
      String str1 = str.replaceFirst("worst", "best");
        System.out.println(str1);

    }

}
