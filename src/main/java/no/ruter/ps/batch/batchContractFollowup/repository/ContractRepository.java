package no.ruter.ps.batch.batchContractFollowup.repository;

import no.ruter.ps.batch.batchContractFollowup.domainModel.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract,Integer> {
}
