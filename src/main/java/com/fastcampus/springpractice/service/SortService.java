package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.Sort;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service  // 빈으로 등록빈으로 등록 (@Component 와 같음)
public class SortService {
  private final Sort<String> sort; // 인터페이스

  /**
  2월 15, 2023 2:39:31 오전 org.springframework.context.support.AbstractApplicationContext refresh
  경고: Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException:
  Error creating bean with name 'sortService' defined
  in file [/Users/woochoi/Study/fastcampus-spring-practice/build/classes/java/main/com/fastcampus/springpractice/service/SortService.class]:
  Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
  No qualifying bean of type 'com.fastcampus.springpractice.logic.Sort<java.lang.String>' available: expected single matching bean but found 2: bubbleSort,javaSort
  */

  public SortService(@Qualifier("bubbleSort") Sort<String> sort) { // new JavaSort<String>()
    this.sort = sort;
    System.out.println("구현체 : " + sort.getClass().getName());
  }

  public List<String> doSort(List<String> list) {
    //Sort<String> sort = new JavaSort<>();
    return sort.sort(list);
  }

}
