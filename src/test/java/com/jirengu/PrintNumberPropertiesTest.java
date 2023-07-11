package com.jirengu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintNumberPropertiesTest {

    @Test
    public void testPrintNumberProperties() {
        assertEquals("Even", PrintNumberProperties.printNumberProperties(2));
        assertEquals("Odd", PrintNumberProperties.printNumberProperties(1));
        assertEquals("Even and Large", PrintNumberProperties.printNumberProperties(12));
        assertEquals("Odd and Large", PrintNumberProperties.printNumberProperties(1003));
    }

}
