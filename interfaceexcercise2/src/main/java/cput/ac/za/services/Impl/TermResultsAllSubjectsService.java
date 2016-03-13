package cput.ac.za.services.Impl;

import cput.ac.za.services.ResultsServices;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/11.
 */
public class TermResultsAllSubjectsService implements ResultsServices
{
    @Override
    public void printResults()
    {
        String fName = "Mcdave";
        List<String> subjects = new ArrayList<String>();
        subjects.add("TPG200S");
        subjects.add("DOS300S");
        subjects.add("IRP300S");
        subjects.add("ISY300A");
        subjects.add("ISY300B");

        List<Integer> marks = new ArrayList<Integer>();
        String term = "Term Two";

        marks.add(68);
        marks.add(61);
        marks.add(80);
        marks.add(73);
        marks.add(59);

        String results = "Student Name: " + fName + "\n" + "These Are " + term + " Results" + "\n"
                + "Subject: " + subjects.get(0) + "\t" + "Mark: " + marks.get(0) + " " + "\n"
                + "Subject: " + subjects.get(1)+ "\t" + "Mark: " + marks.get(1) + " " +"\n"
                + "Subject: " + subjects.get(2) + "\t" + "Mark: " + marks.get(2) + " " +"\n"
                + "Subject: " + subjects.get(3) + "\t" + "Mark: " + marks.get(3) + " " + "\n"
                + "Subject: " + subjects.get(4) + "\t" + "Mark: " + marks.get(4);

        System.out.println(results);
        //return results;
    }

    public String studentName()
    {
        return "Mcdave";
    }
}
