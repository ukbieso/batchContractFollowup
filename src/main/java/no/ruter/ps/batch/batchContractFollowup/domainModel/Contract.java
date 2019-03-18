package no.ruter.ps.batch.batchContractFollowup.domainModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contract {
    @Id
    private Integer id;
    private String contractName;
    private String operatorName;
    private List<ContractPeriod> contractPeriods;
    private List<Line> lines;
}
