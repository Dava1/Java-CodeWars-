package com.company;

import java.util.List;

public class CountTheSmileFaces {
    public static int countSmileys(List<String> arr) {
     return (int) arr.stream().filter(e -> e.matches("[:;][-~]?[[:;][-~]?[)D]]")).count();
    }

}
//:) :D ;-D :~) ;-) :~D