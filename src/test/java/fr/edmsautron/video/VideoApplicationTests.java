package fr.edmsautron.video;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes=SystemTestConfig.class)
@ActiveProfiles("h2")
public class VideoApplicationTests {

	@Test
	public void contextLoads() {
	}

}

