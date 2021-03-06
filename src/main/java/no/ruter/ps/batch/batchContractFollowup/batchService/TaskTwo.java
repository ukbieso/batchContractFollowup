package no.ruter.ps.batch.batchContractFollowup.batchService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.ruter.ps.batch.batchContractFollowup.contractService.ContractService;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
@Slf4j
@AllArgsConstructor
public class TaskTwo implements Tasklet {
    private ContractService contractService;
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        log.info("Task two start.....");
        contractService.getAll().forEach(c -> {
            log.info("contract : {}", c);
        });

        log.info("task two done.");
        return RepeatStatus.FINISHED;
    }
}
