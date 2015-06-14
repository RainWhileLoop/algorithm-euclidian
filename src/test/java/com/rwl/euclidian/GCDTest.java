package com.rwl.euclidian;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.rwl.euclidian.algorithm.Euclidian;
import java.lang.reflect.Method;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RainWhileLoop
 */
public class GCDTest {

    public GCDTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void euclidianCorrect() {
        int result = Euclidian.findGCD(8, 14);
        assertEquals(result, 2);
        result = Euclidian.findGCD(35, 14);
        assertEquals(result, 7);
        result = Euclidian.findGCD(303562, 122);
        assertEquals(result, 2);
    }
}
