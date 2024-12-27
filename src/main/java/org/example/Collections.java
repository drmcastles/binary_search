package org.example;

import java.util.Comparator;
import java.util.List;

public class Collections {

    static <T extends Comparable<T>> int binarySearch(List<T> list, T key) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid).compareTo(key) == 0) {
                return mid;
            }
            if (list.get(mid).compareTo(key) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    static <T> int binarySearch(List<T> list, T key, Comparator<? super T> c) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = c.compare(list.get(mid), key);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}