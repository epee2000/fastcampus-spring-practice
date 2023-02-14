package com.fastcampus.javaoop.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSort <T extends Comparable<T>> implements Sort<T> {

  // interface : List<T> sort(List<T> list);

  @Override
  public List<T> sort(List<T> list) {
    List<T> output = new ArrayList<>(list); // 변하지 않는 값으로 다시 저장... 원본 보존
    Collections.sort(output);

    return output;
  }
}
