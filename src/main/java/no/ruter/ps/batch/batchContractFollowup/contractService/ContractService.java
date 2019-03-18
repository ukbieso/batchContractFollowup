package no.ruter.ps.batch.batchContractFollowup.contractService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import no.ruter.ps.batch.batchContractFollowup.domainModel.Contract;
import no.ruter.ps.batch.batchContractFollowup.repository.ContractRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class ContractService {
    private ContractRepository contractRepository;
    JdbcTemplate jdbcTemplate;


    public List<Contract> getAll(){
        return contractRepository.findAll();
    }
/*

    public int getTotalCount(){
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM CONTRACTS", Integer.class);
    }

    public List<Contract> getAllContract(){

        return jdbcTemplate.query("SELECT * FROM contracts", new BeanPropertyRowMapper<Contract>(Contract.class));
    }
*/

}
