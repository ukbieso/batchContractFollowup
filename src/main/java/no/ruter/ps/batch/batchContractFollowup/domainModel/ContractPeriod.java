package no.ruter.ps.batch.batchContractFollowup.domainModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractPeriod {
    private Integer id;
    private LocalDate fromLocalDate;
    private LocalDate toLocalDate;
    private double productionRequired;
    private double feePerMissedInPercentPoint;
}
