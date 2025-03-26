package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter duration in seconds: ");
            int totalSeconds = scanner.nextInt();
            System.out.println(formatDuration(totalSeconds));
        }
    }

    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";

        int[] unitValues = {
            365 * 24 * 60 * 60, // years
            30 * 24 * 60 * 60, // months
            24 * 60 * 60,       // days
            60 * 60,            // hours
            60,                 // minutes
            1                   // seconds
        };

        String[] unitNames = {
            "year",
            "month",
            "day",
            "hour",
            "minute",
            "second"
        };

        List<String> parts = new ArrayList<>();

        for (int i = 0; i < unitValues.length; i++) {
            int unitAmount = seconds / unitValues[i];
            if (unitAmount > 0) {
                seconds %= unitValues[i];
                parts.add(unitAmount + " " + unitNames[i] + (unitAmount > 1 ? "s" : ""));
            }
        }

        int size = parts.size();
        if (size == 1) {
            return parts.get(0);
        }

        String joined = parts.stream()
            .limit(size - 1)
            .collect(Collectors.joining(", "));

        return joined + " and " + parts.get(size - 1);
    }
} 