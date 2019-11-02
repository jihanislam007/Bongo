package player;

public class VideoPlayer implements PlayerInterface{
	
	String url;
	int currentTime = 0;
	
	@Override
	public boolean play(String url,int obsetPosition) {

		System.out.println(url+obsetPosition);
		return true;
	}
	
	@Override
	public int forward(int setPositon) {

		this.currentTime+=10;
		this.play(this.url,this.currentTime);
		return currentTime;

	}
	
	@Override
	public int rewind(int setPositon) {
		
		if(this.currentTime <=0) {
			this.currentTime = 0;
		}else 
		this.currentTime-=10;
		this.play(this.url, this.currentTime);
		return currentTime;

	}
	
	

}
