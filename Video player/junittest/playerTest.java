import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import player.VideoPlayer;

class playerTest {

	@Test
	void playTest() {

		VideoPlayer videoPlayer = new VideoPlayer();
		
		String url = "";
		int obsetPosition = 10;
		
		boolean result = videoPlayer.play(url, obsetPosition);
		
		Assert.assertEquals(true, result);
		
	}
	
	@Test
	void forwardTest() {
		VideoPlayer videoPlayer = new VideoPlayer();
		
		int setPositon = 0;
		
		int result = videoPlayer.forward(setPositon);
		
		Assert.assertEquals(10, result);
		
	}
	
	@Test
	void rewindTest() {
		
		VideoPlayer videoPlayer = new VideoPlayer();
		
		int currentTime = 10;
		
		int result = videoPlayer.rewind(currentTime);
		
		Assert.assertEquals(0, result);
		
		
	}

}
