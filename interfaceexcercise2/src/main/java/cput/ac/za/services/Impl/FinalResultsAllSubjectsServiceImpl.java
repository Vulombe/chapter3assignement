package cput.ac.za.services.Impl;

import cput.ac.za.services.ResultsServices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by student on 2016/03/11.
 */
public class FinalResultsAllSubjectsServiceImpl implements ResultsServices
{
    @Override
    public void printResults()
    {
        String lastName = "Makhubele";
        List<String> subjects = new ArrayList<String>();
        subjects.add("TPG200S");
        subjects.add("DOS300S");
        subjects.add("IRP300S");
        subjects.add("ISY300A");
        subjects.add("ISY300B");

        List<Integer> marks = new ArrayList<Integer>();

        marks.add(75);
        marks.add(80);
        marks.add(85);
        marks.add(65);
        marks.add(60);

        String results;

        results = "Student Name: " + lastName + "\n"
                + "Subject: " + subjects.get(0) + "\t"
                + "Mark: " + marks.get(0) + " "
                + "\n"
                + "Subject: " + subjects.get(1)+ "\t"
                + "Mark: " + marks.get(1) + " "
                +"\n"
                + "Subject: " + subjects.get(2) + "\t"
                + "Mark: " + marks.get(2) + " "
                +"\n"
                + "Subject: " + subjects.get(3) + "\t"
                + "Mark: " + marks.get(3) + " "
                + "\n"
                + "Subject: " + subjects.get(4) + "\t"
                + "Mark: " + marks.get(4);

        System.out.println(results);
    }

    public String studentName()
    {
        return "Vulombe";
    }
}
