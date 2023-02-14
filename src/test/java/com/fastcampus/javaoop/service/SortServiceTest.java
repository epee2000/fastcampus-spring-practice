package com.fastcampus.javaoop.service;

import static org.junit.jupiter.api.Assertions.*;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.JavaSort;
import java.util.List;
import org.junit.jupiter.api.Test;

class SortServiceTest {

  //private SortService ss = new SortService(new JavaSort<String>());
  private SortService ss = new SortService(new BubbleSort<String>());

  @Test
  void test() {
    List<String> actual = ss.doSort(List.of("3", "2", "1"));
    assertEquals(List.of("1", "2", "3"), actual);
  }

}