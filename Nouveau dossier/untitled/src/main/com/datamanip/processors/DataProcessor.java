package com.datamanip.processors;

import com.datamanip.models.Person;

import java.util.*;
import java.util.stream.Collectors;

public class DataProcessor {

    // Calcul de l'âge moyen
    public double calculateAverageAge(List<Person> people) {
        return people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);
    }

    // Calcul du salaire moyen
    public double calculateAveragesalary(List<Person> people) {
        return people.stream()
                .mapToDouble(Person::getSalary)
                .average()
                .orElse(0.0);
    }

    // Groupement par ville
    public Map<String, Long> groupByCity(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCity,
                        Collectors.counting()
                ));
    }

    // Filtrage par salaire minimum
    public List<Person> filterBySalary(List<Person> people, double minSalary) {
        return people.stream()
                .filter(person -> person.getSalary() >= minSalary)
                .collect(Collectors.toList());
    }

    // Tri par âge (croissant)
    public List<Person> sortByAge(List<Person> people) {
        return people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());
    }

    // Obtenir les N plus jeunes
    public List<Person> getYoungest(List<Person> people, int count) {
        return people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .limit(count)
                .collect(Collectors.toList());
    }

    // Obtenir les N plus âgés
    public List<Person> getOldest(List<Person> people, int count) {
        return people.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .limit(count)
                .collect(Collectors.toList());
    }

    // Statistiques complètes
    public Map<String, Object> getStatistics(List<Person> people) {
        Map<String, Object> stats = new HashMap<>();

        IntSummaryStatistics ageStats = people.stream()
                .mapToInt(Person::getAge)
                .summaryStatistics();

        DoubleSummaryStatistics salaryStats = people.stream()
                .mapToDouble(Person::getSalary)
                .summaryStatistics();

        stats.put("totalCount", people.size());
        stats.put("averageAge", ageStats.getAverage());
        stats.put("minAge", ageStats.getMin());
        stats.put("maxAge", ageStats.getMax());
        stats.put("averageSalary", salaryStats.getAverage());
        stats.put("minSalary", salaryStats.getMin());
        stats.put("maxSalary", salaryStats.getMax());
        stats.put("cityDistribution", groupByCity(people));

        return stats;
    }

    // Recherche par nom (insensible à la casse)
    public List<Person> searchByName(List<Person> people, String namePattern) {
        return people.stream()
                .filter(person -> person.getName().toLowerCase()
                        .contains(namePattern.toLowerCase()))
                .collect(Collectors.toList());
    }
}