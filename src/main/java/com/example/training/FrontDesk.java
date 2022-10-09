package com.example.training;
import java.io.IOException;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FrontDesk {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("C:\\Users\\kiro.kosturanov\\Desktop\\JAVA_OOP_training\\exercise_2\\src\\main\\resources\\kiro.json");
        Student student = objectMapper.readValue(file, Student.class);
        System.out.println("After converting JSON to OBJECT :");
        System.out.println(student.toString());
        
        String jsonString = objectMapper.writeValueAsString(student);
        System.out.println("After converting Map to JSON :");
        System.out.println(jsonString);
    }
}
