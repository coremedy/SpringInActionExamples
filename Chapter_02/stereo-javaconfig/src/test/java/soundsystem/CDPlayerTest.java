package soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();

	@Autowired
	@Qualifier("lonelyHeartsClubBand")
	private CompactDisc cd;

	@Autowired
	@Qualifier("strangeCDPlayer")
	private MediaPlayer player;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}

	@Test
	public void play() {
		player.play();
		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n".trim(), log.getLog().trim());
	}
}