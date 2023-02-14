package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    //BubbleSort<String> sort = new BubbleSort<>();

    Sort<String> sort = new JavaSort<>();

    System.out.println("[result] " + sort.sort(Arrays.asList(args)));

  }
}
