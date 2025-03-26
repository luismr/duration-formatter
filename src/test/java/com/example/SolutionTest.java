package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testZeroSeconds() {
        assertEquals("now", Solution.formatDuration(0));
    }

    @Test
    void testSingleUnit() {
        assertEquals("1 second", Solution.formatDuration(1));
        assertEquals("1 minute", Solution.formatDuration(60));
        assertEquals("1 hour", Solution.formatDuration(3600));
        assertEquals("1 day", Solution.formatDuration(86400));
        assertEquals("1 month", Solution.formatDuration(2592000));
        assertEquals("1 year", Solution.formatDuration(31536000));
    }

    @Test
    void testMultipleUnits() {
        assertEquals("1 minute and 1 second", Solution.formatDuration(61));
        assertEquals("1 hour and 1 minute", Solution.formatDuration(3660));
        assertEquals("1 day and 1 hour", Solution.formatDuration(90000));
        assertEquals("1 month and 1 day", Solution.formatDuration(2678400));
        assertEquals("1 year and 1 month", Solution.formatDuration(34128000));
    }

    @Test
    void testComplexScenarios() {
        assertEquals("2 minutes and 30 seconds", Solution.formatDuration(150));
        assertEquals("1 hour, 2 minutes and 30 seconds", Solution.formatDuration(3750));
        assertEquals("2 days, 1 hour and 5 minutes", Solution.formatDuration(176700));
    }

    @Test
    void testPluralization() {
        assertEquals("2 seconds", Solution.formatDuration(2));
        assertEquals("2 minutes", Solution.formatDuration(120));
        assertEquals("2 hours", Solution.formatDuration(7200));
        assertEquals("2 days", Solution.formatDuration(172800));
        assertEquals("2 months", Solution.formatDuration(5184000));
        assertEquals("2 years", Solution.formatDuration(63072000));
    }

    @Test
    void testLargeValues() {
        assertEquals("3 years, 2 months, 2 days, 9 hours, 46 minutes and 40 seconds", 
            Solution.formatDuration(100000000));
    }
} 