package com.google;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BasicsArraysTest {
  @Test
  void should_insert_value_into_middle_of_array() {
    var array = new int[] {1, 2, 3, 5, 6, 7};
    var sut = new BasicsArrays();

    assertThat(sut.insertMiddle(array, 3, 4))
        .containsExactly(1, 2, 3, 4, 5, 6);
  }

  @Test
  void should_remove_duplicated_values_in_a_sorted_array() {
    var input =    new int[] {1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 7};
    var expected = new int[] {1, 2, 3, 4, 5, 6, 7};
    var sut = new BasicsArrays();

    var noOfUniques = sut.removeDuplicates(input);

    assertThat(noOfUniques).isEqualTo(expected.length);
    for (int i = 0; i < noOfUniques; i++) {
      assert input[i] == expected[i];
    }
  }
}