package cput.ac.za;

import cput.ac.za.conf.AppConfig;
import cput.ac.za.services.ResultsServices;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;

/**
 * Created by student on 2016/03/13.
 */
public class TessApp
{

    private ResultsServices services;
    @Before
    public void setUpResults() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        services = (ResultsServices)ctx.getBean("resultpersubject");

    }

    @Test
    public void testResults() throws Exception {
        services.printResults();
        String vulombe  = services.studentName();
        Assert.assertEquals(vulombe, "Makhubele");

    }
}
