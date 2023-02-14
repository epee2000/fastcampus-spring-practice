package com.fastcampus.springpractice;

import com.fastcampus.springpractice.logic.JavaSort;
import com.fastcampus.springpractice.logic.Sort;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    //BubbleSort<String> sort = new BubbleSort<>();

    Sort<String> sort = new JavaSort<>();

    System.out.println("[result] " + sort.sort(Arrays.asList(args)));

  }
}
