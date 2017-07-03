package com.foldik.git;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ClassPathPropertyLoader {

    public Properties loadProperties(String fileName) {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(new File(getClass().getResource(fileName).getFile()))) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
}
