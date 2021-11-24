package com.example.stringtest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtil.isEmpty(""));
        assertTrue(StringUtil.isEmpty(null));
        assertFalse(StringUtil.isEmpty("Id must not be empty"));

    }

    @Test
    public void testCapitalize() {
        Assert.assertEquals(StringUtil.capitalize("mynameisduke"), "Mynameisduke");
    }
}