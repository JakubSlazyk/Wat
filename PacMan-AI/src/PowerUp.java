import java.io.File;
import java.util.Random;

public class PowerUp extends Character{
	private int powerUpIndex;
	static int respawnTime;//w klatkach prawdopodobnie
	private int TimeToLive;//w klatkach prawdopodobnie
	private File powerUpFile;
	/*
	 * 1-strza� 30%
	 * 2-zmiana poziomu 10%
	 * 3-speed x2 30%
	 * 4-duchy speed/10%
	 * 5-score x2 20%
	 * 
	 */
	public PowerUp()
	{
		cord = new Point(10,10,32,32);
		pixels = new Point(320,320,32,32);
		setDir("Right");
		setNewDir("Right");
		speed = 0;
		Random generator = new Random();
		int temp =	generator.nextInt(100);
		
		if(temp>=0 && temp<30)
		{
			setPowerUpIndex(1);
			powerUpFile = new File("Resources/Img/Numbers/1.png");
			}
		if(temp>=30 && temp<40)
		{
			setPowerUpIndex(2);
			powerUpFile = new File("Resources/Img/Numbers/2.png");
			}
		if(temp>=40 && temp<70)
		{
			setPowerUpIndex(3);
			powerUpFile = new File("Resources/Img/Numbers/3.png");
			}
		if(temp>=70 && temp<80)
		{
			setPowerUpIndex(4);
			powerUpFile = new File("Resources/Img/Numbers/4.png");
			}
		if(temp>=80 && temp<100)
		{
			setPowerUpIndex(5);
			powerUpFile = new File("Resources/Img/Numbers/5.png");
			}
		
	}
	public File getPowerUpFile() {
		return powerUpFile;
	}
	public void setPowerUpFile(File powerUpFile) {
		this.powerUpFile = powerUpFile;
	}
	public int getPowerUpIndex() {
		return powerUpIndex;
	}
	public void setPowerUpIndex(int powerUpIndex) {
		this.powerUpIndex = powerUpIndex;
	}
	
}