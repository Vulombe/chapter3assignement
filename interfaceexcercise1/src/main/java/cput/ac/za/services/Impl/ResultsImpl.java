package cput.ac.za.services.Impl;

import cput.ac.za.services.Results;

import java.util.HashMap;

/**
 * Created by student on 2016/03/10.
 */
public class ResultsImpl implements Results
{
    @Override
    public void printResults()
    {
        HashMap<String,String> names= new HashMap<String, String>();
        String subjectName ="";
        double marks = 0.0;
        String results;

        results = "Student Name" + names + "\n"
                + "Subject" + subjectName + "\n"
                + "Marks" + marks;
    }
}
