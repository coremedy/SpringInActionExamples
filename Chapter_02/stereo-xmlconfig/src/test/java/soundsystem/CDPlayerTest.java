package soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/CDPlayerTest_CandPNamespace_configuration.xml" })
public class CDPlayerTest {

	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();

	@Autowired
	private MediaPlayer mediaPlayer;
	
	@Autowired
	private CompactDisc compactDisc;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(compactDisc);
	}

	@Test
	public void play() {
		mediaPlayer.play();
		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n".trim(), log.getLog().trim());
	}
}