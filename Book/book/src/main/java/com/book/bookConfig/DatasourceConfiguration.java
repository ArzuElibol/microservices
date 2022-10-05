package com.book.bookConfig;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;



@Configuration
public class DatasourceConfiguration {

	@Bean
	@Qualifier("oracleDataSource")
	@Primary
	@ConfigurationProperties(prefix = "books.datasource")
	DataSource oracleDataSource() {
			return DataSourceBuilder.create().build();
	}

	@Bean
	@Qualifier("oracleJdbcTemplate")
	JdbcTemplate oracleJdbcTemplate(@Qualifier("oracleDataSource") DataSource oracleDataSource) {
			return new JdbcTemplate(oracleDataSource);
	}

	@Bean
	@Qualifier("oracleNamedParameterJdbcTemplate")
	NamedParameterJdbcTemplate oracleNamedParameterJdbcTemplate(@Qualifier("oracleDataSource") DataSource oracleDataSource) {
			return new NamedParameterJdbcTemplate(oracleDataSource);

	}
		
	}

