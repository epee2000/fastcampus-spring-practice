package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;
import java.util.List;

public class SortService {
  private final Sort<String> sort; // 인터페이스

  public SortService(Sort<String> sort) { // new JavaSort<String>()
    this.sort = sort;
    System.out.println("구현체 : " + sort.getClass().getName());
  }

  public List<String> doSort(List<String> list) {
    //Sort<String> sort = new JavaSort<>();
    return sort.sort(list);
  }

}
