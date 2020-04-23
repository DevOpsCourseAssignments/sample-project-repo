package com.sample.project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Tests that getHelloString returns "Hello".
     */
    @Test
    public void testGetHelloString()
    {
        assertEquals("Hello", App.getHelloString());
    }

    /**
     * Tests that getWorldString returns "World".
     */
    @Test
    public void testGetWorldString()
    {
        assertEquals("World", App.getWorldString());
    }

    /**
     * Tests that getQuestionsAndAnswers returns "questions and answers".
     */
    @Test
    public void testGetQuestionsAndAnswers()
    {
        assertEquals("questions", App.getQuestionsAndAnswers());
    }
}
