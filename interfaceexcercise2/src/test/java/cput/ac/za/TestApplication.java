package cput.ac.za;

import cput.ac.za.conf.AppConfig;
import cput.ac.za.services.Impl.FinalResultsAllSubjectsServiceImpl;
import cput.ac.za.services.ResultsServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by student on 2016/03/11.
 */
public class TestApplication
{
    private ResultsServices services;
    @BeforeMethod
    public void setUpResults() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        services = (ResultsServices)ctx.getBean("resultpersubject");
    }

    @Test
    public void testResults() throws Exception
    {
        //FinalResultsAllSubjectsServiceImpl finalResults = services.printResults();
    }
}
