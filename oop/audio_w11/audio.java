import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class audio {
	public static void main(String [] args){
		try {

			// opens the file.
			System.out.println("안녕하세요");
			File f = new File("ditto.wav");
			// Check if the file exists. I should be checking that it doesn't exist lol.
			if(f.exists()){
				System.out.println("now we're cooking with: "+f.getName());
			}
			// Opens the audio stream.
			AudioInputStream 음악 = AudioSystem.getAudioInputStream(f);
			Clip c = AudioSystem.getClip();
			c.open(음악);

			// start it.
			c.start();

			// Something to note. There is a delay when starting the clip.
			// Thus, when using the method isRunning() immediately afterward start() it might return false
			// Indicating that the clip isn't running yet.
			System.out.println(c.isRunning());

			// Add a delay to ensure the clip runs. 
			Thread.sleep(100);
			
			// Check if the clip is running. When it stops then break out of the loop
			while(c.isRunning()){
				// Add a delay of 100 ms in between each loop.
				Thread.sleep(100);
			}
		}catch(Exception e){
			System.out.println("huh");
		}
	}
}
