package com.devtromo.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.devtromo.reference_operator.NombreUtils;

public class Streams {

    public static void main(String[] args) {
        List<String> courseList = NombreUtils.getList("Java", "Frontend", "Backend", "Fullstack");
        for (String course : courseList) {
            String newCourseName = course.toLowerCase()
                .replace("!", "!!");
            System.out.println("Platzi: " + newCourseName);
        }

        Stream<String> coursesStream = Stream.of("Java", "Frontend", "Backend", "Fullstack");
//        Stream<Integer> coursesStreamLength = coursesStream.map(course -> course.length());
//        Optional<Integer> longest = coursesStreamLength.max((x, y) -> y - x);

//        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");
//        emphasisCourses.forEach(System.out::println);
        Stream<String> justJavaCourses = coursesStream.filter(course -> course.contains("Java"));
        justJavaCourses.forEach(System.out::println);
    }
}
