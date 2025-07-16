package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmpProjectMaps {

	public static void main(String[] args) {

		// hash map with employee data
		Map<String, Integer> empProject = new LinkedHashMap<>();
		empProject.put("EMP 101", 5);
		empProject.put("EMP 102", 2);
		empProject.put("EMP 103", 8);
		empProject.put("EMP 104", 1);
		empProject.put("EMP 105", 8);
		empProject.put("EMP 106", 1);
		empProject.put("EMP 107", 8);

		System.out.println("Employee Project Map: " + empProject);
		System.out.println("");
		

		// saving number of projects in list - values from map (list of duplicate values)
		List<Integer> numOfProjects = new ArrayList<>();
		numOfProjects.addAll(empProject.values());

		System.out.println("Number of projects from list: " + numOfProjects);
		System.out.println("");
		

		//max and MIN method from collections
		System.out.println("Max number of Project: " + Collections.max(numOfProjects));
		System.out.println("Min number of Project: " + Collections.min(numOfProjects));
		System.out.println("");
		

		// saving number of employees in set - keys from map (set for unique keys)
		Set<String> employees = new LinkedHashSet<>();
		employees.addAll(empProject.keySet());

		System.out.println("Emp IDs: " + employees);
		System.out.println("");
		
		
		//EMP id using comparison loop from map
		System.out.println("Person who worked for the Maximum number of projects: ");
		for (String string : employees) {

			if (empProject.get(string) == Collections.max(numOfProjects)) {
				System.out.println(string + " - worked on " + empProject.get(string));
			}
			
		}
		
		
		System.out.println("");
		System.out.println("Person who worked for the Minimum number of projects: ");
		for (String string : employees) {

			if (empProject.get(string) == Collections.min(numOfProjects)) {
				System.out.println(string + " - worked on " + empProject.get(string));
			}
		}

	}

}
