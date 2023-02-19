package com.fastcampus.springpractice;

import com.fastcampus.springpractice.config.Config;
import com.fastcampus.springpractice.logic.JavaSort;
import com.fastcampus.springpractice.logic.Sort;
import com.fastcampus.springpractice.service.SortService;
import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    // 오류 > No qualifying bean of type 'com.fastcampus.springpractice.logic.Sort' available: expected single matching bean but found 2: bubbleSort,javaSort
    //Sort<String> sort = context.getBean(Sort.class); // Sort 구현체를 직접 꺼내온댜!
    //System.out.println("[result1] " + sort.sort(Arrays.asList(args)));

    SortService sortService = context.getBean(SortService.class);
    System.out.println("[result2] " + sortService.doSort(Arrays.asList(args)));



    ////BubbleSort<String> sort = new BubbleSort<>();
    //Sort<String> sort = new JavaSort<>();
    //System.out.println("[result] " + sort.sort(Arrays.asList(args)));

  }
}
