package cput.ac.za.conf;

import cput.ac.za.services.Impl.FinalResultsAllSubjectsServiceImpl;
import cput.ac.za.services.Impl.TermResultsPerSubjectServicesImpl;
import cput.ac.za.services.ResultsServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2016/03/11.
 */
@Configuration
public class AppConfig
{
    @Bean(name = "resultpersubject")
    public ResultsServices getResultsPerSubject()
    {
        return new TermResultsPerSubjectServicesImpl();
    }

    @Bean (name = "finalyearresults")
    public ResultsServices getFinalYearResults()
    {
        return new FinalResultsAllSubjectsServiceImpl();
    }
}
