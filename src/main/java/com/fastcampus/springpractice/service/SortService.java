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

  // 타입을 기준으로 자동 와이어링하는 환경에서, 동일한 타입이 2개 이상 존재하는 bean들 중 하나의 bean을 선택할 때 유용하다.
  // Qualifier 사용법 : 생성자 주입, 필드 주입, setter 주입 > https://lasbe.tistory.com/112#%F0%9F%93%8C_setter_%EC%A3%BC%EC%9E%85
  /**
   * https://mungto.tistory.com/458
   * 내 상황의 경우 WebClinet를 Bean으로 등록했는데 요청해야 할 url이 많아서 여러개의 WebClient를 등록하면서 문제가 발생하였다.(카카오, 네이버, 공공API 등)
   * 물론 그때그때 생성해서 쓰면되지만 자주 사용하고 재사용이 가능하다면 방법을 찾아야 하지 않을까?
   * 이러한 문제를 해결하기 위해서 @Quailifer를 이용하게 된다.
   * 특정한 객체를 찾기위한 이름을 지정한다고 생각하면 된다.
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
