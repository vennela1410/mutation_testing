package com.mutation.test.Software.Verification.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {

    MergeSort serv;
    @BeforeEach
    void setUp(){
        this.serv = new MergeSort();
    }

    @Test
    void mergeSortTest1() {
        int[] a = {-4, 2, 0, 2};
        int[] b = {-4,0,2,2};
        this.serv.sort(a, 0, a.length - 1);
        assertArrayEquals(b, a);
    }
    @Test
    void mergeSortTest2() {
        int[] a = {16, 31, 41, 39, 24, 7, 30, 11};
        int[] b = {7, 11, 16, 24, 30, 31, 39, 41};
        this.serv.sort(a, 0, a.length - 1);
        assertArrayEquals(b, a);
    }

    @Test
    void mergeSortTest3() {
        int[] a = {-4, 10,12, 11, 13,0, 5, 6, 9, 21, 15 , 11};
        int[] b = {-4, 0, 5, 6, 9, 10, 11, 11, 12, 13, 15, 21 };
        this.serv.sort(a, 0, a.length - 1);
        assertArrayEquals(b, a);
    }
}
