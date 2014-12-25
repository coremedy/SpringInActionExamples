package soundsystem;

public class TestAutowire {

	private MediaPlayer mediaPlayer;
	
	private CompactDisc compactDisc;
	
	public void setMediaPlayer(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	public void setCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}
		
	@Override
	public String toString() {
		return mediaPlayer.toString() + compactDisc.toString();
	}

}