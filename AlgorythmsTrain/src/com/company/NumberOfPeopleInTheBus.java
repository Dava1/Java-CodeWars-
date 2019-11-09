package com.company;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public static int countPassengers(ArrayList<int[]> stops) {
      return stops.stream().mapToInt(e -> e[0] - e[1]).sum();
    }
}
