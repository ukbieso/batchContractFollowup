package no.ruter.ps.batch.batchContractFollowup.ContractConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class ContractJdbcConfig {
    @Bean
    public DataSource postgresdataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5433/ps");
        dataSource.setUsername("postgres");
        dataSource.setPassword("User1234");

        return dataSource;
    }
}
