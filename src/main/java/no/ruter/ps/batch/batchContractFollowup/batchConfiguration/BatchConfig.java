package no.ruter.ps.batch.batchContractFollowup.batchConfiguration;

import no.ruter.ps.batch.batchContractFollowup.batchService.TaskOne;
import no.ruter.ps.batch.batchContractFollowup.batchService.TaskTwo;
import no.ruter.ps.batch.batchContractFollowup.contractService.ContractService;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;
    @Autowired
    private ContractService contractService;

    @Bean
    public Step stepOne(){
        return stepBuilderFactory.get("stepOne")
                .tasklet(new TaskOne(contractService))
                .build();
    }

    @Bean
    public Step setpTwo(){
        return stepBuilderFactory.get("stepTwo")
                .tasklet(new TaskTwo(contractService))
                .build();
    }

    @Bean
    public Job calculateDistanceJob(){
        return jobBuilderFactory.get("calculateDistanceJob")
                .incrementer(new RunIdIncrementer())
                .start(stepOne())
                .next(setpTwo())
                .build();
    }

}
