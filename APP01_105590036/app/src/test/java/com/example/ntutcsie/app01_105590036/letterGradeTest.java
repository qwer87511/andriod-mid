package com.example.ntutcsie.app01_105590036;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class letterGradeTest {
    @Test
    public void getGrade() {
        letterGrade letterGrade0 = new letterGrade();

        assertEquals("X", letterGrade0.getGrade(101));
        assertEquals("A", letterGrade0.getGrade(95));
        assertEquals("B", letterGrade0.getGrade(89));
        assertEquals("C", letterGrade0.getGrade(70));
        assertEquals("D", letterGrade0.getGrade(66));
        assertEquals("F", letterGrade0.getGrade(2));
        assertEquals("X", letterGrade0.getGrade(-1));
    }
}
