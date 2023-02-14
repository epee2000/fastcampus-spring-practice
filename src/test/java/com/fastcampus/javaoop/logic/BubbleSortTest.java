package com.fastcampus.javaoop.logic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

  @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다")
  @Test
  void given_List_WhenExecuting_ThenReturnSortedList() {
    // Given
    BubbleSort<Integer> bubbleSort = new BubbleSort<>();

    // When
    List<Integer> actual = bubbleSort.sort(List.of(3, 2, 4, 5, 1));

    // Then > 기대값, 실제
    assertEquals(List.of(1, 2, 4, 3, 5), actual);
  }


}