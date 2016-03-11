package cput.ac.za.services.Impl;

import cput.ac.za.services.ResultsServices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by student on 2016/03/11.
 */
public class TermResultsPerSubjectServicesImpl implements ResultsServices
{
    @Override
    public void printResults()
    {
        HashMap<String,String> names= new HashMap<String, String>();
        String subjectName = "Technical Programming 2";
        List<Double> marks = new ArrayList<Double>();
        names.put("Vulombe","Makhubele");
        marks.add(60.1);
        marks.add(70.1);
        marks.add(65.5);
        marks.add(60.3);
        String results;

        results = "Student Name: " + names.get("Vulombe") + "\n"
                + "Subject: " + subjectName + "\n"
                + "Term one Marks: " + marks.get(0) + "\n"
                + "Term two Marks: " + marks.get(1) + "\n"
                + "Term three Marks: " + marks.get(2) + "\n"
                + "Term four Marks: " + marks.get(3);
        System.out.println(results);
    }

    @Override
    public String studentName()
    {
        return "Vulombe";
    }
}
