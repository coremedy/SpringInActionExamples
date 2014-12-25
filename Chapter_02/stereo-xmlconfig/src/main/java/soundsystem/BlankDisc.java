package soundsystem;

import java.util.List;


public class BlankDisc implements CompactDisc {
	private String title;
	private String artist;
	private List<String> tracks;
	private List<String> tracks2;

	public BlankDisc(String title, String artist, List<String> tracks, List<String> tracks2) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
		this.tracks2 = tracks2;
	}

	public void play() {
		System.out.println("Playing " + title + " by " + artist + tracks.toString() + tracks2.toString());
	}
}