package fr.edmsautron.video;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("h2")
public class SystemTestConfig {
	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.h2")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
}
