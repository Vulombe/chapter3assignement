package cput.ac.za;

import cput.ac.za.services.Impl.TermResultsPerSubjectServicesImpl;
import cput.ac.za.services.ResultsServices;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/03/11.
 */
public class TestApp 
{
    
    private ResultsServices resultsServices;
    @BeforeMethod
    public void setUpResults() throws Exception {
        resultsServices = new TermResultsPerSubjectServicesImpl();
    }

    @Test
    public void testResults() throws Exception {
        resultsServices.printResults();
    }
}
