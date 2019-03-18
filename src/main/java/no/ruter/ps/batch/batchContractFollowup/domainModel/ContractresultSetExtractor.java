package no.ruter.ps.batch.batchContractFollowup.domainModel;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContractresultSetExtractor implements ResultSetExtractor {
    @Override
    public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
        Contract contract = new Contract();
        contract.setId(rs.getInt(0));
        contract.setContractName(rs.getString(1));
        contract.setOperatorName(rs.getString(2));
        return null;
    }
}
